package LAB_12_1;

@SuppressWarnings("serial")
public class IllegalCurveException extends Exception{

	public IllegalCurveException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalCurveException(Object x) {
		
		super("An IllegalCurveException was thrown in a " + x.getClass().getSimpleName() + " instance");
		
		// TODO Auto-generated constructor stub
	}
	
	public IllegalCurveException(String x) {
		
		super(x);
		
		// TODO Auto-generated constructor stub
	}

}
