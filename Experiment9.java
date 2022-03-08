/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/
import java.util.Scanner;

class InvalidAmountException extends Exception {
	InvalidAmountException(String s) {
		super(s);
	}
}
class InsufficientFundsException extends Exception {
	InsufficientFundsException(String s) {
		super(s);
	}
}
class BankDetails {
	private String accno;
	private String name;
	private int balance;
	Scanner sc = new Scanner(System.in);

	public void openAccount() {
		System.out.print("Enter Account No: ");
		accno = sc.nextLine();
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Balance: ");
		balance = sc.nextInt();
	}

	public void showAccount() {
		System.out.println("Name of account holder: " + name);
		System.out.println("Account no.: " + accno);
		System.out.println("Balance: " + balance);
	}

	public void deposit() {
		int amt;
		System.out.print("Enter the amount you want to deposit: ");
		amt = sc.nextInt();
		try {
			if (amt <= 0) {
				throw new InvalidAmountException("Deposit amount should be greater than 0");
			}
			balance = balance + amt;
			System.out.println("Balance after deposit: " + balance);
		} catch (InvalidAmountException E) {
			System.out.println("Exception occured: " + E);
		}

	}

	public void withdrawal() {
		int amt;
		System.out.print("Enter the amount you want to withdraw: ");
		amt = sc.nextInt();
		try {
			if (amt <= 0) {
				throw new InvalidAmountException("Witdraw amount should be greater than 0");
			}

			try {
				if (balance < amt) {
					throw new InsufficientFundsException("Withdraw amount should not exceed balance");
				}
				balance = balance - amt;
				System.out.println("Balance after withdrawal: " + balance);
			} catch (InsufficientFundsException E) {
				System.out.println("Exception occured: " + E);
			}
		} catch (InvalidAmountException E) {
			System.out.println("Exception occured: " + E);
		}
	}

	public boolean search(String ac_no) {
		if (accno.equals(ac_no)) {
			showAccount();
			return (true);
		}
		return (false);
	}
}

public class Experiment9 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		// create initial accounts
		System.out.print("How many number of customers do you want to input : ");
		int n = sc.nextInt();
		BankDetails C[] = new BankDetails[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new BankDetails();
			C[i].openAccount();
		}

		int ch;
		do {
			System.out.println("\n============================================");
			System.out.println(
					"1. Display all account details \n2. Search by Account number\n3. Deposit the amount \n4. Withdraw the amount \n5. Exit ");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			System.out.println("\n============================================");

			switch (ch) {
				case 1:
					for (int i = 0; i < C.length; i++) {
						C[i].showAccount();
					}
					break;
				case 2:
					System.out.print("Enter account no. you want to search: ");
					String ac_no = sc.next();
					boolean found = false;
					for (int i = 0; i < C.length; i++) {
						found = C[i].search(ac_no);
						if (found) {
							break;
						}
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 3:
					System.out.print("Enter Account no. : ");
					ac_no = sc.next();
					found = false;
					for (int i = 0; i < C.length; i++) {
						found = C[i].search(ac_no);
						if (found) {
							C[i].deposit();
							break;
						}
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 4:
					System.out.print("Enter Account No : ");
					ac_no = sc.next();
					found = false;
					for (int i = 0; i < C.length; i++) {
						found = C[i].search(ac_no);
						if (found) {
							C[i].withdrawal();
							break;
						}
					}
					if (!found) {
						System.out.println("Search failed! Account doesn't exist..!!");
					}
					break;
				case 5:
					System.out.println("See you soon...");
					break;
			}
		} while (ch != 5);
		sc.close();
	}
}