package portfolio4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class reflection_Test {
    
	
	
	
    private Area areaClass;
    
    
    
 ///// Launcher unit testing////
    @Before
    public void setUp() {
        areaClass = new Area();
    }
    
    @Test
    public void testCheckMethods() {
        
        Method[] allMethods = Area.class.getDeclaredMethods();
        ArrayList<String> failedChecks = new ArrayList<String>();
        
        for (Method methods : allMethods) {
            String methodName = methods.getName();
            // if method starts with "check"
            if (methodName.startsWith("check")) {
                try {
                    // Invoke 
                    methods.invoke(areaClass);
                } catch (Exception e) {
                    failedChecks.add(methodName);
                }
            }
        }
        
        //  check methods failed
        if (!failedChecks.isEmpty()) {
            fail("The following check methods failed: " + failedChecks.toString());
        }
    }
    
    
    ////Resilience unit testing///
    
    @Test
	public void testCalculateArea() {
		Area area = new Area(4.0, 5.0);
		assertEquals(20.0, area.calculateArea(), 0.0001);
	}
	
	@Test
	public void testDivideByZero() {
		try {
			double x = 4.0 / 2.0;
			fail("Expected an Arithmetic Exception to be thrown");
		} catch (ArithmeticException e) {
			System.out.print("The test pass");
		} catch (Exception e) {
			fail("Unexpected exception: " + e.getMessage());
		}
	}
	
	
	////Simple Assertion Unit Testing////
	
	@Test
	public void testAreaCalculate() { //Area
		Area area = new Area(3.0, 4.0);
		double expectedArea = 12.0;
		double actualArea = area.calculateArea();
		assertEquals(expectedArea, actualArea, 0.0);
	}
	
	@Test
	public void testGetLength() { //Length
		Area area = new Area(3.0, 4.0);
		double expectedLength = 3.0;
		double actualLength = area.getLength();
		assertEquals(expectedLength, actualLength, 0.0);
	}
	
	@Test
	public void testGetWidth() { // Width
		Area area = new Area(3.0, 4.0);
		double expectedWidth = 4.0;
		double actualWidth = area.getWidth();
		assertEquals(expectedWidth, actualWidth, 0.0);
	}
	
	
	////Complex assertion unit testing////
	
	@Test
    public void testArea() throws Exception {
	    Area areaClass = new Area(3.0, 4.0);
	    // Test if length is as expected
	    Field fieldlength = areaClass.getClass().getDeclaredField("length");
	    fieldlength.setAccessible(true);
	    double lengthValue = (double) fieldlength.get(areaClass);
	    assertEquals(3.0, lengthValue, 0.0);
	    
	    // Test if width is as expected
	    Field fieldwidth = areaClass.getClass().getDeclaredField("width");
	    fieldwidth.setAccessible(true);
	    double widthValue = (double) fieldwidth.get(areaClass);
	    assertEquals(4.0, widthValue, 0.0);
    }
    
}