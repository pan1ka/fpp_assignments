package Deptemployee_4_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor(90000, "John Bruen", LocalDate.of(2018, 1, 5), 10);
		Professor prof2 = new Professor(75000, "Samuel Adibo", LocalDate.of(2017, 10, 5), 10);
		Professor prof3 = new Professor(76100.800, "Hanna Maduro", LocalDate.of(2017, 3, 5), 10);
		Secretary sec1 = new Secretary(40000, "Iren Zappo", LocalDate.of(2017, 3, 5));
		sec1.setOvertimeHours(200);
		Secretary sec2 = new Secretary(41000, "Irin Strantford", LocalDate.of(2018, 1, 5));
		sec1.setOvertimeHours(200);
		
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you wish me to copmute the sum of all department employees? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			double sum = 0;
			for (DeptEmployee deptEmployee : department) {
				sum += deptEmployee.computeSalary();
			}
			System.out.println("Sum of all salaries: $" + sum);
		}
		else {
			//do nothing..the application ends here
			sc.close();
		}	
		
		
	}

}
