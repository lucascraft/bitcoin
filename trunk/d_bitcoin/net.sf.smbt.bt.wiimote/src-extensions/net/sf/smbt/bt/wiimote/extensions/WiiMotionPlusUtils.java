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

import net.sf.smbt.bt.wiimote.utils.BTWiimoteCmdUtils;
import net.sf.smbt.ezwiimote.WiiCmd;

/* 
 * extension reports contain WiiMotion Plus data as soon as 0x20 status is raised
 */
public class WiiMotionPlusUtils {
	
	public final static WiiMotionPlusUtils INSTANCE = new WiiMotionPlusUtils();
	
	public final static byte[] REGISTER_ADDR_BYTES = 
		new byte[] { 
			(byte) 0xa6, 0x00, (byte) 0xf0 
		};
	
	public final static byte[] EXTENSION_ACTIVATION_REGISTER_ADDR_BYTES = 
		new byte[] { 
			(byte) 0xa6, 0x00, (byte) 0xfe 
		};
	
	public final static byte[] EXTENSION_DEACTIVATION_REGISTER_ADDR_BYTES = 
		new byte[] { 
			(byte) 0xa4, 0x00, (byte) 0xfe 
		};
	
	public final static byte[] IDENTIFIER = 
		new byte[] { 
			(byte) 0xa6, 0x20, 0x00, 0x05 
		};
	
	public final static byte[] ACTIVE_EXTENSION_IDENTIFIER = 
		new byte[] { 
			(byte) 0xa4, 0x20, 0x04, 0x05 
		};
	
	public final int RETRY_NUMBER = 3;
	
	public final long DELAY = 8000l;
	
	public final byte[] INIT_BYTE = new byte[] { 0x55 };
	
	public final byte[] EXTENSION_ACTIVATION_BYTE = new byte[] { 0x04 };
	
	public WiiCmd createInitWiiMotionPlusCmdReq() {
		return BTWiimoteCmdUtils.INSTANCE.createWiiWriteRegisterReqCmd(
			REGISTER_ADDR_BYTES, 
			INIT_BYTE
		);
	}
	
	public WiiCmd createSetWiiMotionPlusAsActiveExtensionCmdReq() {
		return BTWiimoteCmdUtils.INSTANCE.createWiiWriteRegisterReqCmd(
			EXTENSION_ACTIVATION_REGISTER_ADDR_BYTES, 
			EXTENSION_ACTIVATION_BYTE
		);
	}
	
	public WiiCmd createUnsetWiiMotionPlusAsActiveExtensionCmdReq() {
		return BTWiimoteCmdUtils.INSTANCE.createWiiWriteRegisterReqCmd(
			EXTENSION_DEACTIVATION_REGISTER_ADDR_BYTES, 
			INIT_BYTE
		);
	}
}
