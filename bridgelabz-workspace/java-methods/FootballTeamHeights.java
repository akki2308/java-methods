public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm using Math.random()
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // (250 - 150 + 1) = 101
        }

        // Display heights
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate and display results
        System.out.println("Total Height: " + getTotalHeight(heights) + " cm");
        System.out.println("Mean Height: " + getMeanHeight(heights) + " cm");
        System.out.println("Shortest Player: " + getShortestHeight(heights) + " cm");
        System.out.println("Tallest Player: " + getTallestHeight(heights) + " cm");
    }

    // Method to calculate total height
    public static int getTotalHeight(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double getMeanHeight(int[] heights) {
        return (double) getTotalHeight(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int getShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int getTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}