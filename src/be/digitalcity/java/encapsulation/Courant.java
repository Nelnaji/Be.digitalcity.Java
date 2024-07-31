package be.digitalcity.java.encapsulation;

public class Courant {
    private final String numero;
    private double solde;
    private double ligneDeCredit;
    private Personne titulaire;



    Courant(String numero, Personne titulaire){
        this.solde = 0;
        this.ligneDeCredit = 1000;
        this.numero = numero;
        this.setTitulaire(titulaire);

    }


    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit( double ligneDeCredit ){
        this.ligneDeCredit = ligneDeCredit;
        System.out.printf("Votre ligne de crédit est de : %.02f \n", ligneDeCredit);
    }

     public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire( Personne titulaire ) {
       if(titulaire != null){
                   this.titulaire = titulaire;
       }else{
           throw new RuntimeException();
       }
    }



    void retrait( double montant ){
        // I would use getSolde() if I know that some verifications are being made in the setter

        if( montant > 0 && montant <= ligneDeCredit + solde ){
        solde -= montant;
        System.out.printf("vous avez retiré %.2f€ votre nouveau solde est de : %.2f€ \n", montant, getSolde());
        } else {
            System.out.printf("Vous ne pouvez pas retirer autant, votre ligne de crédit est de : %.2f€ et votre solde est de : %.2f€ \n", ligneDeCredit, getSolde());
        }
    }

    void depot( double montant ){
        if( montant > 0 ){
        solde += montant;
        System.out.printf("vous avez déposé %.2f€ votre nouveau solde est de : %.2f€ \n", montant, getSolde() );
        }
    }

}
