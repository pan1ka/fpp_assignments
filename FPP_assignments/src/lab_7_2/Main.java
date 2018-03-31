package lab_7_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
		
		String result1 = ms.sort("no more time in exam"); // spaces included to index
		System.out.println(result1);

	}
	
}	
	 
