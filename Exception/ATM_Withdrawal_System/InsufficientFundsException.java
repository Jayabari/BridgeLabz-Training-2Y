package Exception.ATM_Withdrawal_System;

public class InsufficientFundsException extends Exception{
	InsufficientFundsException(String message){
		super(message);
	}
}
