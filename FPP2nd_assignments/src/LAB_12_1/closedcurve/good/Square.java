package LAB_12_1.closedcurve.good;

import LAB_12_1.IllegalCurveException;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalCurveException{
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalCurveException {
		if (side<0) throw new IllegalCurveException(this);
		this.side = side;
	}
	public double computeArea() {
		return(side*side);
	}

}
