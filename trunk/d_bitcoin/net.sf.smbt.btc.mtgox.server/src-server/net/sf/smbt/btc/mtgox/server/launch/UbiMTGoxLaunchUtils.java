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

package net.sf.smbt.btc.mtgox.server.launch;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.btc.mtgox.server.Activator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.debug.internal.core.LaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.ui.progress.UIJob;

public class UbiMTGoxLaunchUtils {
	
	public final static UbiMTGoxLaunchUtils INSTANCE = new UbiMTGoxLaunchUtils();
	
	private ILaunchConfiguration createLaunchConfiguration() throws CoreException {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		   ILaunchConfigurationType type =
		      manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
		ILaunchConfiguration[] configurations =
		      manager.getLaunchConfigurations(type);
		   for (int i = 0; i < configurations.length; i++) {
		      ILaunchConfiguration configuration = configurations[i];
		      if (configuration.getName().equals("Start Ubiquisense Server")) {
		         configuration.delete();
		         break;
		      }
		   }
		ILaunchConfigurationWorkingCopy workingCopy =
		      type.newInstance(null, "Start Ubiquisense Server");
		
		return workingCopy;
	}
	
	private List<IVMInstall> getJVMInstall() {
		List<IVMInstall> jreList = new ArrayList<IVMInstall>();
		IVMInstallType[] types = JavaRuntime.getVMInstallTypes();
		for (int i = 0; i < types.length; i++) {
		   IVMInstallType type = types[i];
		   IVMInstall[] jres = type.getVMInstalls();
		   for (int j = 0; j < jres.length; j++) {
			  /*
		      IAction action = new StartAction(jres[j]);
		      ActionContributionItem item = new ActionContributionItem(action);
		      item.fill(menu, -1);
			  */
			  jreList.add(jres[j]);
		   }
		}
		return jreList;
	}
	
	
	private List computeClassPath() throws CoreException {
		IVMInstall jre = JavaRuntime.getDefaultVMInstall();			

		File jdkHome = jre.getInstallLocation();

	     URL url = null;
	     List classpath = new ArrayList();
	     
	      try {
			String ubiquisenseJarPath = "/dist/ubiquisense.jar";
			url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
	 		
	        java.net.URI fileUri = FileLocator.resolve(url).toURI();
	        
	        File f = new File(fileUri);
	        
			IPath ubiquisensePath = new Path(f.getCanonicalPath());
			
			IRuntimeClasspathEntry ubiquisenseEntry = JavaRuntime.newArchiveRuntimeClasspathEntry(ubiquisensePath);
			ubiquisenseEntry.setClasspathProperty(IRuntimeClasspathEntry.USER_CLASSES);
			
			
			//for (IPath inclPattern : ubiquisenseEntry.getClasspathEntry().getInclusionPatterns()) {
			//	System.out.println(inclPattern.toOSString());
			//}
			
			//JarPackageReader jarPackageReader = new JarPackageReader(FileLocator.openStream(Activator.getDefault().getBundle(), new Path(imagePath), false));
			
			//JarFile jarFile =  new JarFile(f);
			//while (jarFile.entries().hasMoreElements()) {
			//	JarEntry jarEntry = jarFile.entries().nextElement();
			//}
			
			IPath systemLibsPath = new Path(JavaRuntime.JRE_CONTAINER);
			IRuntimeClasspathEntry systemLibsEntry = JavaRuntime.newRuntimeContainerClasspathEntry(systemLibsPath, IRuntimeClasspathEntry.STANDARD_CLASSES);

			classpath.add(ubiquisenseEntry.getMemento());
			classpath.add(systemLibsEntry.getMemento());
	      } catch (Exception exception1) {
	    	  exception1.printStackTrace();
	      }
		   
		return classpath;
	}
	
	/*
	-sp 8001 
	-sk "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" 
	-ak "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" 
	-ws "ws://socketio.mtgox.com/sockeio/1/websocket/" 
	-v "false" 
	-jp 8095
	*/
	public void launchUbiMtGoxWithParameters(int serverPort /* jetty */, int restPort, String websocketAddr, String secretKey, String apiKey, boolean verbose ) throws CoreException {
		
		String argsLine = 
			" -sp " + restPort + 
			" -sk " + secretKey + 
			" -ak " + apiKey + 
			" -ws " + websocketAddr + 
			" -v  " + Boolean.toString(verbose) + 
			" -jp " + serverPort
		; 
		
		LaunchConfigurationWorkingCopy launchConfig = (LaunchConfigurationWorkingCopy) createLaunchConfiguration();

		IVMInstall jre = JavaRuntime.getDefaultVMInstall();
		List classpath = computeClassPath();
		
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_INSTALL_NAME, jre.getName());
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE, jre.getVMInstallType().getId());
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "com.ubiquisense.ubibot.MtGoxJettyBotServer");
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, argsLine);
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, classpath);
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, false);
		
		ILaunch launch = launchConfig.launch(ILaunchManager.RUN_MODE, UIJob.getJobManager().createProgressGroup());
		IProcess[] p = launch.getProcesses();
		for (IProcess pp : p) {
			pp.getStreamsProxy().getOutputStreamMonitor().addListener(new IStreamListener() {
				@Override
				public void streamAppended(String text, IStreamMonitor monitor) {
					System.out.println(text);
				}
			});
		}
		
	}
	
	public void testUbiquisenseJarLaunchConfig() {
		try {
			INSTANCE.launchUbiMtGoxWithParameters(8095, 8001, "ws://socketio.mtgox.com/sockeio/1/websocket/", "yOXO9npUgFth0FOEVle2dOuas9tbU49dZzK+rXbMHCjrxAMU+eKLn/WoNQXBMw3DOUNSXjqMnZVocIHtszIEYQ==" , "9e1f447e-b377-469f-b2b6-4be488316d7a", false);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
