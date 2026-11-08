package extendandprotected;

public class Circle {

	protected Point center;
	protected int radius;
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double getarea() {
		return Math.PI * Math.pow(this.radius,2);
	}
	
	public double getperimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public String toString() {
		return "center " + this.center + " radius " + this.radius;
	}
	
}
