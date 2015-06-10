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

package net.sf.smbt.btc.mtgox;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.google.gson.JsonObject;

public class MTGoxController {
	private CmdPipe mtgoxPipe;
	private CmdPipe mtgoxWebSocket;
	private String apiKey;
	private String secretKey;
	private String privateDataKey;
	private Date lastSeenPrivateDataKey, expirationPrivateDataKey;
	
	private volatile MTGoxDataManager mtgoxDataManager;
	
	public MTGoxDataManager getMtgoxDataManager() {
		return mtgoxDataManager;
	}
	
	public CmdPipe getMtgoxPipe() {
		return mtgoxPipe;
	}
	public CmdPipe getMtgoxWebSocketPipe() {
		return mtgoxWebSocket;
	}
	public MTGox getMTGox() {
		return mtgoxDataManager.getMtGox();
	}
	class MtGoxJob extends Job {
		int ticks;
		public MtGoxJob() {
			super("MTGox Controller Job");
			setPriority(LONG);
			setSystem(true);
			ticks = 0;
		}
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			getMoneyDepthFetch(BtcCurrency.BTC, mtgoxDataManager.getMtGox().getMarket().getCurrency());
			//getMoneyTradesFetch(BtcCurrency.BTC, mtgoxDataManager.getMtGox().getMarket().getCurrency(), mtgoxDataManager.getLastTid()+"");
			getMoneyInfo(BtcCurrency.BTC, mtgoxDataManager.getMtGox().getMarket().getCurrency());
			Date now = new Date();
			if (privateDataKey.equals("") || now.after(expirationPrivateDataKey)) {
				getPrivateApiKey(BtcCurrency.BTC, mtgoxDataManager.getMtGox().getMarket().getCurrency());
			}
			schedule(30000);
			return Status.OK_STATUS;
		}
	}
	public void getMoneyDepthFetch(BtcCurrency btc1, BtcCurrency btc2) {
		if (mtgoxPipe != null) {
			mtgoxPipe.send(MTGoxUtils.INSTANCE.createMtGoxMoneyDepthFetch(btc1, btc2, apiKey, secretKey));
		}
	}
	public void getTicker(BtcCurrency btc1, BtcCurrency btc2) {
		if (mtgoxPipe != null) {
			mtgoxPipe.send(MTGoxUtils.INSTANCE.createMtGoxTicker(btc1, btc2, apiKey, secretKey));
		}
	}
	public void getPrivateApiKey(BtcCurrency btc1, BtcCurrency btc2) {
		if (mtgoxPipe != null) {
			mtgoxPipe.send(MTGoxUtils.INSTANCE.createMtGoxGetPrivateKey(btc1, btc2, apiKey, secretKey));
		}
	}
	public void getWalletHistory(BtcCurrency btc) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxWalletHistory(btc, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void getMoneyOrders(BtcCurrency btc1, BtcCurrency btc2) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxGenericOrders(btc1, btc2, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void getMoneyInfo(BtcCurrency btc1, BtcCurrency btc2) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxV1MoneyInfo(btc1, btc2, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void getDepthFull(BtcCurrency btc1, BtcCurrency btc2) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxMoneyDepthFull(btc1, btc2, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void getMoneyTradesFetch(BtcCurrency btc1, BtcCurrency btc2, String tid) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxMoneyTradesFetch(btc1, btc2, tid, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void addOrder(BtcCurrency btc1, BtcCurrency btc2, String type, float amount, float price) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxAddOrder(btc1, btc2, type, amount, price, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void cancelOrder(BtcCurrency btc1, BtcCurrency btc2, String oid) {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxCancelOrder(btc1, btc2, oid, apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public void getBitcoinAddr() {
		if (mtgoxPipe != null) {
			Cmd cmd = MTGoxUtils.INSTANCE.createMtGoxBitcoinAddr(apiKey, secretKey);
			mtgoxPipe.send(cmd);
		}
	}
	public MTGoxController(String apiKey, String secretKey) {
		this.apiKey 	= apiKey;
		this.secretKey	= secretKey;
		privateDataKey = "";
		expirationPrivateDataKey = new Date();
		lastSeenPrivateDataKey = new Date();

		mtgoxDataManager = new MTGoxDataManager();
		
		mtgoxPipe = QuanticMojo.INSTANCE.getPipe(
			TRANSPORT_PROTOCOL.HTTP.getLiteral(),
			"mtgox-v2", 
			"https://data.mtgox.com/api/",
			80
		);
		if (mtgoxPipe == null) {
			mtgoxPipe = QuanticMojo.INSTANCE.createHttpPipe(
				"mtgox-v2", 
				"https://data.mtgox.com/api/"
			);
		}
		if (mtgoxPipe != null) {
			mtgoxPipe.setLocked(true);
			mtgoxPipe.addQxEventHandler(
				new AbstractQxEventHandlerImpl() {
					public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
						if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
							Cmd cmd = event.getCmd();
							if (cmd instanceof MTGoxCmd) {
								mtgoxDataManager.handleMtGoxEvents((MTGoxCmd) cmd);
							}
						}
					};
				}
			);
		}
		getDepthFull(BtcCurrency.BTC, mtgoxDataManager.getMtGox().getMarket().getCurrency());
		getMoneyTradesFetch(BtcCurrency.BTC, mtgoxDataManager.getMtGox().getMarket().getCurrency(), "0");

		new MtGoxJob().schedule(2500);
		
		
		//
		// Web Socket 
		//
		mtgoxWebSocket = QuanticMojo.INSTANCE.getPipe(
			TRANSPORT_PROTOCOL.HTTP.getLiteral(),
			"mtgox-wsocket", 
			"ws://socketio.mtgox.com/socket.io/1/websocket/",
			80
		);
		if (mtgoxWebSocket == null) {
			mtgoxWebSocket = QuanticMojo.INSTANCE.createHttpPipe(
				"mtgox-wsocket", 
				"ws://socketio.mtgox.com/socket.io/1/websocket/"
			);
			mtgoxWebSocket.setLocked(true);
			mtgoxWebSocket.addQxEventHandler(
				new AbstractQxEventHandlerImpl() {
					public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
						if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
							Cmd cmd = event.getCmd();
							if (cmd instanceof MTGoxCmd) {
								mtgoxDataManager.handleMtGoxEvents((MTGoxCmd) cmd);
							}
						}
					};
				}
			);
		}
	}
	
	public void connectWebSocket() {
		MTGoxCmd cmd = MtgoxFactory.eINSTANCE.createMTGoxCmd();
		cmd.setCommand("connect");
		mtgoxWebSocket.send(cmd);
	}
	
	public void disonnectWebSocket() {
		MTGoxCmd cmd = MtgoxFactory.eINSTANCE.createMTGoxCmd();
		cmd.setCommand("disconnect");
		mtgoxWebSocket.send(cmd);
	}
	
	public void getWebSocketStatus() {
		MTGoxCmd cmd = MtgoxFactory.eINSTANCE.createMTGoxCmd();
		cmd.setCommand("status");
		mtgoxWebSocket.send(cmd);
	}
	
	public void getWebSocketReconnect() {
		MTGoxCmd cmd = MtgoxFactory.eINSTANCE.createMTGoxCmd();
		cmd.setCommand("reconnect");
		mtgoxWebSocket.send(cmd);
	}

	private void handleApiKey(JsonObject o) {
		/*
		{"result":"success",
		"return":"Ctm3VsP7Rvq31tzXpJ5/FwAAAABRcWlLsxXetmUyAnlH8vRWH+KgVGA82ou6ORvazeo2qMomi1w",
		"mtgox":"//1/generic/private/idkey"}
		*/
		String k = o.get("return").getAsString();
		Date now = new Date();
		if (!privateDataKey.equals(k) || now.after(expirationPrivateDataKey) ) {
			privateDataKey = k;
			lastSeenPrivateDataKey = now;
			Calendar expirationCalendar = GregorianCalendar.getInstance();
			expirationCalendar.set(Calendar.SECOND, 60);
			expirationPrivateDataKey = expirationCalendar.getTime();
			MTGoxCmd cmd = MtgoxFactory.eINSTANCE.createMTGoxCmd();
			cmd.setJsonSnd(k);
			cmd.setCommand("private");
			mtgoxWebSocket.send(cmd);
		}

		boolean doit = false;
	}
}
