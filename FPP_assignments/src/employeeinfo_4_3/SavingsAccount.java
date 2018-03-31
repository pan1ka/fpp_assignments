package employeeinfo_4_3;

public class SavingsAccount extends Account {
	private final double INTEREST_RATE = 0.25;

	SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public Constants.AccountType getAcctType() {
		return Constants.AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		double baseBalance = super.getBalance();
		double interest = baseBalance * INTEREST_RATE;
		setBalance(baseBalance - interest); ;
		return getBalance();
	}
}
