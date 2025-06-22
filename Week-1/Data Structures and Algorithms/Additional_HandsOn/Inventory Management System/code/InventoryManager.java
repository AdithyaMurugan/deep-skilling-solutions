package InventoryManagement;
/*
Why use Data Structures & Algorithms?

- Helps store and manage large inventory efficiently.
- Improves speed for search, insert, update, and delete operations.

Suitable Data Structures:

- ArrayList: Easy to use, but slower for search (O(n)).
- HashMap: Fast access using productId as key (O(1) average time).
- TreeMap: Maintains sorted order, useful when needed (O(log n)).

→ HashMap is ideal for fast lookups in inventory systems.
*/

import java.util.HashMap;
import java.util.Map;
class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

   
    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setProductName(String name) { this.productName = name; }
    public void setQuantity(int qty) { this.quantity = qty; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " | Qty: " + quantity + " | Price: ₹" + price;
    }
}

public class InventoryManager {

    private Map<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

  
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

  
    public boolean updateProduct(String productId, String newName, int newQty, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(newName);
            product.setQuantity(newQty);
            product.setPrice(newPrice);
            return true;
        }
        return false;
    }

  
    public boolean deleteProduct(String productId) {
        return inventory.remove(productId) != null;
    }

    // Display All Products - O(n)
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
    /*
   Time Complexity Analysis

    addProduct()     → O(1) average
    updateProduct()  → O(1) average (lookup + update)
    deleteProduct()  → O(1) average
    displayInventory() → O(n), where n = total products

    Optimization Notes:
    - HashMap ensures constant-time performance if hash collisions are minimal.
    - For sorted operations, TreeMap could be used (O(log n) performance).
*/
  
}
	