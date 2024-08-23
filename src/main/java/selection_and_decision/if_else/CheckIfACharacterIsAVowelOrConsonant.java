package selection_and_decision.if_else;

public class CheckIfACharacterIsAVowelOrConsonant {

    public static String checkVowelOrConsonant(char c) {
        if (Character.isDigit(c)) {
            throw new RuntimeException("is not a letter.");
        }
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "vowel";
        }
        return "consonant";
    }

    public static void main(String[] args) {
        checkVowelOrConsonant('a');  // Output: a is a vowel.
        checkVowelOrConsonant('b');  // Output: b is a consonant.
        checkVowelOrConsonant('1');  // Output: 1 is not a letter.
    }
}
