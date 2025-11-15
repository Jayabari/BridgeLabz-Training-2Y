package Exception.Online_Order_Processing;

public class OutOfStockException extends Exception {
	OutOfStockException(String message){
		super(message);
	}
}
