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
import java.text.SimpleDateFormat;

import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.progress.UIJob;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.ScriptException;
import com.google.bitcoin.core.Transaction;
import com.google.bitcoin.core.TransactionInput;
import com.google.bitcoin.core.Utils;

public class ReceiveBTCPage  extends AbstractBTCFormPage {
	SimpleDateFormat HH_MM_SS_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);

	private TreeViewer lastReceiveTreeViewer;
	
	public ReceiveBTCPage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	@Override
	public void createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(lightBlue);
		
		lastReceiveTreeViewer = new TreeViewer(container);
		
		lastReceiveTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		lastReceiveTreeViewer.getControl().setFont(medFont);
		lastReceiveTreeViewer.getControl().setBackground(GUIToolkit.BG);
		lastReceiveTreeViewer.getControl().setForeground(lightBlue);
		
		lastReceiveTreeViewer.setLabelProvider(new LabelProvider());
		lastReceiveTreeViewer.setContentProvider(new BicoinWalletTransactionsContentProvider());
		lastReceiveTreeViewer.getTree().setHeaderVisible(true);
		lastReceiveTreeViewer.getTree().setLinesVisible(true);

		lastReceiveTreeViewer.setInput(getWallet());
		
		createTradeTableViewerColumn("Date", 	200, lastReceiveTreeViewer);
		createTradeTableViewerColumn("Amount", 	120, lastReceiveTreeViewer);
		createTradeTableViewerColumn("Address", 220, lastReceiveTreeViewer);
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
			public void update(ViewerCell cell) {
				try {
					super.update(cell);
					Transaction tx			= (Transaction) cell.getElement();
					TransactionInput input	= tx.getInputs().get(0);
					Address from 			= input.getFromAddress();
					BigInteger value 		= tx.getValueSentToMe(getWallet());
					
					/*  */ if (cell.getColumnIndex() == 0) { // Date
						cell.setText(HH_MM_SS_DATE_FORMAT.format(tx.getUpdateTime()));
					} else if (cell.getColumnIndex() == 1) { // Amount
						cell.setText(Utils.bitcoinValueToFriendlyString(value));
					} else if (cell.getColumnIndex() == 2) { // Address{
						cell.setText(from.toString());
					}
				} catch (ScriptException e) {
					e.printStackTrace();
				}
			}
		});
		return viewerColumn;
	}
	@Override
	public void refreshFromWallet() {
		new RefreshJob().schedule();
	}
	class RefreshJob extends UIJob {
		public RefreshJob() {
			super("Refresh from wallet");
			setPriority(INTERACTIVE);
			setSystem(true);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (lastReceiveTreeViewer != null && !lastReceiveTreeViewer.getControl().isDisposed()) {
				lastReceiveTreeViewer.refresh(true);
			}
			return Status.OK_STATUS;
		}
	}
}
