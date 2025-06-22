package TaskManagement;
//Types of Linked Lists:
/*
1. Singly Linked List: One-directional (each node points to next).
2. Doubly Linked List: Two-directional (each node points to next and previous).

In this system, we use Singly Linked List as it’s lightweight and suitable for basic operations.
*/
	class Task {
	    String taskId;
	    String taskName;
	    String status;

	    public Task(String taskId, String taskName, String status) {
	        this.taskId = taskId;
	        this.taskName = taskName;
	        this.status = status;
	    }

	    @Override
	    public String toString() {
	        return "[" + taskId + "] " + taskName + " - Status: " + status;
	    }
	}

	class Node {
	    Task task;
	    Node next;

	    public Node(Task task) {
	        this.task = task;
	        this.next = null;
	    }
	}

	public class TaskManager {
	    private Node head;

	    
	    public void addTask(Task task) {
	        Node newNode = new Node(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	            temp.next = newNode;
	        }
	    }

	    
	    public void displayTasks() {
	        if (head == null) {
	            System.out.println("No tasks available.");
	            return;
	        }
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.task);
	            temp = temp.next;
	        }
	    }

	 
	    public Task searchTask(String taskId) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.task.taskId.equals(taskId)) {
	                return temp.task;
	            }
	            temp = temp.next;
	        }
	        return null;
	    }

	  
	    public boolean deleteTask(String taskId) {
	        if (head == null) return false;

	        if (head.task.taskId.equals(taskId)) {
	            head = head.next;
	            return true;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            if (temp.next.task.taskId.equals(taskId)) {
	                temp.next = temp.next.next;
	                return true;
	            }
	            temp = temp.next;
	        }
	        return false;
	    }

	 // Step 4: Time Complexity & Advantages
	    /*
	    addTask: O(n) (can be O(1) if we maintain tail)
	    searchTask: O(n)
	    deleteTask: O(n)
	    displayTasks: O(n)

	    Linked List Advantages over Array:
	    - Dynamic size (no need to define size in advance)
	    - Easier insertions/deletions (no shifting required)
	    - Better when frequent adds/removals are needed
	    */
	    
	}
