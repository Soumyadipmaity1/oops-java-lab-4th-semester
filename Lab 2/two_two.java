public class two_two {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Please enter 10 numbers from the command line.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
