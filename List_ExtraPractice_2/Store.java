package List_ExtraPractice_2;

import java.util.ArrayList;

public class Store {
    // task 1
    private ArrayList<Book> books;

    // task 2

    public Store() {
        this.books = new ArrayList<>();
    }
    public Store(ArrayList<Book> books) {
        // mutable variable 
        for (Book b : books) {
            Book newNook = new Book(b);
            this.books.add(newNook);
        }

    }
    
    // task 3
    public Book getBook(int i) {
        /**
         * takes an index as a parameter and returns a deep copy of the Book object at that index.
         */
        if (i > books.size() || i < 0) {
            System.out.println("Error: exceeding array length ");
            return null;
        }
        else {
            // get a deep copy
            Book newBook = new Book(books.get(i));
            return newBook;
        }

    }

    // task 4
    public void setBook(Book book, int i) {
        /**
         * takes a Book object and an index as parameters
         * and sets the Book object at the specified index to a deep copy of the given object.
         */
        if (i < 1 || i > books.size()) {
            return;
        } else {
            Book newBook = new Book(book);
            books.add(i - 1, newBook);
            return;
        }

    }
    
    // task 5
    public void addBook(Book book) {
        Book newBook = new Book(book);
        books.add(newBook);
    }

    // task 6
    public boolean contains(Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                return true;
            }
            else if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle()) && b.getRating() == book.getRating() && b.getPrice() == book.getPrice()) {
                return true;
            }
        }
        return false;
    }

    // task 7
    public void sellBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                books.remove(b);
                return;
            }
        }
        System.out.println("Book not found");
        return;
    }

    
}
