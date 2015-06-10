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

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.cmd.BTCUtils;
import net.sf.smbt.btc.mtgox.DepthStatus;
import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchKind;
import net.sf.smbt.btc.mtgox.Fundamentals;
import net.sf.smbt.btc.mtgox.MTGoxController;
import net.sf.smbt.btc.mtgox.MTGoxUtils;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.fmodex.core.AudioUtils;
import net.sf.smbt.fmodex.core.SystemSound;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.btc.Activator;
import net.sf.smbt.ui.btc.prefs.MtGoxWalletPreferenceConstants;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.vu.UbiOscilloscope;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.mylyn.commons.ui.dialogs.AbstractNotificationPopup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

public class TradesView extends ViewPart {
	public SimpleDateFormat HH_MM_SS_DATE_FORMAT; 

	private Image alarmIcon = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/alarm.png").createImage();
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 12, SWT.NORMAL);
	private Label currentLabel;
	private TreeViewer bidsDepthTreeViewer, asksDepthTreeViewer, lastSalesTreeViewer;
	private MTGoxController mtgoxController;
	private UbiOscilloscope oscillo;
	private ComboViewer currencyComboViewer;
	
	public TradesView() {
		HH_MM_SS_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");
		initMarket();
	}
	
	class RefreshSalesJob extends UbiJob {
		private DepthValue latest;
		public RefreshSalesJob() {
			super("refresh trades GUI");
		}
		public void setLatest(DepthValue latest) {
			this.latest = latest;
		}
		public DepthValue getLatest() {
			return latest;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (latest.getCurrency().equals(mtgoxController.getMTGox().getCurrency())) {
				if (latest.getKind().equals(FetchKind.ASK)) {
					AudioUtils.INSTANCE.playSystemSound(SystemSound.SMALL_BELL_RING_2);
				} else {
					AudioUtils.INSTANCE.playSystemSound(SystemSound.SMALL_BELL_RING_1);
				}
				notifyTradeStatus2(latest, getDisplay());
				oscillo.redraw();
			}
			lastSalesTreeViewer.refresh();
			return Status.OK_STATUS;
		}
	};

	class RefreshDepthJob extends UbiJob {
		BitcoinMarket market;
		public RefreshDepthJob(BitcoinMarket market) {
			super("refresh depth GUI");
			this.market = market;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			try {
				currentLabel.setText(
					market.getBroker()		+ "("+market.getCurrency()+"/"+"BTC) : Buy ("+
					market.getBuy()+" : "	+ market.getSell()+") Sell | Low (" + 
					market.getLow()+" : "	+ market.getHigh()+") High | Last :"+ 
					market.getLast()
				);
				float[] values = new float[mtgoxController.getMTGox().getTrend().size()];
				int i = 0;
				for (Fundamentals f : mtgoxController.getMTGox().getTrend()) {
					values[i] = f.getLast();
					i++;
				}
				oscillo.setValues(values);
			} catch (Exception e) {
				e.printStackTrace();
			}
			asksDepthTreeViewer.refresh();
			bidsDepthTreeViewer.refresh();
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
		
		final RefreshSalesJob refreshSalesJob = new RefreshSalesJob();
		final RefreshDepthJob refreshDepthJob = new RefreshDepthJob(mtgoxController.getMTGox().getMarket());
		
		mtgoxController.getMTGox().getMarket().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature().equals(BtcPackage.Literals.BITCOIN_MARKET__BUY)) {
					refreshDepthJob.cancel();
					refreshDepthJob.schedule();
				}
			}
		});
		mtgoxController.getMTGox().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (
					msg.getFeature().equals(MtgoxPackage.Literals.MT_GOX__ASKS) ||
					msg.getFeature().equals(MtgoxPackage.Literals.MT_GOX__BIDS) 
				){
					refreshDepthJob.cancel();
					refreshDepthJob.schedule();
				} else if (
					msg.getFeature().equals(MtgoxPackage.Literals.MT_GOX__SALES)
				){
					DepthValue v = (DepthValue) msg.getNewValue();
					if (mtgoxController.getMtgoxDataManager().getMtGox().getMarket().getCurrency().equals(v.getCurrency())) {
						refreshSalesJob.cancel();
						refreshSalesJob.setLatest(v);
						refreshSalesJob.schedule();
					}
				}
			}
		});
	}
	private void notifyTradeStatus2(final DepthValue v, Display display) {
		final AbstractNotificationPopup notification = new AbstractNotificationPopup(display) {
		  @Override
		  protected void createContentArea(Composite composite) {
			  composite.setLayout(new GridLayout(1, true));
			  composite.setBackground(GUIToolkit.BG);
			  Label label = new Label(composite, SWT.NONE);
			  label.setBackground(GUIToolkit.BG);
			  label.setForeground(v.getKind().equals(FetchKind.ASK) ? GUIToolkit.lightRed : ColorConstants.darkGreen);
			  if (v != null && v.getKind() != null && mtgoxController.getMTGox().getMarket().getCurrency() != null) {
				  label.setText( 
					  (v.getKind().equals(FetchKind.ASK) ? "Sold " : "Bought ") +
					  v.getAmount() + " for " + v.getPrice() + BTCUtils.INSTANCE.getCurrencySymbol(v.getCurrency()) + " " + 
					  "\nat " + new Date(v.getStamp()*1000)
				  );
			  }
		  }
		  @Override
		  protected String getPopupShellTitle(){
		    return "MtGOX Trade done";
		  }
		  @Override
		  protected Image getPopupShellImage(int maximumHeight) {
		    return alarmIcon;
		  }
		};
	    if (Display.getDefault() == Display.getCurrent()) {
	    	   notification.open();
	    } else {
	    	Display.getDefault().syncExec(
	    		new Runnable() {
	    			public void run() {
	    				notification.open();
	    			}
	            }
	        );
	    }
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
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		currencyComboViewer = new ComboViewer(container);
		currencyComboViewer.setContentProvider(new ArrayContentProvider());
		currencyComboViewer.setLabelProvider(new LabelProvider());
		currencyComboViewer.setInput(BtcCurrency.VALUES);
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
					}
				}
			}
		);
		currencyComboViewer.getCombo().setEnabled(false);


		currentLabel = new Label(container, SWT.NONE);
		currentLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, false).create());
		currentLabel.setFont(medFont);
		currentLabel.setForeground(lightBlue);
		currentLabel.setBackground(GUIToolkit.BG);
		currentLabel.setText("                                                                                                                                                        ");
		
		Composite oscilloBag = GUIToolkit.INSTANCE.createComposite(container);
		oscilloBag.setLayout(GridLayoutFactory.fillDefaults().create());
		oscilloBag.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
		
		oscillo = new UbiOscilloscope(oscilloBag, SWT.HORIZONTAL);
		oscillo.setBackground(GUIToolkit.BG);
		oscillo.setForeground(ColorConstants.yellow);
		oscillo.setLayout(GridLayoutFactory.fillDefaults().create());
		oscillo.setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 33).grab(true, false).create());


		
		
		SashForm sash = new SashForm(container, SWT.BORDER | SWT.HORIZONTAL);
		sash.setLayout(GridLayoutFactory.fillDefaults().create());
		sash.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, true).create());
		sash.setBackground(GUIToolkit.FG);
		
		SashForm sashDepths = new SashForm(sash, SWT.BORDER | SWT.HORIZONTAL);
		sashDepths.setLayout(GridLayoutFactory.fillDefaults().create());
		sashDepths.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sashDepths.setBackground(GUIToolkit.FG);

		
		//
		// BIDS
		//
		
		bidsDepthTreeViewer = new TreeViewer(sashDepths);
		
		bidsDepthTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		bidsDepthTreeViewer.getControl().setFont(medFont);
		bidsDepthTreeViewer.getTree().setLinesVisible(false);
		bidsDepthTreeViewer.getControl().setBackground(ColorConstants.darkGray);
		bidsDepthTreeViewer.getControl().setForeground(ColorConstants.lightGray);
		
		bidsDepthTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(new MTGoxCompseableAdapterFactory())
		{
			@Override
			public String getText(Object object) {
				return super.getText(object);
			}
		});
		bidsDepthTreeViewer.setContentProvider(new BtcTransactionsContentProvider(FetchKind.BID));
		bidsDepthTreeViewer.getTree().setHeaderVisible(true);
		bidsDepthTreeViewer.getTree().setLinesVisible(true);

		bidsDepthTreeViewer.setInput(mtgoxController.getMTGox());
		
		//
		// ASKS
		//
		
		asksDepthTreeViewer = new TreeViewer(sashDepths);
		
		asksDepthTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		asksDepthTreeViewer.getControl().setFont(medFont);
		asksDepthTreeViewer.getControl().setBackground(ColorConstants.darkGray);
		asksDepthTreeViewer.getControl().setForeground(ColorConstants.lightGray);
		asksDepthTreeViewer.getTree().setLinesVisible(false);

		asksDepthTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(new MTGoxCompseableAdapterFactory())
		{
			@Override
			public String getText(Object object) {
				return super.getText(object);
			}
		});
		asksDepthTreeViewer.setContentProvider(new BtcTransactionsContentProvider(FetchKind.ASK));
		asksDepthTreeViewer.getTree().setHeaderVisible(true);
		asksDepthTreeViewer.getTree().setLinesVisible(true);

		asksDepthTreeViewer.setInput(mtgoxController.getMTGox());
		
		
		
		lastSalesTreeViewer = new TreeViewer(sash);
		
		lastSalesTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		lastSalesTreeViewer.getControl().setFont(medFont);
		lastSalesTreeViewer.getControl().setBackground(ColorConstants.darkGray);
		lastSalesTreeViewer.getControl().setForeground(ColorConstants.lightBlue);
		lastSalesTreeViewer.getTree().setLinesVisible(false);

		lastSalesTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(new MTGoxCompseableAdapterFactory()) {
			@Override
			public String getText(Object object) {
				return super.getText(object);
			}
		});
		lastSalesTreeViewer.setContentProvider(new LastSalesHistoryContentProvider());
		lastSalesTreeViewer.getTree().setHeaderVisible(true);
		lastSalesTreeViewer.getTree().setLinesVisible(true);

		lastSalesTreeViewer.setInput(mtgoxController.getMTGox());
		
		sash.setWeights(new int[] {5, 3});
		
		sashDepths.setWeights(new int[] {3, 3});
		
		createBidTradeTableViewerColumn("Sum", 		75, bidsDepthTreeViewer);
		createBidTradeTableViewerColumn("Size", 	75, bidsDepthTreeViewer);
		createBidTradeTableViewerColumn("BUY @",	75, bidsDepthTreeViewer);
		
		
		createAskTradeTableViewerColumn("SELL @", 	75, asksDepthTreeViewer);
		createAskTradeTableViewerColumn("Size", 	75, asksDepthTreeViewer);
		createAskTradeTableViewerColumn("Sum", 		75, asksDepthTreeViewer);
		
		//
		
		createSalesTableViewerColumn("Volume", 	65, lastSalesTreeViewer);
		createSalesTableViewerColumn("Price", 	65, lastSalesTreeViewer);
		createSalesTableViewerColumn("Date",	65, lastSalesTreeViewer);
	}
	
	
	private TreeViewerColumn createBidTradeTableViewerColumn(String title, int bound, TreeViewer tv) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(tv, SWT.NONE);
		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);
				if (cell.getElement() instanceof DepthValue) {
					DepthValue v = (DepthValue) cell.getElement();
					String cellText = "???";
					cell.setForeground(GUIToolkit.FG);
					cell.setBackground(GUIToolkit.BG);
					long now = System.currentTimeMillis();
					switch(cell.getColumnIndex()) {
						case 0: // Bid Sum
							if (v instanceof DepthValue) {
								cellText = "" + v.getSum();
							}
							break;
						case 1: // Size
							if (v instanceof DepthValue) {
								cellText = "" + v.getAmount();
							}
							break;
						case 2: // Bid
							if (v instanceof DepthValue) {
								cellText = "" + v.getPrice();
							}
							break;
					}
					cell.setText(cellText);
					if (v instanceof DepthValue && (cell.getColumnIndex() == 0 || cell.getColumnIndex() == 1 || cell.getColumnIndex() == 2)) {
						if (v.getLastLocalStatus()+12000l>now) {
							if (v.getStatus().equals(DepthStatus.ADD)) {
								cell.setForeground(GUIToolkit.lightGreen);
							} else if (v.getStatus().equals(DepthStatus.REM)) {
								cell.setForeground(GUIToolkit.lightRed);
							}  else if (v.getStatus().equals(DepthStatus.UPDATE)) {
								cell.setForeground(GUIToolkit.orange);
							} 
						}
					}
				}
			}
		});
		return viewerColumn;
	}
	
	private TreeViewerColumn createAskTradeTableViewerColumn(String title, int bound, TreeViewer tv) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(tv, SWT.NONE);
		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);
				if (cell.getElement() instanceof DepthValue) {
					DepthValue v = (DepthValue) cell.getElement();
					String cellText = "???";
					cell.setForeground(GUIToolkit.FG);
					cell.setBackground(GUIToolkit.BG);
					long now = System.currentTimeMillis();
					switch(cell.getColumnIndex()) {
						case 2: // Bid Sum
							if (v instanceof DepthValue) {
								cellText = "" + v.getSum();
							}
							break;
						case 1: // Size
							if (v instanceof DepthValue) {
								cellText = "" + v.getAmount();
							}
							break;
						case 0: // Bid
							if (v instanceof DepthValue) {
								cellText = "" + v.getPrice();
							}
							break;
					}
					cell.setText(cellText);
					if (v instanceof DepthValue && (cell.getColumnIndex() == 0 || cell.getColumnIndex() == 1 || cell.getColumnIndex() == 2)) {
						if (v.getLastLocalStatus()+12000l>now) {
							if (v.getStatus().equals(DepthStatus.ADD)) {
								cell.setForeground(GUIToolkit.lightGreen);
							} else if (v.getStatus().equals(DepthStatus.REM)) {
								cell.setForeground(GUIToolkit.lightRed);
							}  else if (v.getStatus().equals(DepthStatus.UPDATE)) {
								cell.setForeground(GUIToolkit.orange);
							} 
						}
					}
				}
			}
		});
		return viewerColumn;
	}
	
	private TreeViewerColumn createSalesTableViewerColumn(String title, int bound, TreeViewer tv) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(tv, SWT.NONE);
		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			protected void paint(Event event, Object element) {
				super.paint(event, element);
			}
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);
				if (cell.getElement() instanceof DepthValue) {
					DepthValue v = (DepthValue) cell.getElement();
					String cellText = "???";
					switch(cell.getColumnIndex()) {
						case 0: // Amount
							cellText = "" + v.getAmount();
							cell.setForeground(GUIToolkit.FG);
							cell.setBackground(GUIToolkit.BG);
							break;
						case 1: // Price
							String symbol = BTCUtils.INSTANCE.getCurrencySymbol(v.getCurrency());
							cellText = "" + v.getPrice() + " " + symbol;
							cell.setForeground(v.getKind().equals(FetchKind.ASK) ? GUIToolkit.lightRed : GUIToolkit.lightGreen);
							cell.setBackground(GUIToolkit.dark_gray);
							break;
						case 2: // Date
							cell.setForeground(GUIToolkit.FG);
							cell.setBackground(GUIToolkit.BG);
							cellText = "" + HH_MM_SS_DATE_FORMAT.format(new Date(v.getStamp()));
							break;
					}
					cell.setText(cellText);
				}
			}
		});
		return viewerColumn;
	}
	@Override
	public void setFocus() {}
}
