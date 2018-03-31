package prog_3_4;

public final class Circle implements Shape{
	private String name = "Circle";
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	};

	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
