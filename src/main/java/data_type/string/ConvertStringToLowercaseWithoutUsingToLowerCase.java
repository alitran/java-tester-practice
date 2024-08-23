package data_type.string;

public class ConvertStringToLowercaseWithoutUsingToLowerCase {
    //Write a method that converts all
    // characters in a string to lowercase without using the built-in toLowerCase() method.

    public static String toLowerCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "HELLO";
        System.out.println("Lowercase: " + toLowerCaseCustom(input)); // Output: "hello"
    }
}
