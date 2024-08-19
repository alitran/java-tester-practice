package data_type.array_list;

import java.util.ArrayList;
import java.util.List;

public class FindPairsWithASpecificSum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);

        int targetSum = 6;

        // Find pairs with the target sum
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == targetSum) {
                    System.out.println("Pair: " + numbers.get(i) + ", " + numbers.get(j));
                }
            }
        }
    }
}
