package be.digitalcity.java.exconstructor;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    String name;
    boolean status;
    int minParticipants;
    int maxParticipants;
    int nbrParticipants;

    // Utiliser un Set car plus stable
    final List<Participant> listeParticipants = new ArrayList<>();

    void startCompetition() {
        nbrParticipants = listeParticipants.size();
        if (!status && nbrParticipants >= 3) {
            status = true;
            System.out.printf("La compétition %s est lancée avec %d participants \n", name, nbrParticipants);
        }
        System.out.println("pas assé de participants");
    }


    void addParticipant(Participant participant) {

        if (!status || listeParticipants.size() < maxParticipants) {
            listeParticipants.add(participant);
            System.out.println("Le participant a été ajouté");
        } else {
            System.out.println("impossible d'ajouter le participant");
        }
    }

//many constructor functions

/*    Competition() {
        this.minParticipants = 3;
        this.maxParticipants = 12;
    }*/

    Competition(String name) {
        this.name = name;
    }

    Competition(String name, int minParticipants) {
        this.name = name;
        this.minParticipants = minParticipants;
    }

    Competition(String name, int minParticipants, int maxParticipants) {
        this.name = name;
        this.minParticipants = minParticipants;
        this.maxParticipants = maxParticipants;
    }
   Competition() {
     this("allo",3,12);
    }

}
