import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class two_five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list of numbers separated by space:");
        String[] nums = scanner.nextLine().split(" ");

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (String num : nums) {
            int n = Integer.parseInt(num);
            occurrences.put(n, occurrences.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
