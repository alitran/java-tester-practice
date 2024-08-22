package data_type.array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortArrayListObject {

    public static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " ($" + price + ")";
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 699.99));
        products.add(new Product("Tablet", 399.99));
        products.add(new Product("Monitor", 199.99));

        double priceThreshold = 500.00;

        // Filter and sort products
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.price > priceThreshold)
                .sorted(Comparator.comparingDouble(p -> p.price))
                .collect(Collectors.toList());

        // Print the filtered and sorted list
        System.out.println("Filtered and Sorted Products: " + filteredProducts);
    }
}
