import java.util.Arrays;

public class IT26101918Lab8Q2 {
    public static void main(String[] args) {
        // Initialize arrays A and B as specified in the question
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        
        // Declare array C with a size of 5
        int[] C = new int[5];

        // Calculate A + B and store the result in array C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print A Array Contents
        System.out.println("A Array Contents:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n");

        // Print B Array Contents
        System.out.println("B Array Contents:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("\n");

        // Print C Array Contents (A + B)
        System.out.println("C Array Contents (A + B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
