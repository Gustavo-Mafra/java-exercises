package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2 * width + 2 * height;
	}
	public double diagonal() {
		double sumCat = width * width + height * height;
		return Math.sqrt(sumCat);
	}

}
