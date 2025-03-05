import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit marks for PCM subjects
    public static int[][] generateMarks(int numStudents) {
        Random random = new Random();
        int[][] marks = new int[numStudents][3]; // [Physics, Chemistry, Math]

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 40 + random.nextInt(61); // Random marks between 40-100 (passing marks)
            marks[i][1] = 40 + random.nextInt(61);
            marks[i][2] = 40 + random.nextInt(61);
        }

        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounding to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n", 
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], 
                              results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generating random marks
        int[][] marks = generateMarks(numStudents);

        // Calculating scores
        double[][] results = calculateScores(marks);

        // Displaying scorecard
        displayScorecard(marks, results);

        scanner.close();
    }
}