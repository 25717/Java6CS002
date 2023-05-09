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
		
		System.out.println("Getting specialised web version.");
		System.out.println("Wait a couple of moments");
		System.out.println("Connecting");
		System.out.println("Ready to play");
	} 
	//^^ The above method calls the other methods in sequence to carry out the steps that is necessary to connect to the web service.


}
