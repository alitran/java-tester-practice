package data_type.string;

public class ConvertStringToTitleCase {

    public static String toTitleCase(String str) {
        String[] words = str.split("\\s+");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return titleCase.toString().trim();
    }

    public static void main(String[] args) {
        String input = "this is a test string";
        System.out.println("Title Case: " + toTitleCase(input)); // Output: "This Is A Test String"
    }

}
