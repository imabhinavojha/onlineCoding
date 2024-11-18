package GFG;

import java.util.Stack;

public class MaximumDifference {
    public static void main(String[] args) {
        MaximumDifference sol = new MaximumDifference();
//        int[] arr1 = {2, 1, 8};
        int[] arr2 = {2, 4, 8, 7, 7, 9, 3};

//        System.out.println(sol.findMaxDiff(arr1, arr1.length)); // Output: 1
        System.out.println(sol.findMaxDiff(arr2, arr2.length)); // Output: 4
    }

    public int findMaxDiff(int arr[], int n) {
        int[] ls = new int[n]; // Array to store the nearest left smaller elements
        int[] rs = new int[n]; // Array to store the nearest right smaller elements
        Stack<Integer> stack = new Stack<>();

        // Finding the nearest left smaller elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ls[i] = 0;
            } else {
                ls[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        // Clear the stack for the next operation
        stack.clear();

        // Finding the nearest right smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rs[i] = 0;
            } else {
                rs[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        // Finding the maximum absolute difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(ls[i] - rs[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }

    public static class pushZerosToEnd {
    }
}

