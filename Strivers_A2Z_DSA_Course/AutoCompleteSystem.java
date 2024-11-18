package Strivers_A2Z_DSA_Course;

import java.util.*;

class AutoCompleteSystem {
    class TrieNode {
        Map<String, Integer> sentenceMap; // Sentence frequency map
        Map<Character, TrieNode> children;

        TrieNode() {
            sentenceMap = new HashMap<>();
            children = new HashMap<>();
        }
    }

    private TrieNode root;
    private StringBuilder currentInput;

    public AutoCompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        currentInput = new StringBuilder();

        // Add historical sentences to the Trie
        for (int i = 0; i < sentences.length; i++) {
            addSentence(sentences[i], times[i]);
        }
    }

    private void addSentence(String sentence, int frequency) {
        TrieNode node = root;
        for (char c : sentence.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
            node.sentenceMap.put(sentence, node.sentenceMap.getOrDefault(sentence, 0) + frequency);
        }
    }

    public String[] input(char c) {
        if (c == '#') {
            String completedSentence = currentInput.toString();
            addSentence(completedSentence, 1);
            currentInput.setLength(0);  // Clear the current input
            return new String[0];
        }

        currentInput.append(c);
        TrieNode node = root;
        for (char ch : currentInput.toString().toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return new String[0];
            }
            node = node.children.get(ch);
        }

        // Get the top 3 sentences
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ?
                        a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()
        );

        pq.addAll(node.sentenceMap.entrySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            result.add(pq.poll().getKey());
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] sentences = {"i love you", "island", "ironman", "i love geeksforgeeks"};
        int[] times = {5, 3, 2, 2};
        AutoCompleteSystem system = new AutoCompleteSystem(sentences, times);

        System.out.println(Arrays.toString(system.input('i'))); // Output: ["i love you", "island", "i love geeksforgeeks"]
        System.out.println(Arrays.toString(system.input(' '))); // Output: ["i love you", "i love geeksforgeeks"]
        System.out.println(Arrays.toString(system.input('a'))); // Output: []
        System.out.println(Arrays.toString(system.input('#'))); // Output: []
    }
}
