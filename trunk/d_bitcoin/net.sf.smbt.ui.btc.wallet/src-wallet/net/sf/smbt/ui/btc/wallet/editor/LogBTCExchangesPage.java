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

import java.text.SimpleDateFormat;

import net.sf.smbt.ui.btc.wallet.misc.GUIToolkit;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;

public class LogBTCExchangesPage  extends AbstractBTCFormPage {
	SimpleDateFormat HH_MM_SS_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	private Font medFont = new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD);

	private TextViewer walletDumpText;
	
	private RefreshJob refreshJob;
	
	class RefreshJob extends UIJob {
		public RefreshJob() {
			super("Bitcoin Wallet Log Refresh Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (walletDumpText != null && !walletDumpText.getControl().isDisposed()) {
				BitcoinWalletEditor editor = (BitcoinWalletEditor) getEditor();
				walletDumpText.getDocument().set(editor.getWallet().toString());
			}
			schedule(5000);
			return Status.OK_STATUS;
		}
	}
	public LogBTCExchangesPage(BitcoinWalletEditor editor, String id, String title) {
		super(editor, id, title);
		refreshJob = new RefreshJob();
	}
	
	@Override
	public void createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		container.setForeground(lightBlue);
		
		walletDumpText = new TextViewer(container, SWT.MULTI | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
		walletDumpText.setDocument(new Document());
		
		walletDumpText.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		walletDumpText.getControl().setFont(medFont);
		walletDumpText.getControl().setBackground(GUIToolkit.BG);
		walletDumpText.getControl().setForeground(lightBlue);
		
		refreshJob.schedule();
	}
	
	@Override
	public void refreshFromWallet() {
		refreshJob.schedule();
	}
}
