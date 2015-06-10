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

import net.sf.smbt.trading.presentation.TradingEditorPlugin;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

public class TradingSheetLabelProvider extends BaseLabelProvider implements
		ILabelProvider {

	public String getText(Object selection) {
/*
 		Object element = unwrap(selection);
		if (element instanceof FixtureDefinition) {
			String label = ((FixtureDefinition)element).getModel();
			return "Fixture : " + (label == null ? "" : label);
		} else if (element instanceof DMXProject) {
			if (!((DMXProject)element).getUniverses().isEmpty()) {
				if (((DMXProject)element).getUniverses().get(0) instanceof DMXFixture) {
					return "Cues (" + ((DMXProject)element).getUniverses().get(0).getCues().size() + ")";
				}
			}
			return "Cues";
		}
*/
		return "Robots";
	}

	public Image getImage(Object element) {
		return TradingEditorPlugin.getPlugin().imageDescriptorFromPlugin(
			"net.sf.smbt.btc.editor"	, 
			"icons/ubiquisense.png"
		).createImage();
	}

	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
