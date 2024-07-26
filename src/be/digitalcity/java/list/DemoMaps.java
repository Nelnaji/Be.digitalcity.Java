package be.digitalcity.java.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class DemoMaps {

    public static void main(String[] args) {

        HashMap<String, int[]> notesParClasse = new HashMap<>();

        notesParClasse.put("A1", new int[]{1,2,3});
        notesParClasse.containsKey("C4");
        Collection<int[]> values = notesParClasse.values();
        Set<String> clefs = notesParClasse.keySet();


    }
}
