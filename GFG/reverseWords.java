package GFG;

public class reverseWords {
    public static void main(String[] args) {
        reverseWords obj = new reverseWords();
        System.out.println(obj.reverseWords("i.like.this.program.very.much"));
    }
    public String reverseWords(String str) {
        String words[] = str.split("\\.");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(".");
            }
        }
        return reversed.toString();
    }
}
