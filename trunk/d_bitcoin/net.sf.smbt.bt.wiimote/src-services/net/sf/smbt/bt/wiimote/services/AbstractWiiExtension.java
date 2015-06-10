/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.bt.wiimote.services;

import net.sf.smbt.ezwiimote.WiiCmd;

public class AbstractWiiExtension implements WiiExtension {
	private String id;
	private String key;

	protected void decrypt(byte[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte) (((byte) data[i] ^ (byte) 0x17) + (byte) 0x17);
		}
	}

	@Override
	public byte[] getAddressBytes() {
		return new byte[0];
	}

	@Override
	public String getName() {
		return "Wii Extension";
	}

	@Override
	public String getID() {
		return id;
	}
	
	@Override
	public void setID(String id) {
		this.id = id;
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	@Override
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public WiiCmd computeDataEvent(byte[] data) {
		return null;
	}
	
	@Override
	public WiiCmd initialize() {
		return null;
	}
}
