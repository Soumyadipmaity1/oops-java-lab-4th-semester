import java.util.Scanner;

public class two_four {
    static int count = 0;

    public two_four() {
        count++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of objects created:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            new two_four();
        }

        System.out.println("Number of objects created: " + count);

        scanner.close();
    }
}
