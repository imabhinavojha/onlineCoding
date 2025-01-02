package GFG;

import java.util.ArrayList;

public class search {
     ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();

        // Step 1: Preprocess the pattern to create the LPS array
        int[] lps = computeLPSArray(pat, m);

        // Step 2: Search the pattern in the text
        int i = 0; // Index for txt
        int j = 0; // Index for pat
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                // Match found, add start index to the result
                result.add(i - j);
                j = lps[j - 1]; // Move to the next potential match
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1]; // Use LPS to avoid unnecessary comparisons
                } else {
                    i++;
                }
            }
        }

        return result;
    }

    private static int[] computeLPSArray(String pat, int m) {
        int[] lps = new int[m];
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

        lps[0] = 0; // LPS of the first character is always 0

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1]; // Fall back in the LPS array
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        search obj = new search();
        String txt1 = "abcab";
        String pat1 = "ab";
        System.out.println(obj.search(pat1, txt1)); // Output: [0, 3]

        String txt2 = "abesdu";
        String pat2 = "edu";
        System.out.println(obj.search(pat2, txt2)); // Output: []

        String txt3 = "aabaacaadaabaaba";
        String pat3 = "aaba";
        System.out.println(obj.search(pat3, txt3)); // Output: [0, 9, 12]
    }
}
