import java.util.Scanner;

class NumberChecker4 {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return (square % Math.pow(10, String.valueOf(num).length())) == num;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Number: " + num);
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon: " + isNeon(num));
        System.out.println("Spy: " + isSpy(num));
        System.out.println("Automorphic: " + isAutomorphic(num));
        System.out.println("Buzz: " + isBuzz(num));
        
        scanner.close();
    }
}