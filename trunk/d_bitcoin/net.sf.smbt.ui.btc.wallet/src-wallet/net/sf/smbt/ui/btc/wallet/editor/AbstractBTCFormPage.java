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

import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.google.bitcoin.core.BlockChain;
import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.PeerGroup;
import com.google.bitcoin.core.Wallet;

public abstract class AbstractBTCFormPage extends FormPage implements IWalletFormPage {
	
	public AbstractBTCFormPage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
	}
	public Wallet getWallet() {
		return ((BitcoinWalletEditor)getEditor()).getWallet();
	}
	public ECKey getECKey() {
		return ((BitcoinWalletEditor)getEditor()).getEcKey();
	}
	public PeerGroup getPeerGroup() {
		return ((BitcoinWalletEditor)getEditor()).getPeerGroup();
	}
	public BlockChain getBlockChain() {
		return ((BitcoinWalletEditor)getEditor()).getChain();
	}
	public void createHeader() {
		Form f = this.getManagedForm().getForm().getForm();
		f.setText(this.getPartName());
		this.getEditor().getToolkit().decorateFormHeading(f);
	}
	/**
	 * @return the editor form toolkit
	 */
	protected FormToolkit getFormToolkit() {
		return getEditor().getToolkit();
	}

	private void updateBG(Composite c) {
		if (c instanceof Composite) {
			c.setBackground(GUIToolkit.BG);
		}
		if (c.getParent() instanceof Composite) {
			((Composite)c.getParent()).setBackground(GUIToolkit.BG);
		}
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		
		Composite body = managedForm.getForm().getBody();
		
		
		managedForm.getForm().setBackground(GUIToolkit.BG);
		managedForm.getForm().setForeground(GUIToolkit.FG);
		
		body.setBackground(GUIToolkit.BG);
		body.setForeground(GUIToolkit.FG);
		
		GridLayout gl = new GridLayout(1, true);
		gl.verticalSpacing = 20;

		Composite actualContent = this.getEditor().getToolkit().createComposite(body, SWT.NONE);
		GridDataFactory.swtDefaults().span(1, 1).align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(actualContent);
		actualContent.setLayout(gl);
		
		createContents(actualContent);

		body.setLayout(gl);

		getFormToolkit().adapt(actualContent);

		updateBG(actualContent);
	}

	public abstract void createContents(Composite content);
}
