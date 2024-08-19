package data_type.array_list;

import java.util.ArrayList;

public class CheckIfAnElementExists {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Check if "Banana" exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }
    }

}
