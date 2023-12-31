import java.util.Scanner;

// Class Book
class Book {

    // Attributes
    private int bookID;
    private String title;
    private String author;
    private String isAvailable;

    // Parameterised Constructor
    Book(int bookID, String title, String author, String isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Getter & Setter Methods
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }
}

class Library {
    private Book[] books;

    // count - maintains number of different books in Library
    private int count = 0;

    // Create an array of Books
    public Library(int no_of_books) {
        this.books = new Book[no_of_books];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    // a. Method to add book to the books array
    public void addBook(Book book) {
        this.getBooks()[count++] = book;
    }

    // b. Method to Seach a book in the library
    public int searchBook(int bookID) {

        Book books[] = this.getBooks();
        int flag = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookID() == bookID) {
                flag = i;
                break;
            }
        }
        return flag;
    }

    // c Remove books when the searched bookID is found
    public void removeBook(int search_index) {
        books[search_index] = null;
        this.count = this.count - 1;
        System.out.println("Book Removed. ");
    }

    // Replace method - Optional Not mentioned in Question
    public void replace(int search_index, String new_Title, String new_Author) {
        
        // Replace the book name & author of the given book
        // from the books
        books[search_index].setTitle(new_Title);
        books[search_index].setAuthor(new_Author);

        System.out.println("Book Replaced");
    }

    // d. Method to display all Books in the library
    public void displayAllBooks() {
        Book[] books = this.getBooks();
        int no_of_books = this.getBooks().length;
        System.out.println("\nEntire Book Details");

        for (int i = 0; i < no_of_books; i++) {
            if (books[i] != null) {
                System.out.println("Book ID         :  " + books[i].getBookID());
                System.out.println("Book Title      :  " + books[i].getTitle());
                System.out.println("Book Author     :  " + books[i].getAuthor());
                System.out.println("Book Availability: " + books[i].getIsAvailable());
                System.out.println("");
            }
        }
    }

}

public class BookManagementSystem {
    public static void main(String args[]) {

        // Library operations
        // a. Add Books
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books: ");
        int no_of_books = Integer.parseInt(sc.nextLine());

        Library library = new Library(no_of_books);

        for (int i = 0; i < no_of_books; i++) {
            System.out.println("Enter Book " + (i + 1) + " Details");
            System.out.println("Enter Book ID");
            int bookID = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Book Title");
            String title = sc.nextLine();

            System.out.println("Enter Book Author");
            String author = sc.nextLine();

            // Initially Book Availability is Set to Yes
            String isAvailable = "Yes";

            library.addBook(new Book(bookID, title, author, isAvailable));
            System.out.println("");

        }

        
        // b. Search Book operation
        System.out.println("Enter Book Id to Search: ");
        int search_bookId = Integer.parseInt(sc.nextLine());
        int search_index = library.searchBook(search_bookId);


        // c. Remove Book Operation only if the
        // searched book is available
        if (search_index >= 0) {
            System.out.println("Book with BookID " + search_bookId + " Found");
            library.removeBook(search_index);
        } 
        
        else {
            System.out.println("\nBook with BookID " + search_bookId + " Not found");
            System.out.println("\n--->  So Cannot be Removed. ");
        }

        // d. Display All Books
        library.displayAllBooks();

        sc.close();
    }
}
