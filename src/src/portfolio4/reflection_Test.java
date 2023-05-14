package portfolio4;

import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class reflection_Test {
    
    private Area areaClass;
    
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
    
}