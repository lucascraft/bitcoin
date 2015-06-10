package net.sf.smbt.btc.blockchain.utils;

import java.nio.charset.Charset;

import net.sf.smbt.btc.blockchaincmd.BlockchainCmd;
import net.sf.smbt.btc.blockchaincmd.BlockchaincmdFactory;
import net.sf.smbt.comm.httpcmd.HttpcmdFactory;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.model.cmd.Cmd;

public class BlockchainUtils {
	public final static BlockchainUtils INSTANCE = new BlockchainUtils();
	
	public byte[] dumpCommand(Cmd cmd) {
		if (cmd instanceof BlockchainCmd) {
			BlockchainCmd c = (BlockchainCmd) cmd;
			String url =  "/" + c.getCommand();
			return url.getBytes();
		}
		return new byte[0];
	}
	
	public Cmd handleFrame(byte[] frame) {
		String flux = new String(frame, Charset.forName("UTF-8"));
		BlockchainCmd cmd = BlockchaincmdFactory.eINSTANCE.createBlockchainCmd();
		cmd.setJsonRcv(flux);
		return cmd;
	}
	
	
	public BlockchainCmd createDifficultyCmd() {
		BlockchainCmd cmd = BlockchaincmdFactory.eINSTANCE.createBlockchainCmd();
		
		cmd.setCommand("/fr/charts/difficulty");
		
		Property showDataPoints = HttpcmdFactory.eINSTANCE.createProperty();
		showDataPoints.setKey("showDataPoints");
		showDataPoints.setValue("false");
		
		Property timespan = HttpcmdFactory.eINSTANCE.createProperty();
		timespan.setKey("timespan");
		timespan.setValue("");
		
		Property show_header = HttpcmdFactory.eINSTANCE.createProperty();
		show_header.setKey("show_header");
		show_header.setValue("true");
		
		Property daysAverageString = HttpcmdFactory.eINSTANCE.createProperty();
		daysAverageString.setKey("daysAverageString");
		daysAverageString.setValue("1");
		
		Property scale = HttpcmdFactory.eINSTANCE.createProperty();
		scale.setKey("scale");
		scale.setValue("0");
		
		Property format = HttpcmdFactory.eINSTANCE.createProperty();
		format.setKey("format");
		format.setValue("json");
		
		Property address = HttpcmdFactory.eINSTANCE.createProperty();
		address.setKey("address");
		address.setValue("");
		
		
		cmd.getProperties().add(showDataPoints);
		cmd.getProperties().add(timespan);
		cmd.getProperties().add(show_header);
		cmd.getProperties().add(daysAverageString);
		cmd.getProperties().add(scale);
		cmd.getProperties().add(format);
		cmd.getProperties().add(address);
		
		return cmd;
	}
	
	public BlockchainCmd createHashPowerCmd() {
		BlockchainCmd cmd = BlockchaincmdFactory.eINSTANCE.createBlockchainCmd();
		
		cmd.setCommand("/fr/charts/hash-rate");
		
		Property showDataPoints = HttpcmdFactory.eINSTANCE.createProperty();
		showDataPoints.setKey("showDataPoints");
		showDataPoints.setValue("false");
		
		Property timespan = HttpcmdFactory.eINSTANCE.createProperty();
		timespan.setKey("timespan");
		timespan.setValue("");
		
		Property show_header = HttpcmdFactory.eINSTANCE.createProperty();
		show_header.setKey("show_header");
		show_header.setValue("true");
		
		Property daysAverageString = HttpcmdFactory.eINSTANCE.createProperty();
		daysAverageString.setKey("daysAverageString");
		daysAverageString.setValue("1");
		
//		Property scale = HttpcmdFactory.eINSTANCE.createProperty();
//		scale.setKey("scale");
//		scale.setValue("0");
		
		Property format = HttpcmdFactory.eINSTANCE.createProperty();
		format.setKey("format");
		format.setValue("json");
		
		Property address = HttpcmdFactory.eINSTANCE.createProperty();
		address.setKey("address");
		address.setValue("");
		
		
		cmd.getProperties().add(showDataPoints);
		cmd.getProperties().add(timespan);
		cmd.getProperties().add(show_header);
		cmd.getProperties().add(daysAverageString);
//		cmd.getProperties().add(scale);
		cmd.getProperties().add(format);
		cmd.getProperties().add(address);
		
		return cmd;
	}
	
	public BlockchainCmd createMarketCapCmd() {
		BlockchainCmd cmd = BlockchaincmdFactory.eINSTANCE.createBlockchainCmd();
		cmd.setCommand("/fr/charts/market-cap");
		
		Property showDataPoints = HttpcmdFactory.eINSTANCE.createProperty();
		showDataPoints.setKey("showDataPoints");
		showDataPoints.setValue("false");
		
		Property timespan = HttpcmdFactory.eINSTANCE.createProperty();
		timespan.setKey("timespan");
		timespan.setValue("");
		
		Property show_header = HttpcmdFactory.eINSTANCE.createProperty();
		show_header.setKey("show_header");
		show_header.setValue("true");
		
		Property daysAverageString = HttpcmdFactory.eINSTANCE.createProperty();
		daysAverageString.setKey("daysAverageString");
		daysAverageString.setValue("1");
		
		Property scale = HttpcmdFactory.eINSTANCE.createProperty();
		scale.setKey("scale");
		scale.setValue("0");
		
		Property format = HttpcmdFactory.eINSTANCE.createProperty();
		format.setKey("format");
		format.setValue("json");
		
		Property address = HttpcmdFactory.eINSTANCE.createProperty();
		address.setKey("address");
		address.setValue("");
		
		
		cmd.getProperties().add(showDataPoints);
		cmd.getProperties().add(timespan);
		cmd.getProperties().add(show_header);
		cmd.getProperties().add(daysAverageString);
		cmd.getProperties().add(scale);
		cmd.getProperties().add(format);
		cmd.getProperties().add(address);
		
		return cmd;
	}
	

}
