/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
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

package net.sf.smbt.btc.pools.utils.getwork;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.btc.pools.getwork.GetworkCmd;
import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.runtime.Platform;


public class BtcPoolHttpCommunicator extends HttpCommunicator {
    protected DataInputStream in;
    
    private byte[] data;
    
    protected int access_index;
    private Base64 base64Encoder;
    protected Map<String, String> properties;
    
    private String login 	= "";
    private String password = "";
    private int port 		= 8332;
    private String worker 	= "";
    
    public void setLogin(String login) {
		this.login = login;
	}
    public void setPassword(String password) {
		this.password = password;
	}
    public void setPort(int port) {
		this.port = port;
	}
    public void setWorker(String worker) {
		this.worker = worker;
	}
    public String getLogin() {
		return login;
	}
    public String getPassword() {
		return password;
	}
    public String getWorker() {
		return worker;
	}
    public int getPort() {
		return port;
	}

	
    public BtcPoolHttpCommunicator() {
    	properties = new HashMap<String, String>();
    	base64Encoder = new Base64();
	}
	
	public void init(String pipeID, String portID, int[] acceptedPorts) {
		this.pipeID = pipeID;
		this.portID = portID;
		this.acceptedPorts = acceptedPorts;
	}
	
	@Override
	public void get(Event event) {
		doHttp(event);
	}
	String postData = "";
	HttpURLConnection httpc;
	private synchronized void doHttp(final Event evt) {
		if (evt != null && evt.getQx() != null && evt.getQx().getEngine() != null) {

			try {
				String command = "";
				final CmdPipe pipe = evt.getQx().getEngine();
				synchronized (pipe.getOutputInterpreter()) {
					pipe.getPort().getChannel().setLastFrame(data);
					properties.clear();
					if (evt.getCmd() instanceof GetworkCmd) {
						GetworkCmd cmd = (GetworkCmd) evt.getCmd();
						command = new String(pipe.getOutputInterpreter().cmd2ByteArray(cmd));
						String url = portID;
						if (Platform.inDebugMode()) {
							System.out.println("Http : " + url);
						}
						
						setMethod(HttpMethod.GET.getLiteral());
						setMethod(cmd.getMethod() == null ? HttpMethod.GET.getLiteral() : cmd.getMethod().getLiteral());
						
						Property postProperty = null;
						for (Property p : cmd.getProperties()) {
							if (p.getKey().equals(HttpMethod.POST.getLiteral())) {
								postProperty = p;
							}
						}
						if (postProperty != null) {
							postData = postProperty.getValue();

							cmd.getProperties().remove(postProperty);
						}
						for (Property p : cmd.getProperties()) {
							properties.put(p.getKey(), p.getValue());
						}
					}
					
					//if (getMethod().equals(HttpMethod.GET.getLiteral())) {
						URL url = null;
					    try {
					    	//String query = portID;
					        //url = new URL(query);
					        
					    	CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
					        
					        url = new URL("http", "mint.bitminter.com", getPort(), "");
					        
					        httpc = (HttpURLConnection) url.openConnection();
					        
					        //
					        //
					        //
					        
					        httpc.setConnectTimeout(5 * 1000);
					        httpc.setReadTimeout(5 * 1000);

					        String encoded = new String(base64Encoder.encode((getLogin() + "_" +getWorker() + ":" + getPassword()).getBytes()));
							String userPass = "Basic " + encoded.trim().replace("\r\n", "");

					        httpc.setRequestProperty("Authorization", userPass);
					        httpc.setRequestProperty("Accept", "application/json");
					        httpc.setRequestProperty("Accept-Encoding", "gzip,deflate");
					        httpc.setRequestProperty("Content-Type", "application/json");
					        httpc.setRequestProperty("Cache-Control", "no-cache");
					        httpc.setRequestProperty("User-Agent", "Ubiquisense");
					        httpc.setRequestProperty("X-Mining-Extensions", "longpoll rollntime switchto");
						    httpc.setDoOutput(true);
					        
						    OutputStream requestStream = httpc.getOutputStream();
						    Writer request = new OutputStreamWriter(requestStream);
						    request.write(command);
						    request.close();
						    requestStream.close();
						      
					    } catch (MalformedURLException e) {
					        e.printStackTrace();
					        System.out.println("Malformed URL");
							pipe.getPort().getChannel().setLastFrame(null);
					    } catch (IOException ioe) {
					        ioe.printStackTrace();
							pipe.getPort().getChannel().setLastFrame(null);
					    }
			
					    InputStream responseStream = null;

					    try {
					    	responseStream = httpc.getInputStream();
					    } catch (Exception npe) {
					    	npe.printStackTrace();
					    }
					    
				      	if(responseStream != null) {
						    in = new DataInputStream(responseStream);
						    int len = httpc.getContentLength();
						    if (len == -1) {
							    responseStream.close();
						        return;
						    }
						    data = new byte[len];
						    in.readFully(data);
	
						    responseStream.close();
				
						    pipe.receive(data);
								
							pipe.getPort().getChannel().setLastFrame(data);
					   }
					}
		                
		            properties.clear();
		
			//	}
			} catch (java.net.SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (httpc != null) {
					httpc.disconnect();
				}
			}
		}
	}
	
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		httpc.disconnect();
	}
}
