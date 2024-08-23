package data_type.string;

import java.util.HashMap;
import java.util.Map;

public class FindTheMostFrequentCharacter {

    public static char mostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Most frequent character: " + mostFrequentCharacter(input)); // Output: 'r'
    }
}
