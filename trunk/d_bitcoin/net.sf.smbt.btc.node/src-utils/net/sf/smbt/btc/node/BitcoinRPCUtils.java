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


import net.sf.smbt.btc.node.bitcoind.BitcoinCmd;
import net.sf.smbt.btc.node.bitcoind.BitcoindFactory;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.HttpcmdFactory;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcFactory;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.cmd.Cmd;

public class BitcoinRPCUtils {

	public final static BitcoinRPCUtils INSTANCE = new BitcoinRPCUtils();
	
	public byte[] dumpCommand(Cmd cmd) {
		return new byte[0];
	}
	
	public Property[] buildBlockchanConnectionProperties(String user, String password, String connect, String port) {
		Property userProperty = HttpcmdFactory.eINSTANCE.createProperty();
		userProperty.setKey("-rpcuser");
		userProperty.setValue(user);
		
		Property pwdProperty = HttpcmdFactory.eINSTANCE.createProperty();
		pwdProperty.setKey("-rpcpassword");
		pwdProperty.setValue(password);
		
		Property connectProperty = HttpcmdFactory.eINSTANCE.createProperty();
		connectProperty.setKey("-rpcconnect");
		connectProperty.setValue(connect);
		
		Property portProperty = HttpcmdFactory.eINSTANCE.createProperty();
		portProperty.setKey("-rpcport");
		portProperty.setValue(port);
		
		Property sslProperty = HttpcmdFactory.eINSTANCE.createProperty();
		sslProperty.setKey("-rpcssl");
		
		return new Property[]{userProperty, connectProperty, portProperty, pwdProperty, sslProperty};
	}
	
	public BitcoinCmd createBlockchainCommand(String command, String user, String password, String connect, String port, Property...args) {
		return createBlockchainCommand(command, args, buildBlockchanConnectionProperties(user, password, connect, port));
	}
	
	public BitcoinCmd createBlockchainCommand(String command, Property[] args, Property... properties) {
		BitcoinCmd cmd = BitcoindFactory.eINSTANCE.createBitcoinCmd();
		
		for (Property p : properties) {
			cmd.getProperties().add(p);
		}
		for (Property p : args) {
			cmd.getProperties().add(p);
		}
		
		cmd.setMethod(HttpMethod.GET);
		
		cmd.setCommand(command);
		
		return cmd;
	}
	
	public BitcoinNode createBitcoinNodeController(XCPAddress addr) {
		BitcoinNode node = BitcoinrpcFactory.eINSTANCE.createBitcoinNode();
		
		node.setInetAddr(addr);
		
		return node;
	}
}
