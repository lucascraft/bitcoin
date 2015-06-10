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

package net.sf.smbt.bt.wiimote.utils;


import net.sf.smbt.bt.wiimote.services.WiiExtension;
import net.sf.smbt.bt.wiimote.services.WiiExtensionManager;
import net.sf.smbt.ezwiimote.EzwiimoteFactory;
import net.sf.smbt.ezwiimote.WiiAccelEvt;
import net.sf.smbt.ezwiimote.WiiCalibrationDataReport;
import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.smbt.ezwiimote.WiiConnectedEvt;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;
import net.sf.smbt.ezwiimote.WiiDataEvt;
import net.sf.smbt.ezwiimote.WiiMultiCmd;
import net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd;
import net.sf.smbt.ezwiimote.WiiRawByteReqCmd;
import net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd;
import net.sf.smbt.ezwiimote.WiiReadRegisterReqCmd;
import net.sf.smbt.ezwiimote.WiiReportModeReqCmd;
import net.sf.smbt.ezwiimote.WiiReqCmd;
import net.sf.smbt.ezwiimote.WiiRumbleReqCmd;
import net.sf.smbt.ezwiimote.WiiStatusInfoReport;
import net.sf.smbt.ezwiimote.WiiStatusInfoReqCmd;
import net.sf.smbt.ezwiimote.WiiWriteRegisterReq;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.core.runtime.Platform;

public class BTWiimoteCmdUtils {

	private IrPoint[] interleavedIrCameraData;
	private int[] interleavedAccelerometerData;
	private WiiCalibrationDataReport calibrationDataReport;
	private WiiExtension currentExtension;

	public final static BTWiimoteCmdUtils INSTANCE = new BTWiimoteCmdUtils();
	
	public final static  WiiCmd ALL_LED_OFF	= INSTANCE.createWiiPlayerLEDReqCmd(
		new boolean[] {false, false, false, false}
	);
	public final static  WiiCmd ALL_LED_ON	= INSTANCE.createWiiPlayerLEDReqCmd(
		new boolean[] {true, true, true, true}
	);
	
	private BTWiimoteCmdUtils() {}

	/**
	 * Basically an Ubqt Wiimote orient {@link WiiCmd} command and
	 * dumps it as a compliant Wiimote command frame to
	 * BT L2CAP comm
	 * 
	 * @param cmd WiiCmd command as per Ubqt architecture/specs
	 * 
	 * @return a wiimote data control byte[] stream, null otherwise
	 */
	public synchronized byte[] dumpWimmoteCmd(WiiCmd cmd) {
		if (cmd instanceof WiiReqCmd) {
			return ((WiiReqCmd)cmd).getBytes();
		}
		return new byte[0];
	}
	
	/**
	 * Basically gets what comes from the Wiimote BT L2CAP comm
	 * and process the RAW chunk 
	 * 
	 * @param frame RAW wiimote comm as byte[] frame
	 * 
	 * @return a decoded {@link WiiCmd}, null otherwise
	 */
	public synchronized Cmd decodeWimmoteFrame(byte[] frame) {
		return processFrame(frame);
	}
	
	
	//
	//
	//
	
	public WiiReqCmd createWiiRawByteReqCmd(byte[] info) {
		WiiRawByteReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiRawByteReqCmd();
		cmd.setBytes(info);
		return cmd;
	}
	
	public WiiReqCmd createWiiStatusInfoReqCmd() {
		WiiStatusInfoReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiStatusInfoReqCmd();
		cmd.setBytes(new byte[] { 0x52, 0x15, 0x00 });
		return cmd;
	}
	
	public WiiReqCmd createWiiReportModeReqCmd(byte mode, boolean continuous) {
		WiiReportModeReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiReportModeReqCmd();
		
		if (mode < 0x30 || (mode > 0x37 && mode < 0x3d) || mode > 0x3f) {
			throw new IllegalArgumentException("Undefined data report mode");
		}
		cmd.setMode(mode);
		cmd.setContinuous(continuous);
		cmd.setBytes(new byte[] { 82, 18, continuous ? (byte) 4 : (byte) 0, mode });
		
		return cmd;
	}
	
