import java.util.Arrays;

public class NumberChecker3 {
    
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    public static int[] reverseArray(int[] array) {
        int[] reversed = Arrays.copyOf(array, array.length);
        for (int i = 0, j = reversed.length - 1; i < j; i++, j--) {
            int temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
        }
        return reversed;
    }
    
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }
    
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }
    
    public static void main(String[] args) {
        int number = 12321;
        int duckNumber = 1023;
        
        System.out.println("Count of digits: " + countDigits(number));
        
        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));
        
        int[] reversedArray = reverseArray(digitsArray);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
        
        System.out.println("Is Palindrome: " + isPalindrome(number));
        
        System.out.println("Is Duck Number: " + isDuckNumber(duckNumber));
    }
}