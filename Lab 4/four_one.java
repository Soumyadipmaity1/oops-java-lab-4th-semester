import java.util.Scanner;

class TwoD {
    protected double length;
    protected double width;

    TwoD(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class ThreeD extends TwoD {
    protected double height;

    ThreeD(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

public class four_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for plastic (length, width, height):");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        ThreeD box = new ThreeD(length, width, height);
        double cost = box.volume() * 60; // Cost of box: Rs 60 per cubic ft

        System.out.println("Cost of plastic: Rs " + cost);

        scanner.close();
    }
}
