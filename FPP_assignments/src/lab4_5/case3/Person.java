package lab4_5.case3;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) dateOfBirth.clone();
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Person))
			return false;
		Person p = (Person) ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}

	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}

	public static void main(String[] args) {
		Person p0 = new Person("John", new GregorianCalendar(2000, 0, 1));
		PersonWithJob p1 = new PersonWithJob("John", new GregorianCalendar(2000, 0, 1), 1500);
		PersonWithJob p2 = new PersonWithJob("John", new GregorianCalendar(2000, 0, 1), 22299);
		PersonWithJob p3 = new PersonWithJob("Ahn", new GregorianCalendar(2000, 0, 1), 1500);
		PersonWithJob p4 = new PersonWithJob("Ahn", new GregorianCalendar(1999, 0, 1), 1500);
		PersonWithJob p5 = new PersonWithJob("Ahn", new GregorianCalendar(1999, 0, 1), 1500);

		System.out.println(p0.equals(p1)); // Person with PersonWithJob
		System.out.println(p1.equals(p0)); // PersonWithJob with Person
		System.out.println(p1.equals(p2)); // two PersonWithJob but diff. salary
		System.out.println(p2.equals(p3)); // two PersonWithJob but diff. names
		System.out.println(p3.equals(p4)); // two PersonWithJob but diff. birth dates
		System.out.println(p4.equals(p5)); // two PersonWithJob same name, bd, salary

	}

}
