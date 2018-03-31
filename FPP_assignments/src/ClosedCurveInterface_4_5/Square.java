package ClosedCurveInterface_4_5;

import Good_4_5.Polygon;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;

	}

	public double computeArea() {
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return (new double[]{side, side, side, side});
	}

}
