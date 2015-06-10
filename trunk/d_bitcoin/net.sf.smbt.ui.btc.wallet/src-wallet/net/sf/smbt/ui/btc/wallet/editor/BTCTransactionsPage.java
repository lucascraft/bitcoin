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

import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.TreeColumn;

public class BTCTransactionsPage extends AbstractBTCFormPage {
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);

	private TreeViewer lastTransactionsTreeViewer;
	
	public BTCTransactionsPage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	@Override
	public void createContents(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(lightBlue);
		
		lastTransactionsTreeViewer = new TreeViewer(container);
		
		lastTransactionsTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		lastTransactionsTreeViewer.getControl().setFont(medFont);
		lastTransactionsTreeViewer.getControl().setBackground(GUIToolkit.BG);
		lastTransactionsTreeViewer.getControl().setForeground(lightBlue);
		
		lastTransactionsTreeViewer.setLabelProvider(new LabelProvider());
		lastTransactionsTreeViewer.setContentProvider(new BicoinWalletTransactionsContentProvider());
		lastTransactionsTreeViewer.getTree().setHeaderVisible(true);
		lastTransactionsTreeViewer.getTree().setLinesVisible(true);

		lastTransactionsTreeViewer.setInput(getWallet());
		
		createTradeTableViewerColumn("Label", 	200, lastTransactionsTreeViewer);
		createTradeTableViewerColumn("Address", 165, lastTransactionsTreeViewer);
	}
	
	private TreeViewerColumn createTradeTableViewerColumn(String title, int bound, TreeViewer tv) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(tv, SWT.NONE);
		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			protected void paint(Event event, Object element) {
				super.paint(event, element);
			}
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);
					cell.setText("???");
				}
			}
		);
		return viewerColumn;
	}
	
	@Override
	public void refreshFromWallet() {
		
	}
}
