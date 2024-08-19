package data_type.array_list;

import java.util.ArrayList;

public class FindTheIndexOfAnElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Find the index of "Date"
        int index = fruits.indexOf("Date");

        // Print the index
        System.out.println("Index of 'Date': " + index);
    }
}
