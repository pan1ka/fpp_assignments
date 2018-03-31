package parse_2_4;

public class Prog4 {
	/* 
	 * Author: Yerbol Panaberdiyev
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = Data.records;
		
		String[] products = myString.split(":");
		
		for (String string : products) {
			System.out.println(string.split(",")[0]);
		}
		
	}

}
