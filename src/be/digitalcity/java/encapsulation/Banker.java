package be.digitalcity.java.encapsulation;

public interface Banker extends Customer {

    void appliquerInteret();

    Personne getTitulaire();

    String getNumero();

}
