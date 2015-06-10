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
import java.net.URI;
import java.util.Date;

import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

public class MTGoxWebSocketCommunicator extends HttpCommunicator {
	
	public final static String IO_CHANNEL_DEPTH		= "4::{\"op\": \"subscribe\", \"channel\": \"057bdc6b-9f9c-44e4-bc1a-363e4443ce87\"}";
	public final static String IO_CHANNEL_TICKER	= "4::{\"op\": \"subscribe\", \"channel\": \"0bb6da8b-f6c6-4ecf-8f0d-a544ad948c15\"}";
	public final static String IO_CHANNEL_TRADES	= "4::{\"op\": \"subscribe\", \"channel\": \"dbf1dee9-4f2e-4a08-8cb7-748919a71b21\"}";
	public final static String IO_CHANNEL_LAG		= "4::{\"op\": \"subscribe\", \"channel\": \"85174711-be64-4de1-b783-0628995d7914\"}";
	
	public final static String IO_CALL				= "4::{\"op\": \"call\"}";

	private byte[] data;
    protected int access_index;
	final ObjectMapper mapper = new ObjectMapper();
	private WebSocketClient websocket;
	private CmdPipe pipe;
	private AliveJob aliveJob;
	private int msgRcv = 0;
	private String privateKey="";
	private boolean alive = false;

	private String url;
	class AliveJob extends Job {
		private WebSocketClient ws;
		public AliveJob(WebSocketClient websocket) {
			super("socketio job");
			setSystem(true);
			setPriority(INTERACTIVE);
			ws = websocket;
		}
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			ws.send("2::");
			if (Platform.inDebugMode()) {
				System.out.println("sending 2::");
			}
			msgRcv = msgRcv > 0 ? 0 : msgRcv-1;
			if (msgRcv <= -4) {
				alive = false;
				connect();
			}
			schedule(5000);
			return Status.OK_STATUS;
		}
	}
	
	class WSocket extends WebSocketClient	 {
		public WSocket(URI serverURI, Draft d) {
			super(serverURI, d);
		}
		@Override
		public void onClose(int arg0, String arg1, boolean arg2) {
			if (Platform.inDebugMode()) {
				System.out.println(arg1);
			}
		}
		@Override
		public void onError(Exception err) {
			err.printStackTrace();
		}
		@Override
		public void onMessage(String msg) {
			if (msg!=null) {
				if(!msg.contains("::")) {
					receive(msg.getBytes());
				} else {
					// do the harlem shake ...
					if (websocket != null) {
						protocol(msg);
					}
				}
			}
		}
		@Override
		public void onOpen(ServerHandshake arg0) {
			System.out.println(arg0.getHttpStatusMessage());
		}
	}

    @Override
    public void init(String pipeID, String portID, int[] ports) {
    	setParameters(pipeID, portID, ports);
    	connect();
    }
    boolean status = false;
	public void connect () {
		try {
			url = "ws://socketio.mtgox.com/socket.io/1/websocket/"+new Date().getTime()+"/?Currency=EUR";
			websocket = new WSocket(URI.create(url), new Draft_10());
			if (Platform.inDebugMode()) {
				System.out.println("Connect Websocket");
			}
			status = websocket.connectBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (!status) {
				new Job("Reconnect") {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						connect();
						if (Platform.inDebugMode()) {
							System.out.println("reconnect");
						}
						receive("{\"status\":\"dead\", \"mtgox\":\"status\"}".getBytes());
						return Status.OK_STATUS;
					}
				}.schedule(5000);
			}
		}
	}
	private void protocol(String msg) {
		if (msg.equals("1::")) {
			if (Platform.inDebugMode()) {
				System.out.println(msg);
				System.out.println("sending 1::/mtgox back");
			}
			websocket.send("1::/mtgox");
		} if (msg.equals("2::")) {
			if (Platform.inDebugMode()) {
				System.out.println(msg);
			}
			if (aliveJob == null) {
				aliveJob = new AliveJob(websocket);
				if (Platform.inDebugMode()) {
					System.out.println("start heartbeating to socket.io");
				}
				alive = true;
			}
			aliveJob.schedule();
			
			if (status) {
				status = false;
				if (Platform.inDebugMode()) {
					System.out.println("subscribe to socket.io : trades, ticker, depth, lag");
				}
				websocket.send(IO_CHANNEL_TICKER);
				websocket.send(IO_CHANNEL_DEPTH);
				websocket.send(IO_CHANNEL_TRADES);
				websocket.send(IO_CHANNEL_LAG);
	
				receive("{\"status\":\"dead\", \"mtgox\":\"status\"}".getBytes());
			}
		} else if (msg.startsWith("4::/mtgox:")) {
			msgRcv++;
			if (Platform.inDebugMode()) {
				System.out.println(msg);
			}
			receive(msg.substring("4::/mtgox:".length()).getBytes());
			receive("{\"status\":\"alive\", \"mtgox\":\"status\"}".getBytes());
			alive = true;
		} else  {
			if (Platform.inDebugMode()) {
				System.out.println(msg);
			}
		}
	}
	@Override
	public void receive(byte[] stream) {
		JsonNode obj;
		try {
			obj = mapper.readTree(stream);
			pipe = QuanticMojo.INSTANCE.getPipe(getPipeID());
			if (pipe != null) {
				pipe.setLocked(true);
				String json = obj.toString();
				if(json.contains("057bdc6b-9f9c-44e4-bc1a-363e4443ce87") && !json.contains("subscribe")) {
					((ObjectNode)obj).set("mtgox", new TextNode("/channel/fetch"));
				} else if (json.contains("dbf1dee9-4f2e-4a08-8cb7-748919a71b21") && !json.contains("subscribe")) {
					((ObjectNode)obj).set("mtgox", new TextNode("/channel/trades"));
				} else if (json.contains("0bb6da8b-f6c6-4ecf-8f0d-a544ad948c15") && !json.contains("subscribe")) {
					((ObjectNode)obj).set("mtgox", new TextNode("/channel/ticker"));
				} else {
					((ObjectNode)obj).set("mtgox", new TextNode("/channel"));
				}
				pipe.receive(obj.toString().getBytes());
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void close() {
		if (websocket != null) {
			try {
				websocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		super.close();
	}
	@Override
	public void get(Event evt) {
		if (evt != null && evt.getQx() != null && evt.getQx().getEngine() != null) {
			final CmdPipe pipe = evt.getQx().getEngine();
			synchronized (pipe.getOutputInterpreter()) {
				pipe.getPort().getChannel().setLastFrame(data);
				if (evt.getCmd() instanceof MTGoxCmd) {
					MTGoxCmd cmd = (MTGoxCmd) evt.getCmd();
					String command = cmd.getCommand();
					if ("connect".equals(command)) {
						connect();
					} else if ("reconnect".equals(command)) {
						connect();
					} else if ("close".equals(command)) {
						close();
					} else if ("status".equals(command)) {
						// later
					} else if ("currency".equals(command)) {
						// later
					} else if ("private".equals(command)) {
						if (alive) {
							privateKey = cmd.getJsonSnd();
							websocket.send("4::{\"op\": \"subscribe\", \"key\": \""+cmd.getJsonSnd()+"\"}");
							if (Platform.inDebugMode()) {
								System.out.println("registering to private channel ==> 4::{\"op\": \"subscribe\", \"key\": \""+cmd.getJsonSnd()+"\"}");
							}
						}
					}
				}
			}
		}
	}
}