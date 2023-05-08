package base;

import java.net.InetAddress;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class ConnectionGenius {
/*The class called "ConnectionGenuis" is used to connect to a web service and play a game*/
	private static ConnectionGenius instance = null;
	private InetAddress ipa; //instance variable to hold the IP address

	public ConnectionGenius(InetAddress ipa) {
		this.ipa = ipa;
	}
	
	//Creates and returns the single instance of the class
	public static ConnectionGenius getInstance (InetAddress i) {
		if (instance == null) {
			instance = new ConnectionGenius(i);
		}
		return instance;
	}
	

	public void fireUpGame() {
		
		downloadWebVersion();
		connectToWebService();
		awayWeGo();
	} 
	//^^ The above method calls the other methods in sequence to carry out the steps that is necessary to connect to the web service.

	public void downloadWebVersion() {
		System.out.println("Getting specialised web version.");
		System.out.println("Wait a couple of moments");
	}
	//^^ The above method outputs a message indicating that the game is getting ready

	public void connectToWebService() {
		System.out.println("Connecting");
	}
	//^^ The above method outputs a message saying that it is connecting with the web service

	public void awayWeGo() {
		System.out.println("Ready to play");
	}
	//^^ The above method outputs a message saying that the game is rady to play

}
