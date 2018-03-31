package ClosedCurve_4_2;

public class Rectangle extends ClosedCurve {
	double width;
	double length;
	
	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
}
