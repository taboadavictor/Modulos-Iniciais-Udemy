package Parte_4;

public class Rectangle {
	
	double width, height;

	public double area () {
		return width * height;
	}
	
	public double perimeter () {
		return 2 * (width + height);
	}
	
	public double diagonal () {
		double b = Math.pow(width, 2);
		double h = Math.pow(height, 2);
		double d;
		return d = (double) Math.sqrt(b + h); 
	}
	

}