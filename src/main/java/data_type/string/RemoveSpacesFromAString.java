package data_type.string;

public class RemoveSpacesFromAString {

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "Hello World ";
        System.out.println("Without spaces: " + removeSpaces(input)); // Output: "HelloWorld"
    }

}
