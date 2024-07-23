package Main.Lesson13.Library;

import java.util.Objects;

public class Book {
    protected final String title;
    protected final String author;
    protected final String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    protected String getBookInfo() {
        return title + ", " + author + ", " + ISBN;
    }

    @Override
    public String toString() {
        return getBookInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, ISBN);
    }
}
