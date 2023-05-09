package reflectionPackage;

import java.lang.reflect.*;
public class reflectionTester {

	public static void main(String[] args) {
		reflectionOne area = new reflectionOne(4.0, 5.0);
		 runResilienceTesting(area);
 
	}
	
	//Reselience
    public static void runResilienceTesting(reflectionOne rect) {
    	
    	// Class<?>[] areaClass= new Class<?>[] {reflectionOne.class};
        
        Class<?> areaClass = rect.getClass(); //object using array list
        try {
            Method method = areaClass.getDeclaredMethod("nonexistentMethod");
            //method.equals()
            method.setAccessible(true);
            method.invoke(rect);
            
            //Exceptions
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println("Resilience test passed."); //message
        }
    }

    //launcher
    //Assertion#
    //Complex assertion
    //loggin
}
