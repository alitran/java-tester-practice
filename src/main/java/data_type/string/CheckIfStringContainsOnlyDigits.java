package data_type.string;

public class CheckIfStringContainsOnlyDigits {

    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "12345";
        System.out.println("Contains only digits: " + containsOnlyDigits(input)); // Output: true
    }

}
