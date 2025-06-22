package TaskManagement;

public class TaskApp {
	 public static void main(String[] args) {
	        TaskManager manager = new TaskManager();

	        manager.addTask(new Task("T101", "Design Homepage", "Pending"));
	        manager.addTask(new Task("T102", "Write Backend API", "In Progress"));
	        manager.addTask(new Task("T103", "Test Payment Module", "Pending"));

	        System.out.println("All Tasks:");
	        manager.displayTasks();

	        System.out.println("\nSearching for Task ID T102:");
	        Task found = manager.searchTask("T102");
	        if (found != null) {
	            System.out.println("Found: " + found);
	        } else {
	            System.out.println("Task not found.");
	        }

	        System.out.println("\nDeleting Task T103...");
	        boolean deleted = manager.deleteTask("T103");
	        System.out.println(deleted ? "Task deleted successfully." : "Task not found.");

	        System.out.println("\nTasks After Deletion:");
	        manager.displayTasks();
	    }
	
}
