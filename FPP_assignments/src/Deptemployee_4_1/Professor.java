package Deptemployee_4_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
		public Professor(double salary, String name, LocalDate hireDate, int numberOfPublications) {
		super(salary, name, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
