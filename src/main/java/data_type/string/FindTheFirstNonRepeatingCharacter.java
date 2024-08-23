package data_type.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheFirstNonRepeatingCharacter {
    public static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null; // or throw an exception
    }

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(input)); // Output: 'w'
    }
}
