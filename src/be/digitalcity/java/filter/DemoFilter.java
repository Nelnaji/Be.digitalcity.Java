package be.digitalcity.java.filter;

import be.digitalcity.java.filter.interfaces.Predicat;

import java.util.ArrayList;
import java.util.List;

public class DemoFilter {


    public static void main(String[] args) {

        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> strings = List.of("Pierre", "Charle", "Roger");

        List<Integer> result = monFiltreGeneral(integers, nb -> nb > 2 && nb < 7);

        result.forEach(System.out::println);
    }


    //region methods static
    // ce filtre ne fonctionne qu'avec des chiffres
    public static List<Integer> monFiltre(List<Integer> list, Predicat predict) {
        List<Integer> filteredList = new ArrayList<>();

        for (int nb : list) {
            if (nb % 2 == 0) {
                filteredList.add(nb);
            }
        }
        return filteredList;
    }


    public static List<Integer> filterEventNumber(List<Integer> myList){

        List<Integer> filteredList = new ArrayList<>();

        for(int nb : myList){
            if(nb > 5){
                filteredList.add(nb);
            }
        }
        return filteredList;
    }

    // le premier <TypeGenerique> est le return type  Predicat equivaux à mon interface
    public  static <TypeGenerique>  List<TypeGenerique> monFiltreGeneral(List<TypeGenerique> maliste, Predicat<TypeGenerique> predicat){
        List<TypeGenerique> listFiltre = new ArrayList<>();
         for(TypeGenerique valeur : maliste){
             if(predicat.execute(valeur)){
                 listFiltre.add(valeur);
             }
         }
        return listFiltre;
    }

    //endregion
}