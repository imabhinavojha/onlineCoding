package GFG;

import java.io.IOException;
import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) throws IOException {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int value1 = KthSmallest.kthSmallest(arr,  k);
        System.out.println(value1);
    }

    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        int value = 0;
        for (int i = 0; i < k; i++) {
            value = arr[i];
        }
        return  value;

    }
}
