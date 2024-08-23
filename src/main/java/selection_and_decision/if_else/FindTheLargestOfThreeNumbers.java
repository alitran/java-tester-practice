package selection_and_decision.if_else;

public class FindTheLargestOfThreeNumbers {

    public static void findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }

    public static void main(String[] args) {
        findLargest(10, 20, 30);  // Output: 30 is the largest number.
        findLargest(50, 10, 20);  // Output: 50 is the largest number.
        findLargest(5, 5, 5);     // Output: 5 is the largest number.
    }

}
