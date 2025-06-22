package EcommercePlatform;
// Asymptotic Notation & Search Analysis
/*
 Big O Notation?
  - Big O describes **how efficient** an algorithm is as the input size (n) increases.
  - It helps compare different algorithms regardless of hardware.
 For Search Operations:
  Best Case:
    - Linear Search: O(1) → if the element is at the beginning
    - Binary Search: O(1) → if the element is exactly in the middle
  Average Case:
    - Linear Search: O(n/2) ≈ O(n)
    - Binary Search: O(log n)
  Worst Case:
    - Linear Search: O(n) → check all elements
    - Binary Search: O(log n) → keep halving until found or not
*/

public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
    // Analysis of Time Complexity
    /*
     Time Complexity Comparison:

    1. Linear Search:
       - Best: O(1)
       - Average: O(n)
       - Worst: O(n)
       - Pros: Works on any data (unsorted)
       - Cons: Slow on large datasets

    2. Binary Search:
       - Best: O(1)
       - Average: O(log n)
       - Worst: O(log n)
       - Pros: Very fast on large datasets
       - Cons: Needs sorted data

    Best for Platform:
       → If your product data is large and sorted (or can be pre-sorted), **Binary Search** is the best choice.
       → If the data is small or unsorted, use **Linear Search**.
    */
}
