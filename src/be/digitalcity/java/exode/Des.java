package be.digitalcity.java.exode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Des {


    public static class LancerDes {

        public static int lancerDes(int nbrFace) {
            Random randomizer = new Random();
            return randomizer.nextInt(1, nbrFace + 1);
        }

        public static void lancerPlusieursDes(int nbrFace, int nbrLances, int nbrAGarder ){

            List<Integer> listDesGardes = new ArrayList<>();

            Random random = new Random();

            for (int i = 0; i < nbrLances; i++) {
                int chiffreTrouve = random.nextInt(1, nbrFace +1);
                listDesGardes.add(chiffreTrouve);
            }

            listDesGardes.forEach(System.out::println);

        }




    }
}
