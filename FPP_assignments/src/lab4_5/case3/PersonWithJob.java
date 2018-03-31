package lab4_5.case3;

import java.util.GregorianCalendar;

public class PersonWithJob{
	private double salary;
	private Person person;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (ob.getClass() != getClass()) return false;
		PersonWithJob pwj = (PersonWithJob) ob;
		return (pwj.person.equals(person) && pwj.salary == salary);	
	}
	
	public double getSalary() {
		return salary;
	}
}
