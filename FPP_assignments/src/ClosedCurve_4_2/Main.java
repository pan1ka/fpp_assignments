package ClosedCurve_4_2;



public class Main {

	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
				                 new Triangle(8,10),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println("The area of this " + cc.getClass().getSimpleName() 
                                                   + " is " + cc.computeArea());
			
		}
    
	}

}
