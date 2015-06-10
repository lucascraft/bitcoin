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

package net.sf.smbt.btc.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.trading.TradeBotsConfig;
import net.sf.smbt.trading.TradingPackage;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class BTCResourceUtils {
	
	public final static BTCResourceUtils INSTANCE = new BTCResourceUtils();
	
	public void save(TradeBotsConfig cfg, String filename) {
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(TradingPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TradingPackage.eNS_URI, TradingPackage.eINSTANCE);

		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(filename);
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.createResource(touchoscURI);
		
		resource.getContents().add(cfg);

		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public TradeBotsConfig load(String filename) {
		System.out.println("try to load : [" + filename + "]");
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(TradingPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TradingPackage.eNS_URI, TradingPackage.eINSTANCE);

		TradingPackage tradingPackageToInit = TradingPackage.eINSTANCE;
		
		File f = new File(filename);
		if (f != null && f.exists()) {
			System.out.println("[" + filename + "] exist ... ");
			URI tradeBotsURI = URI.createFileURI(filename);
			Resource resource = resourceSet.getResource(tradeBotsURI, true);
			return (TradeBotsConfig) resource.getContents().get(0);
		}
		System.out.println("Loading [" + filename + "] failed !");

		return null;
	}
	
	
	public void upload(String portID, String command, File file) {
    	String query = portID + command;

		boolean verbose = true;
		boolean requestFailed = false;

		HttpResponse response;
    	HttpEntity entity;
    	HttpClient httpclient = new DefaultHttpClient();

    	try {
	        InputStreamEntity reqEntity = new InputStreamEntity(new FileInputStream(file), -1);
	        reqEntity.setContentType("application/xml");
	        reqEntity.setChunked(true);
	        

			HttpPost httpput = new HttpPost(query);
			httpput.setEntity(reqEntity);

			if (verbose) {
				System.out.println("-------- open ubibot connection --------");
				System.out.println("executing request: " + httpput.getURI());
			}
			
			response = httpclient.execute(httpput); // execute this mother
			entity = response.getEntity();
			
			String ubiResponse = "";
			String statusLine = response.getStatusLine().toString() + "\n";
			String delims = "[ ]+";
			String[] tokens = statusLine.split(delims);

			if (tokens[1].equals("200")) { // success
				System.out.println("\nserver response:");
				System.out.println(statusLine);
				ubiResponse = EntityUtils.toString(entity);
			} else { // bad request
				System.out.println("\nbad request. status code: \n");
				System.out.println(statusLine);
				System.out.println("check the HTTP status codes");
				ubiResponse = EntityUtils.toString(entity) + "\n\n";
				Header[] respHeader;
				respHeader = response.getAllHeaders();
				for (int i = 0; i < respHeader.length; i++) {
					ubiResponse += respHeader[i].toString() + "\n";
				}
				if (verbose)
					System.out.print(ubiResponse);
					requestFailed = true;
					// "***failed request***";
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// shut down the connection manager to ensure
				// immediate deallocation of all system resources
				httpclient.getConnectionManager().shutdown();
				if (verbose) {
					System.out.println("----------- connection closed ----------\n");
				}
			}
	}
}
