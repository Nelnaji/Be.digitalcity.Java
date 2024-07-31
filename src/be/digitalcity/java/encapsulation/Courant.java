package be.digitalcity.java.encapsulation;

public class Courant extends Compte{

     private double ligneDeCredit;




    Courant(String numero, Personne titulaire){
        super(numero, titulaire);
        this.setTitulaire(titulaire);

    }



    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit( double ligneDeCredit ){
        this.ligneDeCredit = ligneDeCredit;
        System.out.printf("Votre ligne de crédit est de : %.02f \n", ligneDeCredit);
    }


}
