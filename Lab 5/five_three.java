import java.util.Scanner;

// Define the interface
interface Employee {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

// Manager class implementing Employee interface without bonus method
class Manager implements Employee {
    @Override
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic); // Basic + DA + HRA
    }

    @Override
    public double deductions(double basic) {
        return 0.12 * basic; // PF deduction
    }

    // No bonus method implemented in Manager class
    @Override
    public double bonus(double basic) {
        return 0; // No bonus for Manager
    }
}

// Substaff class extending Manager class and implementing bonus method
class Substaff extends Manager {
    @Override
    public double bonus(double basic) {
        return 0.5 * basic; // 50% of basic as bonus
    }
}

// Main class
public class five_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter basic salary
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Create an object of Substaff class
        Substaff substaff = new Substaff();

        // Calculate earnings, deductions, and bonus
        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        // Print the results
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}
