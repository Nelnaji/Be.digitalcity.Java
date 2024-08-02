package be.digitalcity.java.exconstructor;


import java.util.HashSet;
import java.util.Set;

public class Competition<T extends Competiteur> {
    private String titreCompet;
    private boolean statusCompet;
    private int minParticipants;
    private int maxParticipants;
    private int nbrParticipants;
    private Set<T> listeParticipants = new HashSet<>();

    //region Constructor

    Competition(String titreCompet) {
        this.titreCompet = titreCompet;
    }

    Competition(String titreCompet, int maxParticipants) {
        this.titreCompet = titreCompet;
        this.maxParticipants = maxParticipants;
    }

    Competition(String titreCompet, int minParticipants, int maxParticipants) {
        this.titreCompet = titreCompet;
        this.minParticipants = minParticipants;
        this.maxParticipants = maxParticipants;
    }
    //endregion


    public void addParticipant(T participant) {

        if (!statusCompet || listeParticipants.size() < maxParticipants) {
            listeParticipants.add(participant);
            System.out.println("Le participant a été ajouté");
        } else {
            System.out.println("impossible d'ajouter le participant");
        }
    }

    public void removeParticipant(T participant) {
        listeParticipants.remove(participant);
    }

    public void startCompetition() {
        nbrParticipants = listeParticipants.size();
        if (!statusCompet && nbrParticipants >= 3) {
            statusCompet = true;
            System.out.printf("La compétition %s est lancée avec %d de %s \n", titreCompet, nbrParticipants
            );
        }
        System.out.println("pas assé de participants");
    }


}

