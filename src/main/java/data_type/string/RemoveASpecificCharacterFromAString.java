package data_type.string;

public class RemoveASpecificCharacterFromAString {
    //Write a method that removes all occurrences of a specific character from a string.


    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        String input = "hello world";
        char charToRemove = 'o';
        System.out.println("String after removing character: " + removeCharacter(input, charToRemove)); // Output: "hell wrld"
    }

}
