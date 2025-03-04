import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the three sides
        System.out.print("Enter the three sides of the triangular park (in meters): ");
        double side1 = sc.nextDouble(), side2 = sc.nextDouble(), side3 = sc.nextDouble();

        // Checking if valid triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            double perimeter = side1 + side2 + side3;
            System.out.println("Rounds needed: " + (int) Math.ceil(5000 / perimeter));
        } else {
            System.out.println("Invalid triangle sides.");
        }

        sc.close();
    }
}
