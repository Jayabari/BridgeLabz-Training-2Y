package Exception.Temperature_Conversion_Tool;

public class Check {
	public void conversion(int temp, String convert) throws InvalidTemperatureException {
		if(temp<-273.15 && convert.equals("Fahrenheit")) {
			throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
		}
		else if(temp<-459.67 && convert.equals("Celsius")) {
			throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
		}
		else if(convert.equals("Fahrenheit")) {
			double con = temp*9/5+32;
			System.out.println(temp+" Calsius is "+con+" Fahrenheit");
		}
		else if(convert.equals("Celsius")) {
			double con = (temp-32)*5/9;
			System.out.println(temp+" Fahrenheit is "+con+" Calsius");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
