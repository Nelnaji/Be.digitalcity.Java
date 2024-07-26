package be.digitalcity.java.OOP;


public class Personne {

    String prenom;
    String nom;

    void appeler(Object personne) {
        System.out.println("Bonjour " + personne.prenom + personne.nom " , je me nomme " + this.prenom + " " + this.nom );
    }


    public Personne (String prenom, String nom)
    {
        this.prenom = prenom;
        this.nom = nom;
    }



    public static void main(String[] args) {

        Personne Nawfal = new Personne();




    }
}
