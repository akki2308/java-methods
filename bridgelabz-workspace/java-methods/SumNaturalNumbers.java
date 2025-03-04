import java.util.Scanner;

public class SumNaturalNumbers {
    // Method to calculate sum of n natural numbers using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculating sum and displaying output
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNumbers(n));

        sc.close();
    }
}
