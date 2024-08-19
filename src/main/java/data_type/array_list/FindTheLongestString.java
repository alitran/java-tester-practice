package data_type.array_list;

import java.util.ArrayList;

public class FindTheLongestString {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Elderberry");

        // Find the longest string
        String longest = words.get(0);
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Print the longest string
        System.out.println("Longest word: " + longest);
    }
}
