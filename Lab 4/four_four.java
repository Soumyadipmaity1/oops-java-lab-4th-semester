import java.util.Scanner;

class Account {
    protected int acc_no;
    protected double balance;

    void input(Scanner scanner) {
        System.out.println("Enter Account Number:");
        acc_no = scanner.nextInt();
        System.out.println("Enter Balance:");
        balance = scanner.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    void disp() {
        super.disp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter Aadhar Number:");
        aadhar_no = scanner.nextLong();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class four_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(scanner);
            persons[i].disp();
        }
        scanner.close(); // Close the scanner after its usage
    }
}
