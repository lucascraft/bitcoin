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

package net.sf.smbt.bflv2.cmd;

import net.sf.smbt.bfl.bitforce.rev2.cmd.BFLBitForceV2CmdUtils;
import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl;

public class BitForceV2CmdInterpreter  extends AbstractCmdInterpreterImpl {
	@Override
	public synchronized byte[] cmd2ByteArray(final Cmd cmd) {
		if (cmd instanceof BFLCmd) {
			return BFLBitForceV2CmdUtils.INSTANCE.dumpBFLCmd((BFLCmd)cmd);
		}
		return new byte[0];
	}
}