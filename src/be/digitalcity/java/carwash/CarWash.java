package be.digitalcity.java.carwash;

import java.util.List;

public class CarWash {


    List<ActionVoiture> maListeDactions = List.of((laVoiture) -> System.out.println("Je prépare la voiture: " + laVoiture),
            (laVoiture) -> System.out.println("Je lave la voiture " + laVoiture),
            (laVoiture) -> System.out.println("je seche la voiture " + laVoiture),
            (laVoiture) -> System.out.println(""));


    //region La Manière redondante
    private void preparer(Voiture V) {
        System.out.println("Je prépare la voiture: " + V.getPlaque());
    }

    private void laver(Voiture V) {
        System.out.println("Je lave la voiture: " + V.getPlaque());
    }

    private void secher(Voiture V) {
        System.out.println("Je seche la voiture: " + V.getPlaque());
    }

    private void finaliser(Voiture V) {
        System.out.println("Je finalise la voiture: " + V.getPlaque());
    }

    public void <ActionVoiture> List<ActionVoiture> traiter(List<ActionVoiture> V) {
        System.out.println(V);
    }
    //endregion
}
