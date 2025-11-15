package Exception.Product_Review_System;

public class Validate {
	public static void submitReview(int rating, String comment) throws EmptyReviewException, InvalidRatingException {
		if(rating<1 || rating>5) {
			throw new InvalidRatingException("InvalidRAtingException: Rating should be between 1 and 5.");
		}
		else if(comment.isEmpty()) {
			throw new EmptyReviewException("EmptyReviewException: Give some comment.");
		}
		else {
			System.out.println("Thanks For Review.");
		}
	}
}
