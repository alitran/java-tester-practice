package data_type.string;

public class FindAllPermutationsOfAString {

    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            findPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        findPermutations(input, ""); // Output: "abc", "acb", "bac", "bca", "cab", "cba"
    }

}
