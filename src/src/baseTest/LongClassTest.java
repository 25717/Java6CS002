package baseTest;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import org.junit.Test;

import base.ConnectionGenius;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

class LongClassTest {

	@Test
	public void testFireupGame() throws UnknownHostException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ConnectionGenius connGenius = ConnectionGenius.getInstance(InetAddress.getLocalHost());
        connGenius.fireUpGame();
        String expectedOutput = "Getting specialised web version.\nWait a couple of moments\nConnecting\nReady to play\n";
        assertEquals(expectedOutput, outContent.toString());
	}

}
