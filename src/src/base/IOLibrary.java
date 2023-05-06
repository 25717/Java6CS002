package base;

import java.io.*;
import java.net.*;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public final class IOLibrary {
	/** reads a line of text from the standard input and returns it as a string */
	public static String getString() {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in)); //"BufferedReader" object that wraps the standard input stream
		do {
			try {
				return r.readLine();
			} catch (Exception e) {
			}
		} while (true);
	}

	/**  reads a line of text from the standard input and returns it as an "InetAddress" object*/
	public static InetAddress getIPAddress() {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				String[] chunks = r.readLine().split("\\.");
				byte[] data = { Byte.parseByte(chunks[0]), Byte.parseByte(chunks[1]), Byte.parseByte(chunks[2]),
						Byte.parseByte(chunks[3]) };
				return Inet4Address.getByAddress(data);
			} catch (Exception e) {
			}
		} while (true);
	}

}