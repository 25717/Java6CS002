package baseTest;

import static org.junit.Assert.assertEquals;
//import base.LocationCoordinates;
import static org.junit.Assert.*;
import java.awt.Graphics;
import org.junit.jupiter.api.Test;

import base.Location;

public class DataClumpsTestTest {

	@Test
	public void testDrawGridLines() {
		Graphics graphics = new Graphics();
		Location location = new Location(0, 0);
		location.drawGridLines(graphics);
		assertTrue(graphics.horizontalLineDrawn);
		assertTrue(graphics.verticalLineDrawn);
	}
	@Test
	public void testToString() {
		Location location = new Location(0,0);
		assertEquals("(1,1)", location.toString());
		
		location = new Location(3,4, LocationCoordinates.DIRECTION.HORIZONTAL);
		assertEquals("(5,4,HORIZONTAL)", location.toString());
	}


}
