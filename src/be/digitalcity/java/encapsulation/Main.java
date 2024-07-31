package be.digitalcity.java.encapsulation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Personne personne1 = new Personne(LocalDate.of(2000,10,10), "te","re");

        System.out.println(personne1);


    Courant courantPersonne1 = new Courant("BE8125", personne1);

    courantPersonne1.depot(1000);
    courantPersonne1.retrait(1102);
    courantPersonne1.setLigneDeCredit(-2000);

    }
}
