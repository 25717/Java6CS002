package portfolio4;

import java.lang.reflect.Field;

/**
 *  use Java Reflection to get information about the fields of an object of the Area class.
 * 
 * The code retrieves the declared fields of the Area object using the getDeclaredFields() method and then loops through each field, printing its name, type, and accessibility using the getName(), getType(), and isAccessible() methods of the Field class respectively. 
 * */

public class Class06 {

	public static void main(String[] args) throws Exception {
	Area a = new Area();
    Field[] fields = a.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);

    for (Field f : fields) {
      System.out.printf("field name=%s type=%s accessible=%s\n", f.getName(), f.getType(), f.isAccessible());
    }

	}

}
