package selection_and_decision.if_else;

public class CheckLeapYear {

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        isLeapYear(2020);  // Output: 2020 is a leap year.
        isLeapYear(1900);  // Output: 1900 is not a leap year.
        isLeapYear(2000);  // Output: 2000 is a leap year.
    }
}
