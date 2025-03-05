import java.util.Scanner;

public class TriangularParkRun {
    
    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        int rounds = (int) Math.ceil(5000 / perimeter); // Rounding up to ensure full completion
        return rounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for triangle sides
        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();
        
        // Checking if the sides form a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete needs to complete " + rounds + " rounds.");
        } else {
            System.out.println("Invalid triangle sides. Please enter valid values.");
        }

        scanner.close();
    }
}
