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

import java.math.BigInteger;

import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

public class TradingOrderPricePropertySection  extends AbstractBigIntegerPropertySection {
	public TradingOrderPricePropertySection() {}
	
	@Override
	protected void createWidgets(Composite composite) {
		super.createWidgets(composite);
		GUIColors.cascadeStyling(composite, getBG(), getFG());
	}

	@Override
	protected EStructuralFeature getFeature() {
		return TradingPackage.Literals.ORDER__PRICE_INT;
	}

	@Override
	protected String getLabelText() {
		return "Price";
	}

	@Override
	protected BigInteger getFeatureBigInteger() {
		BigInteger big = ((Order)getEObject()).getPrice_int();
		return big == null ? new BigInteger("0") : big;
	}
}