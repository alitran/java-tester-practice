package data_type.string;

public class ConvertStringToIntegerWithoutUsingParseInt {

    public static int stringToInteger(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result = result * 10 + (c - '0');
            } else {
                throw new NumberFormatException("Invalid character found: " + c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "1234";
        System.out.println("Converted integer: " + stringToInteger(input)); // Output: 1234
    }

}
