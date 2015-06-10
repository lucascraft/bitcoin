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

package net.sf.smbt.btc.node;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.comm.httpcmd.HttpCommCmd;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.engine.utils.ICommunicatorReactor;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;


public class BitcoinDProcessCommunicator extends HttpCommunicator implements ICommunicatorReactor {

	
	public void handleGet(Event evt) {
		final CmdPipe pipe = evt.getQx().getEngine();

		HttpCommCmd cmd = (HttpCommCmd) evt.getCmd();
		try {
	        StringBuffer buffer = new StringBuffer();
	        	
	        for (Property p : cmd.getProperties()) {
	        	buffer.append(p.getKey()+(p.getValue()==null?"":"="+p.getValue()+" "));
	        }
	        	
	        String commanPath = "";
	        URL url = null;
			try {
				String ubiquisenseJarPath = "/node/bitcoind" + (Platform.getOS().equals(Platform.OS_WIN32) ? ".exe" : "");
				url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
				if (url != null) {
					//System.out.println(url.toString());
					java.net.URI fileUri = FileLocator.resolve(url).toURI();
					if (fileUri != null) {
						//System.out.println(fileUri.toString());
						File f = new File(fileUri);
						if (f != null) {
							//System.out.println(f.getCanonicalPath());
							commanPath = new Path(f.getCanonicalPath()).toOSString();
						}
					}
				}
			} catch(Exception e) {
			    e.toString();
			}
	        if (!"".equals(commanPath)) {
		        String commandLine = commanPath + " " + buffer.toString() + " " + cmd.getCommand();
		        //System.out.println(commandLine);

		            Process p = Runtime.getRuntime().exec(commandLine);
		            
		            BufferedReader stdInput = new BufferedReader(new 
		                 InputStreamReader(p.getInputStream()));
	
		            // read the output from the command
		            //System.out.println("Here is the standard output of the command:\n");
		            StringBuffer inputBuffer = new StringBuffer();
		            String s;
		            while ((s = stdInput.readLine()) != null) {
		                //System.out.println(s);
		                inputBuffer.append(s);
		            }
		            pipe.receive(inputBuffer.toString().getBytes());
		            
		            /*
		            BufferedReader stdError = new BufferedReader(new 
		            		InputStreamReader(p.getErrorStream()));
		            
		            // read any errors from the attempted command
		            System.out.println("Here is the standard error of the command (if any):\n");
		            while ((s = stdError.readLine()) != null) {
		                System.out.println(s);
		            }
		            */
	        	}
	        }
	        catch (IOException e) {
	            System.out.println("exception happened - here's what I know: ");
	            e.printStackTrace();
	        }	
	}
	class RefreshNodeJob extends Job {
		Event evt;
		public RefreshNodeJob(Event evt) {
			super("Refresh Bitcoind Node Job");
			this.evt = evt;
			setPriority(LONG);
			setSystem(true);
		}
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			handleGet(evt);
			return Status.OK_STATUS;
		}
	}
	@Override
	public void get(final Event evt) {

		if (evt != null && evt.getQx() != null && evt.getQx().getEngine() != null) {
			final CmdPipe pipe = evt.getQx().getEngine();
			synchronized (pipe.getOutputInterpreter()) {
				if (evt.getCmd() instanceof HttpCommCmd) {
					new RefreshNodeJob(evt).schedule();
				}
			}
		}
	}
	@Override
	public IChannel createChannel(String protocolID) {
		return this;
	}
	@Override
	public void init(String pipeID, String portID, int[] ports) {}
}
