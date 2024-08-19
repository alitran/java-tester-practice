package data_type.array_list;

import java.util.ArrayList;

public class IterateOverAnArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Iterate over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
