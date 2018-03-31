package employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		//salary = aSalary;
		hireDate =  LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	/*Immutability added*/
	public LocalDate getHireDate() {
		return LocalDate.of(hireDate.getYear(), hireDate.getMonthValue(), hireDate.getDayOfMonth());
	}


	public String getName() {
		return name;
	}


	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(this, Constants.AccountType.CHECKING);
		this.checkingAcct.makeDeposit(startAmount);
	}

	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(this, Constants.AccountType.SAVINGS);
		this.savingsAcct.makeDeposit(startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, Constants.AccountType.RETIREMENT);
		this.retirementAcct.makeDeposit(startAmount);
	}

	public String getFormattedAcctInfo() {
		String result = new String("");
		result += "ACCOUNT INFO FOR " + this.getName() + ":\n\n";
		
		if (this.checkingAcct!=null) {
			result += this.checkingAcct.toString();
		}
		if (this.savingsAcct!=null) {
			result += this.savingsAcct.toString();
		}
		if (this.retirementAcct!=null) {	
			result += this.retirementAcct.toString();
		}
		
		return result + "\n\n";
	}
	public void deposit(Constants.AccountType acctType, double amt){
		switch (acctType) {
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
        case SAVINGS:
        	savingsAcct.makeDeposit(amt);
        	break;
        default:
			checkingAcct.makeDeposit(amt);
			break;
		}
	}
	public boolean withdraw(Constants.AccountType acctType, double amt){
		switch (acctType) {
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
        case SAVINGS:
        	return savingsAcct.makeWithdrawal(amt);
        default:
        	return checkingAcct.makeWithdrawal(amt);
		}
	}

}
