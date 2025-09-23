class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher: " + name + " | Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student: " + name + " | Grade: " + grade);
    }
}

class Staff extends Person {
    String role;

    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    void displayRole() {
        System.out.println("Staff: " + name + " | Role: " + role);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Math");
        Student s = new Student("Anita", 16, "10th Grade");
        Staff st = new Staff("Ramesh", 35, "Clerk");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

