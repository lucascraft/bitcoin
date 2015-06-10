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

package net.sf.smbt.btc.mtgox;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.BtcFactory;

import org.apache.commons.collections.CollectionUtils;
import org.eclipse.core.runtime.Platform;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class MTGoxDataManager {
	private volatile MTGox mtGox;
	
	public MTGoxDataManager() {
		mtGox 	= MtgoxFactory.eINSTANCE.createMTGox();
		mtGox.setMarket(BtcFactory.eINSTANCE.createBitcoinMarket());
		mtGox.getMarket().setCurrency(BtcCurrency.EUR);
		mtGox.getMarket().setBroker("MtGOX");
		mtGox.setWallet(MtgoxFactory.eINSTANCE.createWallet());
	}

	public MTGox getMtGox() {
		return mtGox;
	}
	public String getLastTid() {
		return lastTid;
	}
	private void handleAlive(JsonObject o) {
		String status = o.getAsJsonObject().get("status").getAsString();
		if ("alive".equals(status)) {
			mtGox.setSocketioConnected(true);
		} else if ("dead".equals(status)) {
			mtGox.setSocketioConnected(false);
		} 
	}
	private void handleOrderFeeback(JsonObject o) {
		String tag = o.getAsJsonObject().get("mtgox").getAsString();

		if (tag.endsWith("/cancel")) {
			JsonObject returnv = (JsonObject) o.getAsJsonObject().get("return");
			String qid = returnv.get("qid").getAsString();
			String oid = returnv.get("oid").getAsString();
			String success = o.getAsJsonObject().get("result").getAsString();

			System.out.println("Cancelling " + oid + " / " + qid + " order == " + success );
			
		} else if (tag.endsWith("/add")) {
			String qid = o.getAsJsonObject().get("return").getAsString();
			
			String success = o.getAsJsonObject().get("result").getAsString();
			
			System.out.println("Adding " + qid + " order == " + success );
		}
	}
	
	private void handleMoneyInfo(JsonObject o) {
		/*
		 {
		 "Login":"lucasb31",
		 "Index":"329163",
		 "Id":"0ad9b756-c3fb-46fa-b7d6-dcd7a49e7f17",
		 "Rights":["deposit","get_info","merchant","trade"],
		 "Language":"en_US",
		 "Created":"2013-03-24 12:24:17",
		 "Last_Login":"2013-04-19 11:59:37",
		 "Wallets":{
		 	"BTC":{
		 		"Balance":{
		 			"value":"0.00994700",
		 			"value_int":"994700",
		 			"display":"0.00994700蔅TC",
		 			"display_short":"0.01蔅TC",
		 			"currency":"BTC"
		 		},
		 		"Operations":565,
		 		"Daily_Withdraw_Limit":{
		 			"value":"100.00000000",
		 			"value_int":"10000000000",
		 			"display":"100.00000000蔅TC",
		 			"display_short":"100.00蔅TC",
		 			"currency":"BTC"
		 		},
		 		"Monthly_Withdraw_Limit":null,
		 		"Max_Withdraw":{
		 			"value":"100.00000000",
		 			"value_int":"10000000000",
		 			"display":"100.00000000蔅TC",
		 			"display_short":"100.00蔅TC",
		 			"currency":"BTC"
		 		},
		 		"Open_Orders":{
		 			"value":"0.00000000",
		 			"value_int":"0",
		 			"display":"0.00000000蔅TC",
		 			"display_short":"0.00蔅TC",
		 			"currency":"BTC"
		 		}
		 	},
		 	"EUR":{
		 		"Balance":{
		 			"value":"992.11214",
		 			"value_int":"99211214",
		 			"display":"992.11214售",
		 			"display_short":"992.11售",
		 			"currency":"EUR"
		 		},
		 		"Operations":600,
		 		"Daily_Withdraw_Limit":{
		 		"value":"1000.00000"
		 		,"value_int":"100000000",
		 		"display":"1,000.00000售",
		 		"display_short":"1,000.00售",
		 		"currency":"EUR"
		 	},
		 	"Monthly_Withdraw_Limit":{
		 		"value":"10000.00000",
		 		"value_int":"1000000000",
		 		"display":"10,000.00000售",
		 		"display_short":"10,000.00售",
		 		"currency":"EUR"
		 	},"Max_Withdraw":{
		 		"value":"1000.00000",
		 		"value_int":"100000000",
		 		"display":"1,000.00000售",
		 		"display_short":"1,000.00售",
		 		"currency":"EUR"
		 	},
		 	"Open_Orders":
		 	{"value":"0.00000",
		 	"value_int":"0",
		 	"display":"0.00000售",
		 	"display_short":"0.00售",
		 	"currency":"EUR"
		 	}
		 }
		},
		 "Monthly_Volume":{
		 	"value":"273.46571873","value_int":
		 	"27346571873","display":"273.46571873蔅TC",
		 	"display_short":
		 	"273.47蔅TC",
		 	"currency":"BTC"
		 },
		 "Trade_Fee":0.53
		 	}
		 */
		
		JsonObject data = (JsonObject) o.getAsJsonObject().get("return");
		if (data != null) {
			String creationDate 	= data.get("Created").getAsString();
			String id 				= data.get("Id").getAsString();
			int index 				= data.get("Index").getAsInt();
			String lang 			= data.get("Language").getAsString();
			String lastLogin		= data.get("Last_Login").getAsString();
			String Login			= data.get("Login").getAsString();
			float Trade_Fee		= data.get("Trade_Fee").getAsFloat();
			
			Wallet wallet = mtGox.getWallet();
			wallet.setCreated(creationDate);
			wallet.setId(id);
			wallet.setIndex(index);
			wallet.setLogin(Login);
			wallet.setLastLogin(lastLogin);
			wallet.setTradeFee(Trade_Fee);
			
			JsonArray walllets = data.get("Rights").getAsJsonArray();
			Iterator<JsonElement> itRights = walllets.iterator();
			while (itRights.hasNext()) {
				JsonElement e 	= itRights.next();
				if (e instanceof JsonPrimitive) {
					String Rights	= ((JsonPrimitive)e).getAsString();
					if ("deposit".equals(Rights)) {
						wallet.getRights().add(WalletRight.DEPOSIT);
					}
					if ("get_info".equals(Rights)) {
						wallet.getRights().add(WalletRight.GET_INFO);
					}
					if ("merchant".equals(Rights)) {
						wallet.getRights().add(WalletRight.MERCHANT);
					}
					if ("trade".equals(Rights)) {
						wallet.getRights().add(WalletRight.TRADE);
					}
					if ("withdraw".equals(Rights)) {
						wallet.getRights().add(WalletRight.WITHDRAW);
					}
				}
			}
			
			JsonObject BTC		= data.get("Wallets").getAsJsonObject().get("BTC").getAsJsonObject();

			CurrencyWalletData btcWallet = buildAWallet(BTC);
			btcWallet.setCurrency(BtcCurrency.BTC);

			wallet.setBtcInfo(btcWallet);
			
			JsonObject w		= data.get("Wallets").getAsJsonObject().get(mtGox.getMarket().getCurrency().getLiteral()).getAsJsonObject();

			CurrencyWalletData currentCurrencyWallet = buildAWallet(w);
			currentCurrencyWallet.setCurrency(mtGox.getMarket().getCurrency());

			wallet.setEurInfo(currentCurrencyWallet);
			
			mtGox.setWallet(wallet);

		}
	}
	public void handleMtGoxEvents(MTGoxCmd cmd) {
		String jsonRcv = cmd.getJsonRcv();
		JsonElement o = MTGoxUtils.INSTANCE.loadDataFromJson(jsonRcv);
		if (o instanceof JsonObject) {
			JsonObject json = (JsonObject) o;
			try {
				JsonElement mtgoxElement = o.getAsJsonObject().get("mtgox");
				if (mtgoxElement != null) {
					String mtgoxTag = mtgoxElement.getAsString();		
					if (mtgoxTag != null) {
						/*   */if (mtgoxTag.endsWith("/money/ticker")) {
							handleMoneyTicker(json);
						} else if (mtgoxTag.endsWith("/generic/wallet/history")) {
							handleWalletHistory(json);
						} else if (mtgoxTag.endsWith("/generic/info")) {
							handleMoneyInfo(json);
						} else if (mtgoxTag.endsWith("/generic/orders")) {
							handleMoneyOrders(json);
						} else if (mtgoxTag.endsWith("/channel/fetch")) {
							handleDepthFetch(json);
						} else if (mtgoxTag.endsWith("/channel/lag")) {
							handleLag(json);
						} else if (mtgoxTag.endsWith("/channel/trades")) {
							handleChannelTrade(json);
						} else if (mtgoxTag.endsWith("/channel/ticker")) {
							handleChannelTicker(json);
						} else if (mtgoxTag.contains("/trades")) {
							handleMoneyTradesFetch(json);
						} else if (mtgoxTag.endsWith("/money/depth/fetch")) {
							handleDepthFull(json);
						} else if (mtgoxTag.endsWith("/money/info")) {
							handleMoneyInfo(json);
						} else if (mtgoxTag.endsWith("/money/depth/full")) {
							handleDepthFull(json);
						} else if (mtgoxTag.endsWith("/private/order/cancel") || mtgoxTag.endsWith("/private/order/add")) {
							handleOrderFeeback(json); // duplicate with channel trades ??
						} else if (mtgoxTag.endsWith("/channel")) { // WebSocket
							handleWebsocketChannel(json);
						} else if (mtgoxTag.endsWith("/status")) { // WebSocket
							handleAlive(json);  
						} else if (mtgoxTag.endsWith("/generic/private/idkey")) { // id key
							//handleApiKey(json);
						} else { // id key
							handleOthers(json);
						} 
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void handleChannelTrade(JsonObject o) {
		JsonObject d = (JsonObject) o.getAsJsonObject().get("trade");
		
		if (d != null ) {
			Long stamp				= d.get("date").getAsLong()*1000;
			Float price 			= d.get("price").getAsFloat();
			Float amount			= d.get("amount").getAsFloat();
			BigInteger priceInt		= d.get("price_int").getAsBigInteger();
			BigInteger amountInt	= d.get("amount_int").getAsBigInteger();
			String currencyLiteral 	= d.get("price_currency").getAsString();
			String tradeType 		= d.get("trade_type").getAsString();
			
			DepthValue sale = MtgoxFactory.eINSTANCE.createDepthValue();

			sale.setAmount(amount);
			sale.setAmountInt(amountInt);
			sale.setCurrency(BtcCurrency.get(currencyLiteral));
			sale.setKind("bid".equalsIgnoreCase(tradeType)?FetchKind.BID:FetchKind.ASK);
			sale.setLastLocalStatus(System.currentTimeMillis());
			sale.setPrice(price);
			sale.setPriceInt(priceInt);
			sale.setStamp(stamp);
			sale.setStatus(DepthStatus.NONE);
			if (sale.getCurrency().equals(mtGox.getMarket().getCurrency())) {
				if (!mtGox.getSales().isEmpty()) {
					DepthValue value = mtGox.getSales().get(0);
					if (value.getPrice()!=sale.getPrice() && value.getAmount()!=sale.getAmount()) {
						mtGox.getSales().add(sale);
					}
				} else {
					mtGox.getSales().add(sale);
				}
			}
		}
	}
	private void handleChannelTicker(JsonObject o) {
		JsonElement data = (JsonElement) o.getAsJsonObject().get("ticker");
		
		JsonObject obj =  data.getAsJsonObject();
		if (obj != null) {
			handleTickerData(obj);			
		}
	}
	String lastTid = "0";
	private void handleMoneyTradesFetch(JsonObject o) {
		JsonElement data = (JsonElement) o.getAsJsonObject().get("data");
		
		if (data != null && data.isJsonArray()) {
			JsonArray list = (JsonArray) data.getAsJsonArray();
			Iterator<JsonElement> itFetch = list.iterator();
			int i=0;
			while (itFetch.hasNext()) {
				JsonObject d = (JsonObject) itFetch.next();
				
				Long stamp				= d.get("date").getAsLong()*1000;
				Float price 			= d.get("price").getAsFloat();
				Float amount			= d.get("amount").getAsFloat();
				BigInteger priceInt		= d.get("price_int").getAsBigInteger();
				BigInteger amountInt	= d.get("amount_int").getAsBigInteger();
				String tid 				= d.get("tid").getAsString();
				
				String currencyLiteral 	= d.get("price_currency").getAsString();
				String item 			= d.get("item").getAsString();
				String tradeType 		= d.get("trade_type").getAsString();
				String primary 			= d.get("primary").getAsString();
				String properties 		= d.get("properties").getAsString();

				FetchValue v = MtgoxFactory.eINSTANCE.createFetchValue();
				
				v.setAmount(amount);
				v.setAmountInt(amountInt);
				v.setCurrency(BtcCurrency.get(currencyLiteral));
				v.setItem(item);
				v.setPrice(price);
				v.setPriceInt(priceInt);
				v.setPrimary(primary);
				v.setProperties(properties);
				v.setStamp(stamp);
				v.setTid(tid);
				v.setTradeType(tradeType);
				
				mtGox.eSetDeliver(false);
				if (!mtGox.getFetchs().contains(v)) {
					mtGox.getFetchs().add(v);
				}
				mtGox.eSetDeliver(true);
				lastTid = stamp+"";
				i++;
			}
			System.out.println(i + " trades @ " + new Date(Long.parseLong(lastTid)));
		}
	}
	private DepthValue createDepthValue2(JsonObject d) {
		Long stamp		= d.get("now").getAsLong()*1000;
		Float price 	= d.get("price").getAsFloat();
		Float volume	= d.get("volume").getAsFloat();
		BigInteger priceInt		= d.get("price_int").getAsBigInteger();
		BigInteger volumeInt	= d.get("volume_int").getAsBigInteger();
		String type_str = d.get("type_str").getAsString();
		String currency = d.get("currency").getAsString();
		
		DepthValue v = MtgoxFactory.eINSTANCE.createDepthValue(); 
		v.setVolume(volume);
		v.setVolumeInt(volumeInt);
		v.setPrice(price);
		v.setPriceInt(priceInt);
		v.setStamp(stamp);
		v.setKind("bid".equals(type_str)?FetchKind.BID:FetchKind.ASK);
		v.setCurrency(BtcCurrency.get(currency));
		return v;
	}
	private DepthValue createDepthValue(JsonObject d) {
		Long stamp		= d.get("stamp").getAsLong()*1000;
		Float price 	= d.get("price").getAsFloat();
		Float amount	= d.get("amount").getAsFloat();
		BigInteger priceInt		= d.get("price_int").getAsBigInteger();
		BigInteger amountInt	= d.get("amount_int").getAsBigInteger();
		
		DepthValue v = MtgoxFactory.eINSTANCE.createDepthValue(); 
		v.setAmount(amount);
		v.setAmountInt(amountInt);
		v.setPrice(price);
		v.setPriceInt(priceInt);
		v.setStamp(stamp);
		return v;
	}
	private void handleOthers(JsonObject o) {}
	private CurrencyWalletData buildAWallet(JsonObject BTC) {
		CurrencyWalletData btcWallet = MtgoxFactory.eINSTANCE.createCurrencyWalletData();
		if (!BTC.get("Daily_Withdraw_Limit").isJsonNull()) {
			WithdrawInfo Daily_Withdraw_Limit = createWithdrawInfo(BTC.get("Daily_Withdraw_Limit").getAsJsonObject());
			btcWallet.setDailyLimit(Daily_Withdraw_Limit);
		}
		if (!BTC.get("Monthly_Withdraw_Limit").isJsonNull()) {
			WithdrawInfo Monthly_Withdraw_Limit = createWithdrawInfo(BTC.get("Monthly_Withdraw_Limit").getAsJsonObject());
			btcWallet.setMonthlyLimit(Monthly_Withdraw_Limit);
		}
		int Operations = BTC.get("Operations").getAsInt();
		if (!BTC.get("Balance").isJsonNull()) {
			WithdrawInfo Balance = createWithdrawInfo(BTC.get("Balance").getAsJsonObject());
			btcWallet.setBalance(Balance);
		}
		if (!BTC.get("Max_Withdraw").isJsonNull()) {
			WithdrawInfo Max_Withdraw = createWithdrawInfo(BTC.get("Max_Withdraw").getAsJsonObject());
			btcWallet.setMaxWithdrawLimit(Max_Withdraw);
		}
		if (!BTC.get("Open_Orders").isJsonNull()) {
			WithdrawInfo Open_Orders = createWithdrawInfo(BTC.get("Open_Orders").getAsJsonObject());
			btcWallet.setOrders(Open_Orders);
		}
		return btcWallet;
	}
	private WithdrawInfo createWithdrawInfo(JsonObject o) {
		WithdrawInfo info = MtgoxFactory.eINSTANCE.createWithdrawInfo();
		String currency = o.get("currency").getAsString();
		BtcCurrency cur = BtcCurrency.get(currency);
		
		float value		= o.get("value").getAsFloat();
		BigInteger value_int	= o.get("value_int").getAsBigInteger();
		String display		= o.get("display").getAsString();
		String displayShort	= o.get("display_short").getAsString();

		info.setCurrency(cur);
		info.setDisplay(display);
		info.setDisplay_short(displayShort);
		info.setValue(value);
		info.setValue_int(value_int);
		
		return info;
	}
	private String computDepthValueKey(DepthValue v) {
		return v.getPrice() + "_" + v.getCurrency();
	}
	private void handleLag(JsonObject o) {
		System.out.println("lag " + o.toString());
	}
	private void handleDepthFetch(JsonObject o) {
		JsonObject data		= (JsonObject) o.getAsJsonObject().get("depth");
		DepthValue value	= createDepthValue2(data);
		if (Platform.inDebugMode()) {
			System.out.println(o.toString());
		}
		
		String k = computDepthValueKey(value);
		k += "_" + value.getKind().getLiteral().toUpperCase();
		
		for (int i=0;i<mtGox.getAsks().size();i++) {
			DepthValue v = mtGox.getAsks().get(i);
			if (v != null) {
				String oldKAsk = computDepthValueKey(v) + "_ASK";
				if (oldKAsk.equals(k)) {
					float amount = v.getAmount();
					amount += value.getVolume();
					v.setAmount(amount);
					v.setLastLocalStatus(System.currentTimeMillis());
					if (amount <= 0) {
						v.setStatus(DepthStatus.REM);
					} else {
						v.setStatus(DepthStatus.UPDATE);
					}
					if (mtGox.getAsks().size()>i) {
						mtGox.getAsks().set(i, v);
					}
					break;
				}
			}
		}
		for (int i=0;i<mtGox.getBids().size();i++) {
			DepthValue v = mtGox.getBids().get(i);
			if (v != null) {
				String oldKBis = computDepthValueKey(v) + "_BID";
				if (oldKBis.equals(k)) {
					float amount = v.getAmount();
					amount += value.getVolume();
					v.setAmount(amount);
					v.setLastLocalStatus(System.currentTimeMillis());
					if (amount <= 0) {
						v.setStatus(DepthStatus.REM);
					} else {
						v.setStatus(DepthStatus.UPDATE);
					}
					if (mtGox.getBids().size()>i) {
						mtGox.getBids().set(i, v);
					}
					break;
				}
			}
		}
	}
	/*
	private FetchValue createFetchValue(JsonObject d) {
		Long stamp				= d.get("date").getAsLong()*1000;
		Float price 			= d.get("price").getAsFloat();
		Float amount			= d.get("amount").getAsFloat();
		BigInteger priceInt		= d.get("price_int").getAsBigInteger();
		BigInteger amountInt	= d.get("amount_int").getAsBigInteger();
		String tid 				= d.get("tid").getAsString();
		
		String currencyLiteral 	= d.get("price_currency").getAsString();
		String item 			= d.get("item").getAsString();
		String tradeType 		= d.get("trade_type").getAsString();
		String primary 			= d.get("primary").getAsString();
		String properties 		= d.get("properties").getAsString();

		FetchValue v = MtgoxFactory.eINSTANCE.createFetchValue();
		
		v.setAmount(amount);
		v.setAmountInt(amountInt);
		v.setCurrency(BtcCurrency.get(currencyLiteral));
		v.setItem(item);
		v.setPrice(price);
		v.setPriceInt(priceInt);
		v.setPrimary(primary);
		v.setProperties(properties);
		v.setStamp(stamp);
		v.setTid(tid);
		v.setTradeType(tradeType);

		return v;
	}
	*/
	private void handleDepthFull(JsonObject o) {
		JsonObject data = (JsonObject) o.getAsJsonObject().get("data");
		Map<String, DepthValue> depthsMap = new TreeMap<String, DepthValue>();
		for (DepthValue v : mtGox.getDepths()) {
			if (v != null) {
				if (FetchKind.ASK.equals(v.getKind())) {
					depthsMap.put(computDepthValueKey(v) + "_ASK", v);
				}
				if (FetchKind.BID.equals(v.getKind())) {
					depthsMap.put(computDepthValueKey(v) + "_BID", v);
				}
			}
		}
		
		// Asks
		List<DepthValue> _asks = new ArrayList<DepthValue>();
		List<DepthValue> _bids = new ArrayList<DepthValue>();
		
		JsonArray listAsks = (JsonArray) data.get("asks").getAsJsonArray();
		Iterator<JsonElement> itAsksFetch = listAsks.iterator();
		while (itAsksFetch.hasNext()) {
			_asks.add(createDepthValue((JsonObject) itAsksFetch.next()));
		}	
		// Bids
		JsonArray listBids = (JsonArray) data.get("bids").getAsJsonArray();
		Iterator<JsonElement> itBidsFetch = listBids.iterator();
		while (itBidsFetch.hasNext()) {
			_bids.add(createDepthValue((JsonObject) itBidsFetch.next()));
		}
		DepthValue[] _bidsArray = _bids.toArray(new DepthValue[0]);
		CollectionUtils.reverseArray(_bidsArray);
		_bids.clear();
		_bids.addAll(Arrays.asList(_bidsArray));


		int size = _asks.size();
		mtGox.getAsks().clear();
		for (int i=0;i<size;i++) {
			if (i<_asks.size()) {
				DepthValue ask = _asks.get(i);
				ask.setLastLocalStatus(System.currentTimeMillis());
				ask.setStatus(DepthStatus.NONE);
				String k = computDepthValueKey(ask) + "_ASK";
				if (depthsMap.containsKey(k)) {
					if (ask.getAmount()==0.0f) {
						ask.setStatus(DepthStatus.REM);
					} else if (ask.getAmount() != depthsMap.get(k).getAmount()){
						ask.setStatus(DepthStatus.UPDATE);
					}
				} /*else {
					ask.setStatus(DepthStatus.ADD);
				}*/
				mtGox.getAsks().add(i, ask);
			}
		}
		size = _bids.size();
		mtGox.getBids().clear();
		for (int i=0;i<size;i++) {
			if (i<_bids.size()) {
				DepthValue bid = _bids.get(i);
				bid.setLastLocalStatus(System.currentTimeMillis());
				bid.setStatus(DepthStatus.NONE);
				String k = computDepthValueKey(bid) + "_BID";
				if (depthsMap.containsKey(k)) {
					if (bid.getAmount()==0.0f) {
						bid.setStatus(DepthStatus.REM);
					} else if (bid.getAmount() != depthsMap.get(k).getAmount()){
						bid.setStatus(DepthStatus.UPDATE);
					}
				} /*else {
					bid.setStatus(DepthStatus.ADD);
				}*/
				mtGox.getBids().add(i, bid);
			}
		}
		_asks.clear();
		_bids.clear();
		
		float sumBid = 0, sumAsk = 0;
		for (DepthValue v : mtGox.getAsks()) {
			if (v != null) {
				sumBid += v.getAmount();
				v.setSum(sumBid);
			}
		}
		for (DepthValue v : mtGox.getBids()) {
			if (v != null) {
				sumAsk += v.getAmount();
				v.setSum(sumAsk);
			}
		}
		if (!mtGox.getDepths().isEmpty()) {
			mtGox.getDepths().remove(mtGox.getDepths().size()-1);
		}
	}
	private void handleWalletHistory(JsonObject json) {
		mtGox.getWallet().getRecords().clear();
		
		JsonObject data = (JsonObject) json.getAsJsonObject().get("return");
		
		JsonArray orders = data.get("result").getAsJsonArray();
		
		Iterator<JsonElement> itOrders = orders.iterator();
		while (itOrders.hasNext()) {
			JsonObject o 	= (JsonObject) itOrders.next();

			int idx = o.get("Index").getAsInt();
			Long stamp = o.get("Date").getAsLong()*1000;
			String type = o.get("Type").getAsString();
			
			CompactValue value		= getCVal(o.get("Value").getAsJsonObject());
			CompactValue balance	= getCVal(o.get("Balance").getAsJsonObject());
			
			String info		 	= o.get("Info").getAsString();
			JsonArray links		= o.get("Link").getAsJsonArray();

			WalletRecord record = MtgoxFactory.eINSTANCE.createWalletRecord();
			
			Iterator<JsonElement> itLinks = links.iterator();
			while (itLinks.hasNext()) {
				JsonElement l 	= (JsonElement) itLinks.next();
				if (l.isJsonPrimitive()) {
					
					Link link = MtgoxFactory.eINSTANCE.createLink();
					link.setAddr(l.getAsString());
					
					record.getLinks().add(link);
				}
			}
			
			record.setBalance(balance);
			record.setDate(new Date(stamp));
			record.setIndex(idx);
			record.setInfo(info);
			record.setValue(value);
			record.setType(type);

			mtGox.getWallet().getRecords().add(record);
		}
	}
	private void handleV1MoneyInfo(JsonObject json) {
		JsonArray orders = json.getAsJsonObject().get("return").getAsJsonArray();
		if (orders != null) {
			
		}
	}
	private void handleMoneyOrders(JsonObject json) {
		JsonArray orders = json.getAsJsonObject().get("return").getAsJsonArray();
		mtGox.getWallet().getOrders().clear();
		
		Iterator<JsonElement> itOrders = orders.iterator();
		while (itOrders.hasNext()) {
			JsonObject o 	= (JsonObject) itOrders.next();
			
			Order order = MtgoxFactory.eINSTANCE.createOrder();
			
			
			String oid 		= o.get("oid").getAsString();
			BtcCurrency cur = BtcCurrency.get(o.get("currency").getAsString());
			String item 	= o.get("item").getAsString();
			String type 	= o.get("type").getAsString();
			
			JsonObject amount 	= o.get("amount").getAsJsonObject();
			
			CompactValue v 		= getCVal(amount);
			
			JsonObject effAmount = o.get("effective_amount").getAsJsonObject();
			
			CompactValue affAmountV = getCVal(effAmount); 
			
			JsonObject price = o.get("price").getAsJsonObject();
			
			CompactValue priceV = getCVal(price); 

			order.setAmount(affAmountV);
			order.setPrice(priceV);
			order.setCurrency(cur);
			order.setOid(oid);
			order.setItem(item);
			order.setType(type);
			order.setStatus(o.get("status").getAsString());
			order.setDate(o.get("date").getAsString());
			order.setPriority(o.get("priority").getAsString());
			
			mtGox.getWallet().getOrders().add(order);
		}
	}
	private void handleWebsocketChannel(JsonObject json) {
		JsonElement elem = json.getAsJsonObject().get("channel_name");
		if (elem != null) {
			String channel = json.getAsJsonObject().get("channel_name").getAsString();
			if (channel.equals("ticker."+BtcCurrency.BTC.getLiteral()+mtGox.getMarket().getCurrency())) {
				JsonObject ticker = (JsonObject) json.getAsJsonObject().get("ticker");
				handleTickerData(ticker);
			} else if (channel.equals("depth."+BtcCurrency.BTC.getLiteral()+mtGox.getMarket().getCurrency())) {
				JsonObject depth = (JsonObject) json.getAsJsonObject().get("depth");
				
				int typec	 				= depth.get("type").getAsInt();
				String type 				= depth.get("type_str").getAsString();
				String item 				= depth.get("item").getAsString();
				Date date 					= new Date(depth.get("now").getAsLong()*1000);
				float price					= depth.get("price").getAsFloat();
				BigInteger price_int		= depth.get("price_int").getAsBigInteger();
				BigInteger total_volume_int	= depth.get("total_volume_int").getAsBigInteger();
				float volume				= depth.get("volume").getAsFloat();
				BigInteger volume_int		= depth.get("volume_int").getAsBigInteger();
	
				DepthValue match = null;
				for ( DepthValue v : mtGox.getDepths()) {
					if (v != null) {
						v.setStatus(DepthStatus.NONE);
						if(v.getPrice() == price) {
							v.setAmountInt(total_volume_int);
							float amount = total_volume_int.floatValue()/100000000;
							v.setAmount(amount);
							if (amount<=0.0f) {
								v.setStatus(DepthStatus.REM);
							} else {
								v.setStatus(DepthStatus.UPDATE);
							}
							v.setLastLocalStatus(System.currentTimeMillis());
							match = v;
							break;
						}
					}
				}
				if (match != null) {
					if (FetchKind.ASK.equals(match.getKind())) {
						mtGox.eSetDeliver(false);
						int idx = mtGox.getAsks().indexOf(match);
						mtGox.getAsks().remove(idx);
						mtGox.eSetDeliver(true);
						mtGox.getAsks().add(idx, match);
					} else {
						mtGox.eSetDeliver(false);
						int idx = mtGox.getBids().indexOf(match);
						mtGox.getBids().remove(idx);
						mtGox.eSetDeliver(true);
						mtGox.getBids().add(idx, match);
					}
				}
				mtGox.eSetDeliver(false);
				float sumBid = 0, sumAsk = 0;
				for (DepthValue v : mtGox.getAsks()) {
					if (v != null) {
						sumBid += v.getAmount();
						v.setSum(sumBid);
					}
				}
				for (DepthValue v : mtGox.getAsks()) {
					if (v != null) {
						sumAsk += v.getAmount();
						v.setSum(sumAsk);
					}
				}
				mtGox.eSetDeliver(true);
			}  else if (channel.equals("trade."+BtcCurrency.BTC.getLiteral())) {
				JsonObject depth = (JsonObject) json.getAsJsonObject().get("trade");
				
				String tid					= depth.get("tid").getAsString();
				String primary				= depth.get("primary").getAsString();
				String type 				= depth.get("type").getAsString();
				String item 				= depth.get("item").getAsString();
				String trade 				= depth.get("trade_type").getAsString();
				Date date 					= new Date(depth.get("date").getAsLong()*1000);
				float price					= depth.get("price").getAsFloat();
				BigInteger amount_int		= depth.get("amount_int").getAsBigInteger();
				BigInteger price_int		= depth.get("price_int").getAsBigInteger();
				String price_currency		= depth.get("price_currency").getAsString();

				BtcCurrency currency = BtcCurrency.get(price_currency);
				if (mtGox.getMarket().getCurrency().equals(currency)) {
					DepthValue newV = MtgoxFactory.eINSTANCE.createDepthValue();
					newV.setAmount(amount_int.floatValue() / 100000000);
					newV.setAmountInt(amount_int);
					newV.setKind("ask".equalsIgnoreCase(trade)?FetchKind.ASK:FetchKind.BID);
					newV.setPrice(price);
					newV.setPriceInt(price_int);
					newV.setStamp(date.getTime());
					newV.setCurrency(currency);
					if (!mtGox.getSales().isEmpty()) {
						DepthValue value = mtGox.getSales().get(0);
						if (value.getPrice()!=newV.getPrice() && value.getAmount()!=newV.getAmount()) {
							mtGox.getSales().add(newV);
						}
					} else {
						mtGox.getSales().add(newV);
					}
				}
			}
		} else {
			JsonObject obj = json.getAsJsonObject();
			boolean stop = true;
		}
	}
	private void handleTickerData(JsonObject data) {
		if (data != null) {
			JsonObject high			= data.get("high").getAsJsonObject();
			JsonObject low			= data.get("low").getAsJsonObject();
			JsonObject vwap			= data.get("vwap").getAsJsonObject();
			JsonObject vol			= data.get("vol").getAsJsonObject();
			JsonObject last_local 	= data.get("last_local").getAsJsonObject();
			JsonObject last_orig	= data.get("last_orig").getAsJsonObject();
			JsonObject last			= data.get("last").getAsJsonObject();
			JsonObject buy			= data.get("buy").getAsJsonObject();
			JsonObject sell			= data.get("sell").getAsJsonObject();
			
			CompactValue vHigh 		= getCVal(high); 
			CompactValue vLow 		= getCVal(low); 
			CompactValue vVol 		= getCVal(vol); 
			CompactValue vBuy 		= getCVal(buy); 
			CompactValue vSell 		= getCVal(sell); 
			CompactValue vLastLocal	= getCVal(last_local); 
			CompactValue vLastOrig 	= getCVal(last_orig); 
			CompactValue vLast	 	= getCVal(last); 
			
			mtGox.getMarket().setBroker("MtGOX");
			mtGox.getMarket().setHigh(vHigh.getValue());
			mtGox.getMarket().setLow(vLow.getValue());
			mtGox.getMarket().setBuy(vBuy.getValue());
			mtGox.getMarket().setSell(vSell.getValue());
			mtGox.getMarket().setVolume(vVol.getValue());
			mtGox.getMarket().setLast(vLast.getValue());
			mtGox.getMarket().setLastOrig(vLastOrig.getValue());
			mtGox.getMarket().setLastLocal(vLastLocal.getValue());
			
			Fundamentals f = MtgoxFactory.eINSTANCE.createFundamentals();
			f.setBuy(mtGox.getMarket().getBuy());
			f.setLow(mtGox.getMarket().getLow());
			f.setHigh(mtGox.getMarket().getHigh());
			f.setSell(mtGox.getMarket().getSell());
			f.setLast(mtGox.getMarket().getLast());
			
			List<Fundamentals> last500 = mtGox.getTrend();
			List<Fundamentals> tmp = new ArrayList<Fundamentals>();
			tmp.add(0, f);
			if (last500.size() >= 500) {
				tmp.addAll(last500.subList(1, last500.size()-2));
			} else {
				tmp.addAll(last500);
			}
			mtGox.getTrend().addAll(tmp);
		}
	}
	private void handleMoneyTicker(JsonObject json) {
		JsonObject data = (JsonObject) json.getAsJsonObject().get("data");
		handleTickerData(data);
	}
	private CompactValue getCVal(JsonObject ksonObj) {
		CompactValue v = MtgoxFactory.eINSTANCE.createCompactValue();
		if (ksonObj instanceof JsonObject) {
			v.setValue(ksonObj.get("value").getAsFloat());
			v.setValue_int(ksonObj.get("value_int").getAsBigInteger());
			v.setCurrency(ksonObj.get("currency").getAsString());
			v.setDisplay(ksonObj.get("display").getAsString());
			v.setDisplay_short(ksonObj.get("display_short").getAsString());
		}
		return v;
	}
}
