package data_type.string;

public class CheckIfAStringContainsOnlyLetters {

    public static boolean containsOnlyLetters(String str) {
        return str.chars().allMatch(Character::isLetter);
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("Contains only letters: " + containsOnlyLetters(input)); // Output: true
    }

}
