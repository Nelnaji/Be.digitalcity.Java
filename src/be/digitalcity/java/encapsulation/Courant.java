package be.digitalcity.java.encapsulation;

public class Courant extends Compte {

    private double ligneDeCredit;


    Courant(String numero, Personne titulaire) {
        super(numero, titulaire);
        this.setTitulaire(titulaire);


    }


    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {

        this.ligneDeCredit = ligneDeCredit;
        System.out.printf("Votre ligne de crédit est de : %.02f \n", ligneDeCredit);
    }


    @Override
    public void retrait(double montant) {
        if (montant < 0 || montant >= getSolde() + ligneDeCredit) {
            throw new RuntimeException("Solde insuffisant testatin");
        }
        super.retrait(montant);
    }

    @Override
    protected double calculInteret() {
        return (getSolde() > 0 ? 0.03 : 0.095) * getSolde();
    }
}
