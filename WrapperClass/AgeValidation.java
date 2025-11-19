import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String ageInput = sc.nextLine();
        try {
            int age = Integer.parseInt(ageInput);

            if (age >= 18) {
                System.out.println("Signup Successful!");
            } else {
                System.out.println("Signup Failed: You must be 18 or older.");
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid Age: Please enter a valid number.");
        }
    }
}

