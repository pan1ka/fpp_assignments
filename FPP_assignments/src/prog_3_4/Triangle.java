package prog_3_4;

public final class Triangle implements Shape {
	private String name = "Triangle";
	private double base;
	private double height;
	private double first;
	private double second;
	
	public double getHeight() {
		return height;
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(double first, double second, double third) {
		
		if((first>=second)&&(first>=third)) {
			base = first;
			this.first = second;
			this.second = third;
		}
		
		if((second>=first)&&(second>=third)) {
			base = second;
			this.first = first;
			this.second = third;
		}
		
		if((third>=first)&&(third>=second)) {
			base = third;
			this.first = first;
			this.second = second;
		}
		
		// Heron area and height.
		double semiperimeter = (this.base + this.first + this.second)/2; 
		double area = Math.sqrt(semiperimeter*(semiperimeter-this.base)*(semiperimeter-this.second)*(semiperimeter-this.first));
		this.height = area*2/this.base;
		
	}

	public double computeArea() {
		System.out.println(this.first + " " + this.second  + " " +  this.base + " h" +  this.height);
		return  (base*height/2);
	}

		@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
