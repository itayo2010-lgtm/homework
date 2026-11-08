package extendandprotected;

public class Cylinder extends Circle{
	
	private int hight;

	public Cylinder(Point center, int radius, int hight) {
		super(center, radius);
		this.hight = hight;
	}
	
	public double getarea() {
		return super.getperimeter() * hight;
	}

	public double getvolume() {
		return super.getarea() * hight;
	}
	
	public String toString() {
		return super.toString() + " hight " + hight; 
	}
	
}


