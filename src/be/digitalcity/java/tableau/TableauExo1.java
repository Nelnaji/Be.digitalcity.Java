package be.digitalcity.java.tableau;

import java.util.Scanner;

public class TableauExo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final char PION = '♟';
        final char VIDE = '_';

        //char[] plateau = new char[5]{vide.....};

        char[] plateau = {VIDE, VIDE, PION, VIDE, VIDE};
        int position = 2;
        plateau[position] = PION;

        //De facon répétée, tant que l'utilisateur n veux pas quitter
        //Afficher le plateau
        //Demander la commande (g,d,e)
        //Bouger le pion si pas quitter
        char commande;


//region
        do {

            StringBuilder sb = new StringBuilder();

            sb.append("[ ");
            for (int i = 0; i < plateau.length; i++) {
                sb.append(plateau[i]);
                sb.append(" ");
            }
            sb.append(']');
            System.out.println(sb.toString());


            //Printing the first bound
  /*          System.out.print("[ ");
            //Printing the whole line
            for (int i = 0; i < plateau.length; i++) {
                System.out.print( plateau[i] + ' ');
            }
            //Printing the end bound
            System.out.println(']');*/

//demander d'introduir
            System.out.print("""
                    Direction ou quiter : (g)auche, (d)roite, (q)uitter:
                    >
                    """);
// on trim avant tolowercase, pour eviter de verifier si les espaces sont passer en majuscul
            commande = sc.nextLine().trim().toLowerCase().charAt(0);

            switch (commande) {
                case 'g':
                    if (position == 0) {
                        plateau[position] = VIDE;
                        position = plateau.length - 1;
                        plateau[position] = PION;
                    } else {

                        // plateau[position--] = VIDE faire attention parceque le -- ce trouve apres
                        plateau[position] = VIDE;
                        plateau[--position] = PION;
                    }
                    break;
                case 'd':
                    if (position == plateau.length - 1) {
                        plateau[position] = VIDE;
                        position = 0;
                        plateau[position] = PION;
                    } else {
                        plateau[position++] = VIDE;
                        plateau[position] = PION;
                    }
                    break;
                case 'q':
                    System.out.println("au revoir");
                    break;

                default:
                    System.out.println("veuillez introduire l'un des bon characters");
            }


        } while (commande != 'q');
//endregion

    }
}