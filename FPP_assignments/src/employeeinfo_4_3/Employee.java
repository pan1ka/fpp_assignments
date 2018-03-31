package employeeinfo_4_3;

import java.time.LocalDate;

import CreditUnionBank_4_3.myStringList;
import employeeinfo_4_3.Constants;

public class Employee {

	private AccountList accounts = new AccountList(3);
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		// salary = aSalary;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	/* Immutability added */
	public LocalDate getHireDate() {
		return LocalDate.of(hireDate.getYear(), hireDate.getMonthValue(), hireDate.getDayOfMonth());
	}

	public String getName() {
		return name;
	}

	public void createNewChecking(double startAmount) {
		accounts.add(new CheckingAccount(this, startAmount));
	}

	public void createNewSavings(double startAmount) {
		accounts.add(new SavingsAccount(this, startAmount));

	}

	public void createNewRetirement(double startAmount) {
		accounts.add(new RetirementAccount(this, startAmount));
	}

	public String getFormattedAcctInfo() {
		String result = new String("");
		result += "ACCOUNT INFO FOR " + this.getName() + ":\n\n";

		for (int i = 0; i < accounts.size(); i++) {
			result += accounts.get(i).toString();
		}

		return result + "\n\n";
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		return selected.makeWithdrawal(amt);
	}
	
	public myStringList getNamesOfAccounts() {
		
		myStringList accountsList = new myStringList(3);
		
		for (Constants.AccountType type : Constants.AccountType.values()) {
			for (int i = 0; i < accounts.size(); i++) {
				if(accounts.get(i).getAcctType().equals(type))
					accountsList.add(type.toString());
					continue;
				}
		}
		//System.out.println(accountsList.toString());
		return accountsList;
	}

}
