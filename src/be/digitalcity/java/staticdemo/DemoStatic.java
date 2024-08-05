package be.digitalcity.java.staticdemo;

import java.util.ArrayList;
import java.util.List;

import static be.digitalcity.java.staticdemo.MathUtils.SousClass.addition;
import static be.digitalcity.java.staticdemo.MathUtils.SousClass.multiplication;
public class DemoStatic {

    public static void main(String[] args) {

        addition(1,2);
        multiplication(5,2);


        List<Dwarf> dwarfs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            dwarfs.add(new Dwarf("Nain" + i));
        }

        dwarfs.forEach(System.out::println);
    }

}
