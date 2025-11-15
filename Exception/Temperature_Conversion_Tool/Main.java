package Exception.Temperature_Conversion_Tool;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Check ch = new Check();
		System.out.println("If you want to convert in Celsius enter 0 or 1 for Fahrenheit");
		int user = input.nextInt();
		System.out.print("Enter the temperature: ");
		int temp = input.nextInt();
		if(user==0) {
			try {
				ch.conversion(temp, "Celsius");
			}
			catch(InvalidTemperatureException e) {
				System.out.println(e.getMessage());
			}
		}
		else if(user==1) {
			try {
				ch.conversion(temp, "Fahrenheit");
			}
			catch(InvalidTemperatureException e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
