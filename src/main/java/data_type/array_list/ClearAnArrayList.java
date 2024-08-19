package data_type.array_list;

import java.util.ArrayList;

public class ClearAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Clear the list
        fruits.clear();

        // Print the list after clearing
        System.out.println("Fruits after clearing: " + fruits);
    }
}
