import java.util.Scanner;

// User-defined NegativeNumberException class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class seven_three {
    public void processInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("Number should be positive");
            } else {
                System.out.println("Double value: " + (number * 2));
            }
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        seven_three processInput = new seven_three();
        processInput.processInput();
    }
}
