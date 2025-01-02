import java.util.HashMap;

public class countDigit {
    public static void main(String[] args) {
        String num = "aabbbcc"; // Input string

        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < num.length(); i++) {
            char currentChar = num.charAt(i);

            // If character is already in the map, increment its count
            if (charCountMap.containsKey(currentChar)) {
                charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
            } else {
                // If character is not in the map, add it with count 1
                charCountMap.put(currentChar, 1);
            }
        }

        // Print the frequency of each character
        System.out.println("Character counts:");
        for (char key : charCountMap.keySet()) {
            System.out.println(key + ": " + charCountMap.get(key));
        }
    }
}
