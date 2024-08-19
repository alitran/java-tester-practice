package data_type.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Convert ArrayList to Array
        String[] fruitsArray = fruits.toArray(new String[0]);

        // Print the array
        System.out.println("Fruits Array: " + Arrays.toString(fruitsArray));
    }
}
