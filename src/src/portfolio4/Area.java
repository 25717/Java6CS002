package portfolio4;

public class Area {
	public double length = 4.0;
    private double width = 5.0;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Area() {
    	
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
    
    public double checkArea() {
    	return length * width;
    }

    private void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    public String toString() {
    	return "Area[length=" + length + ", width=" + width + "]";
    }
}
