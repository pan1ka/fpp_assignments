package employeeinfo_4_3;

class Account {
	private double balance;
	private Constants.AccountType acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public Constants.AccountType getAcctType() {
		return acctType;
	}

	Account(Employee emp) {
		this(emp, Constants.DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + getAcctType().toString().toLowerCase() + "\nCurrent bal: " + balance + "\n";
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

	protected void setBalance(double balance) {
		this.balance = balance;
	}
	
}
