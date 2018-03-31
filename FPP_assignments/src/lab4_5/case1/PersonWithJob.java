package lab4_5.case1;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	/*@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return p.getName().equals(this.getName()) && p.getDateOfBirth().equals(getDateOfBirth());
	}*/
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}
