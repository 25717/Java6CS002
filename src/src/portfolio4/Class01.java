package portfolio4;

/**
 * The program creates an instance of the Area class. It then calls the calculateArea() method on the a object to calculate the area and prints the result to the console using the System.out.println() method.
 * */

public class Class01 {

	public static void main(String[] args) {
		Area a = new Area();
		double area = a.calculateArea();
		System.out.println("Area = " + area);

	}

}
