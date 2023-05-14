package portfolio4;

/**
 * The "Field" class is imported from the "java.lang.reflect" package to enable access to the fields of the "Area" class through reflection.
 * 
 * The program throws exceptions of type "IllegalArgumentException" and "IllegalAccessException" to handle any errors that may arise from accessing the fields.
 * */

import java.lang.reflect.Field;


public class Class02 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Area a = new Area();
	    Field[] fields = a.getClass().getFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    for (Field f : fields) {
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	          f.getType(), f.getInt(a));
	    }

	}

}