	public WiiReqCmd createWiiPlayerLEDReqCmd(boolean[] leds) {
		WiiPlayerLEDReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiPlayerLEDReqCmd();
		int ledByte = 0;
		for (int i = 0; i < 4; i++) {
			if (leds[i]) {
				ledByte = ledByte ^ 1 << (4 + i);
			}
		}
		cmd.setLedByte((byte)ledByte);
		cmd.setBytes(new byte[] { 82, 17, (byte) ledByte });
		return cmd;
	}
	
	public WiiReqCmd createWiiReadMemoryReqCmd(byte[] offset, byte[] size) {
		WiiReadMemoryReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiReadMemoryReqCmd();
		
		byte[] data = new byte[8];
			
		data[0] = 0x52;
		data[1] = 0x17;
			
		// eeprom memory address space
		data[2] = 0x00;
			
		System.arraycopy(offset, 0, data, 3, 3);
//		for (int i = 0; i < 3; i++) {
//			data[3 + i] = offset[i];
//		}
			
		System.arraycopy(size, 0, data, 6, 2);
//		for (int i = 0; i < 2; i++) {
//			data[6 + i] = size[i];
//		}
			
		cmd.setBytes(data);
		
		return cmd;
	}
	
	public WiiReqCmd createWiiReadRegisterReqCmd(byte[] offset, byte[] size) {
		WiiReadRegisterReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiReadRegisterReqCmd();
		
		byte[] data = new byte[8];
		
		// HID command
		data[0] = 0x52;
		
		// Output report 0x17
		data[1] = 0x17;
		
		// select control register address space
		data[2] = 0x04;
		
		// offset
		System.arraycopy(offset, 0, data, 3, 3);
		
		// size
		System.arraycopy(size, 0, data, 6, 2);
			
		cmd.setBytes(data);
		
		return cmd;
	}
	
	public WiiReqCmd createWiiCalibrationReqCmd() {
		return createWiiReadMemoryReqCmd(
			new byte[] { 0x00, 0x00, 0x20 }, 
			new byte[] { 0x00, 0x0a }
		);
	}
	
	public WiiReqCmd createWiiWriteRegisterReqCmd(byte[] offset, byte[] payload) {
		WiiWriteRegisterReq cmd = EzwiimoteFactory.eINSTANCE.createWiiWriteRegisterReq();
		
		// write commands must be padded to 16 data bytes, thus this length
		byte[] data = new byte[23];
			
		// HID command
		data[0] = 0x52;
			
		// output report 0x16
		data[1] = 0x16;
			
		// select control register address space
		data[2] = 0x04;
			
		// set offset
		System.arraycopy(offset, 0, data, 3, 3);
//		for (int i = 0; i < 3; i++) {
//			data[3 + i] = offset[i];
//		}
			
		// size information
		data[6] = (byte) payload.length;
		
		// our payload
		System.arraycopy(payload, 0, data, 7, payload.length);
//		for (int i = 0; i < payload.length; i++) {
//			data[7 + i] = payload[i];
//		}

		cmd.setBytes(data);
		
		return cmd;
	}
	
	public WiiReqCmd createWiiRumbleReqCmd(long millis, byte ledByte) {
		WiiRumbleReqCmd cmd = EzwiimoteFactory.eINSTANCE.createWiiRumbleReqCmd();
		
		cmd.setMillis(millis);
		cmd.setLedByte(ledByte);
		cmd.setBytes(new byte[] { 82, 17, (byte) (ledByte ^ 1) });
		
		return cmd;
	}
	
	
	protected WiiAccelEvt parseAccelerometerData(byte[] bytes) {
		WiiAccelEvt accelEvt = EzwiimoteFactory.eINSTANCE.createWiiAccelEvt();
		accelEvt.setX(bytes[4] & 0xff);
		accelEvt.setY(bytes[5] & 0xff);
		accelEvt.setZ(bytes[6] & 0xff);
		return accelEvt;
	}

