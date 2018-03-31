package LAB_12_1;

@SuppressWarnings("serial")
public class IllegalTriangleException extends IllegalCurveException{

	public IllegalTriangleException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalTriangleException(Object x) {
		//super(arg0);
		super("An IllegalTriangleException was thrown in a " + x.getClass().getSimpleName() + " instance");
		// TODO Auto-generated constructor stub
	}
	
	public IllegalTriangleException(String x) {
		//super(arg0);
		super("An IllegalTriangleException was thrown in a " + x.getClass().getSimpleName() + " instance");
		// TODO Auto-generated constructor stub
	}

}
