package data_type.array_list;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayListIntoTwoParts {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Split the list
        List<Integer> firstHalf = numbers.subList(0, numbers.size() / 2);
        List<Integer> secondHalf = numbers.subList(numbers.size() / 2, numbers.size());

        // Print both halves
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);
    }
}
