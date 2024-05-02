//----------5.1-----------

import java.util.Scanner;

abstract class Student {
    protected int rollNo;
    protected int regNo;

    public abstract void course();

    public void getInput(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
}

class Kiitian extends Student {
    private String course;

    public Kiitian(String course) {
        this.course = course;
    }

    @Override
    public void course() {
        System.out.println("Course - " + course);
    }
}

// Driver class
public class five_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for roll number and registration number
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Registration Number: ");
        int regNo = scanner.nextInt();

        // Creating an object of Kiitian
        Kiitian student1 = new Kiitian("B.Tech. (Computer Science & Engg)");
        student1.getInput(rollNo, regNo); // Setting roll no and reg no

        // Printing details
        System.out.println("Roll No: " + student1.rollNo);
        System.out.println("Registration No: " + student1.regNo);
        student1.course(); // Calling course method1

        scanner.close();
    }
}
