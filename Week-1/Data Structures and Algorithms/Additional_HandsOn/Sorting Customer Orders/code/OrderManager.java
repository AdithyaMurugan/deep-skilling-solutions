package CustomerOrder;
/*
Sorting Algorithms Overview:

1. Bubble Sort:
   - Repeatedly compares adjacent elements and swaps if needed.
   - Very simple but inefficient for large datasets.
   - Time Complexity:
       Best Case: O(n)     (if already sorted)
       Average/Worst: O(n^2)

2. Insertion Sort:
   - Builds the sorted array one item at a time by inserting into correct position.
   - Efficient for small or nearly sorted datasets.
   - Time Complexity:
       Best Case: O(n)
       Average/Worst: O(n^2)

3. Quick Sort:
   - Divide-and-conquer algorithm that partitions array and recursively sorts sub-arrays.
   - Very fast for large datasets, but not stable.
   - Time Complexity:
       Best Case: O(n log n)
       Average:    O(n log n)
       Worst:      O(n^2) (when pivot is poorly chosen)

4. Merge Sort:
   - Divide-and-conquer algorithm that divides the array, sorts each half, then merges.
   - Very stable and efficient for large datasets.
   - Time Complexity:
       Best/Average/Worst: O(n log n)
   - Requires extra space (not in-place).

Summary:
   - Use Bubble/Insertion only for educational or very small arrays.
   - Use Quick Sort for most practical cases.
   - Use Merge Sort when stability or guaranteed performance is needed.
*/
import java.util.*;

	

	class Order {
	    String orderId;
	    String customerName;
	    double totalPrice;

	    public Order(String orderId, String customerName, double totalPrice) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.totalPrice = totalPrice;
	    }

	    @Override
	    public String toString() {
	        return "[" + orderId + "] " + customerName + " - ₹" + totalPrice;
	    }
	}

	public class OrderManager {

	    public static void bubbleSort(List<Order> orders) {
	        int n = orders.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (orders.get(j).totalPrice > orders.get(j + 1).totalPrice) {
	                    Collections.swap(orders, j, j + 1);
	                }
	            }
	        }
	    }

	    public static void quickSort(List<Order> orders, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(orders, low, high);
	            quickSort(orders, low, pivotIndex - 1);
	            quickSort(orders, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(List<Order> orders, int low, int high) {
	        double pivot = orders.get(high).totalPrice;
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (orders.get(j).totalPrice <= pivot) {
	                i++;
	                Collections.swap(orders, i, j);
	            }
	        }
	        Collections.swap(orders, i + 1, high);
	        return i + 1;
	    }
	    /*
	       Time Complexity Comparison:

	       Bubble Sort:
	         - Best: O(n), Worst: O(n^2)
	         - Not suitable for large data

	       Quick Sort:
	         - Best: O(n log n), Worst: O(n^2)
	         - Generally faster and more efficient in real-world scenarios

	       Preferred: Quick Sort – better performance for large lists
	    */
	   
	}


