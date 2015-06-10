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

package net.sf.smbt.btc.cmd;

import java.io.UnsupportedEncodingException;

import net.sf.smbt.btc.BtcCurrency;


public class BTCUtils {
	
	public final static BTCUtils INSTANCE = new BTCUtils();
	
	
    // EUR : U+20AC

	public String getCurrencySymbol(BtcCurrency currency) {
		try {
			switch (currency) {
				case BTC:
					return BtcCurrency.BTC.getLiteral();
				case AUD:
				case USD:
				case CAD:
					return new String("\uFE69".getBytes("UTF-16"), "UTF-16");
				case CHF:
					return new String("\u20A3".getBytes("UTF-16"), "UTF-16");
				case EUR:
					return new String("\u20AC".getBytes("UTF-16"), "UTF-16");
				case GBP:
					return new String("\u00A3".getBytes("UTF-16"), "UTF-16");
				case CNY:
				case HKD:
				case JPY:
					return new String("\u00A5".getBytes("UTF-16"), "UTF-16");
				case PLN:
					return BtcCurrency.BTC.getLiteral();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "?";
	}


}
