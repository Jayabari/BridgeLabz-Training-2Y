class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Team: " + teamName + ", Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(1001, "IT", 75000, "Dev Team");
        m.display();
    }
}

