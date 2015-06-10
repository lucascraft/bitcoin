/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.btc.editior.gui;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.trading.PriceRule;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class TradingPriceRuleCurrencyPropertySection  extends AbstractEnumerationPropertySection {
	String[] labels = new String[]{
			BtcCurrency.BTC.getName(),
			BtcCurrency.USD.getName(),
			BtcCurrency.EUR.getName(),
			BtcCurrency.AUD.getName(),
			BtcCurrency.CAD.getName(),
			BtcCurrency.CHF.getName(),
			BtcCurrency.CNY.getName(),
			BtcCurrency.GBP.getName(),
			BtcCurrency.HKD.getName(),
			BtcCurrency.JPY.getName(),
			BtcCurrency.PLN.getName(),
			BtcCurrency.BTC.getName()
		};
		
		@Override
		protected String[] getEnumerationFeatureValues() {
			return labels;
		}

		@Override
		protected String getFeatureAsText() {
			return getEObject() instanceof PriceRule ? getEObject().eGet(getFeature()).toString() : "";
		}

		@Override
		public void setInput(IWorkbenchPart part, ISelection selection) {
			super.setInput(part, selection);
			getCombo().setText(((PriceRule)getEObject()).getCurrency().getName());
		}
		
		@Override
		protected Object getFeatureValue(int index) {
			return BtcCurrency.get(index);
		}

		@Override
		protected Object getOldFeatureValue() {
			return getEObject() == null ? "" : ((PriceRule)getEObject()).getCurrency();
		}

		@Override
		protected EStructuralFeature getFeature() {
			return TradingPackage.Literals.PRICE_RULE__CURRENCY;
		}

		@Override
		protected String getLabelText() {
			return "Currency";
		}
}