package be.digitalcity.java.exconstructor;

import java.util.Random;

public class Coureur extends Sportif{

    Coureur(String nom, String prenom){
    super( nom, prenom);

    }

    final private Random randomizer = new Random();

    final private int coefficientCourse = 15;


    @Override
    public double performer() {

        return coefficientCourse * randomizer.nextInt(2, 6);

    }
}