	/*
	protected void parseBasicIrCameraData(byte[] bytes, int offset) {
		int x0 = bytes[offset] & 0xff ^ (bytes[offset + 2] & 0x30) << 4;
		int y0 = bytes[offset + 1] & 0xff ^ (bytes[offset + 2] & 0xc0) << 2;
		IrPoint p0 = new IrPoint(x0, y0);

		int x1 = bytes[offset + 3] & 0xff ^ (bytes[offset + 2] & 0x03) << 8;
		int y1 = bytes[offset + 4] & 0xff ^ (bytes[offset + 2] & 0x0c) << 6;
		IrPoint p1 = new IrPoint(x1, y1);

		int x2 = bytes[offset + 5] & 0xff ^ (bytes[offset + 7] & 0x30) << 4;
		int y2 = bytes[offset + 6] & 0xff ^ (bytes[offset + 7] & 0xc0) << 2;
		IrPoint p2 = new IrPoint(x2, y2);

		int x3 = bytes[offset + 8] & 0xff ^ (bytes[offset + 7] & 0x03) << 8;
		int y3 = bytes[offset + 9] & 0xff ^ (bytes[offset + 7] & 0x0c) << 6;
		IrPoint p3 = new IrPoint(x3, y3);
		
//		source.fireIrCameraEvent(IrCameraMode.BASIC, p0, p1, p2, p3);
	}
	*/

	protected WiiCoreButtonEvt parseCoreButtonData(byte[] bytes) {
		int modifiers = bytes[2] & 0xff ^ (bytes[3] & 0xff) << 8;
		
		WiiCoreButtonEvt coreButtonEvt = EzwiimoteFactory.eINSTANCE.createWiiCoreButtonEvt();
		coreButtonEvt.setModifiers(modifiers);

		return coreButtonEvt;
	}

	/*
	protected void parseExtendedIrCameraData(byte[] bytes, int offset) {
		int x0 = bytes[7] & 0xff ^ (bytes[9] & 0x30) << 4;
		int y0 = bytes[8] & 0xff ^ (bytes[9] & 0xc0) << 2;
		int size0 = bytes[9] & 0x0f;
		IrPoint p0 = new IrPoint(x0, y0, size0);

		int x1 = bytes[10] & 0xff ^ (bytes[12] & 0x30) << 4;
		int y1 = bytes[11] & 0xff ^ (bytes[12] & 0xc0) << 2;
		int size1 = bytes[12] & 0x0f;
		IrPoint p1 = new IrPoint(x1, y1, size1);

		int x2 = bytes[13] & 0xff ^ (bytes[15] & 0x30) << 4;
		int y2 = bytes[14] & 0xff ^ (bytes[15] & 0xc0) << 2;
		int size2 = bytes[15] & 0x0f;
		IrPoint p2 = new IrPoint(x2, y2, size2);

		int x3 = bytes[16] & 0xff ^ (bytes[18] & 0x30) << 4;
		int y3 = bytes[17] & 0xff ^ (bytes[18] & 0xc0) << 2;
		int size3 = bytes[18] & 0x0f;
		IrPoint p3 = new IrPoint(x3, y3, size3);

//		source.fireIrCameraEvent(IrCameraMode.EXTENDED, p0, p1, p2, p3);
	}
	*/
	
