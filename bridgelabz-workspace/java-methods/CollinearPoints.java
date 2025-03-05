import java.util.Scanner;

public class CollinearPoints {
    
    // Method to check collinearity using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Check if slopes are equal (Avoid division by zero by using cross multiplication)
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area using the determinant method
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check collinearity using slope method
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area method
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Output results
        if (collinearBySlope && collinearByArea) {
            System.out.println("The three points are collinear.");
        } else {
            System.out.println("The three points are not collinear.");
        }

        scanner.close();
    }
}