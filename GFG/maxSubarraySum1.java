package GFG;

public class maxSubarraySum1 {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        maxSubarraySum1.maxSubarraySum(arr);
    }

    static int maxSubarraySum(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int sum=0;
        int max=arr[0];
        for (int i : arr) {
            sum+=i;
            max=Math.max(sum,max);
            if(sum<=0){
                sum=0;
            }
        }
        // System.out.println(max);
        return max;
    }
}