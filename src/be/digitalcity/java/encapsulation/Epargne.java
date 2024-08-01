package be.digitalcity.java.encapsulation;

import java.time.LocalDateTime;

public class Epargne extends Compte implements ActionCompte {

    private LocalDateTime dateDernierRetrait;

    Epargne(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    //region Override
    @Override
    public void retrait(double montant) {
        if (getSolde() >= montant) ;
        super.retrait(montant);

    }

    @Override
    protected double calculInteret() {
        return getSolde() * 0.045;
    }
    //endregion


}