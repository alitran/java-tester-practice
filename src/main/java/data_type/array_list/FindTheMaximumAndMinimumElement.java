package data_type.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class FindTheMaximumAndMinimumElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);

        // Find maximum and minimum
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        // Print the results
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
