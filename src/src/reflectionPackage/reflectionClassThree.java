package reflectionPackage;

public class reflectionClassThree {
	/**
	 * Finding an Object's Class
	 * @param args
	 */

	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("class =" + a.getClass());
		System.out.println("class name =" + a.getClass().getName());

	}

}
