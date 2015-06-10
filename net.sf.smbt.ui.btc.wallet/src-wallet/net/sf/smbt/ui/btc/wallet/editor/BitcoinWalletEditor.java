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

package net.sf.smbt.ui.btc.wallet.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.smbt.btc.wallet.BtcWalletHandler;
import net.sf.smbt.ui.btc.wallet.Activator;
import net.sf.smbt.ui.btc.wallet.misc.BTCOperationStatus;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.FileEditorInput;

import com.google.bitcoin.core.AbstractWalletEventListener;
import com.google.bitcoin.core.Block;
import com.google.bitcoin.core.BlockChain;
import com.google.bitcoin.core.CheckpointManager;
import com.google.bitcoin.core.DownloadListener;
import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.Peer;
import com.google.bitcoin.core.PeerGroup;
import com.google.bitcoin.core.Transaction;
import com.google.bitcoin.core.Utils;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.discovery.DnsDiscovery;
import com.google.bitcoin.store.BlockStoreException;
import com.google.bitcoin.store.DiskBlockStore;

public class BitcoinWalletEditor extends FormEditor {
	
	
	private MainBTCPage mainBTCPage;
	private SendBTCPage sendBTCPage;
	private ReceiveBTCPage receiveBTCPage;
	private LogBTCExchangesPage logsBTCPage;
	private QRCodePage qrCodePage;
//	private BTCTransactionsPage btcTransactionsPage;
	private BtcWalletHandler walletHandler;
	
	private Map<Date, BTCOperationStatus> logs;

	public Wallet getWallet() {
		return walletHandler != null ? walletHandler.getWallet() : null;
	}
	public ECKey getEcKey() {
		return walletHandler != null ? walletHandler.getEcKey() : null;
	}
	public PeerGroup getPeerGroup() {
		return walletHandler != null ? walletHandler.getPeerGroup() : null;
	}
	public BlockChain getChain() {
		return walletHandler != null ? walletHandler.getChain() : null;
	}
	public BitcoinWalletEditor() {
		logs = new TreeMap<Date, BTCOperationStatus>(new Comparator<Date>() {
			@Override
			public int compare(Date o1, Date o2) {
				return o1.compareTo(o2);
			}
		});
		walletHandler = new BtcWalletHandler();
	}
	
	public Map<Date, BTCOperationStatus> getLogs() {
		return logs;
	}
	
	public void log(int severity, String info) {
		logs.put(new Date(System.currentTimeMillis()), new BTCOperationStatus(severity, Activator.PLUGIN_ID, info));
	}
	
	class WallUpdateJob extends Job {
		int maxBlocks;
		int blocksLeft;
		IProgressMonitor monitor;
		public WallUpdateJob(String name) {
			super(name);
		}
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			this.monitor = monitor;
			walletHandler.getPeerGroup().startBlockChainDownload(walletHandler.getDownloadListener());
			try {
				walletHandler.getDownloadListener().await();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			walletHandler.getPeerGroup().downloadBlockChain();
			return Status.OK_STATUS;
		}
		public void setBlocksLeft(int blocksLeft) {
			this.blocksLeft = blocksLeft;
			this.monitor.worked(1);
		}
		public void setMaxBlocks(int maxBlocks) {
			this.maxBlocks = maxBlocks;
			monitor.beginTask("Wallet Synchronization", maxBlocks);
		}
	}
	
	private WallUpdateJob job;
	@Override
	protected void addPages() {
		try {
			mainBTCPage			= new MainBTCPage			(this, "net.sf.smbt.ui.btc.wallet.editor.mainPage", 		"Main");
			sendBTCPage 		= new SendBTCPage			(this, "net.sf.smbt.ui.btc.wallet.editor.sendPage", 		"Send");
			receiveBTCPage		= new ReceiveBTCPage		(this, "net.sf.smbt.ui.btc.wallet.editor.historyPage", 		"History");
			logsBTCPage			= new LogBTCExchangesPage	(this, "net.sf.smbt.ui.btc.wallet.editor.logsPage", 		"Logs");
			qrCodePage			= new QRCodePage			(this, "net.sf.smbt.ui.btc.wallet.editor.qrCodePage", 		"QRCode");
			
			addPage(mainBTCPage);
			addPage(sendBTCPage);
			addPage(receiveBTCPage);
			addPage(logsBTCPage);
			addPage(qrCodePage);

		} catch(PartInitException pie) {
			pie.printStackTrace();
		}
		
		walletHandler.setDownloadListener(new DownloadListener(){
			@Override
			public void onChainDownloadStarted(Peer peer, int blocksLeft) {
				//String txt = "onChainDownloadStarted " + " : " + blocksLeft + " blocs max.";
				//System.out.println(txt);
				job.setMaxBlocks(blocksLeft);
				super.onChainDownloadStarted(peer, blocksLeft);
			}
			@Override
			public void onBlocksDownloaded(final Peer peer, final Block block, final int blocksLeft) {
				//String txt = "onBlocksDownloaded " + peer.getAddress().toString() + " : " + blocksLeft + " blocs left.";
				//System.out.println(txt);
				job.setBlocksLeft(blocksLeft);
				if (blocksLeft == 0) {
					job.cancel();
					job.done(Status.OK_STATUS);
				}
			}
		});
		
		job = new WallUpdateJob("Wallet Synchronization");
		job.addJobChangeListener(new IJobChangeListener() {
			@Override
			public void sleeping(IJobChangeEvent event) {}
			@Override
			public void scheduled(IJobChangeEvent event) {}
			@Override
			public void running(IJobChangeEvent event) {}
			@Override
			public void done(IJobChangeEvent event) {
				refreshPages();
			}
			@Override
			public void awake(IJobChangeEvent event) {}
			@Override
			public void aboutToRun(IJobChangeEvent event) {}
		});
		job.schedule();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		if (input instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)input).getFile();
			