	protected WiiCmd parseExtensionData(byte[] bytes, int offset, int length) {
		byte[] extensionData = new byte[length];
		System.arraycopy(bytes, offset, extensionData, 0, length);
		currentExtension = WiiExtensionManager.INSTANCE.getExtension(extensionData);
		if (currentExtension != null) {
			WiiCmd initCmd = currentExtension.initialize();
			WiiCmd dataCmd = currentExtension.computeDataEvent(extensionData);
			
			WiiMultiCmd multi = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
			multi.add(initCmd);
			multi.add(dataCmd);
			return multi;
		}
		return null;
	}
	/*
	protected void parseFullIrCameraData(byte[] bytes, int reportMode) {
		if (interleavedIrCameraData == null) {
			interleavedIrCameraData = new IrPoint[4];
		}
		if (reportMode == Byte.decode("0x30").intValue()) {
			int x0 = (bytes[5] & 0xff) ^ ((bytes[7] & 0x30) << 4);
			int y0 = (bytes[6] & 0xff) ^ ((bytes[7] & 0xc0) << 2);
			int size0 = bytes[7] & 0x0f;
			int xmin0 = bytes[8] & 0x7f;
			int ymin0 = bytes[9] & 0x7f;
			int xmax0 = bytes[10] & 0x7f;
			int ymax0 = bytes[11] & 0x7f;
			int intensity0 = bytes[13] & 0xff;
			interleavedIrCameraData[0] = new IrPoint(x0, y0, size0, xmin0, ymin0, xmax0, ymax0, intensity0);
		
			int x1 = (bytes[14] & 0xff) ^ ((bytes[16] & 0x30) << 4);
			int y1 = (bytes[15] & 0xff) ^ ((bytes[16] & 0xc0) << 2);
			int size1 = bytes[16] & 0x0f;
			int xmin1 = bytes[17] & 0x7f;
			int ymin1 = bytes[18] & 0x7f;
			int xmax1 = bytes[19] & 0x7f;
			int ymax1 = bytes[20] & 0x7f;
			int intensity1 = bytes[22] & 0xff;
			interleavedIrCameraData[1] = new IrPoint(x1, y1, size1, xmin1, ymin1, xmax1, ymax1, intensity1);
		}
		
		if (reportMode == Byte.decode("0x3f").intValue()) {
			int x2 = (bytes[5] & 0xff) ^ ((bytes[7] & 0x30) << 4);
			int y2 = (bytes[6] & 0xff) ^ ((bytes[7] & 0xc0) << 2);
			int size2 = bytes[7] & 0x0f;
			int xmin2 = bytes[8] & 0x7f;
			int ymin2 = bytes[9] & 0x7f;
			int xmax2 = bytes[10] & 0x7f;
			int ymax2 = bytes[11] & 0x7f;
			int intensity2 = bytes[13] & 0xff;
			interleavedIrCameraData[2] = new IrPoint(x2, y2, size2, xmin2, ymin2, xmax2, ymax2, intensity2);
			
			int x3 = (bytes[14] & 0xff) ^ ((bytes[16] & 0x30) << 4);
			int y3 = (bytes[15] & 0xff) ^ ((bytes[16] & 0xc0) << 2);
			int size3 = bytes[16] & 0x0f;
			int xmin3 = bytes[17] & 0x7f;
			int ymin3 = bytes[18] & 0x7f;
			int xmax3 = bytes[19] & 0x7f;
			int ymax3 = bytes[20] & 0x7f;
			int intensity3 = bytes[22] & 0xff;
			interleavedIrCameraData[3] = new IrPoint(x3, y3, size3, xmin3, ymin3, xmax3, ymax3, intensity3);
		}
		
		if (interleavedIrCameraData[0] != null &&
				interleavedIrCameraData[2] != null) {
			IrPoint p0 = interleavedIrCameraData[0];
			IrPoint p1 = interleavedIrCameraData[1];
			IrPoint p2 = interleavedIrCameraData[2];
			IrPoint p3 = interleavedIrCameraData[3];
			interleavedIrCameraData = null;
			// FIXME : LB to fix it
			//source.fireIrCameraEvent(IrCameraMode.FULL, p0, p1, p2, p3);
		}
	}
	*/
	

