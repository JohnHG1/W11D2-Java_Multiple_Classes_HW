import java.awt.print.Book;
import java.util.ArrayList;

public class Library {


    private int capacity;
    private ArrayList<Book> books;


    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }


    public void addBook(Book book) {
        if(hasSpace()){
            this.books.add(book);
        }
    }
    public boolean hasSpace() { return this.capacity > getNumberOfBooks();
    }

    public Book removeBook() {
        return this.books.remove(0);
    }
}