			walletHandler.setWalletFile(
				new File(file.getRawLocation().toString())
			);
			
			setPartName(file.getName());
			
			try {
			    walletHandler.setWallet(Wallet.loadFromFile(walletHandler.getWalletFile()));
			} catch (IOException e1) {
			    walletHandler.setWallet(new Wallet(walletHandler.getNetworkParameters()));
				walletHandler.getWallet().addEventListener(new AbstractWalletEventListener() {
				    public void onCoinsReceived(Wallet w, Transaction tx, BigInteger prevBalance, BigInteger newBalance) {
				    	super.onCoinsReceived(w, tx, prevBalance, newBalance);
				    	log(Status.INFO, "Coins received : balance was " + Utils.bitcoinValueToFriendlyString(prevBalance) + " and is now " + Utils.bitcoinValueToFriendlyString(newBalance));
				        refreshPages();
				    }
				    @Override
				    public void onCoinsSent(Wallet wallet, Transaction tx, BigInteger prevBalance, BigInteger newBalance) {
				    	super.onCoinsSent(wallet, tx, prevBalance, newBalance);
				    	log(Status.INFO, "Coins sent : balance was " + Utils.bitcoinValueToFriendlyString(prevBalance) + " and is now " + Utils.bitcoinValueToFriendlyString(newBalance));
				        refreshPages();
				    }
				    @Override
				    public void onKeyAdded(ECKey key) {
				    	super.onKeyAdded(key);
				    	log(Status.INFO, "Key added : " + key.toString());
				    	refreshPages();
				    }
				    @Override
				    public void onTransactionConfidenceChanged(Wallet wallet, Transaction tx) {
				    	super.onTransactionConfidenceChanged(wallet, tx);
				    	log(Status.INFO, "Transaction Confidence changed : " + tx.toString());
				    	refreshPages();
				    }
				    @Override
				    public void onWalletChanged(Wallet wallet) {
				    	super.onWalletChanged(wallet);
				    }
				    @Override
				    public void onChange() {
				    	super.onChange();
				    	//log(Status.INFO, "Wallet state changed");
				    	refreshPages();
				    }
				    @Override
				    public void onReorganize(Wallet wallet) {
				    	super.onReorganize(wallet);
				    	log(Status.INFO, "Wallet got reorganized");
				        refreshPages();
				    }
				});

			    walletHandler.getWallet().addKey(new ECKey());
			}  catch(Throwable t) {
				t.printStackTrace();
			}
			
			try {
			    walletHandler.getWallet().saveToFile(walletHandler.getWalletFile());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			walletHandler.setEcKey(walletHandler.getWallet().keychain.get(0));
			
			IProject project = file.getProject();
			
			IPath pathChainFile = file.getFullPath().removeFileExtension().addFileExtension("spvchain");
			IFile spvChainFile = project.getWorkspace().getRoot().getFile(pathChainFile);
			
			try {
				File chainFile = new File(spvChainFile.getRawLocation().toString());
				spvChainFile.delete(true, new NullProgressMonitor());
				spvChainFile.create(null, true, new NullProgressMonitor());
				chainFile.createNewFile();
				boolean chainExistedAlready = file.exists();
				
				walletHandler.setBlockStore(new DiskBlockStore(walletHandler.getNetworkParameters(), chainFile));
				if (!chainExistedAlready) {
				    File checkpointsFile = new File("checkpoints");
				    if (checkpointsFile.exists()) {
				        FileInputStream stream = new FileInputStream(checkpointsFile);
				        CheckpointManager.checkpoint(walletHandler.getNetworkParameters(), stream, walletHandler.getBlockStore(), walletHandler.getEcKey().getCreationTimeSeconds());
				    }
				}
	
				BlockChain chain		= new BlockChain(walletHandler.getNetworkParameters(), walletHandler.getWallet(), walletHandler.getBlockStore());
				
				walletHandler.setPeerGroup(new PeerGroup(walletHandler.getNetworkParameters(), chain));
				walletHandler.getPeerGroup().setUserAgent("PingService", "1.0");
				walletHandler.getPeerGroup().addPeerDiscovery(new DnsDiscovery(walletHandler.getNetworkParameters()));
				walletHandler.getPeerGroup().addWallet(walletHandler.getWallet());
				
				walletHandler.getPeerGroup().startAndWait();

				project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} catch (BlockStoreException bse) {
				bse.printStackTrace();
			} catch (CoreException ce) {
				ce.printStackTrace();
			}
		}
	}
	@Override
	public void close(boolean save) {
		super.close(save);
		if (job != null) {
			job.cancel();
			job.done(Status.OK_STATUS);
		}
		if (walletHandler.getPeerGroup().isRunning()) {
			walletHandler.getPeerGroup().stop();
			try {
				walletHandler.getBlockStore().close();
			} catch (BlockStoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void dispose() {
		super.dispose();
		close(false);
	}
	
	private void refreshPages() {
		if (mainBTCPage != null && sendBTCPage != null && receiveBTCPage != null && logsBTCPage != null) {
			mainBTCPage.refreshFromWallet();
			sendBTCPage.refreshFromWallet();
			receiveBTCPage.refreshFromWallet();
	//		btcTransactionsPage.refreshFromWallet();
			logsBTCPage.refreshFromWallet();
		}
	}
	@Override
	public void doSave(IProgressMonitor monitor) {
		doSaveAs();
	}
	@Override
	public void doSaveAs() {
		try {
			walletHandler.getWallet().saveToFile(walletHandler.getWalletFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}
