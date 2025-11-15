package Exception.Online_Exam_Submission;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Validate {
	static void submitExam(String fileName) throws LateSubmissionException, InvalidFileFormatException {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatD = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String currentTime = time.format(formatD);
		LocalDateTime currenttime = LocalDateTime.parse(currentTime, formatD);
		LocalDateTime submissionDate = LocalDateTime.parse("05-11-2025 24:00:00", formatD);
		if(!fileName.contains(".pdf")) {
			throw new InvalidFileFormatException("Submission failed: invalid file format");
		}
		else if(currenttime.isAfter(submissionDate)) {
			throw new LateSubmissionException("Deadline expire: Submission date end");
		}
		else {
			System.out.println("Exam submitted successfully.");
		}
	}
}
