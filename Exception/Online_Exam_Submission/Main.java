package Exception.Online_Exam_Submission;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of file: ");
		String filename = input.next();
		try {
			Validate.submitExam(filename);
		}
		catch(LateSubmissionException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidFileFormatException e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}
}
