import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

    public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library(6);
        book = new Book();

    }

        @Test
        public void startWithNoBooks(){
            assertEquals(0, library.getNumberOfBooks());
        }


        @Test
        public void canAddBook(){
            library.addBook(book);
            assertEquals(1, library.getNumberOfBooks());
        }

        @Test
        public void cannotAddBookIfFull(){
            Library portablelibrary = new Library(3);
            ((Library) portablelibrary).addBook(book);
            ((Library) portablelibrary).addBook(book);
            ((Library) portablelibrary).addBook(book);
            ((Library) portablelibrary).addBook(book);
            assertEquals(3, ((Library) portablelibrary).getNumberOfBooks());
        }

        @Test
        public void canRemoveBook(){
            library.addBook((book));
            library.removeBook();
            assertEquals(0, library.getNumberOfBooks());
        }


}
