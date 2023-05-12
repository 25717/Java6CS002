package portfolio4;

import java.lang.reflect.Field;

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
