import java.util.*;


public class binaryLibraryManagementSystem {
    private List<Book> books;

    public binaryLibraryManagementSystem() {
        books = new ArrayList<>();
    }

 
    public void addBook(Book book) {
        books.add(book);
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (compare == 0) {
                return books.get(mid);
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

  
    public static void main(String[] args) {
        binaryLibraryManagementSystem library = new binaryLibraryManagementSystem();
        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("B002", "1984", "George Orwell"));
        library.addBook(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));

       
        System.out.println("Searching for '1984' using binary search:");
        Book foundBook = library.binarySearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found");
    }
}
