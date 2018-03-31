package Deptemployee_4_1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	private double overtimeHours = 0;

	public Secretary(double salary, String name, LocalDate hireDate) {
		super(salary, name, hireDate);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary()+12*getOvertimeHours();
	}
	
	
	
}
