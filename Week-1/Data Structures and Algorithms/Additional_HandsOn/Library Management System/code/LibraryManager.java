package LibraryManagement;
//Step 1: Search Algorithm Explanation
/*
Linear Search:
- Check each element one by one.
- Time complexity: O(n)
- Works on unsorted lists.
Binary Search:
- Divide and conquer (check middle, then half).
- Time complexity: O(log n)
- Requires sorted list.
*/
import java.util.*;
class Book {
    String bookId;
    String title;
    String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" + bookId + "] " + title + " by " + author;
    }
}

public class LibraryManager {

    
    public static Book linearSearch(List<Book> books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

  
    public static Book binarySearch(List<Book> books, String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);

            int result = title.compareToIgnoreCase(midBook.title);
            if (result == 0) return midBook;
            else if (result < 0) high = mid - 1;
            else low = mid + 1;
        }

        return null;
    }

   
    public static void sortBooksByTitle(List<Book> books) {
        books.sort(Comparator.comparing(b -> b.title.toLowerCase()));
    }
 //  Time Complexity 
    /*
    Linear Search:
        - Time: O(n)
        - Best for small or unsorted datasets

    Binary Search:
        - Time: O(log n)
        - Only works on sorted data
        - Best for large datasets

    Use linear search when data is small or unsorted.
    Use binary search when data is sorted and large.
    */
}
