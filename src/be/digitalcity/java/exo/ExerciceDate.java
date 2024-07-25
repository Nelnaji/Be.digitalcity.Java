package be.digitalcity.java.exo;

import java.util.Scanner;
//import java.util.concurrent.TimeUnit;

public class ExerciceDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour veuillez rentrer un nombre de secondes pour convertire en date");
        int seconds = sc.nextInt();
/*
        Method with java util

        int day = TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

        System.out.println(seconds + " vaut exactement :" + day + " jour " + hours + " heure " + minute + " minute " + second + " secondes " );
   */

        // methode sans
        int second = seconds % 60;
        int minutes = seconds % 3600 / 60 ;
        int hours = seconds % 86400 / 3600;
        int days = seconds / 86400;
        System.out.println(seconds + " vaut exactement :"  + days + " jour " + hours + " heure " + minutes + " minute " + second + " secondes " );


    }
}
