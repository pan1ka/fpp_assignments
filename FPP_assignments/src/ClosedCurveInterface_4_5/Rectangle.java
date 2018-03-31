package ClosedCurveInterface_4_5;

import Good_4_5.Polygon;

public class Rectangle extends ClosedCurve  implements Polygon{
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

	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return (new double[]{width, length, width, length});
	}

	
}
