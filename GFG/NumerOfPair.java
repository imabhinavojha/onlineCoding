package GFG;

import java.util.Arrays;

public class NumerOfPair {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        int brr [] = {1, 2, 3};
        NumerOfPair obj = new NumerOfPair();
//        Long value = obj.countPairs(arr,brr, arr.length, brr.length);
//        System.out.println(value);
        Long value1 =  obj.countPairs1(arr, brr, arr.length, brr.length);
        System.out.println(value1);

    }
        public long countPairs(int arr[], int brr[], int M, int N) {
        // Sort brr[] to facilitate binary search
        Arrays.sort(brr);

        // Count occurrences of 0, 1, 2, 3, and 4 in brr
        int[] countY = new int[5];
        for (int i = 0; i < N; i++) {
            if (brr[i] < 5) {
                countY[brr[i]]++;
            }
        }

        long totalPairs = 0;

        // Iterate through each element in arr and count valid pairs
        for (int x : arr) {
            totalPairs += countValidPairs(x, brr, countY, N);
        }


        return totalPairs;
    }

    private long countValidPairs(int x, int brr[], int[] countY, int N) {


        // Handle special cases based on the value of x
        if (x == 0) {
            // No valid pairs when x = 0
            return 0;
        }
        if (x == 1) {
            // When x = 1, valid pairs are only with y = 0
            return countY[0];
        }

        // Find the number of elements in brr greater than x using binary search
        int idx = Arrays.binarySearch(brr, x);
        System.out.println("idx : "+idx);
        if (idx < 0) {
            idx = -(idx + 1);
        } else {
            // If x is present multiple times in brr, find the index after the last occurrence of x
            while (idx < N && brr[idx] == x) {
                idx++;
                System.out.println("after while : "+idx);
            }
        }
        long count = N - idx;

        // Add the number of y's that are 0 or 1
        count += (countY[0] + countY[1]);

        // Adjust the count based on specific values of x
        if (x == 2) {
            // Subtract the count of y = 3 and y = 4 since 2^3 < 3^2 and 2^4 < 4^2
            count -= (countY[3] + countY[4]);
        }
        if (x == 3) {
            // Add the count of y = 2 since 3^2 > 2^3
            count += countY[2];
        }

        return count;
    }

    public long countPairs1(int[] arr, int[] brr, int m, int n) {

        // Create arrays to hold transformed values
        double[] x = new double[m];
        double[] y = new double[n];

        // Transform arr[] -> x[] by computing log(x)/x
        for (int i = 0; i < m; i++) {
            x[i] = Math.log(arr[i]) / arr[i];
        }

        // Transform brr[] -> y[] by computing log(y)/y
        for (int i = 0; i < n; i++) {
            y[i] = Math.log(brr[i]) / brr[i];
        }

        // Sort the transformed arrays
        Arrays.sort(x);
        Arrays.sort(y);

        // Count valid pairs
        long count = 0;
        int j = 0;

        // Traverse through each element in x[] and count how many y[] values are smaller
        for (int i = 0; i < m; i++) {
            while (j < n && y[j] < x[i]) {
                j++;
            }
            count += j;  // All elements before j are valid
        }

        return count;
    }
}
