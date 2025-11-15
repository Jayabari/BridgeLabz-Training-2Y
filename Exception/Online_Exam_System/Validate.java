package Exception.Online_Exam_System;

public class Validate {
	public static String username = "admin";
	public static String password = "admin@123";
	public static void validateStudent(String user, String pass, int v) throws InvalidStudentException, IOException {
		int in = v;
		if(!username.equals(user) || !password.equals(pass)) {
			throw new InvalidStudentException("InvalidStudentException: Invalid Credentials!");
		}
		else {
			Validate.submitExam(in);
		}
	}
	public static void submitExam(int v) throws IOException {
		if(v==1) {
			throw new IOException("IOException");
		}
	}
}
