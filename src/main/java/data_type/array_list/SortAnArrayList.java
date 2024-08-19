package data_type.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Elderberry");
        fruits.add("Cherry");
        fruits.add("Date");

        // Sort the list alphabetically
        Collections.sort(fruits);

        // Print the sorted list
        System.out.println("Sorted fruits: " + fruits);
    }
}
