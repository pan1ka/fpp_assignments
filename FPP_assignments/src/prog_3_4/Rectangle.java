package prog_3_4;

public final class Rectangle implements Shape {
	private String name = "Rectangle";
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	};
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}

	public double computeArea() {
		return width * length;
	}

		@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
}
