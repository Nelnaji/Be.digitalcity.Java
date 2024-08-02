package be.digitalcity.java.exconstructor;

import java.util.Random;

public class Nageur extends Sportif {

    Nageur(String nom, String prenom){
        super( nom, prenom);

    }
    final private Random randomizer = new Random();

    private int coefficientNage = 10;


    @Override
    public double performer() {
        return coefficientNage * randomizer.nextInt(1, 4);

    }
}
