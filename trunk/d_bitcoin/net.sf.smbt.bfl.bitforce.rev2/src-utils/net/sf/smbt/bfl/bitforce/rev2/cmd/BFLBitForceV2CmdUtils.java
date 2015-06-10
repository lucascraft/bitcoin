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
package net.sf.smbt.bfl.bitforce.rev2.cmd;

import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.BFLCmdKind;
import net.sf.smbt.bitforcev2.Bitforcev2Factory;
import net.sf.smbt.bitforcev2.ZCX;
import net.sf.smbt.bitforcev2.ZDX;
import net.sf.smbt.bitforcev2.ZDXFullRangeJob;
import net.sf.smbt.bitforcev2.ZFX;
import net.sf.smbt.bitforcev2.ZGX;
import net.sf.smbt.bitforcev2.ZJX;
import net.sf.smbt.bitforcev2.ZLX;
import net.sf.smbt.bitforcev2.ZMX;
import net.sf.smbt.bitforcev2.ZNX;
import net.sf.smbt.bitforcev2.ZOX;
import net.sf.smbt.bitforcev2.ZPX;
import net.sf.smbt.bitforcev2.ZPXCustomRangeJob;
import net.sf.smbt.bitforcev2.ZQX;
import net.sf.smbt.bitforcev2.ZTX;

public class BFLBitForceV2CmdUtils {

	public final char CR = 13; // /r
    public final char LF = 10; // /n

	
	public final static BFLBitForceV2CmdUtils INSTANCE = new BFLBitForceV2CmdUtils();
	
	/**
	 * Dump AT command
	 * 
	 * @param cmd {@link ATCmd} command
	 * 
	 * @return byte stream from an {@link ATCmd} intrinsic valuation
	 */
	public byte[] dumpBFLCmd(BFLCmd cmd) {
		if (cmd instanceof BFLCmd) {
			return dumpBFLCmdWithHints(cmd, -1);
		}
		return new byte[0];
	}
	
	/**
	 * Dump AT command
	 * 
	 * @param cmd {@link ATCmd} command
	 * @param hints some indications for the command dump
	 * 
	 * @return byte stream from an {@link ATCmd} intrinsic valuation
	 */
	private byte[] dumpBFLCmdWithHints(BFLCmd cmd, int hints) {
		byte[] data		= cmd.getKind().getLiteral().getBytes();
		byte[] empty 	= new byte[0];
		byte[] ret 		= new byte[data.length+2];
		
		System.arraycopy(data, 0, ret, 0, data.length);
		ret[data.length]		= CR;
		ret[data.length+1]		= LF;
		return data == null ? empty : ret;
	}
	
	public BFLCmd create(BFLCmdKind kind) {
		return create(kind.getLiteral());
	}
	public BFLCmd create(String id) {
		switch(BFLCmdKind.get(id)) {
			case ZCX:
				return createZCX();
			case ZDX:
				return createZDX();
			case ZDX_FULL_RANGE:
				return createZDXFullRangeJob();
			case ZPX_CUSTOM_RANGE:
				return createZPXCustomRangeJob();
			case ZFX:
				return createZFX();
			case ZGX:
				return createZGX();
			case ZJX:
				return createZJX();
			case ZLX:
				return createZLX();
			case ZMX:
				return createZMX();
			case ZNX:
				return createZNX();
			case ZOX:
				return createZOX();
			case ZPX:
				return createZPX();
			case ZQX:
				return createZQX();
			case ZTX:
				return createZTX();
			case KO:
			case OK:
			case NONE:
				break;
		}
		return null;
	}
	
	private ZDXFullRangeJob createZDXFullRangeJob() {
		ZDXFullRangeJob zdxFRJ = Bitforcev2Factory.eINSTANCE.createZDXFullRangeJob();
		zdxFRJ.setHeader((byte)'@');
		zdxFRJ.setAddr((byte)1);
		zdxFRJ.setData("ZCX".getBytes());
		zdxFRJ.setKind(BFLCmdKind.ZCX);
		zdxFRJ.setLength((byte)"ZCX".getBytes().length);
		return zdxFRJ;
		
	}
	
