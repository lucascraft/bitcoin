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

import gnu.io.CommPortIdentifier;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.arduino.wizards.ArduinoConfigWizardDialog;
import net.sf.smbt.ui.btc.pools.Activator;
import net.sf.smbt.ui.btc.pools.ui.actions.ConnectAsicOverUSBAction;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.EditorActionBarContributor;

public class BitMinterPoolsActionBarContributor extends EditorActionBarContributor {
	private ConnectAsicOverUSBAction 	connectAsicOverUSBAction;
	private BitMinterPoolsEditor 		cosmEditor;
	
	public BitMinterPoolsEditor getCosmEditor() {
		return cosmEditor;
	}

	public BitMinterPoolsActionBarContributor() {
		//
		// Connect Arduino
		//
		connectAsicOverUSBAction = new ConnectAsicOverUSBAction(ConnectAsicOverUSBAction.ID, "Connect") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				ArduinoConfigWizardDialog arduinoConfigWizardDialog = new ArduinoConfigWizardDialog();
				int status = arduinoConfigWizardDialog.open();
				if (status == Window.OK) {
					ArduinoConfig cfg = arduinoConfigWizardDialog.getArduinoConfiguration();
					if (cfg != null) {
						CommPortIdentifier obj = cfg.getUsbComm();
						if (obj instanceof CommPortIdentifier) {
							if (checkIfArduinoConnectionAlreadyExistAndAskForReplace(obj)) {
								CmdPipe bflAsicPipe = QuanticMojo.INSTANCE.openUsbPipe(
									"bfl-v2", 
									((CommPortIdentifier)obj).getName(), 
									cfg.getUsbSpeed()
								);

								XCPAddress addr = XCPAddressUtils.INSTANCE.createEzTarget(bflAsicPipe);
								cosmEditor.getBitMinterProject().setLastAddress(addr);
								cosmEditor.updateUSBLink(bflAsicPipe);
							}
						}		
					}
				}
			}
		};	
		connectAsicOverUSBAction.setText("Connection To BFL device");
		connectAsicOverUSBAction.setToolTipText("Connection To BFL device");
		connectAsicOverUSBAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.btc.pools", 
				"icons/bfl-connect.png"
			)
		);
	}

	
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator());
		toolBarManager.add(connectAsicOverUSBAction);
	}
	
	public void setActiveEditor(IEditorPart part) {
	    IActionBars actionBars = getActionBars();
	    if (actionBars != null && part instanceof BitMinterPoolsEditor) {
	    	cosmEditor = (BitMinterPoolsEditor) part;

	    	// Asic
	    	actionBars.setGlobalActionHandler(ConnectAsicOverUSBAction.ID, 	connectAsicOverUSBAction);
	    	connectAsicOverUSBAction.setEnabled(true);
	    }
	}
	
	public void contributeToMenu(IMenuManager manager) {
		IMenuManager menu = new MenuManager("BitMinter");
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(connectAsicOverUSBAction);
	}

	private boolean checkIfArduinoConnectionAlreadyExistAndAskForReplace(CommPortIdentifier io) {
		if (cosmEditor != null) {
			return true;
		} else {
			MessageDialog dlg = new MessageDialog(
				Display.getDefault().getActiveShell(),
				"BFL ASIC connection question",
				Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.btc.pools", "icons/bfl.png").createImage(),
				"BFL ASIC connection already active !\nWould you want to replace it ?",
				MessageDialog.QUESTION_WITH_CANCEL,
				new String[] { 
					"Yes", 
					"No", 
					"Cancel" 
				},
				0
			);
			return dlg.open() == 0;
		}
	}
}
