package Good_4_5;

public interface Polygon {
	public abstract double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		double sumVariable = 0;
		for (double elem : arr) {
			sumVariable += elem;
		}
		
		return sumVariable;
	}
	
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}
}
