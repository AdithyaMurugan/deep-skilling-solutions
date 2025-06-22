package EmployeeManagement;

//Step 1: Arrays in Memory
/*
Arrays are stored in contiguous memory locations.
- Access time is constant: O(1) for getting by index.
- Fixed size: cannot be resized after creation.
- Best for simple, fixed-length collections.
*/
	class Employee {
	    String employeeId;
	    String name;
	    String position;
	    double salary;

	    public Employee(String employeeId, String name, String position, double salary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.position = position;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "[" + employeeId + "] " + name + " - " + position + " - ₹" + salary;
	    }
	}

	public class EmployeeManager {

	    private Employee[] employees;
	    private int count;

	    public EmployeeManager(int size) {
	        employees = new Employee[size];
	        count = 0;
	    }

	    public void addEmployee(Employee e) {
	        if (count < employees.length) {
	            employees[count++] = e;
	        } else {
	            System.out.println("Employee list is full!");
	        }
	    }

	    public void displayEmployees() {
	        if (count == 0) {
	            System.out.println("No employees found.");
	        } else {
	            for (int i = 0; i < count; i++) {
	                System.out.println(employees[i]);
	            }
	        }
	    }

	    public Employee searchById(String id) {
	        for (int i = 0; i < count; i++) {
	            if (employees[i].employeeId.equals(id)) {
	                return employees[i];
	            }
	        }
	        return null;
	    }
	    public boolean deleteById(String id) {
	        for (int i = 0; i < count; i++) {
	            if (employees[i].employeeId.equals(id)) {
	                for (int j = i; j < count - 1; j++) {
	                    employees[j] = employees[j + 1];
	                }
	                employees[--count] = null;
	                return true;
	            }
	        }
	        return false;
	    }
	    /*
        Time Complexity:
        - Add: O(1)
        - Search: O(n)
        - Delete: O(n)
        - Traverse: O(n)

        Limitations:
        - Fixed capacity (no dynamic resizing)
        - Slower insert/delete at middle
        - Better for small datasets with simple operations

        Use ArrayList if flexibility is needed.
    */

	}


