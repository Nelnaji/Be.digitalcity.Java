package be.digitalcity.java.demoAnnotation;
@CoolClass( value = "tototot")
public class Bird {

    private int id;
    private String name;

    @CoolClass
    public Bird(){};

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
