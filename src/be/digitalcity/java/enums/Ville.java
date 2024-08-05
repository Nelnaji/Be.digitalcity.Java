package be.digitalcity.java.enums;

public enum Ville {
    LIEGE(1000) ,
    BRUXELLES(400005),
    LLN(13);

    public final int codePostal;

    Ville(int codooodPostaloo){
        this.codePostal = codooodPostaloo;
    }

    public void show(){
        System.out.println(this.toString() + " : " + this.codePostal);
    }


}
