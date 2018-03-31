package minimum_2_8;

public class prog28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOfInt = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		System.out.println(min(arrayOfInt));
	}
	
	static int min(int[] arrayOfInts) {
		
		int x = arrayOfInts[0];
		
		for (int i =0; i<arrayOfInts.length; i++) {
			if (x > arrayOfInts[i])
				x = arrayOfInts[i];
		}
		
		return x;
	}

}
