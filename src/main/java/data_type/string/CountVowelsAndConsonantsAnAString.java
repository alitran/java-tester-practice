package data_type.string;

public class CountVowelsAndConsonantsAnAString {

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsAndConsonants(input); // Output: Vowels: 3, Consonants: 7
    }

}
