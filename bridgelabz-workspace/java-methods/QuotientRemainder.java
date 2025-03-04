import java.util.Scanner;

public class QuotientRemainder {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the dividend: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Ensuring divisor is not zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            // Calling method
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying output
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        sc.close();
    }
}
