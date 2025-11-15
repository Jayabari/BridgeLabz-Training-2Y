package Exception.Login_System;

public class Validate {
	public void check(String username, String password) throws InvalidCredentialsException {
		Userdata user = new Userdata();
		if(user.username.contains(username)==false&&user.password.contains(password)==false) {
			throw new InvalidCredentialsException("Invalid Credentials");
		}
		else {
			System.out.print("You are ready to go.");
		}
	}
}
