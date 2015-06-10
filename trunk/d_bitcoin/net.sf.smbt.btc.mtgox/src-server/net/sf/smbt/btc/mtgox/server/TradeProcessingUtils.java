/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.btc.mtgox.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.eval.ImpossibleRuleEvalDelegate;
import net.sf.smbt.btc.mtgox.eval.PriceRuleEvalDelegate;
import net.sf.smbt.btc.mtgox.eval.TimeRuleEvalDelegate;
import net.sf.smbt.btc.mtgox.eval.VolumeRuleEvalDelegate;
import net.sf.smbt.btc.notifications.IOrderBatchProcessor;
import net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate;
import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.PriceRule;
import net.sf.smbt.trading.Robot;
import net.sf.smbt.trading.RuleVisitor;
import net.sf.smbt.trading.TimeRule;
import net.sf.smbt.trading.TradeBotsConfig;
import net.sf.smbt.trading.TradingFactory;
import net.sf.smbt.trading.TradingRule;
import net.sf.smbt.trading.Trigger;
import net.sf.smbt.trading.VolumeRule;

import org.eclipse.emf.common.notify.Adapter;

public class TradeProcessingUtils {
	
	private List<ITriggerListener> listeners;
	private boolean verbose;
	public TradeProcessingUtils(boolean verbose) {
		listeners = new ArrayList<ITriggerListener>();
		this.verbose = verbose;
	}
	public void addTriggerListener(ITriggerListener trigger) {
		listeners.add(trigger);
	}
	public void removeTriggerListener(ITriggerListener trigger) {
		listeners.remove(trigger);
	}
	IOrderBatchProcessor defaultProcessor = new IOrderBatchProcessor() {
		@Override
		public void processOrder(Order... orders) {
			if (verbose) {
				for (Order o: orders) {
					System.out.println(new Date().toString());
					System.out.println("emmits " + o.getVolume() + " @ " + o.getPrice_int() + " " + o.getCurrency());
					System.out.println("================================================");
				}
			}
		}
	};
	public void process(MTGox mtgox, TradeBotsConfig... tradeBotsConfigs) {
		processRobotContext(
			mtgox, 
			defaultProcessor,
			tradeBotsConfigs
		);
	}
	public void registerDepthValueChangeListener(MTGox mtgox, float price, float tolerance, String kind, String direction) {
		mtgox.eAdapters().add(new FetchValueAdapterImpl(mtgox, price, tolerance, kind, direction));
	}
	public void unregisterDepthValueChangeListener(MTGox mtgox, float price, float tolerance, String kind, String direction) {
		for (Adapter adapter : mtgox.eAdapters()) {
			if (adapter instanceof FetchValueAdapterImpl) {
				//FetchValueAdapterImpl depthValueAdapter = (FetchValueAdapterImpl) adapter;
				//if (depthValueAdapter.)
			}
		}
	}
	public List<FetchValueAdapterImpl> getFetchValueAdapters(MTGox mtgox) {
		List<FetchValueAdapterImpl> list = new ArrayList<FetchValueAdapterImpl>();
		for (Adapter adapter : mtgox.eAdapters()) {
			if (adapter instanceof FetchValueAdapterImpl) {
				FetchValueAdapterImpl depthValueAdapter = (FetchValueAdapterImpl) adapter;
				list.add(depthValueAdapter);
			}
		}
		return list;
	}
	public void eval(TradingRule rule) {
		if(verbose) {
			System.out.println("eval " + rule.eClass().getName() + " rule");
		}
	}
	public void processRobotContext(MTGox mtgox, TradeBotsConfig... botsCfg) {
		processRobotContext(mtgox, defaultProcessor, botsCfg);
	}
	public void processRobotContext(MTGox mtgox, IOrderBatchProcessor processor, TradeBotsConfig... botsCfg) {
		if (verbose) {
			System.out.println("Process robot config against current context");
		}
		RuleVisitor v = TradingFactory.eINSTANCE.createRuleVisitor();
		v.setDelegate(new ITradeRuleVisitorDelegate() {
			@Override
			public boolean visit(TradingRule rule) {
				eval(rule);
				return true;
			}
		});
		for (TradeBotsConfig cfg : botsCfg) {
			int idx = 0;
			for(Robot robby : cfg.getBots()) {
				if (verbose) {
					System.out.println("Robot " + idx++);
				}
				int tidx = 0;
				for (Trigger trigger : robby.getTriggers()) {
					if (verbose) {
						System.out.println("   Trigger " + idx + "_" + tidx++);
					}
					if (!trigger.isProcessed()) {
						if (verbose) {
							System.out.println("     Checking trigger conditions ...");
						}
						if (!trigger.getRules().isEmpty()) {
							List<TradingRule> rules = new ArrayList<TradingRule>();
							for (TradingRule tr : trigger.getRules()) {
								if (verbose) {
									System.out.println("         eval " + tr.toString());
								}
								if (eval(tr, mtgox)) {
									if (verbose) {
										System.out.println(      "Rule " + tr.toString() + " matched !!!");
									}
									rules.add(tr);
								}
							}
							if (rules.size() == trigger.getRules().size()) {
								if (verbose) {
									System.out.println(      "Trigger Conditions fully matched !!!");
								}
								processor.processOrder(trigger.getOrders().toArray(new Order[0]));
								trigger.setProcessed(true);
								notify(trigger);
							}
						}
					}
				}
			}
		}
	}
	private void notify(Trigger...triggers) {
		for (ITriggerListener l : listeners) {
			for (Trigger t : triggers) {
				l.handle(t);
			}
		}
	}
	public boolean eval(TradingRule r, MTGox mtgox) {
		if (r.getEvalDelegate()==null) {
			if (r instanceof TimeRule) {
				r.setEvalDelegate(new TimeRuleEvalDelegate(verbose));
			} else if (r instanceof PriceRule) {
				r.setEvalDelegate(new PriceRuleEvalDelegate(verbose));
			} else if (r instanceof VolumeRule) {
				r.setEvalDelegate(new VolumeRuleEvalDelegate(verbose));
			} else {
				r.setEvalDelegate(new ImpossibleRuleEvalDelegate(verbose));
			}
		}
		return (!r.compute(mtgox).isEmpty());
	}
	public Robot addBot(TradeBotsConfig cfg, String uuid) {
		for (Robot bot : cfg.getBots()) {
			if (bot.getUuid().equals(uuid)) {
				return null;
			}
		}
		Robot r = TradingFactory.eINSTANCE.createRobot();
		r.setUuid(uuid);
		cfg.getBots().add(r);
		return r;
	}
	public Robot delBot(TradeBotsConfig cfg, String uuid) {
		for (Robot bot : cfg.getBots()) {
			if (bot.getUuid().equals(uuid)) {
				cfg.getBots().remove(bot);
				return bot;
			}
		}
		return null;
	}
	/*
	private float checkWalletLimit(MTGox mtgox) {
		if (mtgox != null) {
			return mtgox.getWallet().getBtcInfo().getDailyLimit().getValue();
		}
		return 0f;
	}
	*/
}
