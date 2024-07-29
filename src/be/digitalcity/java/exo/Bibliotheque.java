package be.digitalcity.java.exo;

import java.util.LinkedList;

public class Bibliotheque {
    String name;
    LinkedList<Book> bookList;

    void searchBook(Book book) {
        if (book == null) {
            System.out.println("This book is no longer available");
        }
        int bookIndex = bookList.indexOf(book);
        Book bookFound = bookList.get(bookIndex);
        System.out.printf("Le livre que vous avez recheché est : %s \n", bookFound.title);

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

}
