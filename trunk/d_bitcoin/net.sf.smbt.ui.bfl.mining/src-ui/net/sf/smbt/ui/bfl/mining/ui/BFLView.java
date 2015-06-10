/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.bfl.mining.ui;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ui.bfl.mining.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

public class BFLView extends ViewPart {

	private Font bigFont = new Font(Display.getDefault(), "tahoma", 18, SWT.BOLD);
	private Action connectXBeeAction, scanConfigAction;
	private CmdPipe xbeePipe;
	private TextViewer textViewer;

	@Override
	public void createPartControl(Composite parent) {
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		final Button connectLabel = new Button(container, SWT.PUSH);
		connectLabel.setLayoutData(GridDataFactory.swtDefaults().grab(false, false).align(SWT.END, SWT.CENTER).hint(200, 80).minSize(200, 80).create());
		connectLabel.setBackground(ColorConstants.orange);
		connectLabel.setForeground(ColorsUtil.BG);
		connectLabel.setFont(bigFont);
		connectLabel.setText("Connect");
		connectLabel.setImage(
			Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, 
				"icons/connect-48x48.png"
			).createImage()
		);
		connectLabel.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				connectXBeeAction.run();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		connectXBeeAction = new Action() {
			public void run() {
				CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"at"});
				if (dlg.open() == Window.OK) {
					Object[] results = dlg.getResult();
					if (results != null) {
						for (Object obj : results) {
							if (obj instanceof CmdPipe) {
								CmdPipe p = (CmdPipe) obj;
								xbeePipe = p;
								textViewer.getDocument().set("Connected to XBee AT modem [" + p.getAddr() + "] at " + p.getSpeed() + " bauds");
							}
						}
					} else {
						CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"at"});
						int status = pipeConfigWizardDialog.open();
						if (status == Window.OK) {
							CmdPipe pipe = pipeConfigWizardDialog.getSelection();
							if (pipe != null) {
								xbeePipe = pipe;
								textViewer.getDocument().set("Connected to XBee AT modem [" + pipe.getAddr() + "] at " + pipe.getSpeed() + " bauds");
							}
						}
					}
				}
			}
		};	
		
		
		final Button scanXBeeLabel = new Button(container, SWT.PUSH);
		scanXBeeLabel.setLayoutData(GridDataFactory.swtDefaults().hint(200, 80).minSize(200, 80).align(SWT.END, SWT.CENTER).grab(false, false).create());
		scanXBeeLabel.setBackground(ColorConstants.orange);
		scanXBeeLabel.setForeground(ColorsUtil.BG);
		scanXBeeLabel.setFont(bigFont);
		scanXBeeLabel.setText("Scan");
		scanXBeeLabel.setImage(
			Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, 
				"icons/scan-xbee.jpg"
			).createImage()
		);
		scanXBeeLabel.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				scanConfigAction.run();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		

		scanConfigAction = new Action() {
			public void run() {
				try {
					String txt = "";
						textViewer.getDocument().set(txt);
						/*
					ATRetCmd APPP = (ATRetCmd) ATCmdUtils.INSTANCE.initXBeeATPPP(xbeePipe);
					if (APPP != null) {
						if (APPP.getCode().equals(AT_RET_CODES.OK)) {
							txt = "OK\n";
							txt += "Ask for speed ...\n";
							int baudRate	= ATCmdUtils.INSTANCE.getBaudRate(xbeePipe);
							txt += "Connection at " + baudRate + " bauds\n";
							txt += "Ask for PAN ...\n";
							String panID 	= ATCmdUtils.INSTANCE.getPanID(xbeePipe);
							txt += "PAN ID : " + panID + " (Personal Area ID)\n";
							txt += "Ask for MY ...\n";
							String myID		= ATCmdUtils.INSTANCE.getMY(xbeePipe);
							txt += "MY ID  : " + myID + " (16 bits Address)\n";
						} else {
							// XBee device is busy ... Error transmitting
							txt = "BUSY";
						}
					} else {
						txt = "INIT ERROR";
					}
					ATRetCmd CN = (ATRetCmd) ATCmdUtils.INSTANCE.invokeCN(xbeePipe);
					if (CN != null && CN.getCode().equals(AT_RET_CODES.OK)) {
						txt += "Connection Succefully Closed\n";
					} else {
						txt += "Error On Connection Termination\n";
					}
					*/
					textViewer.getDocument().set(txt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		
		connectXBeeAction.setText("Connection To AT XBee modem over USB/Arduino");
		connectXBeeAction.setToolTipText("Connection To AT XBee modem over USB/Arduino");
		connectXBeeAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.thingm", 
				"icons/arduino-add.png"
			)
		);
		
		textViewer = new TextViewer(container, SWT.BORDER);
		textViewer.setDocument(new Document());
		textViewer.setTextColor(ColorConstants.lightBlue);
		textViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, true).create());
		textViewer.getControl().setBackground(GUIToolkit.BG);

	}

	@Override
	public void setFocus() {}
}
