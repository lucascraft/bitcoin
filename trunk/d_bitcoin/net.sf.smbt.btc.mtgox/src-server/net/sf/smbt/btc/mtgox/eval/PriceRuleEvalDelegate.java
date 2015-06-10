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

package net.sf.smbt.btc.mtgox.eval;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchKind;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.trading.PriceRule;
import net.sf.smbt.trading.TradingRule;

import org.eclipse.emf.ecore.EObject;

public class PriceRuleEvalDelegate extends RuleEvalDelegate {

	public PriceRuleEvalDelegate(boolean verbose) {
		super(verbose);
	}
	
	public PriceRuleEvalDelegate() {
		super(false);
	}
	
	@Override
	public List<EObject> eval(TradingRule rule, Object ctx) {
		System.out.println("Start evaluation ...");
		List<EObject> list = new ArrayList<EObject>();
		if (ctx instanceof MTGox) {
			System.out.println("Eval against MtGOX context");
			MTGox mtgox = (MTGox) ctx;
			if (!mtgox.getDepths().isEmpty()) {
				System.out.println(mtgox.getDepths().size() + " depths to eval against.");
				PriceRule pRule = (PriceRule) rule;

				float price = pRule.getPrice();
				float tolerance = price * (pRule.getPercentTolerance() / 100f);
				float priceMin = price - tolerance;
				float priceMax = price + tolerance;

				System.out.println("Rule is " + price + " with tolerance : " + tolerance );
				
				DepthValue v = mtgox.getDepths().get(0);
				float lastAsk = FetchKind.ASK.equals(v.getKind()) ? Float.NaN : v.getPrice();
				float lastBid = FetchKind.BID.equals(v.getKind()) ? Float.NaN : v.getPrice();
				System.out.println("latest Ask/Bid : " + lastAsk + " / " + lastBid );
				if (v != null) {
					System.out.println("Check : ??? [" + priceMin + " / " + price + " / " + priceMax + "] ???");
					if (v.getPrice() >=priceMin && v.getPrice()<=priceMax) {
						System.out.println(v.getKind().getLiteral() + " matched : " + v.getPrice());
						list.add(v);
					}
				}
			}
		}
		return list;
	}
}
