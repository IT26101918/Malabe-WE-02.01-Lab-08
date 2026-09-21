import java.util.Scanner;

public class IT26101918Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        
        System.out.println("Microsoft Windows [Version 10.0.19045.4780]");
        System.out.println("(c) Microsoft Corporation. All rights reserved.\n");
        
        // 1. Input 8 valid student IDs
        int count = 0;
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = input.nextInt();
            
            // Validate input (check if negative or zero)
            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }
        
        System.out.println();
        
        // 2. Search for a Student ID
        System.out.print("Enter a Student ID to Search: ");
        int searchId = input.nextInt();
        System.out.println();
        
        boolean isFound = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                isFound = true;
                break; // Stop searching once found
            }
        }
        
        // 3. Display search results
        if (isFound) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
        
        input.close();
    }
}
