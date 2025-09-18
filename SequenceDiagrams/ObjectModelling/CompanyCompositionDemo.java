import java.util.*;

// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showEmployee() {
        System.out.println("   Employee: " + name);
    }
}

// Department class
class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDept() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

// Company class (composition)
class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

// Main class must be public
public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Charlie"));

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompany();
    }
}


