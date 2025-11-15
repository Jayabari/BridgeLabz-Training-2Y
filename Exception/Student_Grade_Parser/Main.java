package Exception.Student_Grade_Parser;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Marks mark = new Marks();
		System.out.print("Enter the number of grade you want enter: ");
		int n = input.nextInt();
		String[] grade = new String[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the grade: ");
			grade[i] = input.next();
		}
		mark.check(grade, n);
	}
}
