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
        //Declaration du tableau

        int[] primaryNumbers = new int[inputNbr];
        // ce nombre vas augmenter a chaque fois qu'il est verifier
        int candidat = 2;

        //Je print le premier crochet avant ma boucle
        System.out.print("[ ");

        //  tant que nombre de premiers est en dessous de la target fait
        while (nbrOfPrimary < inputNbr) {
            // on part du principe que le nombre est premier de base
            boolean isPrime = true;


            for(int i = 0; isPrime && i< nbrOfPrimary && primaryNumbers[i] <= Math.sqrt(candidat); i++){
                int dividor = primaryNumbers[i];
                if(candidat% dividor == 0){
                    isPrime = false;
                }
            }



            // parcours le nombre de 1 à n jusqu'a savoir si le nombre n'est pas premier si le isPrime passe faux la boucle est arreté.
            // the isPrime is the same as break;

            /* for (int i = 2; isPrime && i <= Math.sqrt(candidat); i++) {

                // Si à un moment le nombre est divisible alors il n'est pas premier
                if (candidat % i == 0) {
                    isPrime = false;
                }
            }*/

            // Si premier
            if (isPrime) {

                //je stock le candidat en fonction du nombre de premier qui est incrémenté

                primaryNumbers[nbrOfPrimary] = candidat;
                //J'imprimme

                System.out.print(primaryNumbers[nbrOfPrimary] + " ");

                ++nbrOfPrimary;
            }

            //Nous sommes encore dans loop for
            candidat++;

        } //end for loop

        //j'imprime après ma boucle while
        System.out.println("]");


    } // end main
}

