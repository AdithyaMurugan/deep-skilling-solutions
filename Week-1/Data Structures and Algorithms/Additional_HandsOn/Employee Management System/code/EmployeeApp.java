package EmployeeManagement;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmployeeManager manager = new EmployeeManager(5);

	        manager.addEmployee(new Employee("E101", "Adithya", "Developer", 45000));
	        manager.addEmployee(new Employee("E102", "Ravi", "Designer", 40000));
	        manager.addEmployee(new Employee("E103", "Priya", "Tester", 38000));

	        System.out.println("All Employees:");
	        manager.displayEmployees();

	        System.out.println("\nSearching for E102:");
	        Employee found = manager.searchById("E102");
	        if (found != null) {
	            System.out.println("Found: " + found);
	        } else {
	            System.out.println("Employee not found.");
	        }

	        System.out.println("\nDeleting E103...");
	        if (manager.deleteById("E103")) {
	            System.out.println("Deleted successfully.");
	        } else {
	            System.out.println("Employee not found.");
	        }

	        System.out.println("\nEmployees After Deletion:");
	        manager.displayEmployees();
	    }
	}


