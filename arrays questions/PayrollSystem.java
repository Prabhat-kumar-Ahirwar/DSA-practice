// Base class: Employee
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate total salary
    void calculateSalary() {
        System.out.println("Total Salary of " + name + ": ₹" + salary);
    }
}

// Derived class: Manager (inherits Employee)
class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Overriding the method to include manager's bonus
    @Override
    void calculateSalary() {
        double total = salary + bonus;
        System.out.println("Total Salary of Manager " + name + " (with bonus): ₹" + total);
    }
}

// Main class to run the program
public class PayrollSystem {
    public static void main(String[] args) {
        // Create an Employee
        Employee emp = new Employee("John", 3000);
        emp.calculateSalary();

        // Create a Manager
        Manager mgr = new Manager("Alice", 50000, 10000);
        mgr.calculateSalary();
    }
}
