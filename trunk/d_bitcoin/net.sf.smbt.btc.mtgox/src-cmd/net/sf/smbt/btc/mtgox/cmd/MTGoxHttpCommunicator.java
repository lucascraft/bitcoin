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

package net.sf.smbt.btc.mtgox.cmd;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.comm.httpcmd.HttpCommCmd;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;

import org.eclipse.core.runtime.Platform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

public class MTGoxHttpCommunicator extends HttpCommunicator {
    private int response_code;
    private String response_message;
    private byte[] data;

    private int readTimout = 600000;
    private int connectTimeout = 10000;

    protected int access_index;
    
	final ObjectMapper mapper = new ObjectMapper();
	public void init(String pipeID, String portID, int[] acceptedPorts) {
		this.pipeID = pipeID;
		this.portID = portID;
		this.acceptedPorts = acceptedPorts;
	}
    public MTGoxHttpCommunicator() {
		properties		= new HashMap<String, String>();
		
	    TrustManager[] trustAllCerts = new TrustManager[]{
	    	new X509TrustManager() {
	    		@Override
	    		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
	    			return null;
	    		}
	    		@Override
	    		public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {}
	    		@Override
	    		public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {}
	    	}
	    };

	    try {
	    	SSLContext sc = SSLContext.getInstance("SSL");
	    	sc.init(null, trustAllCerts, new java.security.SecureRandom());
	    	HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	@Override
	public void get(Event evt) {
	HttpURLConnection httpc = null;
		if (evt != null && evt.getQx() != null && evt.getQx().getEngine() != null) {
			String command = "";
			final CmdPipe pipe = evt.getQx().getEngine();
			synchronized (pipe.getOutputInterpreter()) {
				pipe.getPort().getChannel().setLastFrame(data);
				properties.clear();
				if (evt.getCmd() instanceof HttpCommCmd) {
					HttpCommCmd cmd = (HttpCommCmd) evt.getCmd();
					command = new String(pipe.getOutputInterpreter().cmd2ByteArray(cmd));
					String url = portID + command;
					if (Platform.inDebugMode()) {
						System.out.println("Http : " + url);
					}
					setMethod(HttpMethod.GET.getLiteral());
					setMethod(cmd.getMethod() == null ? HttpMethod.GET.getLiteral() : cmd.getMethod().getLiteral());
						
					for (Property p : cmd.getProperties()) {
						properties.put(p.getKey(), p.getValue());
					}
				}
					    	
				String secretKey = "";
				String apiKey = "";
				if (properties.containsKey("secretKey")) {
					secretKey = properties.remove("secretKey");
				}
				if (properties.containsKey("key")) {
					apiKey = properties.remove("key");
				}
				String path 	= command.startsWith("/") ? command.substring(1) : command;
				if (path != null) {
					if (getMethod().equals(HttpMethod.POST.getLiteral())) {
						if (!"".equals(secretKey)) {
							try {
								Map<String, String> args = new HashMap<String, String>();
								
								// add nonce and build arg list
								args.put("nonce", String.valueOf(System.nanoTime()));
								for (String k : properties.keySet()) {
									args.put(k, properties.get(k));
								}
								String post_data = buildQueryString(args);
								System.setProperty("jsse.enableSNIExtension", "false");
								// args signature
								Mac mac = Mac.getInstance("HmacSHA512");
								SecretKeySpec secret_spec = new SecretKeySpec(Base64Coder.decode(secretKey), "HmacSHA512");
								mac.init(secret_spec);
								String signature = new String(Base64Coder.encode(mac.doFinal(post_data.getBytes())));
							        				  
								// build URL
								URL queryUrl = new URL("https://data.mtgox.com/api" + path);
								
								// create connection
								HttpURLConnection connection = (HttpURLConnection)queryUrl.openConnection();
								connection.setDoOutput(true);
								connection.setConnectTimeout(connectTimeout);
								connection.setReadTimeout(readTimout);
							        				 
								// set signature
								connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; Ubiquisense client)");
								connection.setRequestProperty("Rest-Key", apiKey);
								connection.setRequestProperty("Rest-Sign", signature.replaceAll("\n", ""));
								
								// write post
								connection.getOutputStream().write(post_data.getBytes());
							        				 
								handleInput(connection, command, pipe);
							} catch(Exception e) {
								e.printStackTrace();
							}
							return;
						}
					} else {
						if (Platform.inDebugMode()) {
							System.out.println(httpc);
						}
						try {
							String query 	= portID + path;
							query = query.replace("https", "http");
										    	
							URL url = new URL(query);
							httpc = (HttpURLConnection) url.openConnection();

							httpc.connect();
						} catch (Exception e) {
							e.printStackTrace();
						}
						handleInput(httpc, command, pipe);
						httpc.disconnect();
					}
				}
		                
				properties.clear();
			}
		}
	}
	
	
	protected String buildQueryString(Map<String, String> args) {
		String result = new String();
		for (String hashkey : args.keySet()) {
			 if (result.length() > 0) result += '&';
			 try {
				 result += URLEncoder.encode(hashkey, "UTF-8") + "="
						 + URLEncoder.encode(args.get(hashkey), "UTF-8");
			 } catch (Exception ex) {
				 //Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
			 }
		 }
		 return result;
	}
	
	private void handleInput(HttpURLConnection httpc, String command, CmdPipe pipe) {
		try {
        response_code = httpc.getResponseCode();
	        if (!(response_code == HttpURLConnection.HTTP_OK)
	                && !(response_code == HttpURLConnection.HTTP_PARTIAL)) {
	            response_message = httpc.getResponseMessage();
	            if (response_code == HttpURLConnection.HTTP_UNAUTHORIZED) {
	                System.out.println(portID
	                        + " requires password!\n"+response_message);
	                }
	        }
		    String encoding = httpc.getContentEncoding();
		    
		    InputStream in = null;
	      	if(encoding != null) {
	      		if(encoding.equalsIgnoreCase("gzip"))
	      			in = new GZIPInputStream(httpc.getInputStream());
	      		else if(encoding.equalsIgnoreCase("deflate"))
	      			in = new InflaterInputStream(httpc.getInputStream());
	      	} else {
	      		in = httpc.getInputStream();
	      	}
	      	
	      	if (in != null && in.available()>0) {
	      		try {
		      		Object obj = mapper.readTree(in);
		      	
			      	TextNode mtgoxNode = TextNode.valueOf(command);
			      	if (obj instanceof ObjectNode) {
			      		((ObjectNode)obj).set("mtgox", mtgoxNode);
			      	}
			      	
					if (Platform.inDebugMode()) {
						System.out.println(obj.toString());
					}
					    
			      	byte[] data = obj.toString().getBytes();
			      	
			      	pipe.receive(data);
			      	pipe.getPort().getChannel().setLastFrame(data);
	      		} catch (Exception e) {
	      			e.printStackTrace();
	      		} finally {
	      			in.close();
	      		}
	      	}
		} catch (java.net.SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getQueryArguments() {
		if (properties.isEmpty()) {
			return "";
		} else {
			String q = "";
			for (String k : properties.keySet()) {
				q += k + "=" + properties.get(k) + "&";
			}
			return q.substring(0, q.length()-1);
		}
	}
}
