/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.intel.bluetooth.BlueCoveConfigProperties;

public class BluetoothIOUtils implements DiscoveryListener{
	public final static BluetoothIOUtils INSTANCE = new BluetoothIOUtils();
	
	private LocalDevice localDevice;
	private DiscoveryAgent discoveryAgent;
	private List<DiscoveryListener> discoveryListeners;
	private Set<String> bluetoothAddressCache;
	private Set<WiiFinderListener> listenerList;
	
	public BluetoothIOUtils() {
		System.setProperty(BlueCoveConfigProperties.PROPERTY_JSR_82_PSM_MINIMUM_OFF, "true");
		discoveryListeners = new ArrayList<DiscoveryListener>();
		bluetoothAddressCache = new HashSet<String>();
		listenerList = new HashSet<WiiFinderListener>(); 
		try {
			localDevice = LocalDevice.getLocalDevice();
			discoveryAgent = localDevice.getDiscoveryAgent(); 
		} catch (BluetoothStateException e) {
			e.printStackTrace();
		}
	}
		
	public void deviceDiscovered(final RemoteDevice device, DeviceClass clazz) {
		if (Platform.inDebugMode()) {
			try {
				System.out.println(
					"found device: " 
					+	device.getFriendlyName(true) + " - " 
					+	device.getBluetoothAddress() + " - "
					+	clazz.getMajorDeviceClass() + ":"
					+	clazz.getMinorDeviceClass() + " - "
					+	clazz.getServiceClasses()
				);
			} catch (IOException ex) {
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		}
		try {
			if (!device.getFriendlyName(true).startsWith("Nintendo")) { //("Nintendo RVL-CNT-01") != 0) {
				return;
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}

		final String address = device.getBluetoothAddress();
		
		// is this already registered?
		if (!bluetoothAddressCache.contains(address)) {
			Job connectThread = new Job("connect: " + address) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// FIXME: LB to automate here a way to connect a BT wiimote
						
					fireMoteFound(address);
					
					bluetoothAddressCache.add(address);
					return Status.OK_STATUS;
				};
			};
			connectThread.schedule();
				
			for (DiscoveryListener delegate : discoveryListeners) {
				delegate.deviceDiscovered(device, clazz);
			}
		}
	}

	public void inquiryCompleted(int discType) {
		if (discType == DiscoveryListener.INQUIRY_COMPLETED) {
			if (Platform.inDebugMode()) {
				System.out.println("inquiry completed");
			}
		}
		if (discType == DiscoveryListener.INQUIRY_TERMINATED) {
			if (Platform.inDebugMode()) {
				System.out.println("inquiry terminated");
			}
		}
		if (discType == DiscoveryListener.INQUIRY_ERROR) {
			if (Platform.inDebugMode()) {
				System.err.println("inquiry error");
			}
		}
		for (DiscoveryListener delegate : discoveryListeners) {
			delegate.inquiryCompleted(discType);
		}
	}
		
	public void servicesDiscovered(int transID, ServiceRecord[] servRecord) {
		for (DiscoveryListener delegate : discoveryListeners) {
			delegate.servicesDiscovered(transID, servRecord);
		}
	}

	public void serviceSearchCompleted(int transID, int respCode) {
		for (DiscoveryListener delegate : discoveryListeners) {
			delegate.serviceSearchCompleted(transID, respCode);
		}
	}

	public void addMoteFinderListener(WiiFinderListener listener) {
		listenerList.add(listener);
	}
	
	protected void fireMoteFound(String address) {
		for (WiiFinderListener l : listenerList) {
			l.moteFound(address);
		}
	}

	public void removeMoteFinderListener(WiiFinderListener listener) {
		listenerList.remove(listener);
	}
	
	public void startDiscovery() {
		try {
			discoveryAgent.startInquiry(DiscoveryAgent.GIAC, this);
		} catch (BluetoothStateException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public void stopDiscovery() {
		discoveryAgent.cancelInquiry(this);
	}
}
