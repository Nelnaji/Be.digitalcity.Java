package be.digitalcity.java.carwash;
import java.util.List;

public class CarWash {


    List<ActionVoiture<Voiture>> maListeDactions = List.of((V) -> preparer(V),
            (V) -> laver(V),
            (V) -> secher(V),
            (V) -> finaliser(V));


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

    public void traiter(Voiture v) {

      maListeDactions.forEach( (e) -> e.maMethodeFonctionnelle(v));

    }
    //endregion
}
