import java.util.*;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private int id;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.getSubjects()) {
            total += s.getMarks();
        }
        double average = (double) total / student.getSubjects().size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 50) return "C";
        else return "F";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student("John", 101);
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println(s.getName() + ": " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
