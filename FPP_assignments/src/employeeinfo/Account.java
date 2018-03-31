package employeeinfo;

class Account {
	private double balance;
	private Constants.AccountType acctType;
	private Employee employee;

	Account(Employee emp, Constants.AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public Constants.AccountType getAcctType() {
		return acctType;
	}

	Account(Employee emp, Constants.AccountType acctType) {
		this(emp, acctType, Constants.DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType.toString().toLowerCase() + "\nCurrent bal: " + balance + "\n";
	}

	/**
	 * updates the balance field
	 * @param val
	 */
	public void makeDeposit(double deposit) {
		this.balance += deposit;
	}

	/**
	 * Updates the balance field and returns true, unless
	 * withdrawal amount is too large; in that case,
	 * it does not modify the balance field, and returns false
	 * @param amount
	 * @return
	 */
	public boolean makeWithdrawal(double amount) {
		if(this.balance>=amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
}
