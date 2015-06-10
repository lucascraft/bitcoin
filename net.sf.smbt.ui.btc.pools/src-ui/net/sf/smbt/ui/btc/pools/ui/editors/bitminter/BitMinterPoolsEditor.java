/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.btc.pools.ui.editors.bitminter;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.bfl.bitforce.rev2.cmd.BFLBitForceV2CmdUtils;
import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.BFLCmdKind;
import net.sf.smbt.btc.genericpools.util.GenericpoolsAdapterFactory;
import net.sf.smbt.btc.pools.bitminter.BitMinterCmd;
import net.sf.smbt.btc.pools.bitminter.BitMinterConfig;
import net.sf.smbt.btc.pools.bitminter.provider.BitminterItemProviderAdapterFactory;
import net.sf.smbt.btc.pools.bitminter.utils.BitMinterCmdUtils;
import net.sf.smbt.btc.pools.bitminter.utils.BitMinterUtils;
import net.sf.smbt.btc.pools.getwork.GetworkCmd;
import net.sf.smbt.btc.pools.protocol.getwork.GetWorkProtocolUtils;
import net.sf.smbt.btc.pools.utils.getwork.BtcPoolHttpCommunicator;
import net.sf.smbt.btc.pools.utils.getwork.GetworkEngine;
import net.sf.smbt.fmodex.core.AudioUtils;
import net.sf.smbt.fmodex.core.SystemSound;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.btc.pools.Activator;
import net.sf.smbt.ui.btc.pools.ui.controller.BtcPoolsCompseableAdapterFactory;
import net.sf.smbt.ui.btc.pools.ui.controller.BtcPoolsFeedContentProvider;
import net.sf.smbt.ui.btc.pools.ui.prefs.BitMinterPoolsPreferenceConstants;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.vu.SixteenSegmentsDisplay;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;
import net.sf.xqz.model.temporal.provider.TemporalItemProviderAdapterFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class BitMinterPoolsEditor extends EditorPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {
	 
	private JsonElement environmentType;

	private TabFolder	folder;
	private RefreshJob	refreshJob;
	private GetworkJob  getworkJob;
	private CmdPipe 	bitMinterEngine;
	private CmdPipe 	getworkEngine;
	private CmdPipe 	asicUsbEngine;
	private static BitMinterConfig bitMinterConfig;
	
	private AbstractQxEventHandler usbEventHandler;

	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	private ComposedAdapterFactory adapterFactory;
	
	private TreeViewer bitminterTreeViewer;
	private SixteenSegmentsDisplay lcdHashRate;
	
	public JsonElement getEnvType() {
		return environmentType;
	}
	public static BitMinterConfig getBitMinterProject() {
		return bitMinterConfig;
	}
	public CmdPipe getBitMinterEngine() {
		return bitMinterEngine;
	}
	public CmdPipe getGetworkEngine() {
		return getworkEngine;
	}
	
	private final class RefreshJob extends UIJob {
		public RefreshJob() {
			super("BitMinter refresh job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			
			queryPoolStats();
			queryPoolRound();

			String apiKey	= getApiKey();
			String user		= getUser();
			if (user != null && !"".equals(user) && apiKey != null && !"".equals(apiKey)) {
				queryUserData();
			}
			if (bitMinterConfig.getStats() !=null) {
				float rate = (bitMinterConfig.getStats().getHashRate()/1000);
				lcdHashRate.setText(String.format("%.2f%n", rate) + "Th/s");
				setSelection(new StructuredSelection(bitMinterConfig));
			}
			
			for (int i=folder.getItemCount()-1;i>=0;i--) {
				TabItem item = folder.getItem(i);
				if (item != null && item.getControl() != null) {
					folder.setSelection(item);
					layoutComposite(item.getControl());
				}
			}
			
			for (TabItem item :	folder.getSelection()) {
				folder.setSelection(item);
			}
			
			bitminterTreeViewer.refresh(true);
			
			schedule(5000);
			return Status.OK_STATUS;
		}
	}

	private final class GetworkJob extends UIJob {
		public GetworkJob() {
			super("Getwork refresh job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			
			queryGetworkCall();
			
			if (asicUsbEngine != null) {
				asicUsbEngine.send(BFLBitForceV2CmdUtils.INSTANCE.create(BFLCmdKind.ZCX));
			}
			
			schedule(3000);
			return Status.OK_STATUS;
		}
	}
	private void queryGetworkCall() {
		if (getworkEngine != null) {
			getworkEngine.send(GetWorkProtocolUtils.INSTANCE.buildGetworkCall());
		}
	}
	private void queryPoolStats() {
		if (bitMinterEngine != null) {
			BitMinterCmd poolStatsCmd = BitMinterCmdUtils.INSTANCE.buildPoolStatsCmd();
			bitMinterEngine.send(poolStatsCmd);
		}
	}
	private void queryPoolRound() {
		if (bitMinterEngine != null) {
			BitMinterCmd poolRoundCmd = BitMinterCmdUtils.INSTANCE.buildPoolRoundCmd();
			bitMinterEngine.send(poolRoundCmd);
		}
	}
	private void queryUserData() {
		if (bitMinterEngine != null) {
			BitMinterCmd userDataCmd = BitMinterCmdUtils.INSTANCE.buildUserDataCmd(getUser(), getApiKey());
			bitMinterEngine.send(userDataCmd);
		}
	}
	public void updateUSBLink(CmdPipe asicUsbPipe) {
		asicUsbEngine = asicUsbPipe;
		if (asicUsbEngine instanceof CmdPipe) {
			bitMinterConfig.setDefault(asicUsbEngine);
			asicUsbEngine.removeQxEventHandler(usbEventHandler);
			asicUsbEngine.addQxEventHandler(usbEventHandler);
			//updateUbiquinoUI(asicUsbEngine);
		}
	}
	private ScrolledComposite scx;
	
	@Override
	public void dispose() {
		if (refreshJob != null) {
			refreshJob.cancel();
			refreshJob.done(Status.OK_STATUS);
		}
		if (getworkJob != null) {
			getworkJob.cancel();
			getworkJob.done(Status.OK_STATUS);
		}
		bitMinterEngine.setLocked(false);
		QuanticMojo.INSTANCE.closePipe(bitMinterEngine, true);

		getworkEngine.setLocked(false);
		QuanticMojo.INSTANCE.closePipe(getworkEngine, true);
		
		if (asicUsbEngine != null) {
			asicUsbEngine.setLocked(false);
			QuanticMojo.INSTANCE.closePipe(asicUsbEngine, true);
		}
		doSaveAs();		
		super.dispose();
	}
	public String getApiKey() {
		return Activator.getDefault().getPreferenceStore().getString(BitMinterPoolsPreferenceConstants.P_BITMINTER_APIKEY);
	}
	public String getUser() {
		return Activator.getDefault().getPreferenceStore().getString(BitMinterPoolsPreferenceConstants.P_BITMINTER_LOGIN);
	}
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	@Override
	public void doSave(IProgressMonitor monitor) {
		BitMinterUtils.INSTANCE.save(getEditorInput(), bitMinterConfig);
	}
	@Override
	public void doSaveAs() {
		doSave(new NullProgressMonitor());
	}
	
	public BitMinterPoolsEditor() {
		listeners = new ConcurrentLinkedQueue<ISelectionChangedListener>();
		usbEventHandler = new AbstractQxEventHandlerImpl() {
			@Override
			public void handleQxEvent(Event event) {
				if (event.getCmd() instanceof BFLCmd) {
					BFLCmd bflCmd = (BFLCmd) event.getCmd();
					if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
						System.out.println("RCV : " + new String(bflCmd.getData()));
						handleBFLCmd(bflCmd);
					} else {
						byte[] data = bflCmd.getData() == null ? new byte[0] : bflCmd.getData();
						System.out.println("SND : " + bflCmd.getKind().getLiteral() + " => " + new String(data));
					}
				}
			}
		};
		bitMinterEngine = QuanticMojo.INSTANCE.createHttpPipe(
			"bitminter", 
			"http://bitminter.com"
		);
		bitMinterEngine.setLocked(true);
		getworkEngine = QuanticMojo.INSTANCE.createHttpPipe(
			"getwork", 
			"http://mint.bitminter.com"
		);
		getworkEngine.setLocked(true);
	   	if (bitMinterEngine != null) {
			bitMinterEngine.addQxEventHandler(new AbstractQxEventHandlerImpl() {
				@Override
				public void handleQxEvent(Event event) {
					if (event.getCmd() instanceof BitMinterCmd) {
						BitMinterCmd bitMinterCmd = (BitMinterCmd) event.getCmd();
						if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
							System.out.println(bitMinterCmd.getJson());
							
							handleBitMinterCmd(bitMinterCmd);
						}
					}
				}
			});
	   	}
	   	if (getworkEngine != null) {
	   		getworkEngine.addQxEventHandler(new AbstractQxEventHandlerImpl() {
				@Override
				public void handleQxEvent(Event event) {
					if (event.getCmd() instanceof GetworkCmd) {
						GetworkCmd getworkCmd = (GetworkCmd) event.getCmd();
						if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
							if (asicUsbEngine != null) {
								XCPAddress xcpAddr = XCPAddressUtils.INSTANCE.createEzTarget(asicUsbEngine);
								GetworkEngine.INSTANCE.handleGetworkCmd(getworkCmd, xcpAddr);
							}
						}
					}
				}
			});
	   	}
	}
	private void handleBitMinterCmd(BitMinterCmd bitMinterCmd) {
		String flux = bitMinterCmd.getJson();

		Object obj = BitMinterCmdUtils.INSTANCE.loadDataFromJson(flux);
		
		String user = getUser();
		if (user != null && !"".equals(user)) {
			if (obj instanceof JsonObject) {
				JsonObject jsonObj = (JsonObject) obj;
				JsonElement _user 		= jsonObj.get("name");
				JsonElement _rate 		= jsonObj.get("hash_rate");
				JsonElement _chains 	= jsonObj.get("chains");
				String tUser 			= _user 	== null ? "" 		: _user.getAsString();
				Float tRate 			= _rate 	== null ? Float.NaN : _rate.getAsFloat();
				JsonObject tChains 		= _chains == null 	? null 		: _chains.getAsJsonObject(); 
				if (tUser.equals(user)) {
					BitMinterUtils.INSTANCE.handleUserData(bitMinterConfig, 	jsonObj);
				} else if (Float.NaN != tRate && tChains == null) {
					BitMinterUtils.INSTANCE.handlePoolStats(bitMinterConfig, 	jsonObj);
				} else if (tChains instanceof JsonObject) {
					BitMinterUtils.INSTANCE.handlePoolRound(bitMinterConfig, 	jsonObj);
				}
			}
		}
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		site.setSelectionProvider(
			this
		);
		setInput(input);
		
		bitMinterConfig = BitMinterUtils.INSTANCE.load(input);
		XCPAddress addr = bitMinterConfig.getLastAddress();
		if (addr != null) {
			asicUsbEngine = XCPAddressUtils.INSTANCE.getCmdPipe(addr, true);
			if (asicUsbEngine instanceof CmdPipe) {
				bitMinterConfig.setDefault(asicUsbEngine);
				asicUsbEngine.removeQxEventHandler(usbEventHandler);
				asicUsbEngine.addQxEventHandler(usbEventHandler);
				//updateUbiquinoUI(asicUsbEngine);
			}
		}

		initAdapterFactory();
	}
	
	public void handleBFLCmd(BFLCmd bflCmd) {
		switch(bflCmd.getKind()) {
			case ZCX:
				System.out.println("Got ASIC device engine status info");
				break;
			case ZMX:
				System.out.println("Got ASIC device blink");
				break;
			case ZTX:
				System.out.println("Got ASIC device voltages info");
				break;
			case ZLX:
				System.out.println("Got ASIC device temperatures info");
				break;
			case ZJX:
				System.out.println("Got ASIC device Firmware info");
				break;
			default:
				break;
		}
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			//return new UbiquinoOutlinePage(this);
		} else if (adapter.equals(IPropertySheetPage.class)) {
			return new BitMinterPoolsPropertySheetPage(this);
		}
		return super.getAdapter(adapter);
	}
	
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TemporalItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new BitminterItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new GenericpoolsAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}
	
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		parent.setBackground(GUIToolkit.BG);
	
		scx = GUIToolkit.INSTANCE.createScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		scx.setLayout(GridLayoutFactory.fillDefaults().create());
		scx.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		scx.setBackground(GUIToolkit.BG);
		
		folder = new TabFolder(scx, SWT.TOP);
		folder.setLayout(GridLayoutFactory.fillDefaults().create());
		folder.setLayoutData(GridDataFactory.fillDefaults().grab(true,true).create());
		
        //
        // TabItem 1
        //
        
		TabItem tabItem1 = new TabItem(folder, SWT.TOP);
		tabItem1.setText("Browse");
		
		Composite browseContainer = GUIToolkit.INSTANCE.createComposite(folder);
		browseContainer.setLayout(GridLayoutFactory.fillDefaults().create());
		browseContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		tabItem1.setControl(browseContainer);
		
		
		lcdHashRate = new SixteenSegmentsDisplay(browseContainer, 10, SWT.HORIZONTAL);
		lcdHashRate.setForeground(ColorConstants.orange);

		lcdHashRate.setText("00TH/s");
		lcdHashRate.setLayout(GridLayoutFactory.fillDefaults().create());
		lcdHashRate.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(400, 50).create());

		bitminterTreeViewer = new TreeViewer(browseContainer);
		bitminterTreeViewer.getControl().setBackground(GUIToolkit.BG);
		
		bitminterTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		bitminterTreeViewer.setContentProvider(new BtcPoolsFeedContentProvider());
		bitminterTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(new BtcPoolsCompseableAdapterFactory()));
		
		bitminterTreeViewer.setInput(bitMinterConfig);
		
		bitminterTreeViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					bitMinterConfig.setSelection(event.getSelection());
					setSelection(new StructuredSelection(event.getSelection()));
				}
			}
		);

		getSite().getWorkbenchWindow().addPageListener(
			new IPageListener() {
				@Override
				public void pageOpened(IWorkbenchPage page) {}
				@Override
				public void pageClosed(IWorkbenchPage page) {}
				@Override
				public void pageActivated(IWorkbenchPage page) {
					setSelection(new StructuredSelection(bitMinterConfig));
				}
			}
		);
		
        //
        // TabItem 2
        //
        
		TabItem tabItem2 = new TabItem(folder, SWT.TOP);
		tabItem2.setText("Manage");
		
		Composite manageContainer = GUIToolkit.INSTANCE.createComposite(folder);
		manageContainer.setLayout(GridLayoutFactory.fillDefaults().create());
		manageContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		tabItem2.setControl(manageContainer);
		
        scx.setAlwaysShowScrollBars(true);
        scx.setExpandVertical(true);
        scx.setExpandHorizontal(true);

		scx.setContent(folder);
		
        folder.addControlListener(
        	new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					Rectangle r = parent.getClientArea();
			        scx.setMinSize(r.width, r.height);
			        scx.layout(true);
			        scx.redraw();
			        layoutComposite(scx);
				}
				@Override
				public void controlMoved(ControlEvent e) {}
			}
        );
        
		Rectangle r2 = parent.getClientArea();
        scx.setMinSize(r2.width, r2.height);
        
        scx.layout(true);
        scx.redraw();
		
		String apiKey = Activator.getDefault().getPreferenceStore().getString(BitMinterPoolsPreferenceConstants.P_BITMINTER_APIKEY);
		if (apiKey == null || apiKey.equals("")) {
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), "BitMinter Key Information", "BitMinter Authentication Key is missing in preferences. \nPlease grab a key from BitMinter.com and update the eclipse preferences page accordingly.");
		}
		
		init();
	}
	
    private void layoutComposite(Control control) {
    	if (control instanceof Composite) {
    		Composite composite = (Composite) control;
    		for (Control c : composite.getChildren()) {
				if (!c.isDisposed()) {
					if (c instanceof Composite) {
						Composite cmp = (Composite) c;
						layoutComposite(cmp);
					}
					c.redraw();
				}
			}
    	}
    }

	/*
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				//fillContextMenu(manager);
			}
		});
		//Menu menu = menuMgr.createContextMenu(tv1.getControl());
		//tv1.getControl().setMenu(menu);

		//getSite().registerContextMenu("#PopupMenu", menuMgr, tv1);
	}
	*/
    
	@SuppressWarnings("unused")
	private void fillContextMenu(IMenuManager manager) {}
	
    void init() {
    	refreshCredentialsFromPrefs();
		refreshJob = new RefreshJob();
		refreshJob.schedule(3000);
		
		getworkJob = new GetworkJob();
		getworkJob.schedule(3000);
		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
				if (event.getProperty().equals(BitMinterPoolsPreferenceConstants.P_BITMINTER_APIKEY)) {
					refreshJob.schedule();
				} else if (event.getProperty().equals(BitMinterPoolsPreferenceConstants.P_BITMINTER_PASSWORD)) {
					refreshCredentialsFromPrefs();
					refreshJob.schedule();
				} else if (event.getProperty().equals(BitMinterPoolsPreferenceConstants.P_BITMINTER_LOGIN)) {
					refreshCredentialsFromPrefs();
					refreshJob.schedule();
				} else if (event.getProperty().equals(BitMinterPoolsPreferenceConstants.P_BITMINTER_WORKER)) {
					refreshCredentialsFromPrefs();
					refreshJob.schedule();
				} else if (event.getProperty().equals(BitMinterPoolsPreferenceConstants.P_BITMINTER_PORT)) {
					refreshJob.schedule();
				} 
			}
		});
		
		AudioUtils.INSTANCE.playSystemSound(SystemSound.FX_1);
	}
    
    void refreshCredentialsFromPrefs() {
    	IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		final String 	login	= store.getString	(BitMinterPoolsPreferenceConstants.P_BITMINTER_LOGIN);
		final String 	pwd		= store.getString	(BitMinterPoolsPreferenceConstants.P_BITMINTER_PASSWORD);
		final int 		port	= store.getInt		(BitMinterPoolsPreferenceConstants.P_BITMINTER_PORT);
		final String 	worker	= store.getString	(BitMinterPoolsPreferenceConstants.P_BITMINTER_WORKER);
		if (login != null && !"".equals(login) && pwd != null && !"".equals(pwd)) {
			Authenticator.setDefault(new Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		          return new PasswordAuthentication (login, pwd.toCharArray());
		      }
			});
			if (getworkEngine != null && getworkEngine.getPort() != null && getworkEngine.getPort().getChannel() != null) {
				BtcPoolHttpCommunicator c = (BtcPoolHttpCommunicator) getworkEngine.getPort().getChannel();
				c.setLogin(login);
				c.setPassword(pwd);
				c.setPort(port);
				c.setWorker(worker);
			}
		}
    }
    
	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}
	@Override
	public void setFocus() {}
	
	//
	// Selection
	//
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}
	@Override
	public ISelection getSelection() {
		if (bitMinterConfig.getSelection() == null) {
			return new StructuredSelection();
		}
		return new StructuredSelection(bitMinterConfig.getSelection()); 
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}
	@Override
	public void setSelection(ISelection selection) {
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}
	
	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.bitminter";
	}
	
	
	//
	//
	// Feed
	//
	//
	public void stop() {}
}
