package data_type.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Shuffle the list
        Collections.shuffle(numbers);

        // Print the shuffled list
        System.out.println("Shuffled List: " + numbers);
    }
}
