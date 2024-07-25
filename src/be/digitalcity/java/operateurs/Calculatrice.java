package be.digitalcity.java.operateurs;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {

        boolean keepGoing = true;

        do {
            //Loop de calcul

            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenue dans la petite calculatrice java: Veuillez introduire un chiffre");
            int firstNum = Integer.parseInt(sc.next());
            System.out.println("Veuillez choisir parmis les opérateurs suivant : +, -, /, *, % ");
            String operator = sc.next();
            System.out.println("Veuillez introduire le dernier chiffre");

            int secondNum = Integer.parseInt(sc.next());


            String rslt = "votre resultat est :";

                switch (operator) {
                    case "*":
                        int result = firstNum * secondNum;
                        System.out.printf("Votre resultat est :  %d * %d = %d", firstNum, secondNum, result);
                        break;
                    case "/":
                        if (secondNum == 0) {

                            System.out.println("Impossible de diviser par 0, veuillez relancer le program");
                        }else {
                            float result1 = (float) firstNum / (float) secondNum;
                            System.out.printf("Votre resultat est :  %d / %d = %f", firstNum, secondNum, result1);
                        }
                        break;
                    case "-":
                        int result2 = firstNum - secondNum;
                        System.out.printf("Votre resultat est :  %d - %d = %d", firstNum, secondNum, result2);

                        break;
                    case "+":
                        int result3 = firstNum + secondNum;
                        System.out.printf("Votre resultat est :  %d + %d = %d", firstNum, secondNum, result3);

                        break;
                    case "%":
                        if (secondNum == 0){
                            System.out.println("Impossible de diviser par 0, veuillez relancer le program");
                        } else {
                        int result4 = firstNum % secondNum;
                        System.out.printf("Votre resultat est :  %d %% %d = %d", firstNum, secondNum, result4);
                        }
                        break;
                    default:
                        System.out.println("Opérateur invalide");
                }

            sc.nextLine();
            System.out.println("\ncontinuer a faire des calculs ?: y/n");
            keepGoing = sc.next().toLowerCase().equals("y");

        }while( keepGoing );

    }
}
