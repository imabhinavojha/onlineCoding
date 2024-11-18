package GFG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class secondLargest {

    public static void main(String[] args) {
        secondLargest obj  = new secondLargest();
//        int arr[] = {12, 35, 1, 10, 34, 1};
        int arr[] = {5, 10, 10};
        int value = obj.getSecondLargest(arr);
        System.out.println(value);
    }

    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements for a second largest
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest if it's not equal to the largest
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