	protected WiiAccelEvt parseInterleavedAccelerometerData(byte[] bytes, int reportMode) {
		int x = 0;
		int y = 0;
		int z = 0;
		
		if (reportMode == Byte.decode("0x3e").intValue()) {
			x = bytes[4] & 0xff;
			z = ((bytes[3] & 0x60) << 1) ^ ((bytes[2] & 0x60) >> 1);
		}
		
		if (reportMode == Byte.decode("0x3f").intValue()) {
			y = bytes[4] & 0xff;
			z = ((bytes[3] & 0x60) >> 3) ^ ((bytes[2] & 0x60) >> 5);
		}
		
		if (interleavedAccelerometerData == null) {
			interleavedAccelerometerData = new int[3];
			interleavedAccelerometerData[0] ^= x;
			interleavedAccelerometerData[1] ^= y;
			interleavedAccelerometerData[2] ^= z;
		} else {
			x ^= interleavedAccelerometerData[0];
			y ^= interleavedAccelerometerData[1];
			z ^= interleavedAccelerometerData[2];
			interleavedAccelerometerData = null;
			// FIXME : LB to fix it
			//fireAccelerometerEvent(x, y, z);
		}
		
		WiiAccelEvt evt = EzwiimoteFactory.eINSTANCE.createWiiAccelEvt();
		
		evt.setX(x);
		evt.setY(y);
		evt.setZ(z);
		
		return evt;
	}

	protected WiiCmd parseMemoryData(byte[] bytes) {
		int size = ((bytes[4] >> 4) & 0x0f) + 1;
		int error = bytes[4] & 0x0f;
		byte[] address = new byte[] { bytes[5], bytes[6] };
		byte[] payload = new byte[size];

		System.arraycopy(bytes, 7, payload, 0, size);

		WiiDataEvt dataEvt = EzwiimoteFactory.eINSTANCE.createWiiDataEvt();
		dataEvt.setAddress(address);
		dataEvt.setPayload(payload);
		dataEvt.setError(error);
		
		WiiCmd readEvt = fireReadDataEvent(address, payload, error);
		
		WiiMultiCmd multi = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
		multi.add(dataEvt);
		if (readEvt != null) {
			multi.add(readEvt);
		}
		return multi;
	}

	protected WiiStatusInfoReport parseStatusInformation(byte[] bytes) {
		boolean[] leds = new boolean[] { 
			(bytes[4] & 0x10) == 0x10,
			(bytes[4] & 0x20) == 0x20,
			(bytes[4] & 0x40) == 0x40,
			(bytes[4] & 0x80) == 0x80 
		};
		boolean extensionControllerConnected	= (bytes[4] & 0x02) == 0x02;
		boolean speakerEnabled					= (bytes[4] & 0x04) == 0x04;
		boolean continuousReportingEnabled		= (bytes[4] & 0x08) == 0x08;
		byte batteryLevel						= bytes[7];
		
		WiiStatusInfoReport info = EzwiimoteFactory.eINSTANCE.createWiiStatusInfoReport();
		//info.ge leds;
		// FIXME : LB to fix it
		info.setSpeakerEnabled(speakerEnabled);
		info.setContinuousReportingEnabled(continuousReportingEnabled);
		info.setExtensionControllerConnected(extensionControllerConnected);
		info.setBatteryLevel(batteryLevel);
		
		return info;
	}

