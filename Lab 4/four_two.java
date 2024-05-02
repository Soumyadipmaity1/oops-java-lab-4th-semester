import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box: Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("Wood Box: Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thick);
    }
}

public class four_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for Plate (length, width):");
        double plateLength = scanner.nextDouble();
        double plateWidth = scanner.nextDouble();
        Plate plate = new Plate(plateLength, plateWidth);

        System.out.println("Enter dimensions for Box (length, width, height):");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);

        System.out.println("Enter dimensions for Wood Box (length, width, height, thickness):");
        double woodBoxLength = scanner.nextDouble();
        double woodBoxWidth = scanner.nextDouble();
        double woodBoxHeight = scanner.nextDouble();
        double woodBoxThickness = scanner.nextDouble();
        WoodBox woodBox = new WoodBox(woodBoxLength, woodBoxWidth, woodBoxHeight, woodBoxThickness);

        scanner.close();
    }
}
