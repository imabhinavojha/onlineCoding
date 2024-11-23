package GFG;

import java.lang.reflect.Array;
import java.util.Arrays;

public class getMinDiff {
    public static void main(String[] args) {

       int k = 2; int arr[] = {1, 5, 8, 10};
       getMinDiff obj = new getMinDiff();
       int vale = obj.getMinDiff(k, arr);
       System.out.println(vale);
        
    }

    public int getMinDiff(int k, int[] arr) {
        int n =arr.length;
        if (n==1) {
            return 0;   
        }
        Arrays.sort(arr);

        int initialDiff = arr[n-1]- arr[0];
        System.out.println("initialDiff "+initialDiff);
        int minDiff = initialDiff;

         // Base heights after adding/subtracting k
         int smallest = arr[0] + k;
         System.out.println("smallest "+smallest);
         int largest = arr[n - 1] - k;
         System.out.println("largest "+largest);

           // Traverse through the sorted array
        for (int i = 1; i < n; i++) {
            System.out.println("\n");
            int minHeight = Math.min(smallest, arr[i] - k);
            System.out.println("minHeight "+minHeight);
            int maxHeight = Math.max(largest, arr[i - 1] + k);
            System.out.println("maxHeight "+maxHeight);
            minDiff = Math.min(minDiff, maxHeight - minHeight);
            System.out.println("minDiff "+minDiff);
            System.out.println("\n");
        }
        
        return minDiff;
    }
    
}
