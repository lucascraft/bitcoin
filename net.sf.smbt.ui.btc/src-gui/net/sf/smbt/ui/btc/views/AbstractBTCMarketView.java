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

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.MTGoxController;
import net.sf.smbt.btc.mtgox.MTGoxUtils;
import net.sf.smbt.ui.btc.Activator;
import net.sf.smbt.ui.btc.prefs.MtGoxWalletPreferenceConstants;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.utils.CandleStickData;
import net.sf.smbt.ui.widgets.utils.LinkedFinancialTimedValue;
import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimeDuration;
import net.sf.smbt.ui.widgets.vu.CandlesManager;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.experimental.chart.swt.ChartComposite;

public abstract class AbstractBTCMarketView extends ViewPart {
	protected RefreshJob refreshJob;
	protected JFreeChart chart;
	private MTGoxController mtgoxController;
	private SelfTimedRange<LinkedFinancialTimedValue> timedRange;
	private volatile long scope = TimeDuration.ONE_DAY.getDuration();
	
	class RefreshJob extends UbiJob {
		public RefreshJob() {
			super("BlockChain refresh job");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			timedRange 	= new SelfTimedRange<LinkedFinancialTimedValue>(scope);
			List<LinkedFinancialTimedValue> timedValues = new ArrayList<LinkedFinancialTimedValue>();
			List<FetchValue> values = mtgoxController.getMTGox().getFetchs();
			for (int i=0; i<values.size();i++) {
				FetchValue order = values.get(i);
				if (order!=null) {
					Date d = new Date(order.getStamp());
					LinkedFinancialTimedValue v;
					if (!timedRange.hasValue(d)) {
						v = new LinkedFinancialTimedValue(order.getPrice(), d, order.getAmount(), LinkedFinancialTimedValue.UP);
						timedRange.setTimedValue(v);
					} else {
						v = (LinkedFinancialTimedValue) timedRange.getTimedValue(d);
					}
					timedValues.add(v);
					if (i-1>=0 && timedValues.get(i-1) != null && !timedValues.isEmpty()) {
						LinkedFinancialTimedValue p = timedValues.get(i-1);
						v.setPrec(p);
						p.setNext(v);
					}
				}
			}
					
			CandlesManager candlesManager = new CandlesManager(timedRange, 8);
			Rectangle r = chartComposite.getBounds();
			candlesManager.updateCandles(r.width, r.height, 2, 2);
			
			int size = candlesManager.getCandles().size();
			Date[] dates = new Date[size];
			double[] highs = new double[size];
			double[] lows = new double[size];
			double[] closes = new double[size];
			double[] opens = new double[size];
			double[] volumes = new double[size];
			double min = Double.MAX_VALUE;
			double max = 0, maxVolume = 0;
			int i = 0;
			for (CandleStickData cData : candlesManager.getCandles()) {
				dates[i]	= cData.getRange().begins;
				highs[i]	= new Float(cData.getHigh()).doubleValue();
				lows[i]		= new Float(cData.getLow()).doubleValue();
				opens[i]	= new Float(cData.getOpen()).doubleValue();
				closes[i]	= new Float(cData.getClose()).doubleValue();
				volumes[i]	= new Float(cData.getVolume()).doubleValue();
				
				if (highs[i] > 0 && lows[i] > 0 && opens[i] > 0 && closes[i] > 0) {
					min = min > highs[i] ? min = highs[i] : min;
					min = min > lows[i] ? min = lows[i] : min;
					min = min > opens[i] ? min = opens[i] : min;
					min = min > closes[i] ? min = closes[i] : min;
					
					max = max < highs[i] ? max = highs[i] : max;
					max = max < lows[i] ? max = lows[i] : max;
					max = max < opens[i] ? max = opens[i] : max;
					max = max < closes[i] ? max = closes[i] : max;
				}
				if (volumes[i] > 0) {
					maxVolume = maxVolume < volumes[i] ? maxVolume = volumes[i] : maxVolume;
				}
				
				i++;
			}
			DefaultHighLowDataset dataset = new DefaultHighLowDataset("BTC/USD", dates, highs, lows, opens, closes, volumes);
			
			NumberAxis domainAxis = new NumberAxis();
			
			max = max < min ? min+1 : max;
			
			domainAxis.setRange(new Range(min, max));
			domainAxis.setLabel("Price");
			domainAxis.setTickLabelPaint(Color.WHITE);
			domainAxis.setLabelPaint(Color.WHITE);
			
			NumberAxis volumeAxis = new NumberAxis();
			
			maxVolume = maxVolume < 0 ? 1 : maxVolume;
			
			volumeAxis.setRange(new Range(0, maxVolume));
			volumeAxis.setLabel("Volume");
			volumeAxis.setTickLabelPaint(Color.WHITE);
			volumeAxis.setLabelPaint(Color.WHITE);

			final XYPlot plot = chart.getXYPlot();
			
			chart.setBackgroundPaint(new java.awt.Color(66, 66, 66));
			
			plot.setBackgroundPaint(new java.awt.Color(66, 66, 66));
			plot.getRenderer().setSeriesVisibleInLegend(false);
			plot.getRenderer().setBaseToolTipGenerator(new XYToolTipGenerator() {
				@Override
				public String generateToolTip(XYDataset ds, int r, int c) {
					return ds.getYValue(r, c) + " BTC";
				}
			});
			chart.getTitle().setPaint(Color.WHITE);

			plot.setRangeAxis(0, domainAxis);
			plot.setRangeAxis(1, volumeAxis);

			chart.getXYPlot().setDataset(dataset);
			
			schedule(3000);
			return Status.OK_STATUS;
		}
	}
	
