import java.util.Scanner;

// Custom exception classes
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

// Time class with data members and method to take time input
class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime() throws HrsException, MinException, SecException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter hours: ");
            hours = scanner.nextInt();
            if (hours < 0 || hours > 24) {
                throw new HrsException("Hour is not between 0 and 24");
            }

            System.out.print("Enter minutes: ");
            minutes = scanner.nextInt();
            if (minutes < 0 || minutes > 60) {
                throw new MinException("Minute is not between 0 and 60");
            }

            System.out.print("Enter seconds: ");
            seconds = scanner.nextInt();
            if (seconds < 0 || seconds > 60) {
                throw new SecException("Second is not between 0 and 60");
            }
        } finally {
            scanner.close();
        }
    }

    public void displayTime() {
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class seven_four {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.setTime();
            time.displayTime();
        } catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getName() + ": " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getName() + ": " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
