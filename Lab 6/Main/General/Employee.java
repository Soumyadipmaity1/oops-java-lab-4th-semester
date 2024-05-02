// General package
package General;

public class Employee {
    public int empId;
    private String empName;
    private double basic;

    // Constructor
    public Employee(int empId, String empName, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.basic = basic;
    }

    // Method to calculate total earnings
    public double earnings() {
        double DA = 0.8 * basic; // 80% of basic
        double HRA = 0.15 * basic; // 15% of basic
        return basic + DA + HRA;
    }
}
