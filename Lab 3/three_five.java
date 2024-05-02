import java.util.Scanner;

public class three_five {
    static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    static double areaSquare(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for Circle, 2 for Triangle, 3 for Square:");
        int choice = scanner.nextInt();

        double areaResult = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter radius:");
                double radius = scanner.nextDouble();
                areaResult = areaCircle(radius);
                System.out.println("Area of Circle: " + areaResult);
                break;
            case 2:
                System.out.println("Enter base:");
                double base = scanner.nextDouble();
                System.out.println("Enter height:");
                double height = scanner.nextDouble();
                areaResult = areaTriangle(base, height);
                System.out.println("Area of Triangle: " + areaResult);
                break;
            case 3:
                System.out.println("Enter side:");
                double side = scanner.nextDouble();
                areaResult = areaSquare(side);
                System.out.println("Area of Square: " + areaResult);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
