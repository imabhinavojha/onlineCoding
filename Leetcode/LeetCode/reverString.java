package Leetcode.LeetCode;

public class reverString {
    public static void main(String[] args) {
        reverString obj = new reverString();
        String ss = "a good   example";
        obj.reverseWords(ss);
        
    }
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
