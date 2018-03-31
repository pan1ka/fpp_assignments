package Lab_11_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schur z = new Schur();
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,3));
		System.out.println(z.checkForSum(a,5));
		System.out.println(z.checkForSum(b,5));
	}

}
