package data_type.array_list;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementsBetweenTwoArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        // Find common elements
        List<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);

        // Print common elements
        System.out.println("Common elements: " + commonElements);
    }
}
