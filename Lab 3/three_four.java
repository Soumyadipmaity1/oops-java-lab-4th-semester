import java.util.Scanner;

public class three_four {
    // Subtract method with two integer parameters
    static int subtract(int a, int b) {
        return a - b;
    }

    // Subtract method with two double parameters
    static double subtract(double a, double b) {
        return a - b;
    }

    // Subtract method with three integer parameters
    static int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers for subtraction 1 (integer):");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Subtraction 1: " + subtract(num1, num2));

        System.out.println("Enter two numbers for subtraction 2 (double):");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        System.out.println("Subtraction 2: " + subtract(num3, num4));

        System.out.println("Enter three numbers for subtraction 3 (integer):");
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        System.out.println("Subtraction 3: " + subtract(num5, num6, num7));

        scanner.close();
    }
}
