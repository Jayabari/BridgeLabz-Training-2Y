class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", 1, "Manager");
        Employee e2 = new Employee("Simran", 2, "Developer");

        e1.displayEmployee();
        e2.displayEmployee();

        Employee.displayTotalEmployees();
    }
}

