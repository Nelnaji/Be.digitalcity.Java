package be.digitalcity.java.exconstructor;

public class Personne {

    private String nom;
    private String prenom;



    public Personne(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    //region SET / GET
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    //endregion


}
