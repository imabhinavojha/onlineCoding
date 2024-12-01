package GFG;

public class circularSubarraySum {
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        int val = circularSubarraySum.circularSubarraySum(arr);
        System.out.println(val);
        
    }

    public static int circularSubarraySum(int a[]) {
        int n = a.length;
        
        // Case 1: Maximum sum using standard Kadane's algorithm
        int maxKadane = kadane(a);
        
        // Case 2: Maximum sum in circular configuration
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
            a[i] = -a[i]; // Invert the array
        }
        
        int maxCircular = totalSum + kadane(a);
        
        // If all elements are negative, maxCircular will be 0
        if (maxCircular > 0) {
            return Math.max(maxKadane, maxCircular);
        } else {
            return maxKadane;
        }

    }    

    // Kadane's algorithm to find maximum subarray sum
    static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}
