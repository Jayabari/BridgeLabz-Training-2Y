package Exception.Banking_Transaction_System;
import java.util.*;

public class Transaction {
	public int amount = 10000;
	boolean condition = false;
	public void transaction(int a) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
		Random rand = new Random();
		if(amount<a) {
			condition = true;
		}
		amount = amount - a;
		int random = rand.nextInt(5)+1;
		System.out.println(random);
		if(random==5) {
			throw new NetworkFailureException("NetworkFailureException: There is some error. Please try later!\n");
		}
		else if(a<0) {
			throw new NegativeAmountException("NegativeAmountException: The amount should not be negative\n!");
		}
		else if(condition) {
			throw new InsufficientFundsException("InsufficientFundsException: Out of Fund!\n");
		}
		else {
			System.out.println("Payment Successful.");
		}
	}
}
