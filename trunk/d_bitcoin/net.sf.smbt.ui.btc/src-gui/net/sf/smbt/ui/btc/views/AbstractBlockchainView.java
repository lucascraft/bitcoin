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

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;

import net.sf.smbt.btc.blockchaincmd.BlockchainCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.utils.BlockChainUiUtils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractBlockchainView extends ViewPart {
	protected RefreshJob refreshJob;
	protected CmdPipe blockchainEngine;
	protected JFreeChart chart;

	private final class RefreshJob extends UbiJob {
		public RefreshJob() {
			super("BlockChain refresh job");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			blockchainEngine.send(getCommand());
			schedule(10000);
			return Status.OK_STATUS;
		}
	}
	public AbstractBlockchainView() {
		blockchainEngine = QuanticMojo.INSTANCE.createHttpPipe(
			"blockchain", 
			"http://blockchain.info"
		);	
		blockchainEngine.addQxEventHandler(new AbstractQxEventHandlerImpl() {
			public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
				if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
					Cmd cmd = event.getCmd();
					if (cmd instanceof BlockchainCmd) {
						BlockchainCmd btcCmd = (BlockchainCmd) cmd;
						final String jsonRcv = btcCmd.getJsonRcv();
						//System.out.println(jsonRcv);
						new UbiJob("refresh text") {
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
					      		Object obj;
								try {
									obj = new ObjectMapper().readTree(jsonRcv);
									XYSeries serie = BlockChainUiUtils.INSTANCE.createSeriesFromJson("serie", (JsonNode) obj);
									final XYSeriesCollection dataset = new XYSeriesCollection();
							        dataset.addSeries(serie);
							        chart.getXYPlot().setDataset(dataset);
								} catch (JsonProcessingException e) {
									e.printStackTrace();
								} catch (IOException e) {
									e.printStackTrace();
								}
								return Status.OK_STATUS;
							}
						}.schedule();
					}
				}
			};
		});
		blockchainEngine.setLocked(true);
		refreshJob = new RefreshJob();
		refreshJob.schedule();
	}

	
	abstract protected Cmd getCommand();
	abstract protected String getChartTitle();
	abstract protected String getXAxisLabel();
	abstract protected String getYAxisLabel();

	public void addCharts(Composite folder) {
		chart = ChartFactory.createXYStepChart(
			getChartTitle(),
	        getXAxisLabel(), getYAxisLabel(),
	        null,
	        PlotOrientation.VERTICAL,
	        true,   // legend
	        true,   // tooltips
	        false   // urls
		);

		// then customise it a little...
		
		final XYPlot plot = chart.getXYPlot();

		chart.getTitle().setPaint(Color.LIGHT_GRAY);
		
		chart.setBackgroundPaint(new java.awt.Color(66, 66, 66));
		plot.setBackgroundPaint(new java.awt.Color(66, 66, 66));
		plot.getRenderer().setSeriesVisibleInLegend(false);

		plot.getRangeAxis().setTickLabelPaint(Color.LIGHT_GRAY);
		plot.getRangeAxis().setLabelPaint(Color.LIGHT_GRAY);

		plot.getDomainAxis().setTickLabelPaint(Color.LIGHT_GRAY);
		plot.getDomainAxis().setLabelPaint(Color.LIGHT_GRAY);

		plot.getRenderer().setSeriesStroke(0, new BasicStroke(2.0f));
	       
		// and present it in a frame...
			
		new ChartComposite(folder, SWT.NONE, chart, true);
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());
		addCharts(container);
	}

	@Override
	public void setFocus() {}
}
