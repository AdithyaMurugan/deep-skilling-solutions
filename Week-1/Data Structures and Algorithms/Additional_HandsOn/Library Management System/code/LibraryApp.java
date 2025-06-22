package LibraryManagement;
import java.util.*;
public class LibraryApp {

	public static void main(String[] args) {
		
		   List<Book> books = new ArrayList<>();
	        books.add(new Book("B101", "The Alchemist", "Paulo Coelho"));
	        books.add(new Book("B102", "Wings of Fire", "A.P.J Abdul Kalam"));
	        books.add(new Book("B103", "Sapiens", "Yuval Noah Harari"));
	        books.add(new Book("B104", "Rich Dad Poor Dad", "Robert Kiyosaki"));
	        books.add(new Book("B105", "Zero to One", "Peter Thiel"));

	        System.out.println("Library Books:");
	        for (Book book : books) {
	            System.out.println(book);
	        }

	        
	        String searchTitle1 = "Sapiens";
	        System.out.println("\nLinear Search for: " + searchTitle1);
	        Book result1 = LibraryManager.linearSearch(books, searchTitle1);
	        System.out.println(result1 != null ? "Found: " + result1 : "Book not found.");

	       
	        LibraryManager.sortBooksByTitle(books); 
	        String searchTitle2 = "Rich Dad Poor Dad";
	        System.out.println("\nBinary Search for: " + searchTitle2);
	        Book result2 = LibraryManager.binarySearch(books, searchTitle2);
	        System.out.println(result2 != null ? "Found: " + result2 : "Book not found.");
	    }
	
	}


