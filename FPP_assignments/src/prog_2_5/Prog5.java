package prog_2_5;

import java.util.Scanner;


public class Prog5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		for(int i = sb.length()-1;i>=0;i--){
			System.out.print(sb.charAt(i));
		}
	
		sc.close(); // close io. 
		
	}


	 

}
