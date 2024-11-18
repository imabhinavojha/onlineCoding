package Leetcode;

public class editDistance {
    public static void main(String[] args) {
        editDistance obj = new editDistance();
        int value = obj.minDistance1("nbydyteoxa","dzfaz");
        System.out.println(value);
    }

    public int minDistance1(String str1, String str2) {
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=1 ; i<str1.length()+1 ; i++){
            for(int j=1 ; j<str2.length()+1 ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int insertCount = str2.length()-dp[str1.length()][str2.length()];
        int removeCount = str1.length()-dp[str1.length()][str2.length()];
        return insertCount + removeCount;
    }

    public int minDistance(String word1, String word2) {
        return calculateDistance(word1, word2, word1.length(), word2.length());
    }

    private int calculateDistance(String word1, String word2, int m, int n) {
        // Base cases
        if (m == 0) {
            return n; // If word1 is empty, we need to insert all characters of word2
        }
        if (n == 0) {
            return m; // If word2 is empty, we need to delete all characters of word1
        }

        // If the last characters of the strings match, no operation is needed for this character
        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return calculateDistance(word1, word2, m - 1, n - 1);
        }

        // If the last characters don't match, consider all three operations:
        // 1. Insert
        // 2. Delete
        // 3. Replace
        // Take the minimum of these operations and add 1 to account for the current operation
        //horses ros
        //hors ros

        int insertOp = 1 + calculateDistance(word1, word2, m, n - 1);
        int deleteOp = 1 + calculateDistance(word1, word2, m - 1, n);
        int replaceOp = 1 + calculateDistance(word1, word2, m - 1, n - 1);

        return  Math.min(insertOp, Math.min(deleteOp, replaceOp));
    }

}
