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

package net.sf.smbt.btc.node;

import java.net.URL;

import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcFactory;
import net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BitcoindNodeUtils {
	public static BitcoindNodeUtils INSTANCE = new BitcoindNodeUtils();
	
	
	
	
	/*
	 {
    "balance" : 43.50100000,
    "errors" : "",
    "paytxfee" : 0.005,
    "proxy" : "",
    "connected" : 0,
    "testnet" : false,
    "difficulty" : 1733207.51384839,
    "blocks" : 179602
	}
	*/
	
	public void handleJSonGetInfo(BitcoinNode node, String json) {
		if (node != null) {
			if(node.getInfo() == null) {
				BtcInfo btcInfo = BitcoinrpcFactory.eINSTANCE.createBtcInfo();
				node.setInfo(btcInfo);
			}
			BtcInfo btcInfo = node.getInfo();
			
			JsonElement jsonElem = new JsonParser().parse(json);
			
			if (jsonElem.isJsonObject()) {
				JsonObject obj = (JsonObject) jsonElem;
				float balance = obj.get("balance").getAsFloat();
				float paytxfee = obj.get("paytxfee").getAsFloat();
				//String proxy = obj.get("proxy").getAsString();
				String errors = obj.get("errors").getAsString();
				float difficulty = obj.get("difficulty").getAsFloat();
				boolean connected = obj.get("connected").getAsBoolean();
				boolean testnet = obj.get("testnet").getAsBoolean();
				long blocks = obj.get("blocks").getAsLong();

				btcInfo.setBalance(balance);
				btcInfo.setBlocks(blocks);
				btcInfo.setConnected(connected ? 1 : 0);
				btcInfo.setErrors(errors);
				btcInfo.setDifficulty(difficulty);
				btcInfo.setPaytxfee(paytxfee);
				btcInfo.setTestnet(testnet);
				//btcInfo.setProxy(proxy);
				
				node.setInfo(btcInfo);
			}
		}
	}
	
	public static String getBitcoinNodePath() {
		URL url = Activator.class.getClassLoader().getResource("node");
		return url.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(getBitcoinNodePath());
	}
}
