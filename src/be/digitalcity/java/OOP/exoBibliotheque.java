package be.digitalcity.java.OOP;

import java.time.LocalDate;

public class exoBibliotheque {
    public static void main(String[] args) {

        Bibliotheque royale = new Bibliotheque();
        royale.name = "Bibliotheque Royale";

        Book monteCristo = new Book("Le Comte de Monte Cristo", "Alexandre Dumas", LocalDate.of(2000, 10, 4));
        Book miserables = new Book("Les Miserables", "Victor Hugo", LocalDate.of(2000, 9, 4));
        Book reineMargot = new Book("La Reine Margot", "Alexandre Dumas", LocalDate.of(2000, 10, 6));
        Book lesFourmis = new Book("Les Fourmis", "Bernard Werber", LocalDate.of(2010, 5, 4));


        royale.addBook(monteCristo);
        royale.addBook(miserables);
        royale.addBook(reineMargot);
        royale.deleteBook(miserables);

//        royale.searchBook(monteCristo);

        royale.printBookList();
        System.out.println( royale.bookList );

    }
}
