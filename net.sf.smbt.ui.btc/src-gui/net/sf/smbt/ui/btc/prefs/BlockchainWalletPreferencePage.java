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

package net.sf.smbt.ui.btc.prefs;

import net.sf.smbt.ui.btc.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class BlockchainWalletPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public BlockchainWalletPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("MT.GOX Keys Preference Page");
	}
	
	public void createFieldEditors() {
		addField(new StringFieldEditor(BlockchainWalletPreferenceConstants.P_BLOCKCHAIN_WALLET_ADDR_KEY, "Wallet :", getFieldEditorParent()));
		addField(new StringFieldEditor(BlockchainWalletPreferenceConstants.P_BLOCKCHAIN_USER_KEY, "User :", getFieldEditorParent()));
		addField(new StringFieldEditor(BlockchainWalletPreferenceConstants.P_BLOCKCHAIN_PASSWORD_KEY, "Password :", getFieldEditorParent()));
		addField(new StringFieldEditor(BlockchainWalletPreferenceConstants.P_BLOCKCHAIN_CONNECT_KEY, "Connect :", getFieldEditorParent()));
		addField(new StringFieldEditor(BlockchainWalletPreferenceConstants.P_BLOCKCHAIN_PORT_KEY, "Port :", getFieldEditorParent()));
		addField(new StringFieldEditor(BlockchainWalletPreferenceConstants.P_BLOCKCHAIN_SSL_KEY, "SSL :", getFieldEditorParent()));
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}