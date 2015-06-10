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

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.btc.mtgox.MTGoxController;
import net.sf.smbt.btc.mtgox.MTGoxUtils;
import net.sf.smbt.btc.mtgox.Order;
import net.sf.smbt.btc.mtgox.Wallet;
import net.sf.smbt.btc.mtgox.WalletRecord;
import net.sf.smbt.fmodex.core.AudioUtils;
import net.sf.smbt.fmodex.core.SystemSound;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.btc.Activator;
import net.sf.smbt.ui.btc.prefs.MtGoxWalletPreferenceConstants;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
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
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class MTGoxView extends ViewPart {
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 12, SWT.NORMAL);

	private TreeViewer transactionTreeViewer, hitoryTreeViewer;
	private ComboViewer currencyComboViewer;
	private RefreshJob refreshJob;
	private MTGoxController mtgoxController;
	private Image alarmIcon = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/alarm.png").createImage();
	private Action cancelOrderAction;
	private Label wallInfoLabel;
	
	public MTGoxView() {
		String apiKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_API_KEY);
		String secretKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_SECRET_KEY);
		
		if (apiKey == null || secretKey == null || "".equals(apiKey) || "".equals(secretKey)) {
				MessageDialog.openInformation(Display.getDefault().getActiveShell(), "BitMinter Key Information", "BitMinter Authentication Key is missing in preferences. \nPlease grab a key from BitMinter.com and update the eclipse preferences page accordingly.");
		}
		
		mtgoxController = MTGoxUtils.INSTANCE.getMTGoxControl(
			apiKey,
			secretKey
		);
		
		if (mtgoxController != null) {
			mtgoxController.getMtgoxPipe().addQxEventHandler(
				new AbstractQxEventHandlerImpl() {
					public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
						if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
							if (event.getCmd() instanceof MTGoxCmd) {
								MTGoxCmd cmd = (MTGoxCmd) event.getCmd();
								String jsonRcv = cmd.getJsonRcv();
								JsonElement o = MTGoxUtils.INSTANCE.loadDataFromJson(jsonRcv);
								if (o instanceof JsonObject) {
									try {
										String mtgoxTag = o.getAsJsonObject().get("mtgox").getAsString();		
										if (mtgoxTag != null) {
											if (
												mtgoxTag.endsWith("/private/order/cancel") ||
												mtgoxTag.endsWith("/private/order/add")
											) {
												JsonObject json = (JsonObject) o;
												refreshJob.cancel();
												refreshJob.schedule();
												notifyOrderStatus(json);
											}
										}
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							}
						}
					};
				}
			);
		}
		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
				if (event.getProperty().equals(MtGoxWalletPreferenceConstants.P_MTGOX_API_KEY)) {
					refreshJob.cancel();
					refreshJob.schedule();
				} else if (event.getProperty().equals(MtGoxWalletPreferenceConstants.P_MTGOX_SECRET_KEY)) {
					refreshJob.cancel();
					refreshJob.schedule();
				}
			}
		});

		refreshJob 	= new RefreshJob();
		mtgoxController.getMoneyOrders(BtcCurrency.BTC, mtgoxController.getMTGox().getMarket().getCurrency());
		mtgoxController.getWalletHistory(mtgoxController.getMTGox().getMarket().getCurrency());
	}
	
	private void notifyOrderStatus(JsonObject o) {
		final JsonObject json = o; 
		final AbstractNotificationPopup notification = new AbstractNotificationPopup(Display.getDefault())
		{
		  @Override
		  protected void createContentArea(Composite composite)
		  {
			  composite.setLayout(new GridLayout(1, true));
			  Label label = new Label(composite, SWT.NONE);
			  String tag = json.getAsJsonObject().get("mtgox").getAsString();
			  if (tag.endsWith("/cancel")) {
				  JsonObject returnv = (JsonObject) json.getAsJsonObject().get("return");
				  String oid = returnv.get("oid").getAsString();
				  String success = json.getAsJsonObject().get("result").getAsString();

				  label.setText("Cancelling " + oid + " : " + success );
			  } else if (tag.endsWith("/add")) {
				  String qid = json.getAsJsonObject().get("return").getAsString();
				  String success = json.getAsJsonObject().get("result").getAsString();
					
				  label.setText("Adding " + qid + " : " + success);
			  }
		  }
		  @Override
		  protected String getPopupShellTitle(){
		    return "MtGOX Order Status";
		  }
		  @Override
		  protected Image getPopupShellImage(int maximumHeight) {
		    return alarmIcon;
		  }
		};
		Runnable runnable = new Runnable(){
			public void run(){
				refreshJob.cancel();
				refreshJob.schedule(50);
				notification.open();
			}
		};
		Display.getDefault().syncExec(runnable);
	}
	class RefreshJob extends UbiJob {
		public RefreshJob() {
			super("MtGox View Refresh Job");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			String apiKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_API_KEY);
			String secretKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_SECRET_KEY);
			mtgoxController = MTGoxUtils.INSTANCE.getMTGoxControl(
				apiKey,
				secretKey
			);	
			
			if (mtgoxController != null) {
				if (mtgoxController.getMTGox().getWallet()!= null) {
					Wallet wallet = mtgoxController.getMTGox().getWallet();
					if (wallInfoLabel != null && wallet.getBtcInfo() != null && wallet.getEurInfo() != null) {
						wallInfoLabel.setText(
							"Balance : " + 
								wallet.getBtcInfo().getBalance().getDisplay() + " / " + 
									wallet.getEurInfo().getBalance().getDisplay() + " ("+ wallet.getTradeFee() + "% fee)" 
						);
					}
					mtgoxController.getMoneyOrders(
						BtcCurrency.BTC, 
						mtgoxController.getMTGox().getMarket().getCurrency()
					);
					mtgoxController.getWalletHistory(
						BtcCurrency.BTC
					);

					transactionTreeViewer.setInput(mtgoxController.getMTGox());
					hitoryTreeViewer.setInput(mtgoxController.getMTGox());
					
					transactionTreeViewer.refresh();
					hitoryTreeViewer.refresh();
				}
			}
			schedule(1500);
			return Status.OK_STATUS;
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setBackground(GUIToolkit.BG);
		container.setForeground(GUIToolkit.FG);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());

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


		wallInfoLabel = new Label(container, SWT.NONE);
		wallInfoLabel.setLayoutData(GridDataFactory.fillDefaults().create());
		wallInfoLabel.setFont(medFont);
		wallInfoLabel.setForeground(lightBlue);

		wallInfoLabel.setText(
			"Balance : " +"???"+ " (0.6% fee)" 
		);
		
		SashForm sash = new SashForm(container, SWT.BORDER | SWT.VERTICAL);
		sash.setLayout(GridLayoutFactory.fillDefaults().create());
		sash.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).	grab(true, true).create());
		sash.setBackground(GUIToolkit.FG);

		transactionTreeViewer = new TreeViewer(sash);
		
		transactionTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		transactionTreeViewer.getControl().setFont(medFont);
		transactionTreeViewer.getControl().setBackground(ColorConstants.darkGray);
		transactionTreeViewer.getControl().setForeground(ColorConstants.lightBlue);
		
		transactionTreeViewer.setLabelProvider(
			new AdapterFactoryLabelProvider(new MTGoxCompseableAdapterFactory()) {
				@Override
				public String getText(Object object) {
					return super.getText(object);
				}
			}
		);
		transactionTreeViewer.setContentProvider(new WalletOrdersContentProvider());
		transactionTreeViewer.getTree().setHeaderVisible(true);
		transactionTreeViewer.getTree().setLinesVisible(true);

		transactionTreeViewer.setInput(mtgoxController.getMTGox());
		
		createTableViewerColumn("Order",	100);
		createTableViewerColumn("type", 	100);
		createTableViewerColumn("BTC", 		100);
		createTableViewerColumn("Value", 	100);
		createTableViewerColumn("Status", 	100);
		createTableViewerColumn("Date", 	100);
		
		TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(
			transactionTreeViewer, 
			new FocusCellOwnerDrawHighlighter(transactionTreeViewer) {
				@Override
				public ViewerCell getFocusCell() {
					ViewerCell cell = super.getFocusCell();
					//handleClipDetails(cell.getElement(), cell.getColumnIndex());
					return cell;
				}
			}
		);
				
		ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(transactionTreeViewer) {
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
				return false;
			}
		};
				
		TreeViewerEditor.create(transactionTreeViewer, focusCellManager, actSupport, ColumnViewerEditor.KEYBOARD_ACTIVATION);
			
		cancelOrderAction = new Action(
			"Cancel Order",
			Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/cancel.png")
		) {
			public void run() {
				ISelection sel = transactionTreeViewer.getSelection();
				for (Object o : ((IStructuredSelection)sel).toArray()) {
					if (o instanceof Order) {
						Order order = (Order) o;
						String oid = order.getOid();
						if (mtgoxController != null) {
							mtgoxController.cancelOrder(
								BtcCurrency.BTC, 
								mtgoxController.getMTGox().getCurrency(), 
								oid
							);
							refreshJob.schedule(250);
						}
					}
				}
			};
		};

		hookContextMenu();
		
		hitoryTreeViewer = new TreeViewer(sash);
		
		hitoryTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		hitoryTreeViewer.getControl().setFont(medFont);
		hitoryTreeViewer.getControl().setBackground(ColorConstants.darkGray);
		hitoryTreeViewer.getControl().setForeground(ColorConstants.lightBlue);
		
		hitoryTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(new MTGoxCompseableAdapterFactory()) {
			@Override
			public String getText(Object object) {
				return super.getText(object);
			}
		});
		hitoryTreeViewer.setContentProvider(new WalletHistoryContentProvider());
		hitoryTreeViewer.getTree().setHeaderVisible(true);
		hitoryTreeViewer.getTree().setLinesVisible(true);

		hitoryTreeViewer.setInput(mtgoxController.getMTGox());
		
		createHistoryTableViewerColumn("Index", 	100);
		createHistoryTableViewerColumn("Info", 		100);
		createHistoryTableViewerColumn("type", 		100);
		createHistoryTableViewerColumn("Balance", 	100);
		createHistoryTableViewerColumn("Date", 		100);
		createHistoryTableViewerColumn("Value", 	100);

		sash.setWeights(new int[]{50, 50});
		
		init();
	}
	private void fillContextMenu(IMenuManager manager) {
		ISelection sel = transactionTreeViewer.getSelection();
		if (sel instanceof IStructuredSelection) {
			cancelOrderAction.setEnabled(true);
			manager.add(cancelOrderAction);

			// drillDownAdapter.addNavigationActions(manager);
			// Other plug-ins can contribute there actions here
			manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		}
	}
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(transactionTreeViewer.getControl());
		transactionTreeViewer.getControl().setMenu(menu);
		transactionTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection sel = event.getSelection();
				if (sel instanceof IStructuredSelection) {
					cancelOrderAction.setEnabled(true);
				}
			}
		});
		transactionTreeViewer.setSelection(new StructuredSelection());
		transactionTreeViewer.addDoubleClickListener(
			new IDoubleClickListener() {
				@Override
				public void doubleClick(DoubleClickEvent event) {
					if (event.getSelection() instanceof StructuredSelection) {
						cancelOrderAction.run();
						AudioUtils.INSTANCE.playSystemSound(SystemSound.BEEP_24);
					}
				}
			}
		);
	}
	private TreeViewerColumn createHistoryTableViewerColumn(String title, int bound) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(hitoryTreeViewer, SWT.NONE);
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
				if (cell.getElement() instanceof WalletRecord) {
					WalletRecord v = (WalletRecord) cell.getElement();
					String cellText = "???";
					switch(cell.getColumnIndex()) {
						case 0: 
							cellText = "" + v.getIndex();
							break;
						case 1: 
							cellText = "" + v.getInfo();
							break;
						case 2: 
							cellText = "" + v.getType();
							break;
						case 3: 
							cellText = "" + v.getBalance().getDisplay_short();
							break;
						case 4: 
							cellText = "" + v.getDate();
							break;
						case 5: 
							cellText = "" + v.getValue().getDisplay_short();
							break;
					}
					cell.setText(cellText);
					cell.setForeground(GUIToolkit.FG);
					cell.setBackground(GUIToolkit.BG);
				}
			}
		});
		return viewerColumn;
	}
	private TreeViewerColumn createTableViewerColumn(String title, int bound) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(transactionTreeViewer, SWT.NONE);
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
				if (cell.getElement() instanceof Order) {
					Order v = (Order) cell.getElement();
					String cellText = "???";
					switch(cell.getColumnIndex()) {
						case 0: 
							cellText = "" + v.getOid();
							break;
						case 1: 
							cellText = "" + v.getType();
							break;
						case 2: 
							cellText = "" + v.getAmount().getDisplay_short();
							break;
						case 3: 
							cellText = "" + v.getPrice().getDisplay_short();
							break;
						case 4: 
							cellText = "" + v.getStatus();
							break;
						case 5: 
							cellText = "" + v.getDate();
							break;
					}
					cell.setText(cellText);
					cell.setForeground(GUIToolkit.FG);
					cell.setBackground(GUIToolkit.BG);
				}
			}
		});
		return viewerColumn;
	}
	private void init() {
		refreshJob.schedule();
	}
	@Override
	public void setFocus() {}
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
}
