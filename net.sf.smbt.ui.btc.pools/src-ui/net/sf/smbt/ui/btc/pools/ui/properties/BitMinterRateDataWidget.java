/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.btc.pools.ui.properties;

import net.sf.smbt.ui.widgets.vu.UbiTimed2DChart;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class BitMinterRateDataWidget extends Composite {
	private UbiTimed2DChart chart;
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));

	private Font bigFont = new Font(Display.getDefault(), "tahoma", 18, SWT.BOLD);
	public BitMinterRateDataWidget(Composite parent, Object d) {
		super(parent, SWT.NONE);
		
		setLayout(GridLayoutFactory.fillDefaults().create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		setBackground(ColorConstants.green);
		
	}
	public UbiTimed2DChart getChart() {
		return chart;
	}
	@Override
	public void redraw() {
		super.redraw();
		if (chart!=null && !chart.isDisposed()) {
			chart.redraw();
		}
	}
}