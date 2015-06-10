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

package net.sf.smbt.bt.wiimote.extensions;

import net.sf.smbt.bt.wiimote.services.AbstractWiiExtension;
import net.sf.smbt.ezwiimote.EzwiimoteFactory;
import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.smbt.ezwiimote.WiiMultiCmd;

public class WiiMotionPlusExtension extends AbstractWiiExtension {
	public final static String ID = "net.sf.smbt.bt.wiimote.wiiMotionPlus";

	@Override
	public WiiCmd initialize() {
		// TODO Auto-generated method stub
		return super.initialize();
	}
	
	@Override
	public byte[] getAddressBytes() {
		return WiiMotionPlusUtils.REGISTER_ADDR_BYTES;
	}

	@Override
	public String getName() {
		return "Motion+"; //FIXME : LB to dig into that ... ????????????
	}

	@Override
	public WiiCmd computeDataEvent(byte[] data) {
		WiiMultiCmd multiCmd = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();

		//multiCmd.add(WiiMotionPlusUtils.INSTANCE.);
		
		return multiCmd;
	}
}
