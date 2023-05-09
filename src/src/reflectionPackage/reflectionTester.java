package reflectionPackage;

import java.lang.reflect.*;
import java.util.ArrayList;
public class reflectionTester {

	public static void main(String[] args) {
		Area area = new Area(4.0, 5.0);
		 runResilienceTesting(area);
		 runLauncherTesting(area);
 
	}
	/*
     * This method checks for the exception. If one of the message is "NoSuchMethodException", "SecurityException" or "IllegalAccessException"
     * it will print out an error message with the exception. If not the 
     * */
	//Resilience
    public static void runResilienceTesting(Area rect) {
    	
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
    
    
    /**
     * This method runs all the methods in searching for any method that starts with the prefic "check"
     * checks for the exception message
     * Outputs "found" if a method is found
     * @param rect
     */
    //launcher
    public static void runLauncherTesting(Area rect) {
    	Class<?> areaClass = rect.getClass(); //object using array list
    	//Method method = areaClass.getMethod();
    	//method.setAccessible(true);
        //method.invoke(rect);
    	ArrayList<Method> check = new ArrayList<>();//list
    	Method [] allMethods = areaClass.getDeclaredMethods();
    	for(Method method : allMethods) {
    		if(method.getName().startsWith("check")) { //check
    			check.add(method);
    			System.out.println("Found one");
    			System.out.println(allMethods);
    		} else {
    			System.out.println("no running methods with the prefic check found");
    		}
    	}
    	//System.out.println("Launcher test passed.");
    	try {
    		for (Method method: check) {
    			method.setAccessible(true);
    	        method.invoke(rect);
    		}
    		System.out.println("Launcher test passed.");
    	}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    		System.out.println("Error running launcher test: " + e.getMessage());
        }
    	
    }
    
    	

    
    
    
    //Assertion#
    //Complex assertion
    //loggin
}
