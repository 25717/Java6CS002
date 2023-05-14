package portfolio4;

public class Class03 {
	/**
	 * Finding an Object's Class
	 * 
	 *  It creates an object of the "Area" class and then uses the "getClass()" method to get the class of the object. 
	 *  It then prints the name of the class and the fully qualified name of the class using the "getName()" method.
	 * 
	 */

	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("class =" + a.getClass());
		System.out.println("class name =" + a.getClass().getName());

	}

}
