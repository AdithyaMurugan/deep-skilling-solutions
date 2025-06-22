package CustomerOrder;
import java.util.*;
public class OrderTest {
	 public static void main(String[] args) {
	        List<Order> orders = new ArrayList<>();
	        orders.add(new Order("O101", "Adithya", 1500));
	        orders.add(new Order("O102", "Ravi", 950));
	        orders.add(new Order("O103", "Swetha", 2100));
	        orders.add(new Order("O104", "Meena", 800));
	        orders.add(new Order("O105", "Kumar", 1200));

	        System.out.println("Original Orders:");
	        display(orders);

	        
	        System.out.println("\nAfter Bubble Sort (by totalPrice):");
	        OrderManager.bubbleSort(orders);
	        display(orders);

	        
	        orders = new ArrayList<>();
	        orders.add(new Order("O101", "Adithya", 1500));
	        orders.add(new Order("O102", "Ravi", 950));
	        orders.add(new Order("O103", "Swetha", 2100));
	        orders.add(new Order("O104", "Meena", 800));
	        orders.add(new Order("O105", "Kumar", 1200));

	        
	        System.out.println("\nAfter Quick Sort (by totalPrice):");
	        OrderManager.quickSort(orders, 0, orders.size() - 1);
	        display(orders);
	    }

	    private static void display(List<Order> orders) {
	        for (Order order : orders) {
	            System.out.println(order);
	        }
	    }
}
