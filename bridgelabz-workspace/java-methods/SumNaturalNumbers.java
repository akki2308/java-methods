import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Compute sum using recursion
        int sumRec = sumRecursive(n);

        // Compute sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Display the results
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumFormula);

        // Check if both results are the same
        if (sumRec == sumFormula) {
            System.out.println("Both computations are correct and match!");
        } else {
            System.out.println("There is a mismatch in the results.");
        }
    }
}
