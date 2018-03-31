package Lab_8_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
		NameComparator nameComp = 
			new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println("----by Name-----");
		System.out.println(empList);
		
		System.out.println("----by Salary-----");
		SalaryComparator  sc = new SalaryComparator();
		Collections.sort(empList,sc);
		System.out.println(empList);
		
		System.out.println("----by HireDate-----");
		HireDateComparator  hd = new HireDateComparator();
		Collections.sort(empList,hd);
		System.out.println(empList);
	}

}
