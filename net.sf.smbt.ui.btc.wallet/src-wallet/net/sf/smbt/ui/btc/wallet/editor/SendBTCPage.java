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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.AddressFormatException;
import com.google.bitcoin.core.Utils;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.core.WrongNetworkException;

public class SendBTCPage  extends AbstractBTCFormPage {
	private Color lightBlue	= new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont	= new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);
	
	private Label sendBTCLabel, sendMemoLabel, btcAmountLabel;
	private Text addrText, memoText, amountText;
	private Button sendButton;

	private ControlDecoration decWalletAddr;
	private ContentProposalAdapter adapterWalletAddr;
	private FieldDecoration infoFieldIndicator, errorFieldIndicator;
	
	private List<String> lastTenWalletAddresses;
	private String lastWalletAddress;
	
	public SendBTCPage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
		lastTenWalletAddresses = new ArrayList<String>(10);
		loadIpAddresseSettings();
	}
	
	public final static String WALLET_SECTION_DIALOG_SETTINGS_ID	= "net.sf.smbt.ui.dialogs";
	public final static String WALLET_ADDRESSES_CONFIGS_ID			= "net.sf.smbt.ui.dialogs.ip.addresses";
	
	private void storeConsolePageSettings() {
		IDialogSettings settings = net.sf.smbt.ui.btc.wallet.Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(WALLET_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(WALLET_SECTION_DIALOG_SETTINGS_ID);
		}
		
		boolean canStoreSettings = new WalletAddressValidator().validate();
		if (canStoreSettings) {
			if (!lastTenWalletAddresses.contains(lastWalletAddress)) {
				List<String> ipAddressesToStore = new ArrayList<String>();
				if (lastTenWalletAddresses.size() > 10) {
					lastTenWalletAddresses = lastTenWalletAddresses.subList(0, 9);
				}
				ipAddressesToStore.add(lastWalletAddress);
				ipAddressesToStore.addAll(lastTenWalletAddresses);
				
				consolePageDialogSettings.put(WALLET_ADDRESSES_CONFIGS_ID, ipAddressesToStore.toArray(new String[0]));
			}
		}
	}
	
	private void loadIpAddresseSettings() {
		IDialogSettings settings = net.sf.smbt.ui.btc.wallet.Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(WALLET_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(WALLET_SECTION_DIALOG_SETTINGS_ID);
		}
		String[] ipAddrLst = consolePageDialogSettings.getArray(WALLET_ADDRESSES_CONFIGS_ID);
		lastTenWalletAddresses = ipAddrLst == null ? new ArrayList<String>() : Arrays.asList(ipAddrLst);
	}

	private List<String> getFilteredWalletAddresses(String prefix, List<String> possibles) {
		List<String> list = new ArrayList<String>();
		for (String p : possibles) {
			if (p.startsWith(prefix)) {
				list.add(p);
			}
		}
		return list;
	}
	@Override
	public void createContents(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(GUIToolkit.FG);
		
		sendBTCLabel = new Label(container, SWT.NONE);
		sendBTCLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		sendBTCLabel.setText("Recipient : ");
		sendBTCLabel.setFont(medFont);
		sendBTCLabel.setBackground(GUIToolkit.BG);
		sendBTCLabel.setForeground(lightBlue);
		
		addrText = new Text(container, SWT.BORDER);
		addrText.setLayoutData(GridDataFactory.fillDefaults().hint(375, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).grab(true, false).span(2, 1).create());
		addrText.setFont(medFont);
		addrText.setBackground(GUIToolkit.lightGray);
		addrText.setForeground(GUIToolkit.lightGreen);
		addrText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				try {
					new WalletAddressValidator().validate();
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		});
		
		decWalletAddr		= new ControlDecoration(addrText, SWT.TOP | SWT.LEFT);
		
		infoFieldIndicator	= FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		errorFieldIndicator = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		
		decWalletAddr.setImage(infoFieldIndicator.getImage());
		decWalletAddr.setDescriptionText(infoFieldIndicator.getDescription());
		
		KeyStroke keyStroke = null;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		List<String> ipProposals = new ArrayList<String>();
		for (String lastWalletAddr : lastTenWalletAddresses) {
			if (!ipProposals.contains(lastWalletAddr)) {
				ipProposals.add(lastWalletAddr);
			}
		}

		adapterWalletAddr = new ContentProposalAdapter(
			addrText, new TextContentAdapter(), 
			new SimpleContentProposalProvider(
				getFilteredWalletAddresses(
					addrText.getText(), 
					ipProposals
				).toArray(new String[0])
			),
			keyStroke, null) {
			@Override
			protected void openProposalPopup() {
				super.openProposalPopup();
			}
		};
		adapterWalletAddr.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
		
		addrText.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				storeConsolePageSettings();
			}
		});


		sendMemoLabel = new Label(container, SWT.NONE);
		sendMemoLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		sendMemoLabel.setText("Message : ");
		sendMemoLabel.setBackground(GUIToolkit.BG);
		sendMemoLabel.setForeground(lightBlue);
		sendMemoLabel.setFont(medFont);

		
		memoText = new Text(container, SWT.BORDER);
		memoText.setLayoutData(GridDataFactory.fillDefaults().hint(375, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).span(2, 1).grab(true, false).create());
		memoText.setBackground(GUIToolkit.lightGray);
		memoText.setForeground(GUIToolkit.lightGreen);
		memoText.setFont(medFont);

		btcAmountLabel = new Label(container, SWT.NONE);
		btcAmountLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		btcAmountLabel.setText("BTC Amount : ");
		btcAmountLabel.setBackground(GUIToolkit.BG);
		btcAmountLabel.setForeground(lightBlue);
		btcAmountLabel.setFont(medFont);
		
		amountText = new Text(container, SWT.BORDER);
		amountText.setLayoutData(GridDataFactory.fillDefaults().hint(375, SWT.DEFAULT).align(SWT.BEGINNING, SWT.CENTER).span(2, 1).grab(true, false).create());
		amountText.setBackground(GUIToolkit.lightGray);
		amountText.setForeground(GUIToolkit.lightGreen);
		amountText.setFont(medFont);
		amountText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				try {
					new WalletAddressValidator().validate();
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		});

		sendButton = new Button(container, SWT.PUSH);
		sendButton.setText("Send");
		sendButton.setForeground(lightBlue);
		sendButton.setFont(medFont);
		sendButton.setSize(SWT.DEFAULT, 35);
		sendButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					try {
						Address address = new Address(getWallet().getNetworkParameters(), addrText.getText());
						float amount = Float.parseFloat(amountText.getText());
						amount = Utils.toNanoCoins(amountText.getText()).floatValue();
						
						Wallet.SendRequest req = Wallet.SendRequest.to(address, BigInteger.valueOf((long)amount));
						//req.fee = ;
						// Wallet.SendResult result = 
						getWallet().sendCoins(getPeerGroup(), req);
						// Transaction createdTx = result.tx;	
						
						lastWalletAddress = addrText.getText();
						storeConsolePageSettings();
						
						addrText.setText("");
						amountText.setText("");
						memoText.setText("");
						
					} catch (WrongNetworkException e1) {
						e1.printStackTrace();
					} catch (AddressFormatException e1) {
						e1.printStackTrace();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		sendButton.setEnabled(false);
	}
	
	public class WalletAddressValidator{
	    private Pattern pattern;
	    private Matcher matcher;
	 
	    private static final String IPADDRESS_PATTERN = 
			"\\w+";
	 
	    public WalletAddressValidator(){
		  pattern = Pattern.compile(IPADDRESS_PATTERN);
	    }
	 
	    public boolean validate(){
	      String ip = addrText.getText(); 
	      ip = ip == null ? "" : ip.toLowerCase();
	      ip = ip.trim();
		  matcher = pattern.matcher(ip);
		  boolean addrOK = matcher.matches();
		  if (decWalletAddr != null) {
			  if (addrOK) {
				  decWalletAddr.hide();
				  decWalletAddr.setImage(infoFieldIndicator.getImage());
			  } else {
				  decWalletAddr.show();
				  decWalletAddr.setImage(errorFieldIndicator.getImage());
				  //setErrorMessage("Invalid IP address format" + "\n" + USAGE_MSG);
			  }
		  }
		  String amount = amountText.getText();
		  try {
			  float a = Float.parseFloat(amount);
			  if (a <= 0) {
				  addrOK = false;
			  }
		  } catch(Exception e) {
			  addrOK = false;
		  }
		  sendButton.setEnabled(addrOK);
		  return addrOK; 	    	    
	    }
	}

	
	@Override
	public void refreshFromWallet() {}
}
