import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book();
    }

    @Test
    public void getCapacity() {
        assertEquals(2, library.getCapacity());
    }


    @Test
    public void totalStock() {
        assertEquals(0, library.totalStock());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.totalStock());
    }

    @Test
    public void cannotAddBookCapacityFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.totalStock();
        assertEquals(null, library.totalStock());
    }


}