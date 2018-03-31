package employeeinfo_4_3;

public class RetirementAccount extends Account {
	private final double PENALTY = 0.02;

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public Constants.AccountType getAcctType() {
		return Constants.AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {

		double ammountPlusPentalty = amount + getBalance() * PENALTY;
		
		return super.makeWithdrawal(ammountPlusPentalty);
	}
}
