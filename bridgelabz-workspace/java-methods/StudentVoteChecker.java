import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Eligible to vote if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Loop to take input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if student can vote
            boolean eligible = canStudentVote(studentAges[i]);

            // Display the result
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (eligible) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
