package Exception.ATM_Withdrawal_System;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ATM atm = new ATM();
		double account = 10000;
		System.out.print("Enter the amount to be withdrawn: ");
		double amount = input.nextInt();
		try {
			atm.withdraw(account,amount);
		}
		catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
