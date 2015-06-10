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

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.MTGoxController;
import net.sf.smbt.btc.mtgox.MTGoxUtils;
import net.sf.smbt.fmodex.core.AudioUtils;
import net.sf.smbt.fmodex.core.SystemSound;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.btc.Activator;
import net.sf.smbt.ui.btc.prefs.MtGoxWalletPreferenceConstants;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class OrderView extends ViewPart {
	private Font bigFont = new Font(Display.getDefault(), "tahoma", 16, SWT.BOLD);
	private Font medFont = new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);
	
	private MTGoxController mtgoxController;

	
	
	
	
	
	
	
	
	
	
	public void initMarket() {
		String apiKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_API_KEY);
		String secretKey = Activator.getDefault().getPreferenceStore().getString(MtGoxWalletPreferenceConstants.P_MTGOX_SECRET_KEY);
		
		mtgoxController = MTGoxUtils.INSTANCE.getMTGoxControl(
			apiKey,
			secretKey
		);
	}
	@Override
	public void dispose() {
		if (mtgoxController != null) {
			if (mtgoxController.getMtgoxPipe() != null) {
				QuanticMojo.INSTANCE.closePipe(
					mtgoxController.getMtgoxPipe(),
					true
				);
			}
		}
		
		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.setForeground(GUIToolkit.FG);

		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
		container.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(GUIToolkit.FG);
	
		Composite buyBagLeft = GUIToolkit.INSTANCE.createComposite(container);
		buyBagLeft.setLayout(GridLayoutFactory.fillDefaults().create());
		buyBagLeft.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.TOP).grab(false, true).create());
		buyBagLeft.setBackground(GUIToolkit.BG);
		buyBagLeft.setForeground(GUIToolkit.FG);
		
		new AuctionWidget(buyBagLeft, "Buy");

		UbiVuMeter bidAskVumeter = new UbiVuMeter(container, SWT.VERTICAL);
		bidAskVumeter.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
		bidAskVumeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(25, 250).grab(false, true).create());
		bidAskVumeter.setBackground(GUIToolkit.BG);
		bidAskVumeter.setForeground(GUIToolkit.FG);

		Composite sellBagRight = GUIToolkit.INSTANCE.createComposite(container);
		sellBagRight.setLayout(GridLayoutFactory.fillDefaults().create());
		sellBagRight.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).grab(false, true).create());
		sellBagRight.setBackground(GUIToolkit.BG);
		sellBagRight.setForeground(GUIToolkit.FG);

		new AuctionWidget(sellBagRight, "Sell");
		
		initMarket();
	}

	@Override
	public void setFocus() {}
	
	class AuctionWidget extends Composite {
		private Button buyButtonCustom; //, buyButtonMarket;
		private Text auctionText, btcText, priceText;
		private Label textErr;
		private final String action;

		
		
		
		private ControlDecoration decBTC, decPrice;

		
		//protected Text ipAddrText, ingoingPortText;
		//private ContentProposalAdapter adapterIPAddr, adapterInPort;
		//private List<String> lastTenIPAddresses, lastTenInputPorts;
		private FieldDecoration infoFieldIndicator, errorFieldIndicator;
		
		
		private String adaptFloatFormat(String val) {
			String finalVal = "0.0";
			if (val.equals("0") || val.equals("0.")) {
				return finalVal;
			} else if (!val.contains(".")) {
				return val+".0";
			} else if (val.endsWith(".")) {
				return val.replaceAll(".", "").concat(".0");
			}
			return finalVal;
		}
		
		private boolean isValidFloat(String f) {
			try {
				float fV = Float.parseFloat(f);
				if (fV > 0f) {
					return true;
				}
			} catch(NumberFormatException nfe) {
				return false;
			}
			return false;
		}
		
		public class BTCAmountValidator{
		    public boolean validate(){
		    	String btcAmount = btcText.getText(); 
				setErrorMessage(null);
				if (btcText != null) {
					if (isValidFloat(adaptFloatFormat(btcAmount))) {
						decBTC.hide();
						decBTC.setImage(infoFieldIndicator.getImage());
						setErrorMessage(null);
					} else {
						decBTC.show();
						decBTC.setImage(errorFieldIndicator.getImage());
						setErrorMessage("Invalid BTC amount format");
						return false;
					}
				}
				return true; 	    	    
		    }
		}
		public class PriceValidator{
			public boolean validate(){
				String price = priceText.getText(); 
				setErrorMessage(null);
				if (priceText != null) {
					if (isValidFloat(adaptFloatFormat(price))) {
						decPrice.hide();
						decPrice.setImage(infoFieldIndicator.getImage());
						setErrorMessage(null);
					} else {
						decPrice.show();
						decPrice.setImage(errorFieldIndicator.getImage());
						setErrorMessage("Invalid price format");
						return false;
					}
				}
				return true; 	    	    
			}
		}

		
		private void setErrorMessage(String msg) {
			textErr.setText(msg);
		}
		
		
		public AuctionWidget(Composite p, final String _action) {
			super(p, SWT.NONE);
			
			this.action = _action;
			
			setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
			setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
			setBackground(GUIToolkit.BG);
			setForeground(GUIToolkit.FG);
			
			Composite container = GUIToolkit.INSTANCE.createComposite(p);
			container.setLayout(GridLayoutFactory.fillDefaults().margins(10, 30).numColumns(3).create());
			container.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(false, true).create());
			container.setBackground(GUIToolkit.BG);
			container.setForeground(GUIToolkit.FG);

			Label btcLabel = new Label(container, SWT.READ_ONLY);
			btcLabel.setText("BTC");
			btcLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(true, false).create());
			btcLabel.setBackground(GUIToolkit.BG);
			btcLabel.setForeground(GUIToolkit.FG);
			btcLabel.setFont(medFont);

			Label currencyLabel = new Label(container, SWT.READ_ONLY);
			currencyLabel.setText("Price");
			currencyLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).grab(true, false).create());
			currencyLabel.setBackground(GUIToolkit.BG);
			currencyLabel.setForeground(GUIToolkit.FG);
			currencyLabel.setFont(medFont);

			Label auctionLabel	= new Label(container, SWT.READ_ONLY);
			auctionLabel.setText("Auction");
			auctionLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).grab(true, false).create());
			auctionLabel.setBackground(GUIToolkit.FG);
			auctionLabel.setBackground(GUIToolkit.BG);
			auctionLabel.setForeground(GUIToolkit.FG);
			auctionLabel.setFont(medFont);
			
			//
			
			btcText		= new Text(container, SWT.BORDER);
			btcText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
			btcText.setBackground(GUIToolkit.FG);
			btcText.setForeground(GUIToolkit.BG);
			btcText.setFont(bigFont);
			btcText.setText("0.01");
			btcText.addModifyListener(
				new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						new BTCAmountValidator().validate();
					}
				}
			);
			btcText.addVerifyListener(new VerifyListener() {
				@Override
				public void verifyText(VerifyEvent e) {
					/*
					buyButtonCustom.setEnabled(false);
					auctionText.setText("");
					try {
						String btcTxt = btcText.getText();
						btcTxt = btcTxt.contains(".") ? btcTxt : btcTxt.concat(".0");
						float btc = Float.parseFloat(btcTxt);
						
						String priceTxt = priceText.getText();
						priceTxt = priceTxt.contains(".") ? priceTxt : priceTxt.concat(".0");
						float price = Float.parseFloat(priceTxt);

						if (btc>0  && price>0) {
							auctionText.setText((btc * price) + mtgoxController.getMTGox().getMarket().getCurrency().getLiteral());
						}
					} catch (Exception e1) {
						e1.printStackTrace();
						auctionText.setText("Err");
						buyButtonCustom.setEnabled(false);
					}
					*/
				}
			});
			
			// Create a control decoration to indicate an error.
			decBTC = new ControlDecoration(btcText, SWT.TOP | SWT.LEFT);
			infoFieldIndicator = FieldDecorationRegistry.getDefault().
					   getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
			errorFieldIndicator = FieldDecorationRegistry.getDefault().
					   getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
			decBTC.setImage(infoFieldIndicator.getImage());
			decBTC.setDescriptionText(infoFieldIndicator.getDescription());


			priceText = new Text(container, SWT.BORDER);
			priceText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
			priceText.setBackground(GUIToolkit.FG);
			priceText.setForeground(GUIToolkit.BG);
			priceText.setFont(bigFont);
			priceText.setText("0.01");
			priceText.addVerifyListener(new VerifyListener() {
				@Override
				public void verifyText(VerifyEvent e) {
					/*
					auctionText.setText("");
					try {
						String btcTxt = btcText.getText();
						btcTxt += btcTxt.endsWith(".") ? "" : btcTxt.replaceAll(".", "").concat(".0");
						float btc = Float.parseFloat(btcTxt);
						
						String priceTxt = priceText.getText();
						priceTxt += priceTxt.endsWith(".") ? "" : priceTxt.replaceAll(".", "").concat(".0");
						float price = Float.parseFloat(priceTxt);

						if (btc>0  && price>0) {
							auctionText.setText((btc * price) + mtgoxController.getMTGox().getMarket().getCurrency().getLiteral());
						}
					} catch (Exception e1) {
						e1.printStackTrace();
						auctionText.setText("Err");
						buyButtonCustom.setEnabled(false);
					}
					*/
				}
			});
			priceText.addModifyListener(
				new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						new BTCAmountValidator().validate();
					}
				}
			);
			
			// Create a control decoration to indicate an error.
			decPrice = new ControlDecoration(priceText, SWT.TOP | SWT.LEFT);
			infoFieldIndicator = FieldDecorationRegistry.getDefault().
					   getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
			errorFieldIndicator = FieldDecorationRegistry.getDefault().
					   getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
			decPrice.setImage(infoFieldIndicator.getImage());
			decPrice.setDescriptionText(infoFieldIndicator.getDescription());


			auctionText	= new Text(container, SWT.BORDER | SWT.READ_ONLY);
			auctionText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
			auctionText.setBackground(GUIToolkit.FG);
			auctionText.setForeground(GUIToolkit.BG);
			auctionText.setFont(bigFont);
			
			buyButtonCustom = new Button(container, SWT.PUSH);
			buyButtonCustom.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).align(SWT.CENTER, SWT.BOTTOM).hint(200, 40).grab(true, false).create());
			buyButtonCustom.setBackground(GUIToolkit.Red);
			buyButtonCustom.setForeground(GUIToolkit.BG);
			buyButtonCustom.setFont(bigFont);
			buyButtonCustom.setText(action);
			
			buyButtonCustom.addSelectionListener(
				new SelectionListener() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String amountAsText = btcText.getText();
						float amount = Float.parseFloat(amountAsText);
						String priceAsText = priceText.getText();
						float price = Float.parseFloat(priceAsText);
						mtgoxController.addOrder(
							BtcCurrency.BTC, 
							mtgoxController.getMTGox().getMarket().getCurrency(), 
							"Buy".equals(action)?"bid":"ask", 
							amount,
							price
						);
						AudioUtils.INSTANCE.playSystemSound(SystemSound.BUTTON_33);
					}
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}
				}
			);
	
			Label price = new Label(container, SWT.NONE);
			price.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, 40).grab(true, false).create());
			price.setBackground(GUIToolkit.BG);
			price.setForeground(GUIToolkit.FG);
			price.setFont(bigFont);
			price.setText("");
			
			textErr = new Label(container, SWT.READ_ONLY|SWT.BORDER);
		
			textErr.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).align(SWT.CENTER, SWT.TOP).hint(200, 40).grab(true, false).create());
			textErr.setBackground(GUIToolkit.BG);
			textErr.setForeground(GUIToolkit.lightRed);
			textErr.setFont(medFont);


			/*
			buyButtonMarket = new Button(container, SWT.PUSH);
			buyButtonMarket.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).align(SWT.CENTER, SWT.TOP).hint(200, 40).grab(true, false).create());
			buyButtonMarket.setBackground(GUIToolkit.FG);
			buyButtonMarket.setForeground(GUIToolkit.BG);
			buyButtonMarket.setFont(bigFont);
			buyButtonMarket.setText(action + " 1st");
			buyButtonMarket.addSelectionListener(
				new SelectionListener() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						mtgoxController.addOrder(
							BtcCurrency.BTC, 
							mtgoxController.getMTGox().getMarket().getCurrency(), 
							"Buy".equals(action)?"bid":"ask", 
							0,
							0
						);
						AudioUtils.INSTANCE.playSystemSound(SystemSound.BUTTON_33);
					}
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}
				}
			);
			*/
		}
	}
}
