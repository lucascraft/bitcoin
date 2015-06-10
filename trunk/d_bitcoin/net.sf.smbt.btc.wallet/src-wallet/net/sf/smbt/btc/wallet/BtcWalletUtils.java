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
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;

import com.google.bitcoin.core.AbstractWalletEventListener;
import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.BlockChain;
import com.google.bitcoin.core.CheckpointManager;
import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.core.PeerGroup;
import com.google.bitcoin.core.Transaction;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.discovery.DnsDiscovery;
import com.google.bitcoin.store.BlockStore;
import com.google.bitcoin.store.BlockStoreException;
import com.google.bitcoin.store.DiskBlockStore;



public class BtcWalletUtils {
	public final static BtcWalletUtils INSTANCE = new BtcWalletUtils();
	
	//
	//
	public Wallet createWallet(String filePrefix) {
//		boolean testNet = args.length > 0 && args[0].equalsIgnoreCase("testnet");
//		final NetworkParameters params = testNet ? NetworkParameters.testNet() : NetworkParameters.prodNet();
		final NetworkParameters params = NetworkParameters.prodNet();
		Wallet wallet = new Wallet(params);
		try {
			ECKey key = new ECKey();
	
			System.out.println("Reading block store from disk");
			
			byte[] publicKey = key.getPubKey();

			// Gets the address corresponding to the public key.
			Address addr = key.toAddress(params);
			System.out.println(addr.toString()); 
			
			File file = new File(filePrefix + ".spvchain");
			boolean chainExistedAlready = file.exists();
			BlockStore blockStore = new DiskBlockStore(params, file);
			if (!chainExistedAlready) {
			    File checkpointsFile = new File("checkpoints");
			    if (checkpointsFile.exists()) {
			        FileInputStream stream = new FileInputStream(checkpointsFile);
			        CheckpointManager.checkpoint(params, stream, blockStore, key.getCreationTimeSeconds());
			    }
			}
			wallet.addKey(key);

			BlockChain	chain = new BlockChain(params, wallet, blockStore);
			
			PeerGroup peerGroup = new PeerGroup(params, chain);
			peerGroup.addWallet(wallet);
			
			
		} catch (BlockStoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wallet;
	}
	
	public BtcWalletHandler initWallet(File ubistore, String walletName) throws IOException {
		BtcWalletHandler walletHandler = new BtcWalletHandler();
		if (ubistore != null && ubistore.isDirectory()) {
			System.out.println("Enter in " + ubistore.getCanonicalPath() + " dir");
			String walletFilename = ubistore.getCanonicalPath() + File.separator + walletName + ".wallet";
			System.out.println("Creating " + walletFilename);
			File file = new File(walletFilename);
			if (file != null) {
				System.out.println( walletFilename + " succesfully created !!!");
				walletHandler.setWalletFile(
					file
				);
				
				System.out.println( "Load " + walletFilename);

				try {
				    walletHandler.setWallet(Wallet.loadFromFile(walletHandler.getWalletFile()));
				} catch (IOException e1) {
				    walletHandler.setWallet(new Wallet(walletHandler.getNetworkParameters()));
				    walletHandler.getWallet().addKey(new ECKey());
				}  catch(Throwable t) {
					t.printStackTrace();
				}
				
				System.out.println( walletFilename + " succesfuly loaded !!!");

				try {
				    walletHandler.getWallet().saveToFile(walletHandler.getWalletFile());
				} catch (IOException e2) {
					e2.printStackTrace();
				}

				System.out.println( walletFilename + " succesfuly saved !!!");

				
				walletHandler.setEcKey(walletHandler.getWallet().keychain.get(0));
				
				try {
					File chainFile = new File(ubistore.getCanonicalPath() + File.separator + walletName + ".spvchain");
					if (chainFile.exists()) {
						System.out.println("Deleting existing " + chainFile.getCanonicalPath() + " spvchain file");
						chainFile.delete();
					}
					chainFile.createNewFile();
					boolean chainExistedAlready = file.exists();
					
					System.out.println("creating block store");
					walletHandler.setBlockStore(new DiskBlockStore(walletHandler.getNetworkParameters(), chainFile));
					if (!chainExistedAlready) {
					    File checkpointsFile = new File("checkpoints");
					    if (checkpointsFile.exists()) {
					        FileInputStream stream = new FileInputStream(checkpointsFile);
					        CheckpointManager.checkpoint(walletHandler.getNetworkParameters(), stream, walletHandler.getBlockStore(), walletHandler.getEcKey().getCreationTimeSeconds());
					    }
					}
					//walletHandler.addKey(ecKey);
					walletHandler.getWallet().addEventListener(new AbstractWalletEventListener() {
					    public void onCoinsReceived(Wallet w, Transaction tx, BigInteger prevBalance, BigInteger newBalance) {
					    	System.out.println("Received " + (newBalance.floatValue()-prevBalance.floatValue()) + " coins");
					    }
					});
		
					
					System.out.println("Creating block chain from network parameters and block store");
					
					BlockChain chain = new BlockChain(walletHandler.getNetworkParameters(), walletHandler.getWallet(), walletHandler.getBlockStore());
					
					walletHandler.setPeerGroup(new PeerGroup(walletHandler.getNetworkParameters(), chain));
					walletHandler.getPeerGroup().setUserAgent("PingService", "1.0");
					walletHandler.getPeerGroup().addPeerDiscovery(new DnsDiscovery(walletHandler.getNetworkParameters()));
					walletHandler.getPeerGroup().addWallet(walletHandler.getWallet());

					System.out.println("Created PeeGroup for DNS discovery purposes : success");

					System.out.println("Satrting DNS discovery ...");

					walletHandler.getPeerGroup().startAndWait();
		
					walletHandler.getWallet().addEventListener(new AbstractWalletEventListener() {
					    public void onCoinsReceived(Wallet w, Transaction tx, BigInteger prevBalance, BigInteger newBalance) {
					    	System.out.println("Coins received : was " + prevBalance + " BTC and now " + newBalance);
					    }
					});
					
				} catch (IOException ioe) {
					ioe.printStackTrace();
				} catch (BlockStoreException bse) {
					bse.printStackTrace();
				}
			}
		}
		return walletHandler;
	}
	
	public Wallet createLocalTestWallet() {
		return createWallet("/tmp/btcwallet2");
	}
	
	public static void main(String[] args) {
		Wallet wallet = INSTANCE.createLocalTestWallet();
		
		wallet.getBalance();
	}
}
