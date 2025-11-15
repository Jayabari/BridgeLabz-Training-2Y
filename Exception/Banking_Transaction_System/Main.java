package Exception.Banking_Transaction_System;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Transaction trans = new Transaction();
		boolean run = true;
		while(run) {
			System.out.println("If you want to make transaction enter 1 or to exit enter 0");
			int user = input.nextInt();
			if(user==1) {
				System.out.print("Enter the amount of which you have to make transaction: ");
				int amount = input.nextInt();
				try {
					trans.transaction(amount);
				}
				catch(InsufficientFundsException e) {
					System.out.println(e.getMessage());
				}
				catch(NegativeAmountException e) {
					System.out.println(e.getMessage());
				}
				catch(NetworkFailureException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(user==0) {
				run = false;
			}
			else {
				System.out.println("Invalid Input!");
			}
		}
	}
}
