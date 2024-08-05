package be.digitalcity.java.enums;

import java.util.ArrayList;
import java.util.List;

public class DemoEnum {
    public static void main(String[] args) {

        Gender genre = Gender.FEMALE;
        String genderString = genre.toString();
        int ordinal = genre.ordinal();

        System.out.println(genderString + " " + ordinal);

        List<Gender> genres = new ArrayList<>();
        genres.add(Gender.FEMALE);
        genres.add(Gender.MALE);

        Ville.BRUXELLES.show();
    }

}
