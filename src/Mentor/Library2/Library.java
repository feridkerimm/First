package Mentor.Library2;

import java.util.Arrays;

public class Library {
    String libraryName;
    String address;
    Book[] books = new Book[10];
    int counter = 0;

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addBook(Book book) {

        if (counter < books.length) {
            books[counter] = book;
            counter++;
        } else {
            System.out.println("Library Full. ");
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsbn().equals(book.isbn)) {
                System.out.println("Removed Book " + books[i].getTitle());
                for (int j = i; j < counter - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[counter - 1] = null;
                counter--;
                return;

            }
        }
    }

    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void printBookByISBN(String isbn) {
        Book foundBook = findBookByISBN(isbn);
        if (foundBook != null) {
            System.out.println("Book found with ISBN " + isbn + ":");
            System.out.println(foundBook);
        } else {
            System.out.println("No book found with ISBN " + isbn);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", address='" + address +
                "'}\n" + Arrays.toString(books) +
                " " + counter + " books in the library" +
                '}';
    }
}