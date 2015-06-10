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

package net.sf.smbt.btc.pools.bitminter.utils;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import net.sf.smbt.btc.pools.bitminter.BitMinterCmd;
import net.sf.smbt.btc.pools.bitminter.BitminterFactory;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.HttpcmdFactory;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.model.cmd.Cmd;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BitMinterCmdUtils {
	
	public final static BitMinterCmdUtils INSTANCE = new BitMinterCmdUtils();
	
	
public SimpleDateFormat ISO_8601_DATE_FORMAT, ISO_8601_SHORT_DATE_FORMAT; 
	

	public BitMinterCmdUtils() {
		ISO_8601_DATE_FORMAT		= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
		ISO_8601_DATE_FORMAT.setLenient(true);
		ISO_8601_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
		
		ISO_8601_SHORT_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ISO_8601_SHORT_DATE_FORMAT.setLenient(true);
		ISO_8601_SHORT_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
	}
	
	public byte[] dumpPachubeCommand(Cmd cmd) {
		if (cmd instanceof BitMinterCmd) {
			BitMinterCmd c = (BitMinterCmd) cmd;
			String url =  "/api/";
			url += c.getCommand();
			return url.getBytes();
		}
		return new byte[0];
	}

	public Cmd handlePachubeFrame(byte[] frame) {
		String flux = new String(frame, Charset.forName("UTF-8"));

		BitMinterCmd cmd = BitminterFactory.eINSTANCE.createBitMinterCmd();
		cmd.setJson(flux);
		
		return cmd;
	}
	
	//
	//
	//
	
	public Object loadDataFromJson(String json) {
		System.err.println(json);
		return new JsonParser().parse(json);
	}
	
	
	public BitMinterCmd buildPoolStatsCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/stats", null, new ArrayList<Property>(), "");
	}

	public BitMinterCmd buildPoolHashRateCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/hashrate", null, new ArrayList<Property>(), "");
	}

	public BitMinterCmd buildPoolWorkersCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/workers", null, new ArrayList<Property>(), "");
	}

	public BitMinterCmd buildPoolUsersCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/users", null, new ArrayList<Property>(), "");
	}
	
	public BitMinterCmd buildPoolRoundCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/round", null, new ArrayList<Property>(), "");
	}
	
	public BitMinterCmd buildPoolBlocksCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/blocks", null, new ArrayList<Property>(), "");
	}
	
	public BitMinterCmd buildPoolShiftsCmd() {
		return buildBitMinterRequest(HttpMethod.GET, "pool/shifts", null, new ArrayList<Property>(), "");
	}
	
	
	public BitMinterCmd buildUserDataCmd(String user, String apiKey) {
		return buildBitMinterRequest(HttpMethod.GET, "users/" + user + "?", null, new ArrayList<Property>(), apiKey);
	}

	
	
	public BitMinterCmd buildBitMinterRequest(HttpMethod method, String command, JsonObject json, List<Property> properties,  String apiKey) {
		BitminterFactory factory = BitminterFactory.eINSTANCE;
		
		BitMinterCmd cmd = factory.createBitMinterCmd();
		
		cmd.setMethod(method);
		cmd.getProperties().addAll(properties);
		cmd.setJson(json != null ? json.getAsString() : "");
		cmd.setCommand(command);
		
		if (apiKey != null && !"".equals(apiKey)) {
			cmd.getProperties().add(createProperty("key", apiKey));
		}

		return cmd;
	}
	
	public Property createProperty(String key, String... value) {
		Property property = HttpcmdFactory.eINSTANCE.createProperty();
		property.setKey(key);
		String pValues = "";
		for (String v : value) {
			pValues += v + ",";
		}
		property.setValue(pValues.substring(0, pValues.length()-1));
		return property;
	}

}
