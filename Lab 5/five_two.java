import java.util.Scanner;

// Define the Motor interface
interface Motor {
    void run(); // Method to start the motor

    void consume(); // Method to consume power
}

// Implement the Motor interface in WashingMachine class
class WashingMachine implements Motor {
    int capacity; // Data member

    // Constructor to initialize capacity
    public WashingMachine(int capacity) {
        this.capacity = capacity;
    }

    // Implementation of the run method
    public void run() {
        System.out.println("Washing machine motor is running.");
    }

    // Implementation of the consume method
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
}

// Main class to test the implementation
public class five_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the capacity
        System.out.print("Enter capacity of the motor: ");
        int capacity = scanner.nextInt();

        // Create an object of WashingMachine with user-defined capacity
        WashingMachine washingMachine = new WashingMachine(capacity);

        // Invoke methods of the WashingMachine object
        System.out.println("Capacity of the motor: " + washingMachine.capacity);
        washingMachine.run();
        washingMachine.consume();

        scanner.close();
    }
}
