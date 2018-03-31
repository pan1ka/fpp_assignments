package Lab_10_1.employeebst;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	// compareTo in this case is not consistent with equals
	public int compare(Employee e1, Employee e2) {
		if (e1.getName().compareTo(e2.getName()) == 0) {
			if (e1.getSalary() > e2.getSalary()) {
				return 1;
			} else if (e1.getSalary() < e2.getSalary()) {
				return -1;
			} else // equal names and salary, hire date doesn't matter or us
			{
				return 0;
			}

		} else if (e1.getName().compareTo(e2.getName()) > 0) {
			return 1;
		}

		return -1;

	}

}
