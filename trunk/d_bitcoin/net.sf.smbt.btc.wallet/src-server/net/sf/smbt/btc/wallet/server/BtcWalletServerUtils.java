package net.sf.smbt.btc.wallet.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class BtcWalletServerUtils {
	
	public final static BtcWalletServerUtils INSTANCE = new BtcWalletServerUtils();
	
	public void deployWallet(String portID, String command, File file) {
	    	String query = portID + command;

			boolean verbose = true;
			boolean requestFailed = false;

			HttpResponse response;
	    	HttpEntity entity;
	    	HttpClient httpclient = new DefaultHttpClient();

	    	try {
		        InputStreamEntity reqEntity = new InputStreamEntity(new FileInputStream(file), -1);
		        reqEntity.setContentType("application/wallet");
		        reqEntity.setChunked(true);
		        

				HttpPost httpput = new HttpPost(query);
				httpput.setEntity(reqEntity);

				if (verbose) {
					System.out.println("-------- open ubibot connection --------");
					System.out.println("executing request: " + httpput.getURI());
				}
				
				response = httpclient.execute(httpput); // execute this mother
				entity = response.getEntity();
				
				String ubiResponse = "";
				String statusLine = response.getStatusLine().toString() + "\n";
				String delims = "[ ]+";
				String[] tokens = statusLine.split(delims);

				if (tokens[1].equals("200")) { // success
					System.out.println("\nserver response:");
					System.out.println(statusLine);
					ubiResponse = EntityUtils.toString(entity);
				} else { // bad request
					System.out.println("\nbad request. status code: \n");
					System.out.println(statusLine);
					System.out.println("check the HTTP status codes");
					ubiResponse = EntityUtils.toString(entity) + "\n\n";
					Header[] respHeader;
					respHeader = response.getAllHeaders();
					for (int i = 0; i < respHeader.length; i++) {
						ubiResponse += respHeader[i].toString() + "\n";
					}
					if (verbose)
						System.out.print(ubiResponse);
						requestFailed = true;
						// "***failed request***";
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// shut down the connection manager to ensure
					// immediate deallocation of all system resources
					httpclient.getConnectionManager().shutdown();
					if (verbose) {
						System.out.println("----------- connection closed ----------\n");
					}
				}
		}
	}
