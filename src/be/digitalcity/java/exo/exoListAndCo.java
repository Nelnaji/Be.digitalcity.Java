package be.digitalcity.java.exo;

import java.util.LinkedList;
import java.util.Scanner;

public class exoListAndCo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Linkedlist est preferable a ArrayList
        LinkedList<Double> numbers = new LinkedList<Double>();
        double total = 0;
        double average;

        // correction Alex
        //has ecout le string
        boolean isDouble = sc.hasNextDouble();

        // lancer un print avant d'initier ma boucle

        System.out.print("> introduisez vos chiffres, pour calculer la moyenne taper une lettre :");

        //Si isDouble est un double alors le code s'execute

        while (isDouble) {
            Double userInput = sc.nextDouble();
            numbers.add(userInput);
            System.out.print("> introduisez vos chiffres, pour calculer la moyenne taper une lettre :");
        }


        //Ajout des nombres
        for (double number : numbers) {
            total += number;
        }

        average = total / numbers.size();
        System.out.println("Your average is : " + average);
        System.out.println("Total is: " + total + " numbers is :" + numbers + " your divider is: " + numbers.size());
    }
}
