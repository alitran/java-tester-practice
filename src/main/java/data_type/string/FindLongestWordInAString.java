package data_type.string;

public class FindLongestWordInAString {

    public static String longestWord(String str) {
        String[] words = str.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String input = "Find the longest word in this sentence";
        System.out.println("Longest word: " + longestWord(input)); // Output: "sentence"
    }

}
