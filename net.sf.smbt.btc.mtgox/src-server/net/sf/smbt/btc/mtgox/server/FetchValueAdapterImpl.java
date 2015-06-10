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

package net.sf.smbt.btc.mtgox.server;

import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.MtgoxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public 	class FetchValueAdapterImpl extends AdapterImpl {
	private MTGox mtgox;
	float price;
	float tolerance;
	String kind;
	String direction;
	public FetchValueAdapterImpl(MTGox mtgox, float price, float tolerance, String kind, String direction) {
		this.mtgox 		= mtgox;
		this.price 		= price;
		this.tolerance 	= tolerance;
		this.kind 		= kind;
		this.direction 	= direction;
	}
	public float getPrice() {
		return price;
	}
	public float getTolerance() {
		return tolerance;
	}
	public String getKind() {
		return kind;
	}
	public String getDirection() {
		return direction;
	}
	@Override
	public void notifyChanged(Notification msg) {
		if (msg.getFeature().equals(MtgoxPackage.Literals.MT_GOX__FETCHS)) {
			Object newValue = msg.getNewValue();
			if (newValue instanceof DepthValue) {
				DepthValue depthV = (DepthValue) newValue;
				depthV.getKind();
				depthV.getPrice();
				if ((depthV.getPrice() >= (price - tolerance)) && (depthV.getPrice() <= (price + tolerance))) {
					System.out.println("Price Event Triggered : " + depthV.getPrice());
				}
			}
		}
	}
}

