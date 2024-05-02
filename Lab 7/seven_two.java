import java.util.Scanner;

public class seven_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Performing division operation
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block: " + e);
        } finally {
            // Closing scanner
            scanner.close();
            System.out.println("Scanner closed in the finally block.");
        }
    }
}
