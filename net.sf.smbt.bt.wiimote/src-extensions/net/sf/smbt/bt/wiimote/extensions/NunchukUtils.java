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

import java.awt.Point;

import net.sf.smbt.bt.wiimote.utils.BTWiimoteCmdUtils;
import net.sf.smbt.ezwiimote.EzwiimoteFactory;
import net.sf.smbt.ezwiimote.WiiAccelEvt;
import net.sf.smbt.ezwiimote.WiiAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.smbt.ezwiimote.WiiDataEvt;
import net.sf.smbt.ezwiimote.WiiMultiCmd;
import net.sf.smbt.ezwiimote.WiiNunchukButtonEvt;


/* 
 * extension reports contain WiiMotion Plus data as soon as 0x20 status is raised
 */
public class NunchukUtils {
	
	public final static NunchukUtils INSTANCE = new NunchukUtils();
	
	public static final int NO_BUTTON = 1;
	public static final int BUTTON_C = 0x02;
	public static final int BUTTON_Z = 0x01;


	private NunchukCalibrationData calibrationData;

	public void dataRead(WiiDataEvt evt) {
		if (calibrationData == null && evt.getError() == 0
				&& evt.getAddress()[0] == 0x00
				&& (evt.getAddress()[1] & 0xff) == 0x30
				&& evt.getPayload().length == 0x0f) {

			//log.debug("Calibration Data received.");

			byte[] payload = evt.getPayload();

			calibrationData = new NunchukCalibrationData();
			calibrationData.setZeroForceX(payload[0] & 0xff);
			calibrationData.setZeroForceY(payload[1] & 0xff);
			calibrationData.setZeroForceZ(payload[2] & 0xff);
			calibrationData.setGravityForceX(payload[4] & 0xff);
			calibrationData.setGravityForceY(payload[5] & 0xff);
			calibrationData.setGravityForceZ(payload[6] & 0xff);
			calibrationData.setMinimumAnalogPoint(new Point(payload[9] & 0xff,
					payload[12] & 0xff));
			calibrationData.setMaximumAnalogPoint(new Point(payload[8] & 0xff,
					payload[11] & 0xff));
			calibrationData.setCenterAnalogPoint(new Point(payload[10] & 0xff,
					payload[13] & 0xff));
		}
	}

	/**
	 * @param data
	 */
	protected WiiCmd fireAccelerometerEvent(byte[] data) {

		// remark: I am currently ignoring the LSB as I do with the LSB of the
		// calibration data.
		// if someone comes up with reliable data, we'll add it, i promise.
		int ax = ((data[2] & 0xff)); // << 2) ^ (data[5] & 0x0c);
		int ay = ((data[3] & 0xff)); // << 2) ^ (data[5] & 0x30);
		int az = ((data[4] & 0xff)); // << 2) ^ (data[5] & 0xc0);
		
		WiiAccelEvt evt = EzwiimoteFactory.eINSTANCE.createWiiAccelEvt();
		
		evt.setX(ax);
		evt.setY(ay);
		evt.setZ(az);

		return evt;
	}

	protected WiiCmd fireAnalogStickEvent(byte[] data) {

		int sx = data[0] & 0xff;
		int sy = data[1] & 0xff;

		WiiAnalogStickEvent evt = EzwiimoteFactory.eINSTANCE.createWiiAnalogStickEvent();
		evt.setX(sx & 0xff);
		evt.setY(sy & 0xff);
		
		return evt;
	}

	protected WiiCmd fireButtonEvent(byte[] data) {

		// we invert the original data as the wiimote returns
		// button pressed as nil and thats not that useable.
		int modifiers = (data[5] & 0x03) ^ 0x03;

		WiiNunchukButtonEvt evt = EzwiimoteFactory.eINSTANCE.createWiiNunchukButtonEvt();

		evt.setC_BUTTON( ( BUTTON_C & modifiers) == BUTTON_C ? 1 : 0);
		evt.setZ_BUTTON( ( BUTTON_Z & modifiers) == BUTTON_Z ? 1 : 0);
		evt.setNO_BUTTON( modifiers == NO_BUTTON ? 1 : 0);
		
		return evt;
	}

	public NunchukCalibrationData getCalibrationData() {
		return calibrationData;
	}

	public WiiCmd initialize() {
		// FIXME : LB to specifically handle nunchuk calibration data !!!!
		//mote.addDataListener(this);
		
		// initialize
		WiiCmd writeRegisterCmd = BTWiimoteCmdUtils.INSTANCE.createWiiWriteRegisterReqCmd(
			new byte[] { (byte) 0xa4, 0x00, 0x40}, 
			new byte[] { 0x00 }
		);
		
		// request calibration data
		WiiCmd readRegisterCmd = BTWiimoteCmdUtils.INSTANCE.createWiiReadRegisterReqCmd(
			new byte[] { (byte) 0xa4, 0x00, 0x30 }, 
			new byte[] { 0x00, 0x0f }
		);

		WiiMultiCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
		cmd.add(writeRegisterCmd);
		cmd.add(readRegisterCmd);
		
		return cmd;
	}
}
