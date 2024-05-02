// Marketing package
package Marketing;
import General.Employee;

public class Sales extends Employee {
    // Constructor
    public Sales(int empId, String empName, double basic) {
        super(empId, empName, basic);
    }

    // Method to calculate travelling allowance
    public double tallowance() {
        double totalEarnings = earnings();
        return 0.05 * totalEarnings; // 5% of total earnings
    }
}
