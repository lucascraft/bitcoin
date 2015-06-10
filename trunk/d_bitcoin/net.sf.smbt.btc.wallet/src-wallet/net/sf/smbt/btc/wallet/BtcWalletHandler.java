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

package net.sf.smbt.btc.wallet;

import java.io.File;

import com.google.bitcoin.core.BlockChain;
import com.google.bitcoin.core.DownloadListener;
import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.core.PeerGroup;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.store.BlockStore;

public class BtcWalletHandler {
	
	private Wallet wallet;
	private File walletFile;
	private ECKey ecKey;
	private NetworkParameters params;
	private BlockStore blockStore;
	private BlockChain chain;
	private PeerGroup peerGroup;
	private DownloadListener listener;

	public BlockStore getBlockStore() {
		return blockStore;
	}
	public void setBlockStore(BlockStore blockStore) {
		this.blockStore = blockStore;
	}
	public void setWalletFile(File walletFile) {
		this.walletFile = walletFile;
	}
	public File getWalletFile() {
		return walletFile;
	}
	public NetworkParameters getNetworkParameters() {
		return params;
	}
	public void setNetworkParameters(NetworkParameters params) {
		this.params = params;
	}
	public void setDownloadListener(DownloadListener listener) {
		this.listener = listener;
	}
	public DownloadListener getDownloadListener() {
		return listener;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public ECKey getEcKey() {
		return ecKey;
	}
	public void setEcKey(ECKey ecKey) {
		this.ecKey = ecKey;
	}
	public BlockChain getChain() {
		return chain;
	}
	public PeerGroup getPeerGroup() {
		return peerGroup;
	}
	public void setPeerGroup(PeerGroup peerGroup) {
		this.peerGroup = peerGroup;
	}
	public BtcWalletHandler() {
		params = NetworkParameters.prodNet();
	}
}
