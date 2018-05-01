import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int totalStock() {
        return this.stock.size();
    }


    //    In this method I want to add a book if the stock level is equal to or less than the capacity in the library
    public Book addBook(Book book) {
        if (totalStock() <= getCapacity())
            this.stock.add(book);

    }

}