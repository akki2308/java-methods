import java.util.Scanner;

public class LineEquation {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of a line: y = mx + b
    public static double[] findEquationOfLine(double x1, double y1, double x2, double y2) {
        double m, b;

        // Avoid division by zero (Vertical line case)
        if (x1 == x2) {
            throw new IllegalArgumentException("The line is vertical, slope is undefined.");
        }

        // Calculate slope (m)
        m = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b)
        b = y1 - m * x1;

        return new double[]{m, b}; // Return slope and intercept as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and print Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        // Calculate and print equation of the line
        try {
            double[] equation = findEquationOfLine(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.2fx + %.2f%n", equation[0], equation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}