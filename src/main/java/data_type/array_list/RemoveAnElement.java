package data_type.array_list;

import java.util.ArrayList;

public class RemoveAnElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Remove "Cherry"
        fruits.remove("Cherry");

        // Print the list
        System.out.println("Fruits after removal: " + fruits);
    }
}
