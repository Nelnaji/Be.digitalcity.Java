package be.digitalcity.java.exo;

import java.time.LocalDate;

public class Book {
    String title;
    String author;
    LocalDate creationDate;

    public Book(String title, String author, LocalDate creationDate) {
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
    }


    // We're changing the method toString() so that it prints the title of the book
    @Override
    public String toString() {

        //Attention ne jamais print
        return this.title;
    }
}
