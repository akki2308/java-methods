import java.util.Scanner;

public class NumberCheck {
    // Method to check the number type
    public static int checkNumber(int num) {
        if (num > 0) return 1;   // Positive number
        if (num < 0) return -1;  // Negative number
        return 0;                // Zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking number type
        int result = checkNumber(num);

        // Displaying result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
