package be.digitalcity.java.exo;

import java.util.Scanner;

public class NbrPremiers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("> Combien de nombre premiers vous voulez ? : ");


        // Initialisation de inputNbr
        int inputNbr = sc.nextInt();

        //Nombre de premiers
        int nbrOfPrimary = 0;

        // ce nombre vas augmenter a chaque fois qu'il est verifier
        int candidat = 2;


        // tant que nombre de premiers est en dessous de la target fait
        while (nbrOfPrimary < inputNbr) {
            // on part du principe que le nombre est premier de base
            boolean isPrime = true;

            // parcours le nombre de 1 à n jusqu'a savoir si le nombre n'est pas premier si le isPrime passe faux la boucle est arreté.

            for (int i = 2; isPrime && i <= Math.sqrt(candidat); i++) {

                // Si à un moment le nombre est divisible alors il n'est pas premier
                if (candidat % i == 0) {
                    isPrime = false;
                }
            }

            // Si prime
            if (isPrime) {
                System.out.println(candidat);
                ++nbrOfPrimary;
            }

            //Nous sommes encore dans loop
            candidat++;
        }

        System.out.println(candidat);

         }
}

