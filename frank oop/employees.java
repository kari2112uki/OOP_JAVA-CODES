//FRANKLIN KARIUKI CT101/G/22924/24
//code to calculate bopmus of employee

//Creating Employee Class
class employees {
    private String name;
    private double salary;

    // Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method displaying employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

s
class SalaryCalculator {
    // Method to calculate 10% of the salary as bonus
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// MainApp Class
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting user input for name and salary
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Creating  an Employee object
        Employee employee = new Employee(name, salary);

        // Using SalaryCalculator to compute bonus
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double bonus = salaryCalculator.calculateBonus(employee.getSalary());

        // Displaying employee details and calculated bonus
        employee.displayDetails();
        System.out.println("Calculated Bonus: " + bonus);

        scanner.close();
    }
}
