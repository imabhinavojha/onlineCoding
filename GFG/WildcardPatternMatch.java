package GFG;

public class WildcardPatternMatch {
    public static void main(String[] args) {
        WildcardPatternMatch obj = new WildcardPatternMatch();
        String pattern = "ba*a?";
        String str = "baaabab";
        int value = obj.wildCard(pattern,str);
        System.out.println(value);
    }

    public int wildCard(String pattern, String str) {
        int m = pattern.length();
        int n = str.length();

        // DP table initialization
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Base case: empty pattern matches empty string
        dp[0][0] = true;

        // Handle patterns with leading '*'
        for (int i = 1; i <= m; i++) {
            if (pattern.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char pChar = pattern.charAt(i - 1);
                char sChar = str.charAt(j - 1);

                if (pChar == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = (pChar == sChar) && dp[i - 1][j - 1];
                }
            }
        }

        // Return 1 if the pattern matches the entire string, otherwise 0
        return dp[m][n] ? 1 : 0;
    }
}
