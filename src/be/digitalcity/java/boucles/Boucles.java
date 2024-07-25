package be.digitalcity.java.boucles;

import java.util.Random;

public class Boucles {
    public static void main(String[] args) {
        Random dice = new Random();
        int randomNumber;

/*
        while((randomNumber = dice.nextInt(1, 13)) != 5) {
            System.out.println(randomNumber);
        }
*/

        // do while
        int index = 5;
        do {

            System.out.println("hello");
            index--;
        } while( index > 5);

    /*    for (int i = 3; i > 0; i--) {
            System.out.println(randomNumber);

        }*/

        for(int i = 1; (i *= 2) <1000; System.out.println(i));

        int j = 1;
        while((j *= 10) <1000) {
            System.out.println(j);
        }



    }
}
