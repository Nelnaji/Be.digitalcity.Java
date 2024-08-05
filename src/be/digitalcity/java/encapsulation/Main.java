package be.digitalcity.java.encapsulation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne personne1 = new Personne(LocalDate.of(2000, 10, 10), "te", "re");
        Personne personne2 = new Personne(LocalDate.now(), "new", "age");
        System.out.println(personne1);

        Courant courantPersonne1 = new Courant("BE8125", personne1);


        courantPersonne1.setTitulaire(personne2);

        courantPersonne1.depot(0);
        try {
            courantPersonne1.retrait(3000);
        } catch (RuntimeException a) {
            System.out.println(a.getMessage());
        }
        courantPersonne1.calculInteret();
        courantPersonne1.appliquerInteret();


        //La signature d'une methode
        //nomMethod(String,Int)
        //nomMethod(Int,String)


    }
}
