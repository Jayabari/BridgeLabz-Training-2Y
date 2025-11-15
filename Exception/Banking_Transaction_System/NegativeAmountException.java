package Exception.Banking_Transaction_System;

public class NegativeAmountException extends Exception {
	NegativeAmountException(String message){
		super(message);
	}
}
