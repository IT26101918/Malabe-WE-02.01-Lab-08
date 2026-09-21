import java.util.Scanner;

public class IT26101918Lab8Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define arrays with a size of 5
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        
        System.out.println("Enter 5 Numbers:");
        
        // Read 5 numbers from user input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        
        // Find even numbers and store them in evenArray
        int evenIndex = 0;
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }
        
        System.out.println();
        
        // Print myArray contents
        System.out.println("myArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }
        
        System.out.println("\n");
        
        // Print evenArray contents
        System.out.println("evenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
