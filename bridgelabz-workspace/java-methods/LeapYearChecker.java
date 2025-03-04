import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("The Leap Year rule applies only for years 1582 and later.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (≥ 1582): ");
        int year = scanner.nextInt();

        // Validate year and check if it is a leap year
        if (year < 1582) {
            System.out.println("Invalid input. Please enter a year 1582 or later.");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
