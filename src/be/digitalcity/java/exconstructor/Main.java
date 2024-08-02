package be.digitalcity.java.exconstructor;

public class Main {
    public static void main(String[] args) {

        //Création de mes competitions
        Competition courseApied = new Competition("Marathon de Bruxelles", 20, 200);

        Competition poolCompet = new Competition("La traversée de Gibraltar", 5, 20);

        Coureur prem = new Coureur("Nel", "Nawfal");
        Coureur dems = new Coureur("azazNel", "Abdallah");
        Coureur trems = new Coureur("azazNel", "Darya");
        Coureur quar = new Coureur("azaNel", "Viktor");
        Coureur cinq = new Coureur("efaaNel", "Geoffrey");
        Coureur ste = new Coureur("Neefel", "Ayoub");
        Coureur six = new Coureur("Nelef", "Christopher");

        Nageur na1 = new Nageur("mornd", "Amin");
        Nageur na2 = new Nageur("oraz", "Amin");
        Nageur na3 = new Nageur("mdfc", "Aurélien");
        Nageur na4 = new Nageur("masqd", "Nicolas");
        Nageur na5 = new Nageur("mazad", "Osmane");
        Nageur na6 = new Nageur("pooed", "Alexandre");
        Nageur na7 = new Nageur("lpofd", "Anna");

        poolCompet.addParticipant(na1);
        poolCompet.addParticipant(na2);
        poolCompet.addParticipant(na3);
        poolCompet.addParticipant(na4);
        poolCompet.addParticipant(na5);
        poolCompet.addParticipant(na6);
        poolCompet.startCompetition();


    }
}
