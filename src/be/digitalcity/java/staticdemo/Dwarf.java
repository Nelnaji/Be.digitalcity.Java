package be.digitalcity.java.staticdemo;

public class Dwarf {
    private static int idTotal = 0;
    private int id;
    private String name;

    Dwarf(String name){
        this.id = idTotal++;
        this.name = name;
    }



/*    @Override
    public String toString() {
        return "id" + id + " name " + name;
    }*/
}
