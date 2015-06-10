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

package net.sf.smbt.bt.wiimote.services;

import java.util.HashMap;
import java.util.Map;

import net.sf.xqz.engine.ext.service.AbstractExtensionManager;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class WiiExtensionManager extends AbstractExtensionManager implements IWiiExtensionManager {
	
	public final static WiiExtensionManager INSTANCE = new WiiExtensionManager();
	
	public final static String EXTENSION_ID = "net.sf.smbt.bt.wiimote.wiiExtension"; 
	
	private Map<String, WiiExtension> wiiExtensionsMap;
	
	public WiiExtensionManager() {
		super(EXTENSION_ID);
		wiiExtensionsMap = new HashMap<String, WiiExtension>();
	}
	
	/**
	 * Accessor for a Wii Device Extension configuration from its extension ID
	 * 
	 * @param extensionID contributed extension ID
	 * 
	 * @return a contributed {@link WiiExtension} configuration from its ID
	 */
	public WiiExtension getWiiExtensionFromID(String extensionID) {
		if (wiiExtensionsMap.keySet().contains(extensionID)) {
			return wiiExtensionsMap.get(extensionID);
		} else {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry.getExtensionPoint(EXTENSION_ID);
			if (point == null) return null;
			IExtension[] extensions = point.getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
					String ID = elem.getAttribute("ID");
					String key = elem.getAttribute("key");
					if (ID.equals(extensionID)) {
						WiiExtension extension = createWiiExtensionConfig(elem);
						extension.setID(ID);
						extension.setKey(key);
						if (!wiiExtensionsMap.containsKey(extensionID)) {
							wiiExtensionsMap.put(extensionID, extension);
						}
						return extension;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Accessor for a Wii Device Extension configuration from its key
	 * 
	 * @param key contributed Wii device key ID
	 * 
	 * @return a contributed {@link WiiExtension} configuration from its key
	 */
	public WiiExtension getWiiExtensionFromKey(String key) {
		if (key != null && !"".equals(key)) {
			for (WiiExtension ext : wiiExtensionsMap.values()) {
				if (ext.getKey() != null && ext.getKey().equals(key)) {
					return ext;
				}
			}
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry.getExtensionPoint(EXTENSION_ID);
			if (point == null) return null;
			IExtension[] extensions = point.getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
					String ID = elem.getAttribute("ID");
					String contributedKey = elem.getAttribute("key");
					if (key.equals(contributedKey)) {
						WiiExtension extension = createWiiExtensionConfig(elem);
						extension.setID(ID);
						extension.setKey(contributedKey);
						if (!wiiExtensionsMap.containsKey(ID)) {
							wiiExtensionsMap.put(ID, extension);
						}
						return extension;
					}
				}
			}
		}
		return null;
	}

	private WiiExtension createWiiExtensionConfig(IConfigurationElement element) {
		try {
			return (WiiExtension) element.createExecutableExtension("wiiExtHandler");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	protected void decrypt(byte[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte) (((byte) data[i] ^ (byte) 0x17) + (byte) 0x17);
		}
	}
	
	@Override
	public WiiExtension getExtension(byte[] payload) {
		if (payload != null && payload.length>0) {
			/*
			 	-------------------------------
			 	Encrypted	Decrypted	Meaning
			 	-------------------------------
				0000 0000 0000*	 0x2E2E	 BladeFX adapter that has been initialised old way, unplugged then replugged
				FFFF FFFF FFFF*	 0xFFFF	 GHWT Guitar or Drums or synced BladeFX or other wireless nunchuk initialised the old way
				0xFEFE	 0000 A420 0000	Nunchuk
				0xFDFD	 0000 A420 0101	Classic Controller
				0xFDFB	 0000 A420 0103	GH3 or GHWT Guitar
				0xFDFB	 0100 A420 0103	Guitar Hero World Tour Drums
				0300 A420 0103*		DJ Hero Turntable
				0000 A420 0402*	 0x2A2C	Wii Balance Board
				0000 A420 0405*		 Activated Wii Motion Plus
				0000 A420 0505*		 Activated Wii Motion Plus in Nunchuck passthrought mode
				0000 A420 0705*		 Activated Wii Motion Plus in Classic Controller passthrought mode
					(4)A60000:
					
				-------------------------------
				Encrypted	Decrypted	Meaning
				-------------------------------
				0000 A620 0005*		 Inactive Wii Motion Plus
				0000 A620 0405*		 No-longer active Wii Motion Plus
				0000 A620 0505*		 No-longer nunchuk-passthrough Wii Motion Plus
				0000 A620 0705*		 No-longer classic-passthrough Wii Motion Plus
	
				fefe=motejx.extensions.nunchuk.Nunchuk
				fdfd=motejx.extensions.classic.ClassicController
				0402=motejx.extensions.balanceboard.BalanceBoard
	
			 */
			String id0 = Integer.toHexString(payload[0] & 0xff);
			if (id0.length() == 1) {
				id0 = "0" + id0;
			}
			String id1 = Integer.toHexString(payload[1] & 0xff);
			if (id1.length() == 1) {
				id1 = "0" + id1;
			}
			String key = id0 + id1;
			
			System.out.println("Wiimote extension id : " + key);
			
			return getWiiExtensionFromKey(key);
		}
		return null;
	}
	
	

	@Override
	protected void addExtension(IExtension extension) {
		for (IConfigurationElement elem : extension.getConfigurationElements()) {
			String ID = elem.getAttribute("ID");
			String key = elem.getAttribute("key");
			if (!wiiExtensionsMap.containsKey(ID)) {
				WiiExtension wiiext = createWiiExtensionConfig(elem);
				wiiext.setID(ID);
				wiiext.setKey(key);
				if (wiiext != null) {
					wiiExtensionsMap.put(ID, wiiext);
				}
			}
		}
	}

	@Override
	protected void removeExtension(IExtension extension) {
		for (IConfigurationElement elem : extension.getConfigurationElements()) {
			String ID = elem.getAttribute("ID");
			if (wiiExtensionsMap.containsKey(ID)) {
				wiiExtensionsMap.remove(ID);
			}
		}
	}
}
