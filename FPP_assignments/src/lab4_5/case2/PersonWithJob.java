package lab4_5.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public boolean equals(Object ob) {
		// TODO Auto-generated method stub
		return super.equals(ob)&&(this.salary == ((PersonWithJob)ob).salary);
	}
}
