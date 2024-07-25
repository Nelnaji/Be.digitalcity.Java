package be.digitalcity.java.exo;

import java.util.Scanner;

public class Conditionnels {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int stockTea = 0, stockCoffee = 5, stockWater = 10;
//        System.out.println("Bonjour, Veuillez taper le chiffre de la boisson que vous voulez 1: Thé ; 2: Café ; 3: Eau");
//        int choice = sc.nextInt();
//
//        if (choice == 1 && stockTea > 0) {
//            stockTea-- ;
//            System.out.println("Vous recevez 1 thé, stock restant : " + stockTea  );
//        }
//        else if (choice == 2 && stockCoffee > 0) {
//            stockCoffee-- ;
//            System.out.println("Vous recevez 1 café, stock restant : " + stockCoffee  );
//        }
//        else if (choice == 3 && stockWater > 0) {
//            stockWater-- ;
//            System.out.println("Vous recevez 1 Eau, stock restant : " + stockWater  );
//        } else {
//            System.out.println("La boisson demandé n'est plus de stock");
//        }

        // teachers way
        Scanner sc = new Scanner(System.in);
        int stockTea = 0;
        int stockCoffee = 5;
        int stockWater = 10;

        final int TEA_CHOICE = 1;
        final int COFFE_CHOICE = 2;
        final int WATER_CHOICE = 3;

        System.out.println("Bonjour, Veuillez taper le chiffre de la boisson que vous voulez 1: Thé ; 2: Café ; 3: Eau");
        int choice = sc.nextInt();

        switch (choice) {
            case TEA_CHOICE:
                if(stockTea > 0 ) {
                    System.out.println("Vous recevez 1 thé, stock restant : " + --stockTea );
                }
                break;
            case COFFE_CHOICE:
                if(stockCoffee > 0 ) {
                    System.out.println("Vous recevez 1 Café, stock restant : " + --stockCoffee );
                }
                break;
            case WATER_CHOICE:
                if(stockCoffee > 0 ) {
                    System.out.println("Vous recevez 1 Eau, stock restant : " + --stockWater );
                }
                break;
            default :
                System.out.println("La boisson demandée n'est plus de stock");
        }


    }
}
