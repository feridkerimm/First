package Mentor.Library2;


public class Main {
    public static void main(String[] args) {
        Library library = new Library("Karimov","Baku,Narimanov");
        Book book1 = new Book("19021999","The silence","Farid K.","Karimoglu MMC",2018,100);
        Book book2 = new Book("10111963","The quite","Rasim K.","Karimoglu MMC",2015,250);
        Book book3 = new Book("11081988","The Blind","Rehman K.","Karimoglu MMC",2017,150);
        Book book4 = new Book("06052019","The little boy","Alikhan K.","Karimoglu MMC",2024,50);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println(library.findBookByISBN("19021999")  + " **************************** ");
        System.out.println(library);

        library.removeBook(book1);

//        library.printBookByISBN("06052019");


    }
}
