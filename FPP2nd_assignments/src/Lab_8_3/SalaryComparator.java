package Lab_8_3;

import java.util.Comparator;
import Lab_8_3.Employee;;

public class SalaryComparator implements Comparator<Employee> {
	final double condition = 0.001f;

	@Override
	public int compare(Employee emp1, Employee emp2) {

		double d = emp1.getSalary() - emp2.getSalary();

		if (Math.abs(d) < condition) {
			return 0;
		}

		if (d < 0) {
			return -1;
		} else
			return 1;

	}

}
