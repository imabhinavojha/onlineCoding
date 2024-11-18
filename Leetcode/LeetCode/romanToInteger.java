package Leetcode.LeetCode;

import java.util.HashMap;

public class romanToInteger {
    public static void main(String[] args) {
        romanToInteger obj = new romanToInteger();
        obj.romanToInt("III");

    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i == s.length() - 1 || map.get(s.charAt(i + 1)) <= value) {
                result += value;
            } else {
                result -= value;
            }
        }
        System.out.println(result);
        return result;

    }
}
