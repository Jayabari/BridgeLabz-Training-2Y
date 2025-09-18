import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enroll(Student s) {
        students.add(s);
        s.addCourse(this);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addCourse(Course c) {
        courses.add(c);
    }

    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.name);
        }
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolAggregationAssociationDemo {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("John");
        Student s2 = new Student("Emma");

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        c1.enroll(s1);
        c1.enroll(s2);
        c2.enroll(s1);

        s1.showCourses();
        c1.showEnrolledStudents();
    }
}

