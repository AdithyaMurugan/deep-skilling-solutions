package InventoryManagement;
public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product("P101", "Cashew 1kg", 50, 820.00));
        manager.addProduct(new Product("P102", "Almond 500g", 30, 420.00));
        manager.addProduct(new Product("P103", "Pista 250g", 25, 380.00));

        System.out.println("Initial Inventory:");
        manager.displayInventory();

        System.out.println("\nUpdating Product P102...");
        manager.updateProduct("P102", "Almond Premium 500g", 35, 450.00);

        System.out.println("\nInventory After Update:");
        manager.displayInventory();

        System.out.println("\nDeleting Product P103...");
        manager.deleteProduct("P103");

        System.out.println("\nFinal Inventory:");
        manager.displayInventory();
    }
}
