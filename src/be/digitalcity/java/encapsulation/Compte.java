package be.digitalcity.java.encapsulation;

public class Compte {
    //region myregion
    private final String numero;
    private double solde;
    private Personne titulaire;


    public Compte(String numero, Personne titulaire, double solde){

        this.numero = numero;
        this.setTitulaire(titulaire);
        this.solde = solde;

    }

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
        if (titulaire != null) {
            this.titulaire = titulaire;
        } else {
            throw new RuntimeException();
        }
    }
// endregion
}

