package be.digitalcity.java.OOP;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    String name;
    //    LinkedList<Book> bookList;
    List<Book> bookList = new ArrayList<>();

 /*   void searchBook(Book book) {
        if (book == null) {
            System.out.println("This book is no longer available");
        }
        int bookIndex = bookList.indexOf(book);
        Book bookFound = bookList.get(bookIndex);
        System.out.printf("Le livre que vous avez recheché est : %s \n", bookFound.title);

    }*/

    Book searchBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.title.equals(title)) return book;
        }
        return null;
    }


    void addBook(Book toAdd) {
        this.bookList.add(toAdd);
    }

    void deleteBook(Book toDelete) {
        if (toDelete == null) {
            System.out.println("This book is no longer in the library");
        }
        this.bookList.remove(toDelete);
    }

    void printBookList() {

        for (Book book : bookList) {
            System.out.println(book.title);
        }

    }

    void removeByTitle(String titre) {
        Book book = searchBookByTitle(titre);
        if (book != null) {
            this.deleteBook(book);
        }
    }

}
