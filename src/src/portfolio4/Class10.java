package portfolio4;

import java.lang.reflect.*;

/**
 * code is to illustrate how to use reflection in Java to invoke a non-public method in a class
 * */

public class Class10 {

	public static void main(String[] args) throws Exception {
	    Area a = new Area();
	    Method m = a.getClass().getDeclaredMethod("setWidth", double.class);
	    m.setAccessible(true);
	    m.invoke(a, 10);
	    System.out.println(a);
	  }

}
