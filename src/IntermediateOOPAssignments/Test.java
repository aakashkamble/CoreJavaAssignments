package IntermediateOOPAssignments;

class Employee
{
    String name;
    double salary;

 public Employee(String name, double salary)
{
        super();
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Manager extends Employee {
    double incentive;

    public Manager(String name, double salary, double incentive) {
        super(name, salary);
        this.incentive = incentive;
    }

    double calculateSalary() {
        return salary + incentive;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", incentive=" + incentive +
                '}';
    }
}

class Labour extends Employee {
    double overtime;

    public Labour(String name, double salary, double overtime) {
        super(name, salary);
        this.overtime = overtime;
    }

    double calculateSalary() {
        return salary + overtime;
    }

    @Override
    public String toString() {
        return "Labour{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", overtime=" + overtime +
                '}';
    }
}

public class Test {
    public static double calculateTotalSalary(Employee... employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee e1 = new Manager("Manager1", 50000, 1000);
        Employee e2 = new Labour("Labour1", 20000, 3000);
        double totalSalary = calculateTotalSalary(e1, e2);
        System.out.println("Total Salary is: " + totalSalary);
    }
}