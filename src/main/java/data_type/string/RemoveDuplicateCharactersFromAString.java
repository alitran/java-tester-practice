package data_type.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersFromAString {

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "banana";
        System.out.println("Without duplicates: " + removeDuplicates(input)); // Output: "ban"
    }
}