	private WiiCmd processFrame(byte[] buf) {
		WiiCmd cmd = null;
		if (Platform.inDebugMode()) {
			StringBuffer sb = new StringBuffer();
			System.out.println("received:");
			for (int i = 0; i < 23; i++) {
				String hex = Integer.toHexString(buf[i] & 0xff);
				sb.append(hex.length() == 1 ? "0x0" : "0x").append(hex).append(" ");
				if ((i + 1) % 8 == 0) {
					System.out.println(sb.toString());
					sb.delete(0, sb.length());
				}
			}
			if (sb.length() > 0) {
				System.out.println(sb.toString());
			}
		}
				
		switch (buf[1]) {
			case 0x20:
				return parseStatusInformation(buf);
	
			case 0x21:
			//case 0x22:
				WiiMultiCmd wmcmd0x21 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x21.getChildren().add(parseCoreButtonData(buf));
				wmcmd0x21.getChildren().add(parseMemoryData(buf));
				return wmcmd0x21;
	
			case 0x30:
				return parseCoreButtonData(buf);
	
			case 0x31:
				WiiMultiCmd wmcmd0x31 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x31.getChildren().add(parseCoreButtonData(buf));
				wmcmd0x31.getChildren().add(parseAccelerometerData(buf));
				return wmcmd0x31;
	
			case 0x32:
				// FIXME : LB to put the Nunchuk/MotionPlus/GuitarHero/Pad magics here
				WiiMultiCmd wmcmd0x32 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x32.add(parseCoreButtonData(buf));
				//WiiCmd wmcmd0x32_2 = parseExtensionData(buf, 4, 8);
				WiiCmd wmcmd0x32_2 = parseExtensionData(buf, 10, 8);
				if (wmcmd0x32_2 != null) {
					wmcmd0x32.add(wmcmd0x32_2);
				}
				return wmcmd0x32;
				
			case 0x33:
				WiiMultiCmd wmcmd0x33 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x33.getChildren().add(parseCoreButtonData(buf));
				wmcmd0x33.getChildren().add(parseAccelerometerData(buf));
				return wmcmd0x33;
				//parseExtendedIrCameraData(buf, 7); //Who cares ??
				//break;
	
			case 0x34:
				// FIXME : LB to put the Nunchuk/MotionPlus/GuitarHero/Pad magics here
				WiiMultiCmd wmcmd0x34 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x34.getChildren().add(parseCoreButtonData(buf));
				WiiCmd wmcmd0x34_2 = parseExtensionData(buf, 4, 19);
				if (wmcmd0x34_2 != null) {
					wmcmd0x34.getChildren().add(wmcmd0x34_2);
				}				
				return wmcmd0x34;
	
			case 0x35:
				// FIXME : LB to put the Nunchuk/MotionPlus/GuitarHero/Pad magics here
				WiiMultiCmd wmcmd0x35 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x35.getChildren().add(parseCoreButtonData(buf));
				WiiCmd wmcmd0x35_2 = parseExtensionData(buf, 7, 16);
				if (wmcmd0x35_2 != null) {
					wmcmd0x35.getChildren().add(wmcmd0x35_2);
				}				
				wmcmd0x35.getChildren().add(parseAccelerometerData(buf));
				return wmcmd0x35;

			case 0x36:
				// FIXME : LB to put the Nunchuk/MotionPlus/GuitarHero/Pad magics here
				WiiMultiCmd wmcmd0x36 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x36.getChildren().add(parseCoreButtonData(buf));
				//parseBasicIrCameraData(buf, 4);
				WiiCmd wmcmd0x36_2 = parseExtensionData(buf, 14, 9);
				if (wmcmd0x36_2 != null) {
					wmcmd0x36.getChildren().add(wmcmd0x36_2);
				}				
				return wmcmd0x36;
	
			case 0x37:
				WiiMultiCmd wmcmd0x37 = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x37.getChildren().add(parseCoreButtonData(buf));
				wmcmd0x37.getChildren().add(parseAccelerometerData(buf));
				//wmcmd.getChildren().add(parseBasicIrCameraData(buf, 7));
				WiiCmd wmcmd0x37_2 = parseExtensionData(buf, 17, 6);
				if (wmcmd0x37_2 != null) {
					wmcmd0x37.getChildren().add(wmcmd0x37_2);
				}				
				return wmcmd0x37;
				
			case 0x3d:
				// FIXME : LB to put the Nunchuk/MotionPlus/GuitarHero/Pad magics here
				return parseExtensionData(buf, 2, 21);
	
			case 0x3e:
				WiiMultiCmd wmcmd0x3e = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x3e.getChildren().add(parseCoreButtonData(buf));
				wmcmd0x3e.getChildren().add(parseInterleavedAccelerometerData(buf, (byte) 0x3e));
				//parseFullIrCameraData(buf, Byte.decode("0x3e").intValue());
				return wmcmd0x3e;
	
			case 0x3f:
				WiiMultiCmd wmcmd0x3f = EzwiimoteFactory.eINSTANCE.createWiiMultiCmd();
				wmcmd0x3f.getChildren().add(parseCoreButtonData(buf));
				wmcmd0x3f.getChildren().add(parseInterleavedAccelerometerData(buf, (byte) 0x3f));
				//parseFullIrCameraData(buf, Byte.decode("0x3f").intValue());
				return wmcmd0x3f;
	
			default:
				if (Platform.inDebugMode()) {
					String hex = Integer.toHexString(buf[1] & 0xff);
					System.out.println("Unknown or not yet implemented data report: " + (hex.length() == 1 ? "0x0" + hex : "0x" + hex));
				}
		}
		
		return cmd;
		//source.fireMoteDisconnectedEvent();
	}

