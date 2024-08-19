package data_type.array_list;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Cherry");
        listWithDuplicates.add("Banana");

        // Remove duplicates using a LinkedHashSet
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));

        // Print the list without duplicates
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}
