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

package net.sf.smbt.utils;

import java.io.IOException;
import java.util.HashMap;

import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.trading.TradeBotsConfig;
import net.sf.smbt.trading.TradingFactory;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

public class TradeBotsConfigUtils {
	
	public final static TradeBotsConfigUtils INSTANCE = new TradeBotsConfigUtils();
	
	//
	//
	// URI Resource load/save
	//
	//
	public void save(IEditorInput uriInput, TradeBotsConfig project) {
		if (project != null) {
			if (uriInput instanceof FileEditorInput) {
				IFile file = ((FileEditorInput)uriInput).getFile();
				ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
				try {
					URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					Resource resource = resourceSetImpl.createResource(uri);
					resource.getContents().add(project);
					resource.save(new HashMap<Object, Object>());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@SuppressWarnings("unused")
	public TradeBotsConfig load(IEditorInput uriInput) {
		TemporalPackage		p0	= TemporalPackage.eINSTANCE;
		BtcPackage			p1	= BtcPackage.eINSTANCE;
		
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSetImpl.getResource(uri, true);
				resource.load(new HashMap<Object, Object>());
				return (TradeBotsConfig) resource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public TradeBotsConfig createTradeBotsConfig() {
		TradeBotsConfig tradeBotsConfig = TradingFactory.eINSTANCE.createTradeBotsConfig();
		return tradeBotsConfig;
	}
}
