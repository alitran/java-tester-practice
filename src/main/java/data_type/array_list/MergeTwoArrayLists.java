package data_type.array_list;

import java.util.ArrayList;

public class MergeTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cherry");
        list2.add("Date");

        // Merge list1 and list2
        ArrayList<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Print the merged list
        System.out.println("Merged List: " + mergedList);
    }
}
