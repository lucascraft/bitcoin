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

import net.sf.smbt.btc.OrderKind;
import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class TradingOrderKindPropertySection  extends AbstractEnumerationPropertySection {

	String[] labels = new String[]{
		OrderKind.ASK.getName(),
		OrderKind.BID.getName(),
		OrderKind.BOTH.getName(),
		OrderKind.ANY.getName()
	};
	
	@Override
	protected String[] getEnumerationFeatureValues() {
		return labels;
	}

	@Override
	protected String getFeatureAsText() {
		return getEObject() instanceof Order ? getEObject().eGet(getFeature()).toString() : "";
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		getCombo().setText(((Order)getEObject()).getKind().getName());
	}
	
	@Override
	protected Object getFeatureValue(int index) {
		return OrderKind.get(index);
	}

	@Override
	protected Object getOldFeatureValue() {
		return getEObject() == null ? "" : ((Order)getEObject()).getKind();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return TradingPackage.Literals.ORDER__KIND;
	}

	@Override
	protected String getLabelText() {
		return "Kind";
	}




}