package be.digitalcity.java.encapsulation;


import java.time.LocalDate;

public class Personne {
    LocalDate dateNaiss;
    private String prenom;
    private String nom;


    public Personne(LocalDate dateNaiss, String nom, String prenom){
            this.dateNaiss = dateNaiss;
            this.nom = nom;
            this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
