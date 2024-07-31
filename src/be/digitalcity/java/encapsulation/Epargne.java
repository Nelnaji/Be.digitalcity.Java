package be.digitalcity.java.encapsulation;

import java.time.LocalDateTime;

public class Epargne extends Compte {

    private
    LocalDateTime dateDernierRetrait;

    Epargne(String numero, Personne titulaire, double solde) {
        super(numero, titulaire, solde);
         }

    @Override
    public void setSolde(double solde) {
        super.setSolde(solde);
    }
}
