package Exception.Product_Review_System;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give us a rating: ");
		int rating = input.nextInt();
		input.nextLine();
		System.out.print("Give any suggestions: ");
		String comment = input.nextLine();
		try {
			Validate.submitReview(rating, comment);
		}
		catch(EmptyReviewException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidRatingException e) {
			System.out.println(e.getMessage());
		}
	}
}
