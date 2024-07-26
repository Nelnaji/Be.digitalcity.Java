package be.digitalcity.java.exo;

import java.util.HashMap;
import java.util.Scanner;

public class ExerciceMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> panierProduit = new HashMap<>();
        panierProduit.put("Ananas", 0);
        panierProduit.put("Mangue", 0);
        panierProduit.put("Orange", 0);
        panierProduit.put("Nectarine", 0);
        panierProduit.put("Pomme", 0);
        panierProduit.put("Banane", 0);

        System.out.println("Voici l'état de votre panier : " + panierProduit + " pour ajouter de l'ananas tapez 1, pour Mangue tapez 2, pour Orange tapez 3 ...");

        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1:
                panierProduit.put("Ananas", +1);
                break;
            case 2:
                panierProduit.put("Mangue", +1);
                break;
            case 3:
                panierProduit.put("Orange", +1);
                break;
            case 4:
                panierProduit.put("Nectarine", +1);
                break;
            case 5:
                panierProduit.put("Pomme", +1);
                break;
            case 6:
                panierProduit.put("Banane", +1);
                break;
            default:
                System.out.println("Ce produit ne ce trouve pas en magasin");
        }


        System.out.printf("votre panier contient : %f", panierProduit);


    }
}
