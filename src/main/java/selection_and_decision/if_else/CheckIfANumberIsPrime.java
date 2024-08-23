package selection_and_decision.if_else;

public class CheckIfANumberIsPrime {

    public static boolean checkPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        checkPrime(29);  // Output: 29 is a prime number.
        checkPrime(10);  // Output: 10 is not a prime number.
    }
}
