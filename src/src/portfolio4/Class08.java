package portfolio4;

import java.lang.reflect.*;

/**
 * Demonstrate how to access and modify the values of the private fields of an object using reflection in Java. 
 * The code creates an object of the Area class and then uses reflection to retrieve all the fields declared in the Area class, including private fields. 
 * */

public class Class08 {

	public static void main(String[] args) throws Exception {
	    Area a = new Area();
	    Field[] fields = a.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    for (Field f : fields) {
	      f.setAccessible(true);
	      int x = f.getInt(a);
	      x++;
	      f.setInt(a, x);
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(), f.getType(), f.getInt(a));
	    }

	}

}
