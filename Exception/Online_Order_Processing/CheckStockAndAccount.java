package Exception.Online_Order_Processing;
import java.util.*;

public class CheckStockAndAccount {
	public int stock=1;
	public int account = 100;
	public void stock(int s,int a) throws OutOfStockException, PaymentFailedException {
		if(s>stock) {
			throw new OutOfStockException("OutOfStockException: Item is Out Of Stock!\n");
		}
		else if(account<a) {
			throw new PaymentFailedException("PaymentFailedException: Payment Failed!\n");
		}
		else {
			System.out.println("The order is placed, have a nice day and come here again.");
		}
	}
}
