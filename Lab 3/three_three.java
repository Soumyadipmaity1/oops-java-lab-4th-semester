import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        roll = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter CGPA:");
        cgpa = scanner.nextDouble();
        scanner.close();
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
    
}

public class three_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        
        Student[] students = new Student[n];
        double lowestCgpa = Double.MAX_VALUE;
        String lowestCgpaName = "";

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i].input();
            if (students[i].cgpa < lowestCgpa) {
                lowestCgpa = students[i].cgpa;
                lowestCgpaName = students[i].name;
            }
        }

        System.out.println("Details of students:");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        System.out.println("Student with lowest CGPA: " + lowestCgpaName);
        
        scanner.close();
    }
}
