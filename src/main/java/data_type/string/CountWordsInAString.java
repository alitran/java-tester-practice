package data_type.string;

public class CountWordsInAString {

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Hello world, welcome to Java programming.";
        System.out.println("Word count: " + countWords(input)); // Output: 6
    }

}
