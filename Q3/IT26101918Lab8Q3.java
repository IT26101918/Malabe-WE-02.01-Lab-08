import java.util.Scanner;

public class IT26101918Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an integer array of size 6
        int[] numbers = new int[6];
        int count = 0;

        // Loop until 6 positive numbers are successfully entered
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = scanner.nextInt();

            // Check if the number is positive (greater than zero)
            if (input > 0) {
                numbers[count] = input;
                count++;
            } else {
                // Display error message if the number is negative or zero
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Print the array contents
        System.out.println("\nArray Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Find the maximum number in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the maximum number
        System.out.println("The Maximum Number Entered: " + max);

        scanner.close();
    }
}