	public AbstractBTCMarketView() {
		String apiKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_API_KEY);
		String secretKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_SECRET_KEY);
		
		mtgoxController = MTGoxUtils.INSTANCE.getMTGoxControl(
			apiKey,
			secretKey
		);

		refreshJob = new RefreshJob();
		refreshJob.schedule();
	}
	
	abstract protected String getChartTitle();
	abstract protected String getXAxisLabel();
	abstract protected String getYAxisLabel();

	private ChartComposite chartComposite;
	public void addCharts(Composite folder) {
		chart = ChartFactory.createCandlestickChart(
			"BTC Price / Volume",
			"Time", 
			"Price",
			new DefaultHighLowDataset("Test", new Date[0], new double[0], new double[0], new double[0], new double[0], new double[0] ), 
			true
		);
		
		chart.setBackgroundPaint(new java.awt.Color(66, 66, 66));
		chart.getPlot().setBackgroundPaint(new java.awt.Color(66, 66, 66));
			
		chartComposite = new ChartComposite(folder, SWT.NONE, chart, true);
	}

	@Override
	public void createPartControl(Composite parent) {
		contributeToActionBars();
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		addCharts(container);
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}

	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(new Action("W1") {
			@Override
			public void run() {
				super.run();
				new UbiJob("W1") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 52*TimeDuration.ONE_WEEK.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("D3") {
			@Override
			public void run() {
				new UbiJob("D3") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 36*TimeDuration.ONE_WEEK.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("D1") {
			@Override
			public void run() {
				new UbiJob("D1") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 12*TimeDuration.ONE_WEEK.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("H4") {
			@Override
			public void run() {
				new UbiJob("H4") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 2*TimeDuration.ONE_WEEK.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("H1") {
			@Override
			public void run() {
				new UbiJob("H1") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 4*TimeDuration.ONE_DAY.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("M15") {
			@Override
			public void run() {
				new UbiJob("M15") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = TimeDuration.ONE_DAY.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("M5") {
			@Override
			public void run() {
				new UbiJob("M5") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 32*TimeDuration.FIFTEEN_MINUTES.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("M3") {
			@Override
			public void run() {
				new UbiJob("M3") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 20*TimeDuration.FIFTEEN_MINUTES.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
		manager.add(new Action("M1") {
			@Override
			public void run() {
				new UbiJob("M1") {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						scope = 6*TimeDuration.FIFTEEN_MINUTES.getDuration();
						refreshJob.cancel();
						refreshJob.schedule();
						return Status.OK_STATUS;
					};
				}.schedule();
			}
		});
	}

	@Override
	public void setFocus() {}
}
