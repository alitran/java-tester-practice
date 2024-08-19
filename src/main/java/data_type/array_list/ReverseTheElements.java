package data_type.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseTheElements {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("First");
        items.add("Second");
        items.add("Third");
        items.add("Fourth");

        // Reverse the list
        Collections.reverse(items);

        // Print the reversed list
        System.out.println("Reversed List: " + items);
    }
}
