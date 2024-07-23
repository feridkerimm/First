package Main.Lesson13.Library;

import java.util.ArrayList;
import java.util.List;

public final class LibraryClass {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayInfo() {
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
