package Main.Lesson13.Library;

public class LibraryMain {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("Fiction", "Farid", "19021999", "Dystopian");
        NonFictionBook nonFictionBook = new NonFictionBook("Fiction", "Farid", "19021999", "Dystopian");

        LibraryClass libraryClass = new LibraryClass();
        libraryClass.addBook(fictionBook);
        libraryClass.addBook(nonFictionBook);

        libraryClass.displayInfo();

        System.out.println("Comparing two books: " + fictionBook.equals(nonFictionBook));
        System.out.println("Hashcode of Fiction book: " + fictionBook.hashCode());
        System.out.println("Hashcode of Nonfiction book: " + nonFictionBook.hashCode());
    }
}
