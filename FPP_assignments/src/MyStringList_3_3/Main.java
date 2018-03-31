package MyStringList_3_3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringList l = new MyStringList(2);
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Arthur");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Asem");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Sunil");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Hanna");
		System.out.println("The list of size " + l.size() + " is " + l);
		
		/*String[] strArray = new String[5];
		System.out.println(Arrays.toString(strArray));*/
		
		
	}

}
