import java.util.Random;

public class RandomValuesStats {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        System.out.println("Generated 4-digit random numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates a 4-digit number (1000-9999)
            System.out.print(numbers[i] + " ");
            
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / 5;

        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
