package data_type.array_list;

import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Get the size of the list
        int size = fruits.size();

        // Print the size
        System.out.println("Size of the list: " + size);
    }
}
