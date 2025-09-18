import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class DepartmentU {
    String deptName;
    DepartmentU(String deptName) { this.deptName = deptName; }
}

class University {
    String name;
    List<DepartmentU> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(DepartmentU d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) System.out.println(" - " + d.deptName);
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(" - " + f.name);
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University u = new University("Global University");

        u.addDepartment(new DepartmentU("Engineering"));
        u.addDepartment(new DepartmentU("Arts"));

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Alice");
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showUniversity();
    }
}

