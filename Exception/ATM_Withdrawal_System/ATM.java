package Exception.ATM_Withdrawal_System;

public class ATM {
	public void withdraw(double account, double amount) throws InsufficientFundsException {
		if(account<amount) {
			throw new InsufficientFundsException("Not sufficient fund in account");
		}
		else {
			System.out.println(amount+" has been withdrawn from your account");
		}
	}
}
