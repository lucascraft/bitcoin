/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.btc.pools.ext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.genericpools.PoolConfig;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class BTCConfUtils {
	public final static BTCConfUtils INSTANCE = new BTCConfUtils();

	public Collection<PoolConfig> getPoolConfigs() {
		List<PoolConfig> configs = new ArrayList<PoolConfig>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("net.sf.smbt.quantic.targetConfig");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				String addr = elem.getAttribute("addr");
				addr = addr == null ? "" : addr.trim();
			}
		}
		return configs;
	}
	
	public List<String> getIPAddresses() {
		List<String> ips = new ArrayList<String>();
		for (PoolConfig c : getPoolConfigs()) {
			String ip = c.getKey(); // FIXME : 
				if (!ips.contains(ip)) {
					ips.add(ip);
				}
		}
		return ips;
	}
	
	

}
