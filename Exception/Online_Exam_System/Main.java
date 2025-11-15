package Exception.Online_Exam_System;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(1);
		int r = rand.nextInt(3);
		System.out.print("Enter the username: ");
		String user = input.next();
		System.out.print("Enter the password: ");
		String pass = input.next();
		try {
			Validate.validateStudent(user, pass, r);
		}
		catch(InvalidStudentException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Exam submission process completed.");
		}
	}
}
