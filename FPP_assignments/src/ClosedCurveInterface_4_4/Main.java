package ClosedCurveInterface_4_4;

import Good_4_4.Polygon;

public class Main {

	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 4) };
		// compute areas
		for (Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + "\n" + " Number of sides = "
					+ cc.getNumberOfSides() + "\n" + "Perimeter = " + cc.computePerimeter());

		}

	}

}
