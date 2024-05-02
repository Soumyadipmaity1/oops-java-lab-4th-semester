import java.util.Scanner;

public class seven_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numbers separated by spaces: ");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            System.out.print("Enter the array size: ");
            int size = scanner.nextInt();

            int[] array = new int[size];
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }

            // Accessing an element outside the array size
            int element = array[size];
            System.out.println("Element at index " + size + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format: " + e);
        } finally {
            scanner.close();
        }
    }
}
