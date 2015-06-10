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

package net.sf.smbt.btc.pools.protocol.getwork;

import java.util.Formatter;
import java.util.concurrent.LinkedBlockingDeque;

import net.sf.smbt.btc.pools.getwork.GetworkCmd;
import net.sf.smbt.btc.pools.getwork.GetworkFactory;
import net.sf.smbt.btc.pools.utils.getwork.miner.WorkState;
import net.sf.xqz.model.engine.CmdPipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class GetWorkProtocolUtils {
	
	public final static GetWorkProtocolUtils INSTANCE = new GetWorkProtocolUtils();
	
	public GetworkCmd buildGetworkCall() {
		String getworkCall = "{\"method\":\"getwork\",\"params\":[],\"id\":\"json\"}";
		return buildGetworkCmd(getworkCall);
	}
	
	public GetworkCmd buildGetworkCmd(String jsonSnd) {
		GetworkCmd cmd = GetworkFactory.eINSTANCE.createGetworkCmd();
		cmd.setJsonSnd(jsonSnd);
		return cmd;
	}
	
	public byte[] dump(GetworkCmd cmd) {
		if (cmd.getJsonSnd() != null) {
			return cmd.getJsonSnd().getBytes();
		}
		return new byte[0];
	}
	
	
	public String format(int[] data) {
		StringBuilder dataOutput = new StringBuilder(8 * 32 + 1);
		Formatter dataFormatter = new Formatter(dataOutput);

		dataFormatter.format(
			"%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x" +
			"%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x%08x",
			Integer.reverseBytes(data[0]), Integer.reverseBytes(data[1]),
			Integer.reverseBytes(data[2]), Integer.reverseBytes(data[3]),
			Integer.reverseBytes(data[4]), Integer.reverseBytes(data[5]),
			Integer.reverseBytes(data[6]), Integer.reverseBytes(data[7]),
			Integer.reverseBytes(data[8]), Integer.reverseBytes(data[9]),
			Integer.reverseBytes(data[10]), Integer.reverseBytes(data[11]),
			Integer.reverseBytes(data[12]), Integer.reverseBytes(data[13]),
			Integer.reverseBytes(data[14]), Integer.reverseBytes(data[15]),
			Integer.reverseBytes(data[16]), Integer.reverseBytes(data[17]),
			Integer.reverseBytes(data[18]), Integer.reverseBytes(data[19]),
			Integer.reverseBytes(data[20]), Integer.reverseBytes(data[21]),
			Integer.reverseBytes(data[22]), Integer.reverseBytes(data[23]),
			Integer.reverseBytes(data[24]), Integer.reverseBytes(data[25]),
			Integer.reverseBytes(data[26]), Integer.reverseBytes(data[27]),
			Integer.reverseBytes(data[28]), Integer.reverseBytes(data[29]),
			Integer.reverseBytes(data[30]), Integer.reverseBytes(data[31]));

		String output = dataOutput.toString();
		
		dataFormatter.close();
		
		return output;
	}
	LinkedBlockingDeque<WorkState> incomingQueue = new LinkedBlockingDeque<WorkState>();

	public WorkState computeWorkState(JsonElement responseMessage) {
		if (responseMessage instanceof JsonObject) {
			JsonObject responseObj = (JsonObject) ((JsonObject) responseMessage).get("result");
			
			String datas		= responseObj.get("data").getAsString();
			String midstates	= responseObj.get("midstate").getAsString();
			String targets		= responseObj.get("target").getAsString();
			
			WorkState ws = new WorkState();
			
			processWorkState(ws, datas, midstates, targets);
				
			return ws;
		}
		return null;
	}
	
	public void processWorkState(WorkState workState, String datas, String midstates, String targets) {
		String parse;

		for(int i = 0; i < 32; i++) {
			parse = datas.substring(i * 8, (i * 8) + 8);
			workState.setData(i, Integer.reverseBytes((int) Long.parseLong(parse, 16)));
		}
		for(int i = 0; i < 8; i++) {
			parse = midstates.substring(i * 8, (i * 8) + 8);
			workState.setMidstate(i, Integer.reverseBytes((int) Long.parseLong(parse, 16)));
		}
		for(int i = 0; i < 8; i++) {
			parse = targets.substring(i * 8, (i * 8) + 8);
			workState.setTarget(i, (Long.reverseBytes(Long.parseLong(parse, 16) << 16)) >>> 16);
		}
	}

	public static int rot(int x, int y) {
		return (x >>> y) | (x << (32 - y));
	}

	public static void sharound(int out[], int na, int nb, int nc, int nd, int ne, int nf, int ng, int nh, int x, int K) {
		int a = out[na];
		int b = out[nb];
		int c = out[nc];
		int d = out[nd];
		int e = out[ne];
		int f = out[nf];
		int g = out[ng];
		int h = out[nh];

		int t1 = h + (rot(e, 6) ^ rot(e, 11) ^ rot(e, 25)) + ((e & f) ^ ((~e) & g)) + K + x;
		int t2 = (rot(a, 2) ^ rot(a, 13) ^ rot(a, 22)) + ((a & b) ^ (a & c) ^ (b & c));

		out[nd] = d + t1;
		out[nh] = t1 + t2;
	}

	
	
	public void handleWorkState(CmdPipe getworkEngine, GetworkCmd workStateCmd) {
		
	}
	
}
