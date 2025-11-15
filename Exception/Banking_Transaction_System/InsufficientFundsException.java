package Exception.Banking_Transaction_System;

public class InsufficientFundsException extends Exception {
	InsufficientFundsException(String message) {
		super(message);
	}
}
