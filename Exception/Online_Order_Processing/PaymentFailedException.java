package Exception.Online_Order_Processing;

public class PaymentFailedException extends Exception {
	PaymentFailedException(String message){
		super(message);
	}
}
