package GFG;

public class MinimalCost {
    public static void main(String[] args) {
        int  k = 3;
        int arr[]= {10, 30, 40, 50, 20};
        MinimalCost obj = new MinimalCost();
        int op = obj.minimizeCost(k,arr);
        System.out.printf("Output "+op);
    }
    public int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];

        // Initialize the dp array with maximum possible values
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // The cost to reach the first stone is 0
        dp[0] = 0;

        // Compute minimum cost for each stone
        for (int i = 0; i < n; i++) {
            // Check all the stones Geek can jump to from current stone
            for (int j = i + 1; j <= i + k && j < n; j++) {
                // Update the cost for stone j
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[i] - arr[j]));
            }
        }

        // The minimum cost to reach the last stone
        return dp[n - 1];
    }
}
