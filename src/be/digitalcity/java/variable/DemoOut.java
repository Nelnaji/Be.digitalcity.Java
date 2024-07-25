package be.digitalcity.java.variable;

import java.util.Scanner;

public class DemoOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un mot");
        String input = sc.nextLine();

        System.out.println("Votre mot est :" + input);

    }
}
