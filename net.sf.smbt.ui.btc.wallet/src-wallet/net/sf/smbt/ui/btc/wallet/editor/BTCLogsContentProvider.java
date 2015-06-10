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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ui.btc.wallet.misc.BTCOperationStatus;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.google.bitcoin.core.Transaction;

public class BTCLogsContentProvider implements ITreeContentProvider {
	SimpleDateFormat yyyy_MM__dd_HH_MM_SS_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	
	private String getSeverity(int severity) {
		switch (severity) {
			case Status.INFO:
				return "INFO";
			case Status.ERROR:
				return "ERROR";
			case Status.WARNING:
				return "WARNING";
		}
		return "???";
	}
	@Override
	public void dispose() {}
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof BitcoinWalletEditor) {
			BitcoinWalletEditor editor = (BitcoinWalletEditor) inputElement;
//			Map<Date, BTCOperationStatus> logs = editor.getLogs();
			List<String> messages = new ArrayList<String>();
//			for (Date date : logs.keySet()) {
//				BTCOperationStatus opStatus = logs.get(date);
//				String msg = yyyy_MM__dd_HH_MM_SS_DATE_FORMAT.format(date) + " (" + getSeverity(opStatus.getSeverity()) + ") : " + opStatus.getMessage();
//				messages.add(msg);
//			}
			for (Transaction tx : editor.getWallet().getTransactionsByTime()) {
				messages.add(tx.toString());
			}
			return messages.toArray();
		}
		return new Object[0];
	}
	@Override
	public Object[] getChildren(Object parentElement) {
		return new Object[0];
	}
	@Override
	public Object getParent(Object element) {
		return null;
	}
	@Override
	public boolean hasChildren(Object element) {
		return false;
	}
}
