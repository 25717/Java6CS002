package baseTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import base.Location;

class DataClumpsTest {
	


	@Test
	public void testToString() {
		Location location = new Location(0,0);
		assertEquals("(1,1)", location.toString());
		
		location = new Location(3,4, LocationCoordinates.DIRECTION.HORIZONTAL);
	}

}
