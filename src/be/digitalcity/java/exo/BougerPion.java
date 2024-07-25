package be.digitalcity.java.exo;

import java.util.Scanner;

public class BougerPion {
    public static void main(String[] args) {
    /*    int[][] matrice = new int[10][10];

        for(int index1Dim = 0; index1Dim < matrice.length; index1Dim++) {

            for (int index2Dim = 0; index2Dim < matrice.length; index2Dim++) {

                System.out.print(matrice[index1Dim][index2Dim] + " ");
            }
            System.out.println();
         }*/

        Scanner sc = new Scanner(System.in);

        String pion = "1";
        String[] plateau = new String[]{"0", "0", "1", "0", "0"};

        System.out.println("Bievenue au jeu de pièces: ");
        for (int i = 0; i < plateau.length; i++) {

            System.out.print(plateau[i] + " ");


        }

        System.out.println("Votre pion est representé par le 1, vous pouvez le deplacer a gauche et a droite en entrant les touches d et g");
        System.out.print("> ce deplacer a gauche (g) ou a droite (d)");

        String deplacement = sc.nextLine();

        if (deplacement.equals("d")) {
            pion = "1";
        }

    }
}
