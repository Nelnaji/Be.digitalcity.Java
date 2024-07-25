package be.digitalcity.java.list;

import java.util.HashSet;

public class DemoSet {

    public static void main(String[] args) {

        //Collection non ordonnée, ne permettant pas les doublons, sans accès rapide

        HashSet<String> prenoms = new HashSet<>();

        prenoms.add("John");
        prenoms.add("Luc");
        prenoms.add("Marie");
        prenoms.add("Johana");

        //iterer
        for (String prenom : prenoms) {
            System.out.println(prenom);
        }

        // retirer
        prenoms.remove("Johana"); // equals()
    }
}
