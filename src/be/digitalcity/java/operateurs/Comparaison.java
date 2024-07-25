package be.digitalcity.java.operateurs;

import java.util.Scanner;

public class Comparaison {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in); // adr25
        Scanner sc2 = new Scanner(System.in); // adr75
        Scanner sc3 = sc1; // adr25

    int a=7, b=5;
    boolean rslt;
    rslt = a != b;
    rslt = a == b;

    // Ne peut-être camparé qu'avec des nombres
    rslt = a < b;
    rslt = a > b;
    rslt = a <= b;
    rslt = a >= b;

    rslt = sc1 == sc2; // faux parceque differentes address
    rslt = sc3 == sc1; // true parceque même adresse


        String str1 = "Salut";
        String str2 = "Salut";
        String str3 = new String("Salut");
        String str4 = "Sa" + "lut"; //this will concatenate and go to the string pool

        rslt = str1 == str2; // TRUE
        rslt = str1 == str3; // false
        rslt = str1 == str4; // true
        str2 = "pas salut";
        System.out.println(str2);


    }
}
