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

package net.sf.smbt.ui.btc.wallet.wizard;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class BTCWalletConfigWizardPage extends WizardPage {
	
	private Label locationLabel;
	private Button asAWorkspaceFileChoiceButton;

	protected BTCWalletConfigWizardPage() {
		super("Bitcoin Wallet Configuration");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		top.setLayoutData(GridDataFactory.fillDefaults().create());
		
		asAWorkspaceFileChoiceButton = new Button(parent, SWT.TOGGLE);
		asAWorkspaceFileChoiceButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.DEFAULT).create());
		asAWorkspaceFileChoiceButton.setSelection(true);
		
		locationLabel = new Label(top, SWT.NONE);
		locationLabel.setText("Create wallet inside eclipse");
		locationLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.DEFAULT).create());

		Composite middle = new Composite(parent, SWT.NONE);
		middle.setLayout(new StackLayout());
	
		
		Composite nothing = new Composite(middle, SWT.NONE);
		nothing.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		nothing.setLayoutData(GridDataFactory.fillDefaults().create());

		Composite outsideResource = new Composite(middle, SWT.NONE);
		outsideResource.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		outsideResource.setLayoutData(GridDataFactory.fillDefaults().create());

		
	}
}
