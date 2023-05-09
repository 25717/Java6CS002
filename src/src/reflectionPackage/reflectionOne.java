package reflectionPackage;

public class reflectionOne {
	private double length;
    private double width;

    public reflectionOne(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    private void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    public String toString() {
    	return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
