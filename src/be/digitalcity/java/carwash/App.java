package be.digitalcity.java.carwash;

public class App {
    public static void main(String[] args) {

    CarWash carWash = new CarWash();
    Voiture voiture = new Voiture("123N4");

    carWash.traiter(voiture);

    }
}
