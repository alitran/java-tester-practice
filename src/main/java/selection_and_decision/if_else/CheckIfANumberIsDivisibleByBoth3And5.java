package selection_and_decision.if_else;

public class CheckIfANumberIsDivisibleByBoth3And5 {

    public static boolean isDivisibility(int number) {
        // return number % 3 == 0 && number % 5 == 0
        if (number % 3 == 0 && number % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isDivisibility(15);  // Output: true
        isDivisibility(10);  // Output: false
    }

}
