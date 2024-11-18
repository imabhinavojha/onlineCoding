package GFG;

public class fibnocci {
    public static int nthFibonacci(int n) {
        // Handle edge cases
        if (n == 1 || n == 2) {
            return 1;
        }

        // Initialize the first two Fibonacci numbers
        int prev1 = 1, prev2 = 1;
        int current = 0;

        // Iterate from 3 to n to compute the Nth Fibonacci number
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 6; // Example input
        int result = nthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
