package be.digitalcity.java.encapsulation;

public class NoTitulaireException extends RuntimeException{

    NoTitulaireException(){
        super("Titulaire n'existe pas");
    }

    //ont crée un constructeur
    NoTitulaireException(String monMessageErreur){
        super(monMessageErreur);
    }
}
