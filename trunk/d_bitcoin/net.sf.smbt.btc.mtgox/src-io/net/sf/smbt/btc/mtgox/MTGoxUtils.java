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

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.HttpcmdFactory;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.model.cmd.Cmd;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MTGoxUtils {
	public final static MTGoxUtils INSTANCE = new MTGoxUtils();
	
	public SimpleDateFormat ISO_8601_DATE_FORMAT, ISO_8601_SHORT_DATE_FORMAT; 
	
	private JsonParser parser;
	
	private Map<String, MTGoxController> controllerMap;
	
	public MTGoxUtils() {
		ISO_8601_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
		ISO_8601_DATE_FORMAT.setLenient(true);
		ISO_8601_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
		
		ISO_8601_SHORT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ISO_8601_SHORT_DATE_FORMAT.setLenient(true);
		ISO_8601_SHORT_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
		
		parser = new JsonParser();
		
		controllerMap = new HashMap<String, MTGoxController>();
		
	}
	
	public Map<String, MTGoxController> getControllerMap() {
		return controllerMap;
	}
	
	public MTGoxController getMTGoxControl(String apiKey, String secretKey) {
		String crappyKey = apiKey+"##SEPARATOR##"+secretKey;
		if (!controllerMap.containsKey(crappyKey)) {
			controllerMap.put(crappyKey, new MTGoxController(apiKey, secretKey));
		}
		return controllerMap.get(crappyKey);
	}
	
	public MTGoxController getMTGoxControl(String apiKey) {
		for (String k : controllerMap.keySet()) {
			if (k.startsWith(apiKey+"##")) {
				return controllerMap.get(k);
			}
		}
		return null;
	}
	
	public byte[] dumpCommand(Cmd cmd) {
		if (cmd instanceof MTGoxCmd) {
			MTGoxCmd c = (MTGoxCmd) cmd;
			String url =  "/" + c.getCommand();
			return url.getBytes();
		}
		return new byte[0];
	}
	
	public Cmd handleMtGOXFrame(byte[] frame) {
		String flux = new String(frame, Charset.forName("UTF-8"));
		MTGoxCmd cmd = MtgoxFactory.eINSTANCE.createMTGoxCmd();
		cmd.setJsonRcv(flux);
		return cmd;
	}
	
	//
	//
	//
	
	public JsonElement loadDataFromJson(String json) {
		return parser.parse(json);
	}
	
	public static void main(String[] args) {
		// from : http://api.bitcoincharts.com/v1/markets.json
		String json = "[{\"high\": null, \"latest_trade\": 1349296271, \"bid\": null, \"volume\": 0, \"currency\": \"AUD\", \"currency_volume\": 0, \"ask\": null, \"close\": 14.000000000000, \"avg\": null, \"symbol\": \"bitmarketAUD\", \"low\": null}, {\"high\": null, \"latest_trade\": 1353317656, \"bid\": null, \"volume\": 0, \"currency\": \"AUD\", \"currency_volume\": 0, \"ask\": null, \"close\": 22.000000000000, \"avg\": null, \"symbol\": \"cryptoxAUD\", \"low\": null}, {\"high\": 119.000000000000, \"latest_trade\": 1368639280, \"bid\": 113.085630000000, \"volume\": 2294.310246010000, \"currency\": \"AUD\", \"currency_volume\": 258257.056337404041, \"ask\": 115.500000000000, \"close\": 115.500000000000, \"avg\": 112.5641385189884208950222837, \"symbol\": \"mtgoxAUD\", \"low\": 103.363900000000}, {\"high\": null, \"latest_trade\": 1318748737, \"bid\": null, \"volume\": 0, \"currency\": \"AUD\", \"currency_volume\": 0, \"ask\": null, \"close\": 4.250000000000, \"avg\": null, \"symbol\": \"ruxumAUD\", \"low\": null}, {\"high\": null, \"latest_trade\": 1329028868, \"bid\": null, \"volume\": 0, \"currency\": \"AUD\", \"currency_volume\": 0, \"ask\": null, \"close\": 5.899978679200, \"avg\": null, \"symbol\": \"thAUD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1329864308, \"bid\": null, \"high\": null, \"currency\": \"AUD\", \"currency_volume\": 0, \"ask\": 31.000000000000, \"close\": 4.600000000000, \"avg\": null, \"symbol\": \"wbxAUD\", \"low\": null}, {\"high\": 110.000000000000, \"latest_trade\": 1368599255, \"bid\": 116.000000000000, \"volume\": 5.500000000000, \"currency\": \"AUD\", \"currency_volume\": 605.000000000000, \"ask\": 120.000000000000, \"close\": 110.000000000000, \"avg\": 110, \"symbol\": \"weexAUD\", \"low\": 110.000000000000}, {\"high\": null, \"latest_trade\": 1320965054, \"bid\": null, \"volume\": 0, \"currency\": \"BRL\", \"currency_volume\": 0, \"ask\": null, \"close\": 18.000000000000, \"avg\": null, \"symbol\": \"bbmBRL\", \"low\": null}, {\"high\": 260.000000000000, \"latest_trade\": 1368577862, \"bid\": 225.000000000000, \"volume\": 0.036000000000, \"currency\": \"BRL\", \"currency_volume\": 9.360000000000, \"ask\": 253.910000000000, \"close\": 260.000000000000, \"avg\": 260, \"symbol\": \"mrcdBRL\", \"low\": 260.000000000000}, {\"high\": 122.000000000000, \"latest_trade\": 1368645013, \"bid\": 110.200000000000, \"volume\": 117.654050400000, \"currency\": \"CAD\", \"currency_volume\": 13100.429958612205, \"ask\": 114.740000000000, \"close\": 110.000000000000, \"avg\": 111.3470374719220461278738943, \"symbol\": \"lybitCAD\", \"low\": 103.200000000000}, {\"high\": 119.100000000000, \"latest_trade\": 1368644888, \"bid\": 113.751350000000, \"volume\": 220.146260290000, \"currency\": \"CAD\", \"currency_volume\": 24734.879352822610, \"ask\": 118.452250000000, \"close\": 117.318000000000, \"avg\": 112.3565729449103693425270676, \"symbol\": \"mtgoxCAD\", \"low\": 106.308310000000}, {\"volume\": 2516.112700000000, \"latest_trade\": 1368645230, \"bid\": 109.000000000000, \"high\": 115.500000000000, \"currency\": \"CAD\", \"currency_volume\": 269274.964026822000, \"ask\": 109.000010000000, \"close\": 109.000000000000, \"avg\": 107.0202316560867881633441936, \"symbol\": \"virtexCAD\", \"low\": 100.058900000000}, {\"high\": null, \"latest_trade\": 1361382204, \"bid\": null, \"volume\": 0, \"currency\": \"CAD\", \"currency_volume\": 0, \"ask\": null, \"close\": 27.000000000000, \"avg\": null, \"symbol\": \"weexCAD\", \"low\": null}, {\"high\": 111.690650000000, \"latest_trade\": 1368635371, \"bid\": 107.360000000000, \"volume\": 75.941122600000, \"currency\": \"CHF\", \"currency_volume\": 8171.352729187724, \"ask\": 111.915960000000, \"close\": 107.363570000000, \"avg\": 107.6011579684986642533514510, \"symbol\": \"mtgoxCHF\", \"low\": 102.117660000000}, {\"high\": null, \"latest_trade\": 1318992534, \"bid\": null, \"volume\": 0, \"currency\": \"CHF\", \"currency_volume\": 0, \"ask\": 3.900000000000, \"close\": 3.000000000000, \"avg\": null, \"symbol\": \"ruxumCHF\", \"low\": null}, {\"high\": null, \"latest_trade\": 1329168604, \"bid\": null, \"volume\": 0, \"currency\": \"CLP\", \"currency_volume\": 0, \"ask\": null, \"close\": 3050.000000000000, \"avg\": null, \"symbol\": \"thCLP\", \"low\": null}, {\"high\": 712.000000000000, \"latest_trade\": 1368644513, \"bid\": 670.000000000000, \"volume\": 8873.655000000000, \"currency\": \"CNY\", \"currency_volume\": 5977572.730690000000, \"ask\": 675.090000000000, \"close\": 670.000000000000, \"avg\": 673.6314101337047699059744829, \"symbol\": \"btcnCNY\", \"low\": 640.080000000000}, {\"volume\": 0, \"latest_trade\": 1367768681, \"bid\": 683.258280000000, \"high\": null, \"currency\": \"CNY\", \"currency_volume\": 0, \"ask\": 718.702470000000, \"close\": 698.148920000000, \"avg\": null, \"symbol\": \"mtgoxCNY\", \"low\": null}, {\"high\": null, \"latest_trade\": 1367686010, \"bid\": 638.824850000000, \"volume\": 0, \"currency\": \"DKK\", \"currency_volume\": 0, \"ask\": 671.964040000000, \"close\": 627.122240000000, \"avg\": null, \"symbol\": \"mtgoxDKK\", \"low\": null}, {\"high\": null, \"latest_trade\": 1321512379, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 1.710000000000, \"avg\": null, \"symbol\": \"aqoinEUR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1317822453, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 3.300000000000, \"avg\": null, \"symbol\": \"b7EUR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1366826331, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 118.000000000000, \"avg\": null, \"symbol\": \"bcEUR\", \"low\": null}, {\"high\": 70.100000000000, \"latest_trade\": 1368642196, \"bid\": 66.000000000000, \"volume\": 5.694607340000, \"currency\": \"EUR\", \"currency_volume\": 398.080474534000, \"ask\": 87.000000000000, \"close\": 66.000000000000, \"avg\": 69.90481533955947874010923464, \"symbol\": \"bitcurexEUR\", \"low\": 66.000000000000}, {\"high\": null, \"latest_trade\": 1361021172, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 19.990000000000, \"avg\": null, \"symbol\": \"bitmarketEUR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1365850828, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 76.012250000000, \"avg\": null, \"symbol\": \"btc24EUR\", \"low\": null}, {\"volume\": 2166.680488660000, \"latest_trade\": 1368645184, \"bid\": 85.000000000000, \"high\": 166.000000000000, \"currency\": \"EUR\", \"currency_volume\": 187038.353996203400, \"ask\": 86.000000000000, \"close\": 83.500000000000, \"avg\": 86.32484345298124239213270657, \"symbol\": \"btcdeEUR\", \"low\": 81.000000000000}, {\"high\": 87.860000000000, \"latest_trade\": 1368643744, \"bid\": 75.800160000000, \"volume\": 130.299888860000, \"currency\": \"EUR\", \"currency_volume\": 10500.312316631051, \"ask\": 78.815160000000, \"close\": 78.815100000000, \"avg\": 80.58573501864651552090356864, \"symbol\": \"btceEUR\", \"low\": 69.000000000000}, {\"high\": null, \"latest_trade\": 1305076646, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 3.900000000000, \"avg\": null, \"symbol\": \"btcexEUR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1317816883, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 4.000000000000, \"avg\": null, \"symbol\": \"globalEUR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1348229048, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 7.711538461540, \"avg\": null, \"symbol\": \"imcexEUR\", \"low\": null}, {\"high\": 95.399900000000, \"latest_trade\": 1368643548, \"bid\": 88.100100000000, \"volume\": 82.939010000000, \"currency\": \"EUR\", \"currency_volume\": 7483.796270053200, \"ask\": 90.568250000000, \"close\": 90.383720000000, \"avg\": 90.23252471970909708230180225, \"symbol\": \"intrsngEUR\", \"low\": 87.794540000000}, {\"high\": 93.000000000000, \"latest_trade\": 1368644979, \"bid\": 86.568740000000, \"volume\": 14587.644299690000, \"currency\": \"EUR\", \"currency_volume\": 1267497.098522359415, \"ask\": 87.890000000000, \"close\": 87.364030000000, \"avg\": 86.88840175169988341044393054, \"symbol\": \"mtgoxEUR\", \"low\": 80.100000000000}, {\"high\": null, \"latest_trade\": 1367957080, \"bid\": 70.000000000000, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": 95.000000000000, \"close\": 55.000000000000, \"avg\": null, \"symbol\": \"rippleEUR\", \"low\": null}, {\"high\": 92.990000000000, \"latest_trade\": 1368643011, \"bid\": 80.000000000000, \"volume\": 59.790000000000, \"currency\": \"EUR\", \"currency_volume\": 5353.886100000000, \"ask\": 89.500000000000, \"close\": 89.500000000000, \"avg\": 89.54484194681384846964375314, \"symbol\": \"rockEUR\", \"low\": 80.000000000000}, {\"high\": null, \"latest_trade\": 1338569911, \"bid\": 4.407990000000, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 5.000000000000, \"avg\": null, \"symbol\": \"ruxumEUR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1329146896, \"bid\": null, \"volume\": 0, \"currency\": \"EUR\", \"currency_volume\": 0, \"ask\": null, \"close\": 4.160000000000, \"avg\": null, \"symbol\": \"thEUR\", \"low\": null}, {\"high\": 94.890074590000, \"latest_trade\": 1368630557, \"bid\": 82.000000000000, \"volume\": 27.921373890000, \"currency\": \"EUR\", \"currency_volume\": 2308.930317779292, \"ask\": 88.900000000000, \"close\": 89.000040050000, \"avg\": 82.69400806979029354633236495, \"symbol\": \"vcxEUR\", \"low\": 80.000000000000}, {\"high\": null, \"latest_trade\": 1312214090, \"bid\": null, \"volume\": 0, \"currency\": \"GAU\", \"currency_volume\": 0, \"ask\": null, \"close\": 0.267000000000, \"avg\": null, \"symbol\": \"bcmBMGAU\", \"low\": null}, {\"high\": null, \"latest_trade\": 1313452498, \"bid\": null, \"volume\": 0, \"currency\": \"GAU\", \"currency_volume\": 0, \"ask\": null, \"close\": 0.200000000000, \"avg\": null, \"symbol\": \"bcmPXGAU\", \"low\": null}, {\"high\": null, \"latest_trade\": 1366825383, \"bid\": null, \"volume\": 0, \"currency\": \"GBP\", \"currency_volume\": 0, \"ask\": null, \"close\": 99.707996640000, \"avg\": null, \"symbol\": \"bcGBP\", \"low\": null}, {\"high\": null, \"latest_trade\": 1314988355, \"bid\": null, \"volume\": 0, \"currency\": \"GBP\", \"currency_volume\": 0, \"ask\": null, \"close\": 5.500000000000, \"avg\": null, \"symbol\": \"bitmarketGBP\", \"low\": null}, {\"high\": null, \"latest_trade\": 1316391901, \"bid\": null, \"volume\": 0, \"currency\": \"GBP\", \"currency_volume\": 0, \"ask\": null, \"close\": 3.662700000000, \"avg\": null, \"symbol\": \"britcoinGBP\", \"low\": null}, {\"high\": null, \"latest_trade\": 1320274888, \"bid\": null, \"volume\": 0, \"currency\": \"GBP\", \"currency_volume\": 0, \"ask\": null, \"close\": 2.990000000000, \"avg\": null, \"symbol\": \"globalGBP\", \"low\": null}, {\"high\": 76.490000000000, \"latest_trade\": 1368634312, \"bid\": 63.900000000000, \"volume\": 0.138240000000, \"currency\": \"GBP\", \"currency_volume\": 10.559971600000, \"ask\": 76.490000000000, \"close\": 76.490000000000, \"avg\": 76.38868344907407407407407407, \"symbol\": \"intrsngGBP\", \"low\": 75.000000000000}, {\"high\": 78.240000000000, \"latest_trade\": 1368643430, \"bid\": 74.001210000000, \"volume\": 2412.088376940000, \"currency\": \"GBP\", \"currency_volume\": 174894.371402542366, \"ask\": 74.728600000000, \"close\": 74.000000000000, \"avg\": 72.50744751915564362886913352, \"symbol\": \"mtgoxGBP\", \"low\": 67.024540000000}, {\"high\": null, \"latest_trade\": 1318792662, \"bid\": null, \"volume\": 0, \"currency\": \"GBP\", \"currency_volume\": 0, \"ask\": null, \"close\": 2.500000000000, \"avg\": null, \"symbol\": \"ruxumGBP\", \"low\": null}, {\"high\": null, \"latest_trade\": 1367641943, \"bid\": 870.845790000000, \"volume\": 0, \"currency\": \"HKD\", \"currency_volume\": 0, \"ask\": 908.342030000000, \"close\": 731.256220000000, \"avg\": null, \"symbol\": \"mtgoxHKD\", \"low\": null}, {\"high\": null, \"latest_trade\": 1318797312, \"bid\": 6.120000000000, \"volume\": 0, \"currency\": \"HKD\", \"currency_volume\": 0, \"ask\": null, \"close\": 29.000000000000, \"avg\": null, \"symbol\": \"ruxumHKD\", \"low\": null}, {\"high\": null, \"latest_trade\": 1319836324, \"bid\": 79.000000000000, \"volume\": 0, \"currency\": \"HUF\", \"currency_volume\": 0, \"ask\": null, \"close\": 79.000000000000, \"avg\": null, \"symbol\": \"ruxumHUF\", \"low\": null}, {\"high\": 458.000000000000, \"latest_trade\": 1368640755, \"bid\": 435.000000000000, \"volume\": 3.047700000000, \"currency\": \"ILS\", \"currency_volume\": 1375.723400000000, \"ask\": 470.000000000000, \"close\": 450.000000000000, \"avg\": 451.3972503855366341831545100, \"symbol\": \"bit2cILS\", \"low\": 442.000000000000}, {\"high\": null, \"latest_trade\": 1327901200, \"bid\": null, \"volume\": 0, \"currency\": \"INR\", \"currency_volume\": 0, \"ask\": null, \"close\": 318.000000000000, \"avg\": null, \"symbol\": \"thINR\", \"low\": null}, {\"high\": null, \"latest_trade\": 1299369401, \"bid\": null, \"volume\": 0, \"currency\": \"JPY\", \"currency_volume\": 0, \"ask\": null, \"close\": 1.000000000000, \"avg\": null, \"symbol\": \"btcexJPY\", \"low\": null}, {\"high\": 12154.000000000000, \"latest_trade\": 1368634995, \"bid\": 11419.772000000000, \"volume\": 965.454967320000, \"currency\": \"JPY\", \"currency_volume\": 10725193.509511049300, \"ask\": 11892.872000000000, \"close\": 11923.963000000000, \"avg\": 11108.95264155410829711199295, \"symbol\": \"mtgoxJPY\", \"low\": 10432.209000000000}, {\"high\": null, \"latest_trade\": 1319028730, \"bid\": 210.000000000000, \"volume\": 0, \"currency\": \"JPY\", \"currency_volume\": 0, \"ask\": null, \"close\": 210.000000000000, \"avg\": null, \"symbol\": \"ruxumJPY\", \"low\": null}, {\"high\": 140.000000000000, \"latest_trade\": 1368583352, \"bid\": 130.000000000000, \"volume\": 20.445621470000, \"currency\": \"NZD\", \"currency_volume\": 2746.063977434800, \"ask\": 139.990000000000, \"close\": 122.000000000000, \"avg\": 134.3106142048124301892399263, \"symbol\": \"bitnzNZD\", \"low\": 122.000000000000}, {\"high\": null, \"latest_trade\": 1367902806, \"bid\": 136.230140000000, \"volume\": 0, \"currency\": \"NZD\", \"currency_volume\": 0, \"ask\": 140.016340000000, \"close\": 125.000000000000, \"avg\": null, \"symbol\": \"mtgoxNZD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1319837979, \"bid\": null, \"high\": null, \"currency\": \"PLN\", \"currency_volume\": 0, \"ask\": null, \"close\": 10.000000000000, \"avg\": null, \"symbol\": \"bitchangePLN\", \"low\": null}, {\"volume\": 1145.044096460000, \"latest_trade\": 1368645172, \"bid\": 331.000000000000, \"high\": 364.000000000000, \"currency\": \"PLN\", \"currency_volume\": 385334.860255731300, \"ask\": 335.000000000000, \"close\": 335.000000000000, \"avg\": 336.5240355782160581822873424, \"symbol\": \"bitcurexPLN\", \"low\": 327.000000000000}, {\"volume\": 0, \"latest_trade\": 1361000593, \"bid\": null, \"high\": null, \"currency\": \"PLN\", \"currency_volume\": 0, \"ask\": null, \"close\": 80.000000000000, \"avg\": null, \"symbol\": \"bitmarketPLN\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1313056551, \"bid\": null, \"high\": null, \"currency\": \"PLN\", \"currency_volume\": 0, \"ask\": null, \"close\": 29.200000000000, \"avg\": null, \"symbol\": \"bitomatPLN\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1315073674, \"bid\": null, \"high\": null, \"currency\": \"PLN\", \"currency_volume\": 0, \"ask\": null, \"close\": 25.000000000000, \"avg\": null, \"symbol\": \"freshPLN\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1325440070, \"bid\": null, \"high\": null, \"currency\": \"PLN\", \"currency_volume\": 0, \"ask\": null, \"close\": 15.820000000000, \"avg\": null, \"symbol\": \"globalPLN\", \"low\": null}, {\"high\": 352.237410000000, \"latest_trade\": 1368567230, \"bid\": 343.466670000000, \"volume\": 30.911600000000, \"currency\": \"PLN\", \"currency_volume\": 10888.221347348000, \"ask\": 382.000000000000, \"close\": 352.237390000000, \"avg\": 352.2373913788998304843489176, \"symbol\": \"intrsngPLN\", \"low\": 352.237390000000}, {\"high\": 379.850000000000, \"latest_trade\": 1368644677, \"bid\": 365.000000000000, \"volume\": 649.409824170000, \"currency\": \"PLN\", \"currency_volume\": 232640.690767588336, \"ask\": 368.000000000000, \"close\": 365.000000000000, \"avg\": 358.2340181947856595820244904, \"symbol\": \"mtgoxPLN\", \"low\": 335.000000000000}, {\"volume\": 0, \"latest_trade\": 1318577499, \"bid\": null, \"high\": null, \"currency\": \"PLN\", \"currency_volume\": 0, \"ask\": null, \"close\": 13.500000000000, \"avg\": null, \"symbol\": \"ruxumPLN\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1319445325, \"bid\": null, \"high\": null, \"currency\": \"RUB\", \"currency_volume\": 0, \"ask\": null, \"close\": 300.000000000000, \"avg\": null, \"symbol\": \"bitmarketRUB\", \"low\": null}, {\"volume\": 1134.497134360000, \"latest_trade\": 1368645291, \"bid\": 3271.010000000000, \"high\": 3500.000000000000, \"currency\": \"RUB\", \"currency_volume\": 3807640.097783886900, \"ask\": 3366.929880000000, \"close\": 3321.110000000000, \"avg\": 3356.235976683958681903355848, \"symbol\": \"btceRUR\", \"low\": 3120.000000000000}, {\"volume\": 0, \"latest_trade\": 1305230002, \"bid\": null, \"high\": null, \"currency\": \"RUB\", \"currency_volume\": 0, \"ask\": null, \"close\": 199.000000000000, \"avg\": null, \"symbol\": \"btcexRUB\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1306059105, \"bid\": null, \"high\": null, \"currency\": \"RUB\", \"currency_volume\": 0, \"ask\": null, \"close\": 155.000000000000, \"avg\": null, \"symbol\": \"btcexWMR\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1305229968, \"bid\": null, \"high\": null, \"currency\": \"RUB\", \"currency_volume\": 0, \"ask\": null, \"close\": 132.000100000000, \"avg\": null, \"symbol\": \"btcexYAD\", \"low\": null}, {\"volume\": 16.724000000000, \"latest_trade\": 1368628031, \"bid\": 3488.561840000000, \"high\": 3491.312400000000, \"currency\": \"RUB\", \"currency_volume\": 58231.215328200000, \"ask\": 3613.482440000000, \"close\": 3488.255810000000, \"avg\": 3481.895200203300645778521885, \"symbol\": \"mtgoxRUB\", \"low\": 3350.000000000000}, {\"high\": null, \"latest_trade\": 1319202603, \"bid\": null, \"volume\": 0, \"currency\": \"RUB\", \"currency_volume\": 0, \"ask\": 195.000000000000, \"close\": 195.000000000000, \"avg\": null, \"symbol\": \"ruxumRUB\", \"low\": null}, {\"volume\": 242.197222860000, \"latest_trade\": 1368645196, \"bid\": 775.000000000000, \"high\": 830.000000000000, \"currency\": \"SEK\", \"currency_volume\": 191144.583858699373, \"ask\": 807.000000000000, \"close\": 809.000000000000, \"avg\": 789.2104690613601241356529401, \"symbol\": \"kptnSEK\", \"low\": 730.000000000000}, {\"high\": null, \"latest_trade\": 1368198097, \"bid\": 749.330000000000, \"volume\": 0, \"currency\": \"SEK\", \"currency_volume\": 0, \"ask\": 778.193000000000, \"close\": 789.648000000000, \"avg\": null, \"symbol\": \"mtgoxSEK\", \"low\": null}, {\"high\": null, \"latest_trade\": 1319028697, \"bid\": null, \"volume\": 0, \"currency\": \"SEK\", \"currency_volume\": 0, \"ask\": 35.000000000000, \"close\": 20.000000000000, \"avg\": null, \"symbol\": \"ruxumSEK\", \"low\": null}, {\"high\": 140.000000000000, \"latest_trade\": 1368580840, \"bid\": 133.450000000000, \"volume\": 0.697535710000, \"currency\": \"SGD\", \"currency_volume\": 97.654999400000, \"ask\": 146.450000000000, \"close\": 140.000000000000, \"avg\": 140, \"symbol\": \"fybsgSGD\", \"low\": 140.000000000000}, {\"high\": null, \"latest_trade\": 1367636162, \"bid\": 139.264780000000, \"volume\": 0, \"currency\": \"SGD\", \"currency_volume\": 0, \"ask\": 143.135310000000, \"close\": 121.239580000000, \"avg\": null, \"symbol\": \"mtgoxSGD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1318789490, \"bid\": null, \"high\": null, \"currency\": \"SGD\", \"currency_volume\": 0, \"ask\": null, \"close\": 5.200000000000, \"avg\": null, \"symbol\": \"ruxumSGD\", \"low\": null}, {\"high\": null, \"latest_trade\": 1367946564, \"bid\": 18050.000000000000, \"volume\": 0, \"currency\": \"SLL\", \"currency_volume\": 0, \"ask\": 39700.000000000000, \"close\": 30000.000000000000, \"avg\": null, \"symbol\": \"rockSLL\", \"low\": null}, {\"high\": 35450.000000000000, \"latest_trade\": 1368645095, \"bid\": 31108.000000000000, \"volume\": 578.250000000000, \"currency\": \"SLL\", \"currency_volume\": 18860249.630000000000, \"ask\": 32196.000000000000, \"close\": 32196.000000000000, \"avg\": 32616.08236921746649373108517, \"symbol\": \"virwoxSLL\", \"low\": 31050.000000000000}, {\"volume\": 0, \"latest_trade\": 1367696676, \"bid\": 3349.866870000000, \"high\": null, \"currency\": \"THB\", \"currency_volume\": 0, \"ask\": 3425.988330000000, \"close\": 3242.240000000000, \"avg\": null, \"symbol\": \"mtgoxTHB\", \"low\": null}, {\"high\": null, \"latest_trade\": 1318519297, \"bid\": null, \"volume\": 0, \"currency\": \"THB\", \"currency_volume\": 0, \"ask\": 345.000000000000, \"close\": 135.000000000000, \"avg\": null, \"symbol\": \"ruxumTHB\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1318793596, \"bid\": null, \"high\": null, \"currency\": \"UAH\", \"currency_volume\": 0, \"ask\": null, \"close\": 30.000000000000, \"avg\": null, \"symbol\": \"ruxumUAH\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1327176610, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 6.500000000000, \"avg\": null, \"symbol\": \"b2cUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1317843215, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 4.750000000000, \"avg\": null, \"symbol\": \"b7USD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1312592486, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 15.000000000000, \"avg\": null, \"symbol\": \"bcmBMUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1312408747, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 11.000000000000, \"avg\": null, \"symbol\": \"bcmLRUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1313715228, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 10.000000000000, \"avg\": null, \"symbol\": \"bcmMBUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1307246798, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 23.500000000000, \"avg\": null, \"symbol\": \"bcmPPUSD\", \"low\": null}, {\"high\": 124.998000000000, \"latest_trade\": 1368592625, \"bid\": 103.000000000000, \"volume\": 25.592000000000, \"currency\": \"USD\", \"currency_volume\": 2719.537500000000, \"ask\": 140.000000000000, \"close\": 124.998000000000, \"avg\": 106.2651414504532666458268209, \"symbol\": \"bitboxUSD\", \"low\": 104.000000000000}, {\"volume\": 0, \"latest_trade\": 1366236000, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 100.000000000000, \"avg\": null, \"symbol\": \"bitfloorUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1356047578, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 14.000000000000, \"avg\": null, \"symbol\": \"bitmarketUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1364508415, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 86.000000000000, \"avg\": null, \"symbol\": \"bitmeUSD\", \"low\": null}, {\"volume\": 16504.077521020000, \"latest_trade\": 1368645252, \"bid\": 108.950000000000, \"high\": 117.480000000000, \"currency\": \"USD\", \"currency_volume\": 1821024.417777971600, \"ask\": 109.350000000000, \"close\": 109.350000000000, \"avg\": 110.3378492653509418167918324, \"symbol\": \"bitstampUSD\", \"low\": 101.720000000000}, {\"volume\": 0, \"latest_trade\": 1365846822, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 73.000000000000, \"avg\": null, \"symbol\": \"btc24USD\", \"low\": null}, {\"volume\": 14155.463356250000, \"latest_trade\": 1368645292, \"bid\": 103.660000000000, \"high\": 114.000000000000, \"currency\": \"USD\", \"currency_volume\": 1501405.220780045320, \"ask\": 104.199000000000, \"close\": 103.750000000000, \"avg\": 106.0654238575056196158064919, \"symbol\": \"btceUSD\", \"low\": 97.010000000000}, {\"volume\": 0, \"latest_trade\": 1342942225, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 6.801100000000, \"avg\": null, \"symbol\": \"btcexUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1305094318, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 5.100000000000, \"avg\": null, \"symbol\": \"btcexWMZ\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1341981899, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 6.470000000000, \"avg\": null, \"symbol\": \"btctreeUSD\", \"low\": null}, {\"volume\": 1921.500655200000, \"latest_trade\": 1368645184, \"bid\": 110.000000000000, \"high\": 119.000000000000, \"currency\": \"USD\", \"currency_volume\": 210369.427627252900, \"ask\": 109.700000000000, \"close\": 109.700000000000, \"avg\": 109.4818401742134883452107396, \"symbol\": \"cbxUSD\", \"low\": 104.000000000000}, {\"volume\": 0, \"latest_trade\": 1353314729, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 13.350000000000, \"avg\": null, \"symbol\": \"cryptoxUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1318805936, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 3.639900000000, \"avg\": null, \"symbol\": \"exchbUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1318013969, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 4.700000000000, \"avg\": null, \"symbol\": \"globalUSD\", \"low\": null}, {\"high\": 108.000000000000, \"latest_trade\": 1368554458, \"bid\": 113.000000000000, \"volume\": 0.746261940000, \"currency\": \"USD\", \"currency_volume\": 75.827278559400, \"ask\": 115.000000000000, \"close\": 101.010000000000, \"avg\": 101.6094677954499461676954877, \"symbol\": \"icbitUSD\", \"low\": 101.010000000000}, {\"volume\": 0, \"latest_trade\": 1350223254, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 19.999140620000, \"avg\": null, \"symbol\": \"imcexUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1350761253, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 11.900000000000, \"avg\": null, \"symbol\": \"intrsngUSD\", \"low\": null}, {\"high\": 125.000000000000, \"latest_trade\": 1368639782, \"bid\": 95.000000000000, \"volume\": 0.214960000000, \"currency\": \"USD\", \"currency_volume\": 26.870000000000, \"ask\": 125.000000000000, \"close\": 125.000000000000, \"avg\": 125, \"symbol\": \"lybitUSD\", \"low\": 125.000000000000}, {\"volume\": 174877.969939880000, \"latest_trade\": 1368645195, \"bid\": 113.995010000000, \"high\": 119.350000000000, \"currency\": \"USD\", \"currency_volume\": 19477037.049452416606, \"ask\": 114.000000000000, \"close\": 112.750000000000, \"avg\": 111.3750179976830854567942840, \"symbol\": \"mtgoxUSD\", \"low\": 103.018470000000}, {\"high\": 105.000000000000, \"latest_trade\": 1368594810, \"bid\": 101.000000000000, \"volume\": 4.604807820000, \"currency\": \"USD\", \"currency_volume\": 480.900015206400, \"ask\": 115.000000000000, \"close\": 105.000000000000, \"avg\": 104.4343290761697846491235328, \"symbol\": \"rippleUSD\", \"low\": 104.000000000000}, {\"high\": null, \"latest_trade\": 1368397961, \"bid\": 110.000000000000, \"volume\": 0, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": 119.990000000000, \"close\": 110.000000000000, \"avg\": null, \"symbol\": \"rockUSD\", \"low\": null}, {\"high\": null, \"latest_trade\": 1347450254, \"bid\": 50.000000000000, \"volume\": 0, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": 15.000000000000, \"close\": 14.750010000000, \"avg\": null, \"symbol\": \"ruxumUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1329154248, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 4.350275241100, \"avg\": null, \"symbol\": \"thLRUSD\", \"low\": null}, {\"volume\": 0, \"latest_trade\": 1329172006, \"bid\": null, \"high\": null, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": null, \"close\": 5.590000000000, \"avg\": null, \"symbol\": \"thUSD\", \"low\": null}, {\"high\": 122.890000000000, \"latest_trade\": 1368644079, \"bid\": 106.000000000000, \"volume\": 197.949392680000, \"currency\": \"USD\", \"currency_volume\": 21848.824371616811, \"ask\": 113.599999700000, \"close\": 106.000000000000, \"avg\": 110.3758090682150760716342502, \"symbol\": \"vcxUSD\", \"low\": 102.000000000000}, {\"high\": null, \"latest_trade\": 1368459761, \"bid\": 105.000000000000, \"volume\": 0, \"currency\": \"USD\", \"currency_volume\": 0, \"ask\": 120.000000000000, \"close\": 100.000000000000, \"avg\": null, \"symbol\": \"weexUSD\", \"low\": null}, {\"high\": 9478.799999940000, \"latest_trade\": 1368644170, \"bid\": 8450.000000000000, \"volume\": 337.231323370000, \"currency\": \"XRP\", \"currency_volume\": 2900329.743587189478, \"ask\": 8749.999999000000, \"close\": 8888.000000000000, \"avg\": 8600.416220544956544260172649, \"symbol\": \"rippleXRP\", \"low\": 7800.000000000000}, {\"volume\": 0, \"latest_trade\": 1367998202, \"bid\": 7065.000000000000, \"high\": null, \"currency\": \"XRP\", \"currency_volume\": 0, \"ask\": 8635.000000000000, \"close\": 8999.000000000000, \"avg\": null, \"symbol\": \"snwcnXRP\", \"low\": null}, {\"high\": null, \"latest_trade\": 1319028662, \"bid\": null, \"volume\": 0, \"currency\": \"ZAR\", \"currency_volume\": 0, \"ask\": 41.000000000000, \"close\": 25.000000000000, \"avg\": null, \"symbol\": \"ruxumZAR\", \"low\": null}]";
		JsonElement element = INSTANCE.loadDataFromJson(json);
		List<String> markets = new ArrayList<String>();
		Iterator<JsonElement> array = element.getAsJsonArray().iterator();
		while (array.hasNext()) {
			JsonElement e	= array.next();
			JsonObject obj	= e.getAsJsonObject();
			String symbol	= obj.get("symbol").getAsString();
			String currency = obj.get("currency").getAsString();
			String market	= symbol.replace(currency, "");
			if (!markets.contains(market)) {
				markets.add(market);
				System.out.println(market);
			}
		}
	}
	
	public String dumpJsonFeed(JsonElement json) {
		return json.toString();
	}

	public MTGoxCmd buildMtGoxRequest(HttpMethod method, String command, List<Property> properties, String apiKey, String secretKey) {
		MtgoxFactory factory = MtgoxFactory.eINSTANCE;
		
		MTGoxCmd cmd = factory.createMTGoxCmd();
		
		cmd.setMethod(method);
		cmd.getProperties().addAll(properties);
		cmd.setCommand(command);
		
		cmd.getProperties().add(MTGoxUtils.INSTANCE.createProperty("key", apiKey));
		cmd.getProperties().add(MTGoxUtils.INSTANCE.createProperty("secretKey", secretKey));

		return cmd;
	}
	
	public Property createProperty(String key, String... value) {
		Property property = HttpcmdFactory.eINSTANCE.createProperty();
		property.setKey(key);
		String pValues = "";
		for (String v : value) {
			pValues += v + ",";
		}
		property.setValue(pValues.substring(0, pValues.length()-1));
		return property;
	}
	
	public Cmd createMtGoxMoneyDepthFetch(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.GET, 
			"/2/"+btc1.getLiteral()+btc2.getLiteral()+"/money/depth/fetch", 
			new ArrayList<Property>(), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxMoneyDepthFull(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.GET, 
			"/2/"+btc1.getLiteral()+btc2.getLiteral()+"/money/depth/full", 
			new ArrayList<Property>(), 
			apiKey,
			secretKey
		);
	}

	public Cmd createMtGoxV1MoneyInfo(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/1/generic/info", 
			Arrays.asList(new Property[]{}), 
			apiKey,
			secretKey
		);
	}

	public Cmd createMtV2GoxMoneyInfo(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/2/"+btc1.getLiteral()+btc2.getLiteral()+"/money/info", 
			Arrays.asList(new Property[]{}), 
			apiKey,
			secretKey
		);
	}

	public Cmd createMtGoxMoneyTradesFetch(BtcCurrency btc1, BtcCurrency btc2, String date, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.GET, 
			"/2/"+btc1.getLiteral()+btc2.getLiteral()+"/money/trades/fetch", //+("0".equals(date)?"?since=0":"?since="+date), 
			new ArrayList<Property>(), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxGenericOrders(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/1/generic/orders", 
			new ArrayList<Property>(), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxWalletHistory(BtcCurrency btc, String apiKey, String secretKey) {
		Property p = HttpcmdFactory.eINSTANCE.createProperty();
		p.setKey("currency");
		p.setValue(btc.getLiteral());
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/1/generic/wallet/history", 
			Arrays.asList(new Property[]{p}), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxTicker(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.GET, 
			"/1/"+btc1.getLiteral()+btc2.getLiteral()+"/money/ticker", 
			new ArrayList<Property>(), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxGetPrivateKey(BtcCurrency btc1, BtcCurrency btc2, String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/1/generic/private/idkey", 
			Arrays.asList(new Property[]{}), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxAddOrder(BtcCurrency btc1, BtcCurrency btc2, String type, float amount, float price, String apiKey, String secretKey) {
		Property p1 = HttpcmdFactory.eINSTANCE.createProperty();
		p1.setKey("type");
		p1.setValue(type);
		Property p2 = HttpcmdFactory.eINSTANCE.createProperty();
		p2.setKey("amount_int");
		p2.setValue(""+amount*100000000);
		Property p3 = HttpcmdFactory.eINSTANCE.createProperty();
		p3.setKey("price_int");
		p3.setValue(""+price*100000);
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/1/"+btc1.getLiteral()+btc2.getLiteral()+"/private/order/add", 
			Arrays.asList(new Property[]{p1, p2, p3}), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxCancelOrder(BtcCurrency btc1, BtcCurrency btc2, String oid, String apiKey, String secretKey) {
		Property p = HttpcmdFactory.eINSTANCE.createProperty();
		p.setKey("oid");
		p.setValue(oid);
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/1/"+btc1.getLiteral()+btc2.getLiteral()+"/private/order/cancel", 
			Arrays.asList(new Property[]{p}), 
			apiKey,
			secretKey
		);
	}
	
	public Cmd createMtGoxBitcoinAddr(String apiKey, String secretKey) {
		return buildMtGoxRequest(
			HttpMethod.POST, 
			"/generic/bitcoin/address", 
			new ArrayList<Property>(), 
			apiKey,
			secretKey
		);
	}
	
}
