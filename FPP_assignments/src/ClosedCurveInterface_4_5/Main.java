package ClosedCurveInterface_4_5;

import Good_4_5.Polygon;

public class Main {

	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(6, 4, 5), new Square(3), new Rectangle(3, 4) };
		// compute areas
		for (Polygon cc : objects) {
			System.out.println(
					"For this " + cc.getClass().getSimpleName() + "\n" + "Perimeter = " + cc.computePerimeter());

		}

	}

}
