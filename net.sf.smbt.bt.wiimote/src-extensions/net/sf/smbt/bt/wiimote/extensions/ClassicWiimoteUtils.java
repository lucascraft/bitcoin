/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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
import net.sf.smbt.ezwiimote.BUTTON_CODE;
import net.sf.smbt.ezwiimote.EzwiimoteFactory;
import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;
import net.sf.smbt.ezwiimote.WiiLeftAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiLeftAnalogTriggerEvent;
import net.sf.smbt.ezwiimote.WiiMultiCmd;
import net.sf.smbt.ezwiimote.WiiRightAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiRightAnalogTriggerEvent;


public class ClassicWiimoteUtils {
	
	public final static ClassicWiimoteUtils INSTANCE = new ClassicWiimoteUtils();

	public final static WiiCmd EXTENSION_REGISTERS_INIT = BTWiimoteCmdUtils.INSTANCE.createWiiWriteRegisterReqCmd(
		new byte[] { (byte) 0xa4, 0x00, 0x40}, 
		new byte[] { 0x00 }
	);
	
	protected WiiCmd fireAnalogEvents(byte[] data) {
		WiiLeftAnalogStickEvent leftStickEvt = EzwiimoteFactory.eINSTANCE.createWiiLeftAnalogStickEvent();
		leftStickEvt.setX(data[0] & 0x3f);
		leftStickEvt.setY(data[1] & 0x3f);

		WiiRightAnalogStickEvent rightStickEvt = EzwiimoteFactory.eINSTANCE.createWiiRightAnalogStickEvent();
		rightStickEvt.setX(((data[0] & 0xc0) >> 3) ^ ((data[1] & 0xc0) >> 5) ^ ((data[2] & 0x80) >> 7));
		rightStickEvt.setY(data[2] & 0x1f);

		WiiLeftAnalogTriggerEvent leftTriggerEvt = EzwiimoteFactory.eINSTANCE.createWiiLeftAnalogTriggerEvent();
		leftTriggerEvt.setTrigger(((data[2] & 0x60) >> 2) ^ ((data[3] & 0xe0) >> 5));
		
		WiiRightAnalogTriggerEvent rightTriggerEvt = EzwiimoteFactory.eINSTANCE.createWiiRightAnalogTriggerEvent();
		rightTriggerEvt.setTrigger(data[3] & 0x1f);
		
		WiiMultiCmd multiCmd = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();

		multiCmd.add(leftStickEvt);
		multiCmd.add(rightStickEvt);
		multiCmd.add(leftTriggerEvt);
		multiCmd.add(rightTriggerEvt);
	
		return multiCmd;
	}

	protected WiiCoreButtonEvt fireButtonEvent(byte[] data) {
		// we invert the original data as the classic controller returns
		// button pressed as nil and thats not that useable.
		int modifiers = (((data[5] & 0xff) ^ 0xff) << 8) ^ ((data[4] & 0xff) ^ 0xff);

		WiiCoreButtonEvt evt = EzwiimoteFactory.eINSTANCE.createWiiCoreButtonEvt();
		
		evt.setBUTTON_A( (BUTTON_CODE.BUTTON_A_VALUE & modifiers) == BUTTON_CODE.BUTTON_A_VALUE ? 1 : 0);
		evt.setBUTTON_B( (BUTTON_CODE.BUTTON_B_VALUE & modifiers) == BUTTON_CODE.BUTTON_B_VALUE ? 1 : 0);
		evt.setBUTTON_HOME( (BUTTON_CODE.BUTTON_HOME_VALUE & modifiers) == BUTTON_CODE.BUTTON_HOME_VALUE ? 1 : 0);
		//evt.set( (BUTTON_CODE.BUTTON_LEFT_TRIGGER & modifiers) == BUTTON_CODE.BUTTON_LEFT_TRIGGER ? 1 : 0);
		evt.setBUTTON_A( (BUTTON_CODE.BUTTON_MINUS_VALUE & modifiers) == BUTTON_CODE.BUTTON_MINUS_VALUE ? 1 : 0);
		//evt.set( (BUTTON_CODE.BUTTON_RIGHT_TRIGGER & modifiers) == BUTTON_CODE.BUTTON_RIGHT_TRIGGER ? 1 : 0);
		evt.setBUTTON_PLUS( (BUTTON_CODE.BUTTON_PLUS_VALUE & modifiers) == BUTTON_CODE.BUTTON_PLUS_VALUE ? 1 : 0);
		//evt.set( (BUTTON_CODE.BUTTON_X & modifiers) == BUTTON_CODE.BUTTON_X ? 1 : 0);
		//evt.set( (BUTTON_CODE.BUTTON_Y & modifiers) == BUTTON_CODE.BUTTON_Y ? 1 : 0);
		//evt.set( (BUTTON_CODE.BUTTON_ZL & modifiers) == BUTTON_CODE.BUTTON_ZL ? 1 : 0);
		//evt.set( (BUTTON_CODE.BUTTON_ZR & modifiers) == BUTTON_CODE.BUTTON_ZR ? 1 : 0);
		evt.setD_PAD_DOWN( (BUTTON_CODE.DPAD_DOWN_VALUE & modifiers) == BUTTON_CODE.DPAD_DOWN_VALUE ? 1 : 0);
		evt.setD_PAD_LEFT( (BUTTON_CODE.DPAD_LEFT_VALUE & modifiers) == BUTTON_CODE.DPAD_LEFT_VALUE ? 1 : 0);
		evt.setD_PAD_RIGHT( (BUTTON_CODE.DPAD_RIGHT_VALUE & modifiers) == BUTTON_CODE.DPAD_RIGHT_VALUE ? 1 : 0);
		evt.setD_PAD_UP( (BUTTON_CODE.DPAD_UP_VALUE & modifiers) == BUTTON_CODE.DPAD_UP_VALUE ? 1 : 0);
		evt.setNO_BUTTON( modifiers == BUTTON_CODE.NO_BUTTON_VALUE ? 1 : 0);
	
		return evt;
	}

	public WiiCmd initialize() {
		return EXTENSION_REGISTERS_INIT;
	}
}
