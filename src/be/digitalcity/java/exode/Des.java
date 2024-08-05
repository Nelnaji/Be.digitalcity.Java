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

            if(nbrFace != 6 || nbrFace != 10 || nbrFace != 20 || nbrFace != 100){

                throw new RuntimeException("Mauvais dés, seules les dés de 6/10/20 et 100 faces sont acceptés");
            }



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
