import java.util.Scanner;

class Box {
    double length, width, height;

    double volume() {
        return length * width * height;
    }
}

public class three_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box();

        System.out.println("Enter length:");
        box.length = scanner.nextDouble();

        System.out.println("Enter width:");
        box.width = scanner.nextDouble();

        System.out.println("Enter height:");
        box.height = scanner.nextDouble();

        System.out.println("Volume: " + box.volume());

        scanner.close();
    }
}
