import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Default constructor to initialize length and breadth to zero
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor to initialize length and breadth according to user input
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

public class three_six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Rectangle rect1 = new Rectangle();

        System.out.println("Area of Rectangle with default length and breadth: " + rect1.area());

        // Using parameterized constructor with user input
        System.out.println("Enter length:");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth:");
        double breadth = scanner.nextDouble();

        Rectangle rect2 = new Rectangle(length, breadth);

        System.out.println("Area of Rectangle with user-defined length and breadth: " + rect2.area());

        scanner.close();
    }
}
