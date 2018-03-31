package Lab_8_3;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getHireDate().compareTo(emp2.getHireDate());
	}

}
