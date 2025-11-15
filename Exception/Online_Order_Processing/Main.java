package Exception.Online_Order_Processing;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CheckStockAndAccount check = new CheckStockAndAccount();
		boolean run = true;
		while(run) {
			System.out.println("If you want to order a item enter 0 or to exit the app enter 1");
			int user = input.nextInt();
			if(user==0) {
				System.out.print("Enter the amount of items you want to order: ");
				int item = input.nextInt();
				System.out.print("Enter the amount to pay: ");
				int pay = input.nextInt();
				try {
					check.stock(item, pay);
				}
				catch(OutOfStockException e) {
					System.out.print(e.getMessage());
				}
				catch(PaymentFailedException e) {
					System.out.print(e.getMessage());
				
				}
			}
			else if(user==1) {
				run=false;
			}
			else {
				System.out.println("Invalid Input!");
			}
		}
	}	
}
