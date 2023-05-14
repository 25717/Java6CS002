package portfolio4;

import java.lang.reflect.Field;

/**
 * Main purpose is to demonstrate the use of reflection in Java. 
 * Specifically, it retrieves the declared fields of an instance of the "Area" class, and then iterates over them to print out their names, types, and values.
 * */

public class Class05 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
	 Area a = new Area();
	    Field[] fields = a.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);

	    for (Field f : fields) {
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(), f.getType(), f.getInt(a));
	    }

	}

}
