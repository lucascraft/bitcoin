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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.ScriptException;
import com.google.bitcoin.core.Transaction;
import com.google.bitcoin.core.TransactionInput;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.core.WalletTransaction;

public class BicoinWalletTransactionsContentProvider implements ITreeContentProvider {
	@Override
	public void dispose() {}
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Wallet) {
			List<Transaction> transactions = new ArrayList<Transaction>();
			Wallet w = (Wallet) inputElement;
			for (Transaction tx :  w.getTransactionsByTime()) {
				//try {
					//TransactionInput input	= tx.getInputs().get(0);
					//Address from 			= input.getFromAddress();
					//BigInteger valueToMe 	= tx.getValueSentToMe(w);
					//BigInteger valueFromMe	= tx.getValueSentFromMe(w);
					transactions.add(tx);
				//} catch (ScriptException e) {
				//	e.printStackTrace();
				//}
			}
			for (WalletTransaction wTx : w.getWalletTransactions()) {
				Transaction tx = wTx.getTransaction();
				//try {
				//	TransactionInput input	= tx.getInputs().get(0);
					//Address from 			= input.getFromAddress();
				//	BigInteger valueToMe 	= tx.getValueSentToMe(w);
				//	BigInteger valueFromMe	= tx.getValueSentFromMe(w);
				//	if (valueToMe.floatValue() > 0f && valueFromMe.floatValue() > 0f) {
						transactions.add(tx);
				//	}
				//} catch (ScriptException e) {
				//	e.printStackTrace();
				//}
			}
			return transactions.toArray();
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
