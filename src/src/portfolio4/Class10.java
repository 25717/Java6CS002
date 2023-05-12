package portfolio4;

import java.lang.reflect.*;

public class Class10 {

	public static void main(String[] args) throws Exception {
	    Area a = new Area();
	    Method m = a.getClass().getDeclaredMethod("setA", int.class);
	    m.setAccessible(true);
	    m.invoke(a, 76);
	    System.out.println(a);
	  }

}
