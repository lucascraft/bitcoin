/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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

package net.sf.smbt.bt.wiimote.handlers;

import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.utils.DefaultTxEventHandlerImpl;
import net.sf.xqz.model.engine.Event;

import org.eclipse.core.runtime.Platform;

public class BTWiimoteEventHandler extends DefaultTxEventHandlerImpl {
	@Override
	public void handleQxEvent(Event evt) {
		if (evt.getCmd() instanceof WiiCmd) {
			if (Platform.inDebugMode()) {
				System.out.println(CmdUtil.INSTANCE.getCmdInfo(evt.getCmd()));
			}
			super.handleQxEvent(evt);
		}
	}
}
