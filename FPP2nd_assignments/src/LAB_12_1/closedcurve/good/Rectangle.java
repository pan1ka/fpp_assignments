package LAB_12_1.closedcurve.good;

import LAB_12_1.IllegalCurveException;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalCurveException{
		this.length = length;
		this.width = width;
		if ((width<0)||(length<0)) throw new IllegalCurveException(this);
	}
	public double computeArea() {
		return width*length;
	}
	


}
