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

import java.io.File;
import java.math.BigInteger;

import net.sf.smbt.btc.wallet.server.BtcWalletServerUtils;
import net.sf.smbt.ui.btc.qrcode.QRCodeUtils;
import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.UIJob;

import com.google.bitcoin.core.Utils;
import com.google.bitcoin.core.Wallet.BalanceType;

public class MainBTCPage extends AbstractBTCFormPage {
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);

	private Label confirmedBalanceLabel, unconfirmedBalanceLabel, transactionsNumberLabel, btcAddressLabel;
	private Label confirmedBalanceValueLabel, unconfirmedBalanceValueLabel, transactionsNumberValueLabel;
	private Text btcAddressValueLabel;
	
	private Button deployWalletOnServerButton;
	
	private String SIX_DIGITS_DECIMAL_FLOAT_FORMAT = "%.10f";
	
	private static MainBTCPage INSTANCE;

	public MainBTCPage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
		INSTANCE = this;
	}
	
	/**
	 * Save as dialog. Cached.
	 */
	protected InputDialog saveAsDialog = new InputDialog(
		Display.getDefault().getActiveShell(),
			"Server address", 
			"Address", 
			"", new IInputValidator() {  

			public String isValid(String newText) {
				if (newText.length() == 0) {
					return "Shouldn't be empty"; 
				}
				return null;
			}
		})

	{

		protected Control createDialogArea(Composite parent) {
			Control control = super.createDialogArea(parent);
			Text text = getText();
			assert null != text;
			text.setTextLimit(30);
			text.setTextLimit(100);
			return control;
		}
	};

	public void createContents(Composite parent) {
		
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		top.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		top.setBackground(GUIToolkit.BG);
		top.setForeground(GUIToolkit.FG);
		
		Composite container = new Composite(top, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(GUIToolkit.FG);
		
		btcAddressLabel = new Label(container, SWT.NONE);
		btcAddressLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		btcAddressLabel.setText("BTC address : ");
		btcAddressLabel.setBackground(GUIToolkit.BG);
		btcAddressLabel.setFont(medFont);
		btcAddressLabel.setForeground(lightBlue);
		
		btcAddressValueLabel = new Text(container, SWT.READ_ONLY);
		btcAddressValueLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(350, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).create());
		btcAddressValueLabel.setBackground(GUIToolkit.BG);
		btcAddressValueLabel.setFont(medFont);
		btcAddressValueLabel.setForeground(lightBlue);

		
		confirmedBalanceLabel = new Label(container, SWT.NONE);
		confirmedBalanceLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		confirmedBalanceLabel.setText("Balance : ");
		confirmedBalanceLabel.setBackground(GUIToolkit.BG);
		confirmedBalanceLabel.setFont(medFont);
		confirmedBalanceLabel.setForeground(lightBlue);
		
		confirmedBalanceValueLabel = new Label(container, SWT.NONE);
		confirmedBalanceValueLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(200, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).grab(true, false).create());
		confirmedBalanceValueLabel.setBackground(GUIToolkit.BG);
		confirmedBalanceValueLabel.setFont(medFont);
		confirmedBalanceValueLabel.setForeground(lightBlue);
		
		unconfirmedBalanceLabel = new Label(container, SWT.NONE);
		unconfirmedBalanceLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		unconfirmedBalanceLabel.setText("Unconfirmed : ");
		unconfirmedBalanceLabel.setBackground(GUIToolkit.BG);
		unconfirmedBalanceLabel.setFont(medFont);
		unconfirmedBalanceLabel.setForeground(lightBlue);
		
		unconfirmedBalanceValueLabel = new Label(container, SWT.NONE);
		unconfirmedBalanceValueLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(200, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).grab(true, false).create());
		unconfirmedBalanceValueLabel.setBackground(GUIToolkit.BG);
		unconfirmedBalanceValueLabel.setFont(medFont);
		unconfirmedBalanceValueLabel.setForeground(lightBlue);
		
		transactionsNumberLabel = new Label(container, SWT.NONE);
		transactionsNumberLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		transactionsNumberLabel.setText("Transactions : ");
		transactionsNumberLabel.setBackground(GUIToolkit.BG);
		transactionsNumberLabel.setFont(medFont);
		transactionsNumberLabel.setForeground(lightBlue);
		
		transactionsNumberValueLabel = new Label(container, SWT.NONE);
		transactionsNumberValueLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(200, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).grab(true, false).create());
		transactionsNumberValueLabel.setBackground(GUIToolkit.BG);
		transactionsNumberValueLabel.setFont(medFont);
		transactionsNumberValueLabel.setForeground(lightBlue);
		
		deployWalletOnServerButton = new Button(container, SWT.PUSH);
		deployWalletOnServerButton.setText("Deploy ...");
		deployWalletOnServerButton.setForeground(lightBlue);
		deployWalletOnServerButton.setFont(medFont);
		deployWalletOnServerButton.setSize(SWT.DEFAULT, 45);
		deployWalletOnServerButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					int status = saveAsDialog.open();
					if (status == Window.OK) {
						BitcoinWalletEditor editor = (BitcoinWalletEditor) getEditor().getActiveEditor();
						FileEditorInput editorInput = (FileEditorInput) editor.getEditorInput();
						String addr = saveAsDialog.getValue();
						// "http://localhost:8093"
						BtcWalletServerUtils.INSTANCE.deployWallet(
							addr, "/wallets/deploy?wallet="+editorInput.getFile().getName(), new File(editorInput.getFile().getRawLocationURI())		
						);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		
		
		Composite qrCode = new Composite(parent, SWT.NONE);
		qrCode.setLayout(GridLayoutFactory.fillDefaults().create());
		qrCode.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		qrCode.setBackground(GUIToolkit.BG);
		qrCode.setForeground(GUIToolkit.FG);

		String btcAddr = getECKey().toAddress(getWallet().getNetworkParameters()).toString();
		
		CLabel qrLabel = new CLabel(qrCode, SWT.NONE);
		qrLabel.setImage(QRCodeUtils.INSTANCE.generateQRCode(btcAddr));

		refreshFromWallet();
	}
	
	@Override
	public void refreshFromWallet() {
		new UIJob("Refresh Wallet") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				BigInteger estimatedBalance = getWallet().getBalance(BalanceType.ESTIMATED);
				BigInteger availableBalance = getWallet().getBalance(BalanceType.AVAILABLE);
				
				if (!btcAddressValueLabel.isDisposed()) {
					btcAddressValueLabel.setText(getECKey().toAddress(getWallet().getNetworkParameters()).toString());
					btcAddressValueLabel.getParent().layout(true);
				}
				if (!confirmedBalanceValueLabel.isDisposed()) {
					
					String confirmedBalanceText = Utils.bitcoinValueToFriendlyString(availableBalance);
					confirmedBalanceValueLabel.setText(confirmedBalanceText + " BTC");
					confirmedBalanceValueLabel.getParent().layout(true);
				}
				if (!unconfirmedBalanceValueLabel.isDisposed()) {
					String unconfirmedBalanceText = Utils.bitcoinValueToFriendlyString(estimatedBalance);
					unconfirmedBalanceValueLabel.setText(unconfirmedBalanceText + " BTC");
					unconfirmedBalanceValueLabel.getParent().layout(true);
				}
				if (!transactionsNumberValueLabel.isDisposed()) {
					transactionsNumberValueLabel.setText(getWallet().getTransactionsByTime().size()+"");
					transactionsNumberValueLabel.getParent().layout(true);
				}
				if (!INSTANCE.getManagedForm().getForm().isDisposed()) {
					INSTANCE.getManagedForm().getForm().layout(true);
				}
				if (!INSTANCE.getPartControl().isDisposed()) {
					INSTANCE.getPartControl().redraw();
				}
				return Status.OK_STATUS;
			}
		}.schedule();
	}
}
