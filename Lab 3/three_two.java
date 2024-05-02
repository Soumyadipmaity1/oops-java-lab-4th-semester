import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        length = scanner.nextDouble();
        System.out.println("Enter breadth:");
        breadth = scanner.nextDouble();
        scanner.close();
    }

    double calculateArea() {
        return length * breadth;
    }

    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}

public class three_two {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.read();
        rect.display();
    }
}
