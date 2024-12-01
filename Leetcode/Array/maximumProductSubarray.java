package Leetcode.Array;

public class maximumProductSubarray {
    public static void main(String[] args) {
        
        
        maximumProductSubarray obj = new maximumProductSubarray();
        
        // int[] arr = { 0, 2, 3};
        // obj.maxProduct(arr);
        
        // int[] arr1 = { 0, 2};
        // obj.maxProduct1(arr1);

        int[] arr2 = { -2, 6, -3, -10, 0, 2};
        int val =  obj.maxProduct2(arr2);
        System.out.println(val);
    }

    public int maxProduct(int[] nums) {
        int max = 0;
        if (nums.length <= 1) {
            max = nums[0];
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (max <= nums[i] * nums[i + 1]) {
                    max = nums[i] * nums[i + 1];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public int maxProduct1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
    
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxSoFar = nums[0];
    
        for (int i = 1; i < nums.length; i++) {
            int temp = maxEndingHere;
            maxEndingHere = Math.max(Math.max(nums[i], maxEndingHere * nums[i]), minEndingHere * nums[i]);
            minEndingHere = Math.min(Math.min(nums[i], temp * nums[i]), minEndingHere * nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
    
        System.out.println(maxSoFar);
        return maxSoFar;
    }

    public int maxProduct2(int[] arr) {
        int n = arr.length;
        int fpro = 1;
        int bpro = 1;
        int max = Integer.MIN_VALUE;
        for(int i =0,j=n-1;i<n;i++,j--){
            fpro *=arr[i];
            bpro *=arr[j];
            if(bpro>max){
                max = bpro;
                
            }
            if(fpro>max){
                max = fpro;
            }
              if(fpro==0){
                fpro = 1;
            }
            if(bpro==0){
                bpro = 1;
            }

        }
        return max;
    }
}
