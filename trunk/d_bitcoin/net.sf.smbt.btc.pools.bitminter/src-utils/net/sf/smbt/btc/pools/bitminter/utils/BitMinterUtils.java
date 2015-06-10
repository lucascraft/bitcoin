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

package net.sf.smbt.btc.pools.bitminter.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import net.sf.smbt.btc.genericpools.GenericpoolsPackage;
import net.sf.smbt.btc.pools.bitminter.Balance;
import net.sf.smbt.btc.pools.bitminter.BitMinterConfig;
import net.sf.smbt.btc.pools.bitminter.BitminterFactory;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.Chain;
import net.sf.smbt.btc.pools.bitminter.PoolRound;
import net.sf.smbt.btc.pools.bitminter.PoolStats;
import net.sf.smbt.btc.pools.bitminter.RoundStart;
import net.sf.smbt.btc.pools.bitminter.Shift;
import net.sf.smbt.btc.pools.bitminter.UserData;
import net.sf.smbt.btc.pools.bitminter.Work;
import net.sf.smbt.btc.pools.bitminter.Worker;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class BitMinterUtils {
	
	public final static BitMinterUtils INSTANCE = new BitMinterUtils();
	
	
	
	//
	//
	// URI Resource load/save
	//
	//

	public void save(IEditorInput uriInput, BitMinterConfig project) {
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
	public BitMinterConfig load(IEditorInput uriInput) {
		TemporalPackage		p0	= TemporalPackage.eINSTANCE;
		GenericpoolsPackage	p1	= GenericpoolsPackage.eINSTANCE;
		BitminterPackage	p2	= BitminterPackage.eINSTANCE;
		
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSetImpl.getResource(uri, true);
				resource.load(new HashMap<Object, Object>());
				return (BitMinterConfig) resource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public BitMinterConfig createDefaultBitMinterConfig() {
		BitMinterConfig bitMinterConfig = BitminterFactory.eINSTANCE.createBitMinterConfig();
		return bitMinterConfig;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void handlePoolStats(BitMinterConfig bitMinterProject, JsonObject jsonPoolStats) {
		PoolStats stats = bitMinterProject.getStats();
		
		if (stats == null) {
			stats = BitminterFactory.eINSTANCE.createPoolStats();
			bitMinterProject.setStats(stats);
		}

		JsonElement eActiveUsers	= jsonPoolStats.get("active_users");
		JsonElement eActiveWorkers 	= jsonPoolStats.get("active_workers");
		JsonElement eHashRate 		= jsonPoolStats.get("hash_rate");

		stats.setActiveUsers(eActiveUsers.getAsInt());
		stats.setActiveWorkers(eActiveWorkers.getAsInt());
		stats.setHashRate(eHashRate.getAsFloat());
	}

	public void handlePoolRound(BitMinterConfig bitMinterProject, JsonObject jsonPoolRound) {
		PoolRound round = bitMinterProject.getRound();
		
		if (round == null) {
			round = BitminterFactory.eINSTANCE.createPoolRound();
			bitMinterProject.setRound(round);
		}
		
		JsonElement eActiveUsers	= jsonPoolRound.get("active_users");
		JsonElement eActiveWorkers 	= jsonPoolRound.get("active_workers");
		JsonElement eHashRate 		= jsonPoolRound.get("hash_rate");
		JsonElement eShiftAccepted	= jsonPoolRound.get("shift_accepted");
		JsonElement eShiftDuration	= jsonPoolRound.get("shift_duration");
		JsonElement eShiftRejected	= jsonPoolRound.get("shift_rejected");
		JsonElement eShiftScore		= jsonPoolRound.get("shift_score");
		
		round.setActiveUsers(eActiveUsers.getAsInt());
		round.setActiveWorkers(eActiveWorkers.getAsInt());
		round.setHashRate(eHashRate.getAsFloat());
		round.setShiftAccepted(eShiftAccepted.getAsInt());
		round.setShiftDuration(eShiftDuration.getAsInt());
		round.setShiftRejected(eShiftRejected.getAsInt());
		round.setShiftScore(eShiftScore.getAsFloat());
		
		JsonObject eChains	= jsonPoolRound.get("chains").getAsJsonObject();

		Chain btc = BitminterFactory.eINSTANCE.createChain();
		Chain nmc = BitminterFactory.eINSTANCE.createChain();
		round.getChains().add(btc);
		round.getChains().add(nmc);

		JsonObject eBTC = eChains.get("BTC").getAsJsonObject();
		JsonObject eNMC = eChains.get("NMC").getAsJsonObject();
		
		btc.setId("BTC");
		btc.setAccepted(eBTC.get("accepted").getAsLong());
		btc.setRejected(eBTC.get("rejected").getAsLong());
		btc.setDifficulty(eBTC.get("difficulty").getAsFloat());
		btc.setDuration(eBTC.get("duration").getAsLong());
		
		nmc.setId("NMC");
		nmc.setAccepted(eNMC.get("accepted").getAsLong());
		nmc.setRejected(eNMC.get("rejected").getAsLong());
		nmc.setDifficulty(eNMC.get("difficulty").getAsFloat());
		nmc.setDuration(eNMC.get("duration").getAsLong());
		
	}
	
	public void handleUserData(BitMinterConfig bitMinterProject, JsonObject jsonUserData) {
		UserData data = bitMinterProject.getData();
		
		if (data == null) {
			data = BitminterFactory.eINSTANCE.createUserData();
			bitMinterProject.setData(data);
		}

		JsonElement eHashRate		= jsonUserData.get("hash_rate");
		JsonElement eActiveWorkers 	= jsonUserData.get("active_workers");
		JsonElement eNow	 		= jsonUserData.get("now");

		
		data.setActiveWorkers(eActiveWorkers.getAsInt());
		data.setHashRate(eHashRate.getAsFloat());
		data.setNow(eNow.getAsLong());
		
		// Shift
		
		Shift shift = data.getShift();
		
		if (shift == null) {
			shift = BitminterFactory.eINSTANCE.createShift();
			data.setShift(shift);
		}

		JsonObject jShift = jsonUserData.get("shift").getAsJsonObject();
		
		JsonElement eAccepted		= jShift.get("accepted");
		JsonElement eStart			= jShift.get("start");
		JsonElement eTotalScore		= jShift.get("total_score");
		JsonElement eUserScore		= jShift.get("user_score");
		
		shift.setAccepted(eAccepted.getAsInt());
		shift.setStart(eStart.getAsLong());
		shift.setTotal_score(eTotalScore.getAsFloat());
		shift.setUser_score(eUserScore.getAsFloat());
		
		
		// Round
		
		RoundStart btcRoundStart = BitminterFactory.eINSTANCE.createRoundStart();
		RoundStart nmcRoundStart = BitminterFactory.eINSTANCE.createRoundStart();
		
		
		JsonObject roundStart = jsonUserData.get("round_start").getAsJsonObject();
		
	
		btcRoundStart.setChainID("BTC");
		btcRoundStart.setShift(roundStart.get("BTC").getAsInt());


		nmcRoundStart.setChainID("NMC");
		nmcRoundStart.setShift(roundStart.get("NMC").getAsInt());

		if (data.getRoundStarts().size()!=2) {
			data.getRoundStarts().add(btcRoundStart);
			data.getRoundStarts().add(nmcRoundStart);
		}
		
		// Balance
		
		Balance btcBalance = BitminterFactory.eINSTANCE.createBalance();
		Balance nmcBalance = BitminterFactory.eINSTANCE.createBalance();
		
		if (data.getBalances().size()!=2) {
			data.getBalances().add(btcBalance);
			data.getBalances().add(nmcBalance);
		}
		
		JsonObject balances = jsonUserData.get("balances").getAsJsonObject();

		btcBalance.setBalance(balances.get("BTC").getAsFloat());
		btcBalance.setChainID("BTC");
		
		nmcBalance.setBalance(balances.get("NMC").getAsFloat());
		nmcBalance.setChainID("NMC");
		
		// Workers
		
		JsonArray workers = jsonUserData.get("workers").getAsJsonArray();
		
		Iterator<JsonElement> itWorkers = workers.iterator();
		while(itWorkers.hasNext()) {
			JsonObject worker = itWorkers.next().getAsJsonObject();
			
			Worker w = BitminterFactory.eINSTANCE.createWorker();
			
			String workerName = worker.get("name").getAsString();
			
			boolean workerExists = false;
			for (Worker wrk : data.getWorkers()) {
				if (wrk.getName().equals(workerName)) {
					w = wrk;
					workerExists = true;
					break;
				}
			}
			
			if (!workerExists) {
				data.getWorkers().add(w);
			}
			
			//w.setAlive(Boolworker.get("alive"));
			w.setHashRate(worker.get("hash_rate").getAsFloat());
			w.setLastWork(worker.get("last_work").getAsLong());
			w.setName(workerName);
			
			
			JsonObject works = worker.get("work").getAsJsonObject();
			
				
				
			JsonObject eBTC = works.get("BTC").getAsJsonObject();
			
			JsonElement eBTCCPAccepted		= eBTC.get("checkpoint_accepted");
			JsonElement eBTCCPRejected 		= eBTC.get("checkpoint_rejected");
			JsonElement eBTCRoundAccepted	= eBTC.get("round_accepted");
			JsonElement eBTCRoundRejected 	= eBTC.get("round_rejected");
			JsonElement eBTCTotalAccepted	= eBTC.get("total_accepted");
			JsonElement eBTCTotalRejected 	= eBTC.get("total_rejected");

			Work wBTC = BitminterFactory.eINSTANCE.createWork();

			boolean btcWorkExists = false;
			for (Work wo : w.getWorks()) {
				if (wo.getChainID().equals("BTC")) {
					btcWorkExists = true;
					wBTC = wo;
					break;
				}
			}
			
			if(!btcWorkExists) {
				w.getWorks().add(wBTC);
			}
				
			wBTC.setChainID("BTC");
			wBTC.setCheckPointAccepted(eBTCCPAccepted.getAsLong());
			wBTC.setCheckPointRejected(eBTCCPRejected.getAsLong());
			wBTC.setRoundAccepted(eBTCRoundAccepted.getAsLong());
			wBTC.setRoundRejected(eBTCRoundRejected.getAsLong());
			wBTC.setTotalAccepted(eBTCTotalAccepted.getAsLong());
			wBTC.setTotalRejected(eBTCTotalRejected.getAsLong());
				
				
			Work wNMC = BitminterFactory.eINSTANCE.createWork();

			boolean nmcWorkExists = false;
			for (Work wo : w.getWorks()) {
				if (wo.getChainID().equals("NMC")) {
					nmcWorkExists = true;
					wNMC = wo;
					break;
				}
			}
			
			if(!nmcWorkExists) {
				w.getWorks().add(wNMC);
			}
				

			JsonObject eNMC = works.get("NMC").getAsJsonObject();

			JsonElement eNMCCPAccepted		= eNMC.get("checkpoint_accepted");
			JsonElement eNMCCPRejected 		= eNMC.get("checkpoint_rejected");
			JsonElement eNMCRoundAccepted	= eNMC.get("round_accepted");
			JsonElement eNMCRoundRejected 	= eNMC.get("round_rejected");
			JsonElement eNMCTotalAccepted	= eNMC.get("total_accepted");
			JsonElement eNMCTotalRejected 	= eNMC.get("total_rejected");
				
			wNMC.setChainID("NMC");
			wNMC.setCheckPointAccepted(eNMCCPAccepted.getAsLong());
			wNMC.setCheckPointRejected(eNMCCPRejected.getAsLong());
			wNMC.setRoundAccepted(eNMCRoundAccepted.getAsLong());
			wNMC.setRoundRejected(eNMCRoundRejected.getAsLong());
			wNMC.setTotalAccepted(eNMCTotalAccepted.getAsLong());
			wNMC.setTotalRejected(eNMCTotalRejected.getAsLong());
	
		}
	}
}
