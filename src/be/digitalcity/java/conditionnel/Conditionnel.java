package be.digitalcity.java.conditionnel;
import java.util.Scanner;

public class Conditionnel {

    public static void main(String[] args) {

        int temp = 18;
        boolean allumer = temp >= 5 && temp <= 15;
        if (allumer) {
            System.out.println("J'allume la chaudière");
        }
        else if ( temp < 5) {
            System.out.println("J'allume le poele");
        }
        else {
            System.out.println("J'éteind la chaudière");
        }

        int age = 58;
        if (age >= 18 && age <= 67) {
            System.out.println("Adulte");
        }
        else if (age >= 12 && age < 17) {
            System.out.println("Adolescent");
        }
        else if (age >= 67) {
            System.out.println("Retraité");
        }
        else {
            System.out.println("Age invalide");
        }

        //methode plus claire

        if(age < 0) {
            System.out.println("Age invalide");
        }
        else if (age < 12) {
            System.out.println("Enfant");
        }
        else if (age < 18) {
            System.out.println("Adolescent");
        }
        else if (age < 67) {
            System.out.println("Adulte");
        }
        else {
            System.out.println("Retraité");
        }

        age = 18;
        switch (age) {
            case 0:
                System.out.println("A");
                break;
            case 12:
                System.out.println("C'est le début de l'adolescence");
                break;
            case 18:
                System.out.println("Vous devenez adulte");
                break;
            case 67:
                System.out.println("C'est la retraite");
                break;
            default:
                System.out.println("Rien de particulier");
        }

        // nouvelle addition au switch Java 12
        int jourChiffre = 5 ;
        String jour = switch (jourChiffre) {

            case 1: yield "Lundi";
            case 2: yield "Mardi";
            case 3: yield "Mercredi";
            case 4: yield "Jeudi";
            case 5: yield "Vendredi";
            case 6: yield "Samedi";
            case 7:yield "Dimanche";
            default: yield "pas un jour";
        };

            jour = switch(jourChiffre){
                case 1 -> "Lundi";
                case 2 -> "Mardi";
                case 3,57 -> {
                    System.out.println("autre code");
                    yield "Mercredi";
                }
                case 4 -> "Jeudi";
                case 5 -> "Vendredi";
                case 6 -> "Samedi";
                case 7 -> "Dimanche";
                default -> "pas un jour";
            };

        System.out.println(jour);

        // Depuis Java 17 pattern matching
        Object valeur = 5;
        switch(valeur) {
            case  Integer i -> System.out.println("C'est un entier");
            case  String s -> System.out.println("C'est un string");
            case  Scanner sc -> System.out.println("C'est un scanner");

            default -> System.out.println();
        }
    }
}
