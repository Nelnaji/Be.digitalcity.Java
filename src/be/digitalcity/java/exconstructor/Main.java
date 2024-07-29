package be.digitalcity.java.exconstructor;

public class Main {
    public static void main(String[] args) {

        //Création de mes competitions
        Competition bowling = new Competition();
        bowling.name = "competition bowling";
        bowling.minParticipants = 6;
        bowling.maxParticipants = 24;


        Competition tirArc = new Competition("tire à l'arc",5);
        Competition pool = new Competition("piscine",3, 12);

        Participant pre = new Participant("pre", "nom");
        Participant pre1 = new Participant("pre1", "name");
        Participant pre2 = new Participant("pre2", "name2");
        Participant pre3 = new Participant("pre3", "noa");
        Participant pre4 = new Participant("pre4", "noma");
        Participant pre5 = new Participant("pre5", "nomaa");

        pool.addParticipant(pre);
        pool.addParticipant(pre1);
        pool.addParticipant(pre2);
        pool.startCompetition();
    }
}
