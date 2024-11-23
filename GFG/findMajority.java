package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findMajority {
    public static void main(String[] args) {
        findMajority obj = new findMajority();
        int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        List<Integer> value = new ArrayList<>();
        value = obj.findMajority(arr);
        System.out.println(value);
    }
    
      public List<Integer> findMajority(int[] nums) {
         int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        // Return results in sorted order
        Collections.sort(result);
        return result;
    }

}
