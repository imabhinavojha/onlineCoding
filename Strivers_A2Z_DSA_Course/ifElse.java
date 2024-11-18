package Strivers_A2Z_DSA_Course;

public class ifElse {
    public static void main(String[] args) {
        ifElse.compareNM(9,4);
    }

    public static String compareNM(int n, int m) {
        String value = n < m ? "lesser" : (n > m ? "greater" : "equal");
        System.out.println(value);
        return value;
    }
}
