package Lab_8_3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Andrew", 15000, 2001, 4, 12));
		l.add(new Employee("Stefan", 16000, 2005, 8, 2));
		l.add(new Employee("Emanuel", 11000, 2002, 4, 20));
		l.add(new Employee("Sam", 28000, 2009, 1, 2));
		
		SalaryComparator  sc = new SalaryComparator();
		Collections.sort(l,sc);
		System.out.print("----Salary-----");
		for (Employee employee : l) {
			System.out.print(employee);
		}
		
		System.out.print("----HireDate-----");
		HireDateComparator  hd = new HireDateComparator();
		Collections.sort(l,hd);
		
		for (Employee employee : l) {
			System.out.print(employee);
		}
	}

}