	private ZPXCustomRangeJob createZPXCustomRangeJob() {
		ZPXCustomRangeJob zpxCRJ = Bitforcev2Factory.eINSTANCE.createZPXCustomRangeJob();
		zpxCRJ.setHeader((byte)'@');
		zpxCRJ.setAddr((byte)1);
		zpxCRJ.setData("ZPX_CUSTOM_RANGE".getBytes());
		zpxCRJ.setKind(BFLCmdKind.ZPX_CUSTOM_RANGE);
		zpxCRJ.setLength((byte)"ZPX".getBytes().length);
		return zpxCRJ;
		
	}
	
	private ZCX createZCX() {
		ZCX zcx = Bitforcev2Factory.eINSTANCE.createZCX();
		zcx.setHeader((byte)'@');
		zcx.setAddr((byte)1);
		zcx.setData("ZCX".getBytes());
		zcx.setKind(BFLCmdKind.ZCX);
		zcx.setLength((byte)"ZCX".getBytes().length);
		return zcx;
	}
	
	private ZDX createZDX() {
		return Bitforcev2Factory.eINSTANCE.createZDX();
	}
	
	private ZFX createZFX() {
		ZFX zfx = Bitforcev2Factory.eINSTANCE.createZFX();
		zfx.setHeader((byte)'@');
		zfx.setAddr((byte)1);
		zfx.setData("ZFX".getBytes());
		zfx.setKind(BFLCmdKind.ZFX);
		zfx.setLength((byte)"ZFX".getBytes().length);
		return zfx;
	}
	
	private ZGX createZGX() {
		return Bitforcev2Factory.eINSTANCE.createZGX();
	}
	
	private ZJX createZJX() {
		return Bitforcev2Factory.eINSTANCE.createZJX();
	}
	
	private ZLX createZLX() {
		ZLX zlx = Bitforcev2Factory.eINSTANCE.createZLX();
		zlx.setHeader((byte)'@');
		zlx.setAddr((byte)1);
		zlx.setData("ZLX".getBytes());
		zlx.setKind(BFLCmdKind.ZLX);
		zlx.setLength((byte)"ZLX".getBytes().length);
		return zlx;
	}
	
	private ZMX createZMX() {
		return Bitforcev2Factory.eINSTANCE.createZMX();
	}
	
	private ZNX createZNX() {
		return Bitforcev2Factory.eINSTANCE.createZNX();
	}
	
	private ZOX createZOX() {
		return Bitforcev2Factory.eINSTANCE.createZOX();
	}
	
	private ZPX createZPX() {
		return Bitforcev2Factory.eINSTANCE.createZPX();
	}
	
	private ZQX createZQX() {
		return Bitforcev2Factory.eINSTANCE.createZQX();
	}
	
	private ZTX createZTX() {
		ZTX ztx = Bitforcev2Factory.eINSTANCE.createZTX();
		ztx.setHeader((byte)'@');
		ztx.setAddr((byte)1);
		ztx.setData("ZTX".getBytes());
		ztx.setKind(BFLCmdKind.ZTX);
		ztx.setLength((byte)"ZTX".getBytes().length);
		return ztx;
	}
	
	
	
	//
	//
	//
	
	
	public BFLCmd handleBFLCmd(byte[] data) {
		if (data != null && data.length > 2) {
			int payloadSize = (int) data[2];
			byte[] payload = new byte[payloadSize];
			if (payload != null) {
				System.arraycopy(data, 3, payload, 0, payloadSize);
				if (payload.length > 2) {
					byte[] tag = new byte[3];
					System.arraycopy(payload, 0, tag, 0, 3);
					String cmdTag = new String(tag);
					BFLCmdKind kind = BFLCmdKind.get(cmdTag);
					if (kind != null) {
						BFLCmd cmd = handleBFLCmdFromKind(kind, payload);
						cmd.setHeader(data[0]);
						cmd.setAddr(data[1]);
						return cmd;
					}
				}
			}
		}
		return null;
	}
	
	private BFLCmd handleBFLCmdFromKind(BFLCmdKind kind, byte[] payload) {
		
		BFLCmd cmd = create(kind.getName());
		
		switch (kind) {
			case ZCX:
				break;
			case ZDX:
				break;
			case ZFX:
				break;
			case ZGX:
				break;
			case ZJX:
				break;
			case ZLX:
				break;
			case ZMX:
				break;
			case ZNX:
				break;
			case ZOX:
				break;
			case ZPX:
				break;
			case ZQX:
				break;
			case ZTX:
				break;
			default:
				break;
		}
		
		return cmd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
