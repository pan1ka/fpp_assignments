
package Employee_3_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Yerbol", "1", 90000, 2018, 11, 05);
		Account accountChecking = new Account(employee, Constants.AccountType.CHECKING, 300);
		Account accountRetirement = new Account(employee, Constants.AccountType.RETIREMENT, 300);
		Account accountSavings = new Account(employee, Constants.AccountType.SAVINGS, 300);
		
		System.out.println(accountChecking.toString());
		System.out.println(accountRetirement.toString());
		System.out.println(accountSavings.toString());
		
		
		
		System.out.println(employee.getHireDay());
	}

}
