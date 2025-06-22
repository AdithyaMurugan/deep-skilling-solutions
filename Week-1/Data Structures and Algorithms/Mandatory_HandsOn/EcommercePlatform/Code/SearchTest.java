package EcommercePlatform;

import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    static Product linearSearch(Product[] items, String name) {
        for (Product p : items) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    static Product binarySearch(Product[] items, String name) {
        int left = 0, right = items.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = items[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return items[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mobile", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Bag", "Travel")
        };

       
        Product result1 = linearSearch(products, "Watch");
        System.out.println(result1 != null ? "Found (Linear): " + result1 : "Not Found (Linear)");

        
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

       
        Product result2 = binarySearch(products, "Mobile");
        System.out.println(result2 != null ? "Found (Binary): " + result2 : "Not Found (Binary)");
    }
}
