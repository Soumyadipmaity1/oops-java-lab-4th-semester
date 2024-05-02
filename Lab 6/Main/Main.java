import Marketing.Sales;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        String empName = scanner.nextLine();
        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        Sales salesPerson = new Sales(empId, empName, basic);

        System.out.println("The emp id of the employee is " + salesPerson.empId);

        double totalEarnings = salesPerson.earnings();
        System.out.println("The total earning is " + totalEarnings);

        double travellingAllowance = salesPerson.tallowance();
        System.out.println("The travelling allowance is " + travellingAllowance);

        scanner.close();
    }
}
