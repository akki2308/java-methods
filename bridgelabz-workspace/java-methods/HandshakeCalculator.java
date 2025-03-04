import java.util.Scanner;

public class HandshakeCalculator {
    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        int handshake = (n * (n - 1)) / 2; // Combination formula
		return handshake;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Ensuring valid input
        if (n < 2) {
            System.out.println("At least 2 students are needed for a handshake.");
        } else {
            // Calling method to calculate handshakes
            int maxHandshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);
        }

        sc.close();
    }
}
