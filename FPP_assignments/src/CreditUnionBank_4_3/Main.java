package CreditUnionBank_4_3;

import java.util.Scanner;
import java.util.function.ToIntFunction;

import employeeinfo_4_3.*;

public class Main {
	Employee[] emps = null;

	enum OperationType {
		DEPOSIT, WITHDRAW
	};

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		String option = "START";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("A. See a report of all accounts.");
			System.out.println("B. Make a deposit.");
			System.out.println("C. Make a withdrawal.");
			System.out.println("X. Close session.");
			System.out.println("Make a selection (A/B/C/X):");
	
			option = sc.next();
	
			switch (option) {
			case "A":
				String info = getFormattedAccountInfo();
				System.out.println(info);
				break;
			case "B":
				showDepWithdrawMenu(sc, OperationType.DEPOSIT);
				break;
			case "C":
				showDepWithdrawMenu(sc, OperationType.WITHDRAW);
				break;
			case "X":
				sc.close();
				System.out.print("Closing session...");
				break;
			default:
				System.out.print("Next time make a selection only (A/B/C), please run again");
			}
			
			if(option.equals("X")) {
				break;
			}
		}
	}

	String getFormattedAccountInfo() {
		String result = new String("");
		for (Employee employee : emps) {
			result += employee.getFormattedAcctInfo();
		}
		// loop through employees array and get formatted
		// account info for each employee, and assemble into a string
		return result;
	}

	public void showDepWithdrawMenu(Scanner sc, OperationType opType) {
		int currentIndex = 0;
		for (Employee employee : emps) {
			System.out.println(++currentIndex + ". " + employee.getName());
		}

		int selection = Integer.parseInt(sc.next()) - 1;

		myStringList accountsList = emps[selection].getNamesOfAccounts();

		for (int i = 0; i < accountsList.size(); i++) {
			System.out.println((i + 1) + "." + accountsList.get(i));
		}
		int accountIndex = Integer.parseInt(sc.next()) - 1;

		System.out.println();
		if (opType.equals(OperationType.DEPOSIT)) {
			System.out.println("Deposit ammount: ");
			double ammount = Double.parseDouble(sc.next());

			emps[selection].deposit(accountIndex, ammount);
			System.out.println("$" + ammount + " has been deposited in the\n" + accountsList.get(selection)
					+ " account of " + emps[selection].getName());
		} else if (opType.equals(OperationType.WITHDRAW)) {
			System.out.println("Withdraw ammount: ");
			double ammount = Double.parseDouble(sc.next());

			boolean successWithdrawal = emps[selection].withdraw(accountIndex, ammount);
			if(successWithdrawal)
				System.out.println("$" + ammount + " has been withdrawn from the\n" + accountsList.get(selection)
						+ " account of " + emps[selection].getName());
			else
				System.out.println("$" + ammount + " not been withdrawn from the\n" + accountsList.get(selection)
				+ " account of " + emps[selection].getName() + "not enough funds");
		}

	}
}
