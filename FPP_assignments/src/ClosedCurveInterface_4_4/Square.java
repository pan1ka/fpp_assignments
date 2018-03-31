package ClosedCurveInterface_4_4;

import Good_4_4.Polygon;

public final class Square extends ClosedCurve  implements Polygon {
	private final double side;
	private final int SIDES_NUMBER = 4;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return SIDES_NUMBER;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return side*SIDES_NUMBER;
	}


}
