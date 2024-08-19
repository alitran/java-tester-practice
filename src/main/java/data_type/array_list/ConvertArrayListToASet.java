package data_type.array_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertArrayListToASet {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Cherry");

        // Convert to Set
        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        // Print the Set
        System.out.println("Set without duplicates: " + setWithoutDuplicates);
    }
}
