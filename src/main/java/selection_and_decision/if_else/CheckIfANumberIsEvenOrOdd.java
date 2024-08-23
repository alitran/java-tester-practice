package selection_and_decision.if_else;

public class CheckIfANumberIsEvenOrOdd {
    public static boolean isEven(int number) {
        //c1:
        return number % 2 == 0;
        //c2:
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void main(String[] args) {
        isEven(10);  // Output: true
        isEven(7);   // Output: false
    }
}
