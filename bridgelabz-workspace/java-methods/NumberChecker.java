import java.util.*;

public class NumberChecker {
    
    public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0") && number > 0;
    }

    public static boolean isArmstrong(int number) {
        int sum = 0, temp = number, digits = String.valueOf(number).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }

    public static void findLargestAndSmallest(int number) {
        int largest = 0, secondLargest = 0, smallest = 9, secondSmallest = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) { secondLargest = largest; largest = digit; }
            else if (digit > secondLargest) secondLargest = digit;

            if (digit < smallest) { secondSmallest = smallest; smallest = digit; }
            else if (digit < secondSmallest) secondSmallest = digit;

            number /= 10;
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + (secondLargest == largest ? "N/A" : secondLargest));
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + (secondSmallest == smallest ? "N/A" : secondSmallest));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println("\nIs Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrong(number));
        findLargestAndSmallest(number);
    }
}
