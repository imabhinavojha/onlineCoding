package GFG;

import java.util.List;

public class maxSumPathInTwoArray {

    public static void main(String[] args) {
        maxSumPathInTwoArray maxSumPath = new maxSumPathInTwoArray();

        List<Integer> arr1 = List.of(2, 3, 7, 10, 12);
        List<Integer> arr2 = List.of(1, 5, 7, 8);

        int maxSum = maxSumPath.maxPathSum(arr1, arr2);
        System.out.println("Maximum sum path: " + maxSum);

        List<Integer> arr3 = List.of(1, 2, 3);
        List<Integer> arr4 = List.of(3, 4, 5);

        maxSum = maxSumPath.maxPathSum(arr3, arr4);
        System.out.println("Maximum sum path: " + maxSum);
    }

    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        int m = arr1.size();
        int n = arr2.size();

        // Traverse both lists
        while (i < m && j < n) {
            // If current element of arr1 is smaller, add it to sum1
            if (arr1.get(i) < arr2.get(j)) {
                sum1 += arr1.get(i);
                i++;
            }
            // If current element of arr2 is smaller, add it to sum2
            else if (arr1.get(i) > arr2.get(j)) {
                sum2 += arr2.get(j);
                j++;
            }
            // If common element is found, take the maximum of sum1 and sum2,
            // add the common element to result and reset the sums
            else {
                result += Math.max(sum1, sum2) + arr1.get(i);
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < m) {
            sum1 += arr1.get(i);
            i++;
        }

        // Add remaining elements of arr2
        while (j < n) {
            sum2 += arr2.get(j);
            j++;
        }

        // Add the maximum of the two sums to the result
        result += Math.max(sum1, sum2);

        return result;
    }

}
