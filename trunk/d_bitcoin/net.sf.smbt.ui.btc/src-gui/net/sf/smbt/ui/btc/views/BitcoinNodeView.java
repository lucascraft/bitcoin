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

import net.sf.smbt.btc.node.BitcoinRPCUtils;
import net.sf.smbt.btc.node.BitcoindNodeUtils;
import net.sf.smbt.btc.node.bitcoind.BitcoinCmd;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

public class BitcoinNodeView extends ViewPart {
	private CmdPipe bitcoindEngine;
	private BitcoinNode node;
	private RefreshJob refreshJob;
	private TextViewer textViewer;
	
	private final class RefreshJob extends UbiJob {
		public RefreshJob() {
			super("Bitcoin refresh job");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			
			BitcoinCmd cmd1 = BitcoinRPCUtils.INSTANCE.createBlockchainCommand(
					"getinfo",
					"8fe83d5d-93e4-43ea-8c13-8f93944b267f", 
					"waaldraock", 
					"rpc.blockchain.info", 
					"443"
				);
			BitcoinCmd cmd2 = BitcoinRPCUtils.INSTANCE.createBlockchainCommand(
					"getconnectioncount",
					"8fe83d5d-93e4-43ea-8c13-8f93944b267f", 
					"waaldraock", 
					"rpc.blockchain.info", 
					"443"
				);
			BitcoinCmd cmd3 = BitcoinRPCUtils.INSTANCE.createBlockchainCommand(
					"getdifficulty",
					"8fe83d5d-93e4-43ea-8c13-8f93944b267f", 
					"waaldraock", 
					"rpc.blockchain.info", 
					"443"
				);
			
			textViewer.getDocument().set("Request Blockchain get info " + System.currentTimeMillis());

			
			bitcoindEngine.send(cmd1);
			bitcoindEngine.send(cmd2);
			bitcoindEngine.send(cmd3);
			
			schedule(10000);
			return Status.OK_STATUS;
		}
	}
	public BitcoinNodeView() {
		bitcoindEngine = QuanticMojo.INSTANCE.createHttpPipe(
			"bitcoind", 
			"http://localhost:443"
		);	
		bitcoindEngine.addQxEventHandler(new AbstractQxEventHandlerImpl() {
			public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
				if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
					Cmd cmd = event.getCmd();
					if (cmd instanceof BitcoinCmd) {
						new RefreshJob2((BitcoinCmd) cmd).schedule();
					}
				}
			};
		});
	
		refreshJob = new RefreshJob();
		refreshJob.schedule();
	}
	
	
	
	class RefreshJob2 extends UIJob {
		BitcoinCmd btcCmd;
		public RefreshJob2(BitcoinCmd btcCmd) {
			super("Refresh from bitcoind");
			setPriority(INTERACTIVE);
			setSystem(true);
			this.btcCmd = btcCmd;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			final String jsonRcv = btcCmd.getJsonRcv();
			if (jsonRcv!=null){
				if (textViewer!=null && textViewer.getControl()!=null&& !textViewer.getControl().isDisposed()&&textViewer.getDocument()!=null) {
					textViewer.getDocument().set(jsonRcv);
				}
				BitcoindNodeUtils.INSTANCE.handleJSonGetInfo(node, jsonRcv);
			}
			return Status.OK_STATUS;
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		textViewer = new TextViewer(container, SWT.READ_ONLY);
		
		textViewer.setDocument(new Document());
		textViewer.setTextColor(ColorConstants.lightBlue);
		textViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		textViewer.getControl().setBackground(GUIToolkit.BG);
	}
	
	@Override
	public void setFocus() {}
}
