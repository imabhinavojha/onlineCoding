public class NearestToTarget {
    public static void main(String[] args) {
        int targetValue = 100;  // The target value
        int num1 = 500;          // First number
        int num2 = 110;         // Second number
        
        // Find the nearest number
        int nearest = findNearestToTarget(targetValue, num1, num2);

        // Output the result
        System.out.println("The nearest number to " + targetValue + " is: " + nearest);
    }

    // Method to find the nearest number to targetValue
    public static int findNearestToTarget(int target, int num1, int num2) {
        // Calculate the absolute differences between the numbers and the target value
        int diff1 = Math.abs(target - num1);
        int diff2 = Math.abs(target - num2);

        // Return the number with the smallest difference
        if (diff1 < diff2) {
            return num1;
        } else if (diff2 < diff1) {
            return num2;
        } else {
            // If both numbers are equally distant from the target, return the smaller one
            return Math.min(num1, num2);
        }
    }
}