	protected WiiCmd fireReadDataEvent(byte[] address, byte[] payload, int error) {
		if (calibrationDataReport == null && error == 0 && address[0] == 0x00 && address[1] == 0x20) {
			// calibration data (most probably)
			if (Platform.inDebugMode()) {
				System.out.println("Received Calibration Data Report.");
			}
			
			WiiCalibrationDataReport report = EzwiimoteFactory.eINSTANCE.createWiiCalibrationDataReport();
			report.setZeroX(payload[0] & 0xff);
			report.setZeroY(payload[1] & 0xff);
			report.setZeroZ(payload[2] & 0xff);
			report.setGravityX(payload[4] & 0xff);
			report.setGravityY(payload[5] & 0xff);
			report.setGravityZ(payload[6] & 0xff);
			calibrationDataReport = report;
		}
		
		if (currentExtension == null && error == 0 && address[0] == 0x00 && (address[1] & 0xff) == 0xfe && payload.length == 2) {
			// extension ID (most probably)
			if (Platform.inDebugMode()) {
				String id0 = Integer.toHexString(payload[0] & 0xff);
				String id1 = Integer.toHexString(payload[1] & 0xff);
				System.out.println(
					"Received Extension ID: " + (id0.length() == 1 ? "0x0" + id0 : "0x" + id0) + " " + (id1.length() == 1 ? "0x0" + id1 : "0x" + id1)
				);
			}
			
			if ((payload[0] & 0xff) == 0xff && (payload[1] & 0xff) == 0xff) {
				System.out.println(
					"Connection not completed, re-requesting extension id."
				);
				return createWiiReadRegisterReqCmd(new byte[] { (byte) 0xa4, 0x00, (byte) 0xfe }, new byte[] { 0x00, 0x02 });
			} else {
			
				currentExtension = WiiExtensionManager.INSTANCE.getExtension(payload);
				
				if (Platform.inDebugMode()) {
					System.out.println("Found extension: " + currentExtension == null ? "null" : currentExtension.toString());
				}
				
				if (currentExtension != null) {
					// currentExtension.setMote(this);
					// currentExtension.initialize();
					// incoming.setExtension(currentExtension);
					
					WiiConnectedEvt connectedEvt = EzwiimoteFactory.eINSTANCE.createWiiConnectedEvt(); 
					connectedEvt.setExtension(currentExtension);
					
					return connectedEvt;
				}
			}
		}
		return null;
	}

	/*
	protected void fireStatusInformationChangedEvent(StatusInformationReport report) {

		// decide if we should query the extension port
		boolean extensionChanged;
		if (statusInformationReport == null) {
			extensionChanged = report.isExtensionControllerConnected();
		} else {
			extensionChanged = statusInformationReport.isExtensionControllerConnected() != report.isExtensionControllerConnected();
		}
		
		statusInformationReport = report;
		StatusInformationListener[] listeners = listenerList.getListeners(StatusInformationListener.class);
		for (StatusInformationListener l : listeners) {
			l.statusInformationReceived(report);
		}
		
		if (extensionChanged) {
			if (!report.isExtensionControllerConnected()) {
				currentExtension = null;
				fireExtensionDisconnectedEvent();
			} else {
				// 1. initialize peripheral (writing zero to 0xa40040) 
				outgoing.sendRequest(new WriteRegisterRequest(new byte[] { (byte) 0xa4, 0x00, 0x40 }, new byte[] { 0x00 }));
				
				// 2. read extension ID bytes from wii register (0xa400fe)
				outgoing.sendRequest(new ReadRegisterRequest(new byte[] { (byte) 0xa4, 0x00, (byte) 0xfe }, new byte[] { 0x00, 0x02 }));
			}
		}
	}
	*/
}
