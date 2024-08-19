package data_type.array_list;

import java.util.ArrayList;

public class ReplaceAllElements {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("cherry");

        // Replace all elements with uppercase versions
        items.replaceAll(String::toUpperCase);

        // Print the modified list
        System.out.println("Uppercase List: " + items);
    }
}
