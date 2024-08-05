package be.digitalcity.java.encapsulation;

public abstract class Compte implements Banker {

    private final String numero;
    private double solde;
    private Personne titulaire;
    private double tauxInteret;

    public Compte(String numero, Personne titulaire) {

        this.numero = numero;
        this.setTitulaire(titulaire);

    }

    //region GET / SET

    public String getNumero() {
        return numero;
    }


    private void setSolde(double solde) {
        this.solde = solde;
    }



    public double getSolde() {
        return solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }


    public void setTitulaire(Personne titulaire) {

        if (titulaire == null) {
            throw new NoTitulaireException();
        }
        this.titulaire = titulaire;
    }

    private double getTauxInteret() {
        return tauxInteret;
    }

    private void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    // endregion


    //region Methods
    public void retrait(double montant) {

        if (montant < 0) {
            throw new RuntimeException("Solde Insuffisant");
        }

            solde -= montant;


    }

    public void depot(double montant) {
        if (montant >= 0) {
            solde += montant;
        }


    }
    // endregion

    protected abstract double calculInteret();

    public void appliquerInteret() {

        double interetTotal = getSolde() + calculInteret();

        System.out.printf("votre compte %s à un solde de %s et un taux d'interet de %.2f votre interet Toral est donc de %.2f ", getClass().getSimpleName()
                , getSolde(), calculInteret(), interetTotal);
    }
}

