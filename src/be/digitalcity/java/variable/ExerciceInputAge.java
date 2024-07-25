package be.digitalcity.java.variable;

import java.util.Scanner;

public class ExerciceInputAge {
    public static void main(String[] args) {
    // Déclaration de variables
        int userAge;
        int userFuturAge;
                Scanner userInput = new Scanner(System.in);

        System.out.println("Veuillez introduire votre nom :");

        String userName = userInput.nextLine();

        System.out.println("Merci " + userName + " Veuillez introduire votre age en année:");

        userAge= userInput.nextInt();
        userFuturAge = userAge + 20;

        System.out.println("Merci " + userName + " dans 20 ans vous aurez : " + userFuturAge);

//        Attention nextInt() prend number n\ et le n\ est directement inscrit dans le next nextLine()

    }

}
