package GFG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordbreak {

    public static void main(String[] args) {
        // Test cases
        String s1 = "catsandog";
        List<String> wordDict1 = Arrays.asList("cats","dog","sand","and","cat");
        System.out.println(wordBreak(s1, wordDict1)); // Output: true

    }
    public static boolean wordBreak1(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        // Create a DP array where dp[i] indicates if the substring s[0..i) can be segmented
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Base case: empty string can always be segmented

        // Fill the DP array
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        // The answer is whether the entire string can be segmented
        return dp[s.length()];


    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return wordBreakHelper(s, wordSet);
    }

    private static boolean wordBreakHelper(String s, Set<String> wordSet) {
        // Base case: if the string is empty, return true
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (wordSet.contains(s.substring(0, i)) && wordBreakHelper(s.substring(i), wordSet)) {
                return true;
            }
        }

        // If no valid segmentation is found, return false
        return false;
    }

}
