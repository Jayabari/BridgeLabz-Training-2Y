package Exception.Login_System;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Userdata us = new Userdata();
		Validate valid = new Validate();
		boolean run = true;
		while(run) {
			System.out.print("If you are new User enter 0 or you want to login enter 1: ");
			int userinput = input.nextInt();
			if(userinput==0) {
				System.out.println("New User page");
				System.out.print("Username: ");
				String usern = input.next();
				System.out.print("Password: ");
				String pass = input.next();
				us.newuser(usern, pass);
			}
			else if(userinput==1) {
				System.out.println("Login page");
				System.out.print("Enter the username: ");
				String usern = input.next();
				System.out.print("Enter the password: ");
				String pass = input.next();
				try {
					valid.check(usern, pass);
				}
				catch(InvalidCredentialsException e){
					System.out.print(e.getMessage());
				}
			}
		}
	}
}
