package portfolio4;

import java.lang.reflect.*;
import java.util.ArrayList;


public class reflectionTester{
	
	private static int passCount = 0;
	private static int failCount = 0;
	
	public static void main(String[] args) {
		Area area = new Area(4.0, 5.0);
		 runResilienceTesting(area);
		 runLauncherTesting(area);
		 runAssertionsTesting(area);
		 runComplexTesting(area);
		 
		 System.out.println("");
		 System.out.println("Tests Pass: " + passCount+ "  Tests Fail: "+failCount);
 
	}
	/**
     * This method checks for the exception. If one of the message is "NoSuchMethodException", "SecurityException" or "IllegalAccessException"
     * it will print out an error message with the exception. 
        Exceptional handling used
     * */
	//Resilience
    public static void runResilienceTesting(Area rect) {
    	
    	// Class<?>[] areaClass= new Class<?>[] {reflectionOne.class};
        
        Class<?> areaClass = rect.getClass(); //object using array list
        try {
            Method method = areaClass.getDeclaredMethod("nonexistentMethod");
            //method.equals()
            //System.out.println(rect);
            method.setAccessible(true);
            method.invoke(rect);
            System.out.println(method);
            //Exceptions
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException e) {
        	failCount++;
            System.out.println("Error: " + e.getMessage());
        } catch (InvocationTargetException e) {
        	passCount++;
            System.out.println("Resilience test passed."); //message
        }
    }
    
    
    /**
     * This method runs all the methods in searching for any method that starts with the prefic "check"
     * checks for the exception message
     * Outputs "found" if a method is found
     *  Exceptional handling used
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
    			//passCount++;
    			//System.out.println("Found one");
    			//System.out.println(allMethods);
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
    		passCount++;
    		System.out.println("Launcher test passed.");
    	}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    		failCount++;
    		System.out.println("Error running launcher test: " + e.getMessage());
        }
    	
    }
    
    //Assertion
    
    /**
     * Checking to see is the value of the length and width that are assign is correct
     *  Exceptional handling used
     */
    public static void runAssertionsTesting(Area rect) {
    	Class<?> areaClass = rect.getClass(); //object using array list
    	
    	//check whether the length and width values are correct
    	try {
    		Field length = areaClass.getDeclaredField("length"); //length
    		length.setAccessible(true);
    		double newlength = length.getDouble(rect);
    		assert(newlength == 4.0) : "Lengths not the same";
    		
    		Field width = areaClass.getDeclaredField("width"); //width 
    		length.setAccessible(true);
    		double newWidth = length.getDouble(rect);
    		assert(newWidth == 5.0) : "widths not the same";
    		
    		passCount++;
    		System.out.println("Assertion test passed");
    	}catch(NoSuchFieldException | SecurityException | IllegalAccessException e) { //exceptions for no fields
    		failCount++;
    		System.out.println("Error" + e.getMessage());
    	}
    }
    
    
    
    /**
     *  In the complex assertion testing, it tests to see whether private methods can be accessed.
     *  Exceptional handling used
     * @param rect
     */
    
    //Complex Assertion
    public static void runComplexTesting(Area rect) {
    	Class<?> areaClass = rect.getClass(); //object using array list
    	
    	//private method
    	try {
    		Method method = areaClass.getDeclaredMethod("printDimensions");
    		method.setAccessible(true); //Access to private
    		method.invoke(rect);
    		//System.out.println(method);
    		passCount++;
    		System.out.println("Complex assertion test passed");
    		
    	}catch(NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
    		failCount++;
    		System.out.println("Error" + e.getMessage());
    	}
    	
    }
    
 }
    	

    
    
