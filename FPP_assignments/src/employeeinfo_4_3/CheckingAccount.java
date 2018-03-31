package employeeinfo_4_3;

public class CheckingAccount extends Account {
	private final double SERVICE_CHARGE = 5;

	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public Constants.AccountType getAcctType() {
		return Constants.AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		double currentBalance = super.getBalance();
		setBalance(currentBalance - SERVICE_CHARGE);
		return getBalance();
	}
}
