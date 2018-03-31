package ClosedCurveInterface_4_4;

import Good_4_4.Polygon;

public class Rectangle extends ClosedCurve  implements Polygon{
	double width;
	double length;
	private final int SIDES_NUMBER = 4;
	
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

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return SIDES_NUMBER;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (width+length)*2;
	}
	
}
