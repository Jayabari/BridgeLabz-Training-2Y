package Exception.Login_System;

import java.util.ArrayList;

public class Userdata {
	public ArrayList<String> username = new ArrayList<String>();
	public ArrayList<String> password = new ArrayList<String>();
	public void newuser(String user,String pass) {
		username.add(user);
		password.add(pass);
	}
}
