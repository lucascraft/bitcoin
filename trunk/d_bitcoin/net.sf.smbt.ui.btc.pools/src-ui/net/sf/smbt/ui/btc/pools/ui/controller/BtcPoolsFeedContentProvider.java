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

package net.sf.smbt.ui.btc.pools.ui.controller;


import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.btc.pools.bitminter.BitMinterConfig;
import net.sf.smbt.btc.pools.bitminter.Shift;
import net.sf.smbt.btc.pools.bitminter.UserData;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class BtcPoolsFeedContentProvider implements ITreeContentProvider {
	@SuppressWarnings("unused")
	private BitMinterConfig bitMinterConfig;
	
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof BitMinterConfig) {
			bitMinterConfig = (BitMinterConfig) newInput;
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof BitMinterConfig) {
			BitMinterConfig et = (BitMinterConfig) inputElement;
			if (et.getData() instanceof UserData) {
				return et.getData().getWorkers().toArray();
			}
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof UserData) {
			UserData et = (UserData) parentElement;
			List<Object> list = new ArrayList<Object>();
			if (et.getShift() instanceof Shift) {
				list.add(et.getShift());
			}
			if (!et.getBalances().isEmpty()) {
				list.addAll(et.getBalances());
			}
			if (!et.getRoundStarts().isEmpty()) {
				list.addAll(et.getRoundStarts());
			}
			if (!et.getWorkers().isEmpty()) {
				list.addAll(et.getWorkers());
			}
			return list.toArray();
		} /*else if (parentElement instanceof Worker) {
			Worker et = (Worker) parentElement;
			List<Object> list = new ArrayList<Object>();
			if (!et.getWorks().isEmpty()) {
				list.addAll(et.getWorks());
			}
			return list.toArray();
			
		} */
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			if (((EObject)element).eContainer() != null) {
				return ((EObject)element).eContainer();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length>0;
	}
}
