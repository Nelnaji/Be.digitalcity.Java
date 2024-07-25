package be.digitalcity.java.operateurs;

public class Operateur {
    public static void main(String[] args) {
        // Opérateur arithmétique
        int a = 10, b = 3;
        double rslt;

        rslt = a / b; // donnera comme resultat 3 car tout ce qui vient apres la virgule est retiré

        // Incrémentation/ Décrémentation
        int variable = 0;


        System.out.println( variable++ ); // 0
        System.out.println( ++variable ); // 2
        System.out.println( variable-- ); // 2
        System.out.println( --variable ); // 0

        System.out.println(variable); // 0

        //Affectation
        System.out.println( variable = 5); // 5 affichera toujours la valeur affecté.

        System.out.println( variable += 5 ); // 10

        // to change the value of two variables you can use two methods either use a temp
        int c = 10, d =5, temp;
        temp = c;
        c=d;
        d=temp;

        // less optimised not something I knew
        c= c*d;
        d=c/d;
        c=c/d;


    }
}
