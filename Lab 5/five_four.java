import java.util.Scanner;

// Define the Employee interface
interface Employee {
    void getDetails(); // Method to get employee details
}

// Define the Manager interface extending Employee
interface Manager extends Employee {
    void getDeptDetails(); // Method to get department details
}

// Head class implementing Manager interface
class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    // Implementation of getDetails method
    @Override
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter employee details
        System.out.print("Enter employee id: ");
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        empName = scanner.nextLine();
    }

    // Implementation of getDeptDetails method
    @Override
    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter department details
        System.out.print("Enter department id: ");
        deptId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter department name: ");
        deptName = scanner.nextLine();
    }

    // Method to print all details
    public void printDetails() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

// Main class
public class five_four {
    public static void main(String[] args) {
        // Create an object of Head class67
        Head head = new Head();

        // Get employee details
        head.getDetails();

        // Get department details
        head.getDeptDetails();

        // Print all details
        head.printDetails();
    }
}
