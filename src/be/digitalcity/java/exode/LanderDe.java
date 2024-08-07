package be.digitalcity.java.exode;

import java.util.List;

import static be.digitalcity.java.exode.Des.LancerDes.*;

public class LanderDe {

    public static void main(String[] args) {

//        System.out.println(lancerDes(6));

        try {
            lancerPlusieursDes(6, 10, 5);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
