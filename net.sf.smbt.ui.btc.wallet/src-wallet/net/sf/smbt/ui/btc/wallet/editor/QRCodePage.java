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

import net.sf.smbt.ui.btc.qrcode.QRCodeUtils;
import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class QRCodePage  extends AbstractBTCFormPage {
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);

	public QRCodePage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	@Override
	public void createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(lightBlue);

		String btcAddr = getECKey().toAddress(getWallet().getNetworkParameters()).toString();
		
		CLabel qrLabel = new CLabel(container, SWT.NONE);
		qrLabel.setImage(QRCodeUtils.INSTANCE.generateQRCode(btcAddr));
		
	}
	
	@Override
	public void refreshFromWallet() {

	}
}
