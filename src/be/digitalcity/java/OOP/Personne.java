package be.digitalcity.java.OOP;


public class Personne {

    String prenom;
    String nom;
// (Parametres)
    void appeler(Personne aSaluer) {
        System.out.printf("Bonjour %s %s, je m'appelle %s %s \n", aSaluer.prenom, aSaluer.nom, this.prenom, this.nom);
    }


    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }


    public static void main(String[] args) {

        Personne nawfal = new Personne("Nawfal", "Elkhaznagi");
        Personne john = new Personne("John", "Doe");

        nawfal.appeler(john);
        john.appeler(nawfal);


    }
}
