package prog_3_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle triangleInstance = new Triangle(3, 4, 5);
		Rectangle rectangleInstance = new Rectangle(1.2, 55.3);
		Circle circleInstance = new Circle(1.25);
		
		
		
		String out = new String();
		
		out = "Area of " + triangleInstance.getName() + String.format(" %5.2f %n", triangleInstance.computeArea());
		out += "Area of " + rectangleInstance.getName() + String.format(" %5.2f %n", rectangleInstance.computeArea());
		out += "Area of " + circleInstance.getName() + String.format(" %5.2f %n", circleInstance.computeArea());
		
		System.out.println(out);
		
	}

}
