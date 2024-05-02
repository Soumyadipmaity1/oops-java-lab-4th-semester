import java.util.Scanner;

public class one_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No:");
        String rollNo = scanner.nextLine();

        System.out.println("Enter Section:");
        String section = scanner.nextLine();

        System.out.println("Enter Branch:");
        String branch = scanner.nextLine();

        System.out.println("Display Name: " + name);
        System.out.println("Display Roll No: " + rollNo);
        System.out.println("Display Section: " + section);
        System.out.println("Display Branch: " + branch);

        scanner.close();
    }
}
