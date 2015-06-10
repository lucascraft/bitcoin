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

package net.sf.smbt.btc.pools.utils.getwork;

import java.util.concurrent.LinkedBlockingDeque;

import net.sf.smbt.bfl.bitforce.rev2.cmd.BFLBitForceV2CmdUtils;
import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.BFLCmdKind;
import net.sf.smbt.bitforcev2.OK;
import net.sf.smbt.btc.genericpools.AsicBatchWork;
import net.sf.smbt.btc.genericpools.GenericpoolsFactory;
import net.sf.smbt.btc.pools.getwork.GetworkCmd;
import net.sf.smbt.btc.pools.protocol.getwork.GetWorkProtocolUtils;
import net.sf.smbt.btc.pools.utils.getwork.miner.WorkState;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class GetworkEngine {
	public final static GetworkEngine INSTANCE = new GetworkEngine();
	
	private ComputeWorkStateJob computeWorkStateJob;
	
	private LinkedBlockingDeque<AsicBatchWork> executionQueue;
	private LinkedBlockingDeque<AsicBatchWork> batchQueue;
	private LinkedBlockingDeque<AsicBatchWork> resultQueue;
	
	public class ComputeWorkStateJob extends Job {
		public ComputeWorkStateJob() {
			super("WorkState Computation Job");
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			if (executionQueue.isEmpty() && batchQueue.isEmpty()) {
				cancel();
			} 
			AsicBatchWork ws = executionQueue.poll();
			if (ws != null) {
				batchQueue.add(ws);
			}
			ws = batchQueue.poll();
			if (ws != null) {
				batchWorkStateToDevice(ws);
			}
			schedule();
			return Status.OK_STATUS;
		}
	}
	
	public void batchWorkStateToDevice(AsicBatchWork batch) {
		CmdPipe asicPipe = XCPAddressUtils.INSTANCE.getCmdPipe(
			batch.getAsicDevicePipe(),
			true
		);		
		BFLCmd zdx = BFLBitForceV2CmdUtils.INSTANCE.create(BFLCmdKind.ZDX);
		Cmd cmd = asicPipe.syncSend(zdx);
		if (cmd instanceof OK) {
			BFLCmd zpx = prepareBatch(batch);
			
			asicPipe.send(zpx);
		}
	}
	
	private BFLCmd prepareBatch(AsicBatchWork w) {
		BFLCmd cmd = BFLBitForceV2CmdUtils.INSTANCE.create(BFLCmdKind.ZDX_FULL_RANGE);
		
		w.getData().getData();
		w.getData().getMidstate();
		
		return cmd;
	}

	public LinkedBlockingDeque<AsicBatchWork> getBatchQueue() {
		return batchQueue;
	}
	
	public LinkedBlockingDeque<AsicBatchWork> getExecutionQueue() {
		return executionQueue;
	}
	
	public LinkedBlockingDeque<AsicBatchWork> getResultQueue() {
		return resultQueue;
	}
	
	public GetworkEngine() {
		computeWorkStateJob	= new ComputeWorkStateJob();
		batchQueue	 		= new LinkedBlockingDeque<AsicBatchWork>();
		executionQueue 		= new LinkedBlockingDeque<AsicBatchWork>();
		resultQueue 		= new LinkedBlockingDeque<AsicBatchWork>();
	}
	
	public void handleGetworkCmd(GetworkCmd getworkCmd, XCPAddress asicDeviceAddr) {
		if (getworkCmd.getJsonRcv() != null) {
			JsonElement responseMessage = new JsonParser().parse(getworkCmd.getJsonRcv());
			System.out.println(getworkCmd.getJsonRcv());
			WorkState ws = GetWorkProtocolUtils.INSTANCE.computeWorkState(responseMessage);
			
			AsicBatchWork asicBatch = GenericpoolsFactory.eINSTANCE.createAsicBatchWork();
			asicBatch.setAsicDevicePipe(asicDeviceAddr);
			asicBatch.setData(ws);
			
			try {
				executionQueue.putLast(asicBatch);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (!executionQueue.isEmpty()) {
				computeWorkStateJob.schedule();
			}
		}
	}
}
