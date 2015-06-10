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

package net.sf.smbt.ui.btc.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.Fundamentals;
import net.sf.smbt.btc.mtgox.MTGoxController;
import net.sf.smbt.btc.mtgox.MTGoxUtils;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.btc.Activator;
import net.sf.smbt.ui.btc.prefs.MtGoxWalletPreferenceConstants;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.utils.LinkedFinancialTimedValue;
import net.sf.smbt.ui.widgets.utils.TimeDuration;
import net.sf.smbt.ui.widgets.utils.TimeRange;
import net.sf.smbt.ui.widgets.vu.UbiCandelstickChart;
import net.sf.smbt.ui.widgets.vu.UbiOscilloscope;
import net.sf.smbt.ui.widgets.vu.UbiTimed2DChart;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class MarketView extends ViewPart {
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font bigFont = new Font(Display.getDefault(), "tahoma", 16, SWT.BOLD);
	private Font medFont = new Font(Display.getDefault(), "tahoma", 12, SWT.NORMAL);
	private UbiOscilloscope oscillo;
	private UbiCandelstickChart chart;
	private Label currentLabel;
	private Composite container;
	
	private static BtcCurrency[] currencies = new BtcCurrency[] {
		BtcCurrency.USD,
		BtcCurrency.EUR,
		BtcCurrency.AUD,
		BtcCurrency.CAD,
		BtcCurrency.CHF,
		BtcCurrency.CNY,
		BtcCurrency.GBP,
		BtcCurrency.HKD,
		BtcCurrency.JPY,
		BtcCurrency.PLN
	};
	private static TimeDuration[] defaultPrecisions = new TimeDuration[] {
		TimeDuration.FIVE_MINUTES,
		TimeDuration.FIFTEEN_MINUTES,
		TimeDuration.ONE_HOUR
	};
	private TimeRange range;
	
	private MTGoxController mtgoxController;
	
	private ComboViewer timeRangeComboViewer;
	private ComboViewer currencyComboViewer;
	
	private TimeDuration lastTimeDuration;
	
	public MarketView() {
		range = TimeRange.FIVE_DAY;
	}
	
	class RefreshFetchesJob extends  UbiJob {
		BitcoinMarket market;
		public RefreshFetchesJob(BitcoinMarket market) {
			super("refresh market fetches");
			this.market = market;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			currentLabel.setText(
				market.getBroker() + "("+market.getCurrency()+"/"+"BTC) : Buy ("+
				market.getBuy()+" : "+market.getSell()+") Sell | Low ("+market.getLow()+" : "+
				market.getHigh()+") High | Last :"+market.getLast()
			);
			float[] values = new float[mtgoxController.getMTGox().getTrend().size()];
			int i = 0;
			for (Fundamentals f : mtgoxController.getMTGox().getTrend()) {
				values[i] = f.getLast();
				i++;
			}
			oscillo.setValues(values);
			recomputeRanges();
			schedule(3000);
			return Status.OK_STATUS;
		}
	};

	
	public void initMarket() {
		String apiKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_API_KEY);
		String secretKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_SECRET_KEY);
		
		mtgoxController = MTGoxUtils.INSTANCE.getMTGoxControl(
			apiKey,
			secretKey
		);
		
		final RefreshFetchesJob refreshFetchesJob = new RefreshFetchesJob(mtgoxController.getMTGox().getMarket());
		mtgoxController.getMTGox().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (
					msg.getFeature().equals(MtgoxPackage.Literals.MT_GOX__SALES)
				){
					DepthValue v = (DepthValue) msg.getNewValue();
					if (mtgoxController.getMtgoxDataManager().getMtGox().getMarket().getCurrency().equals(v.getCurrency())) {
						refreshFetchesJob.cancel();
						refreshFetchesJob.schedule();
					}
				}
			}
		});
		mtgoxController.getMTGox().getMarket().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature().equals(BtcPackage.Literals.BITCOIN_MARKET__LAST)) {
					refreshFetchesJob.schedule();
				}
			}
		});
		refreshFetchesJob.schedule(2500);
	}
	@Override
	public void dispose() {
		if (mtgoxController != null) {
			if (mtgoxController.getMtgoxPipe() != null) {
				QuanticMojo.INSTANCE.closePipe(
					mtgoxController.getMtgoxPipe(),
					true
				);
			}
		}
		super.dispose();
	}
	@Override
	public void createPartControl(Composite parent) {
		container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		Composite topBag = GUIToolkit.INSTANCE.createComposite(container);
		topBag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		topBag.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		Composite topLeft  = GUIToolkit.INSTANCE.createComposite(topBag);
		topLeft.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		topLeft.setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 33).grab(true, false).create());
		
		lastTimeDuration = TimeDuration.FIVE_MINUTES;
		
		timeRangeComboViewer = new ComboViewer(topLeft);
		timeRangeComboViewer.setContentProvider(new ArrayContentProvider());
		timeRangeComboViewer.setLabelProvider(new LabelProvider());
		timeRangeComboViewer.setInput(defaultPrecisions);
		timeRangeComboViewer.setSelection(new StructuredSelection(TimeDuration.FIVE_MINUTES));
		timeRangeComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					lastTimeDuration = (TimeDuration) ((StructuredSelection)timeRangeComboViewer.getSelection()).getFirstElement();
					recomputeRanges();
				}
			}
		);

		currencyComboViewer = new ComboViewer(topLeft);
		currencyComboViewer.setContentProvider(new ArrayContentProvider());
		currencyComboViewer.setLabelProvider(new LabelProvider());
		currencyComboViewer.setInput(currencies);
		currencyComboViewer.setSelection(new StructuredSelection(BtcCurrency.EUR));
		currencyComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ISelection s = event.getSelection();
					if (s instanceof StructuredSelection) {
						BtcCurrency currency = (BtcCurrency) ((StructuredSelection)s).getFirstElement();
						mtgoxController.getMTGox().getMarket().setCurrency(currency);
						mtgoxController.getMTGox().getTrend().clear();
						oscillo.redraw();
					}
					recomputeRanges();
				}
			}
		);
		currencyComboViewer.getCombo().setEnabled(false);

		Composite topRight  = GUIToolkit.INSTANCE.createComposite(topBag);
		topRight.setLayout(GridLayoutFactory.fillDefaults().create());
		topRight.setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 33).grab(true, false).create());
		
		oscillo = new UbiOscilloscope(topRight, SWT.HORIZONTAL);
		oscillo.setBackground(GUIToolkit.BG);
		oscillo.setForeground(ColorConstants.yellow);
		oscillo.setLayout(GridLayoutFactory.fillDefaults().create());
		oscillo.setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 33).grab(true, false).create());
		
		currentLabel = new Label(container, SWT.NONE);
		currentLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		currentLabel.setFont(medFont);
		currentLabel.setForeground(lightBlue);
		
		chart = new UbiCandelstickChart(
			container, 
			UbiTimed2DChart.STYLE_CANDLES, 
			50, 100, "EUR", "EUR/BTC Market", range, 
			TimeDuration.ONE_DAY, TimeDuration.THREE_MINUTES
		);
		chart.setLayout(GridLayoutFactory.fillDefaults().create());
		chart.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		chart.setFont(bigFont);
		chart.setBackground(ColorConstants.darkGray);
		chart.setInsideColor(ColorConstants.darkGray);
		chart.setLineColor(lightBlue);
		chart.setTooltipFGColor(ColorConstants.white);
		chart.setTooltipBGColor(ColorConstants.orange);
		chart.setMinValueColor(ColorConstants.orange);
		chart.setMaxValueColor(ColorConstants.orange);
		chart.setMinUnitColor(ColorConstants.red);
		chart.setMaxUnitColor(ColorConstants.red);
		
		initMarket();
	}
	
	private void recomputeRanges() {
		new UbiJob("MtGOX Chart Refesh") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				if (lastTimeDuration instanceof TimeDuration){
					List<LinkedFinancialTimedValue> timedValues = new ArrayList<LinkedFinancialTimedValue>();
					List<FetchValue> values = mtgoxController.getMTGox().getFetchs();
					for (int i=0; i<values.size();i++) {
						FetchValue order = values.get(i);
						if (order!=null) {
							Date d = new Date(order.getStamp());
							LinkedFinancialTimedValue v;
							if (!chart.getTimedRange().hasValue(d)) {
								v = new LinkedFinancialTimedValue(order.getPrice(), d, order.getAmount(), LinkedFinancialTimedValue.UP);
								chart.getTimedRange().setTimedValue(v);
							} else {
								v = (LinkedFinancialTimedValue) chart.getTimedRange().getTimedValue(d);
							}
							timedValues.add(v);
							if (i-1>=0 && timedValues.get(i-1) != null && !timedValues.isEmpty()) {
								LinkedFinancialTimedValue p = timedValues.get(i-1);
								v.setPrec(p);
								p.setNext(v);
							}
						}
					}

					Rectangle r = chart.getBounds();
					chart.getTimedRange().setScope(chart.getCandlesManager().getNbCandles(r.width, r.height, 6, 6)*lastTimeDuration.getDuration());
					chart.getTimedRange().setTimedValues(timedValues);
					timedValues.clear();
					chart.redraw();
				}
				return Status.OK_STATUS;
			}
		}.schedule();
	}
	@Override
	public void setFocus() {}
}
