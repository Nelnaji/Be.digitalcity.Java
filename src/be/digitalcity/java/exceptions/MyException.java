package be.digitalcity.java.exceptions;

public class MyException {

    public int division(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public void sayHello(String name) throws Exception{
        if(name.equals("Roger")){
            throw new Exception("On veut pas de roger");

        }
        System.out.println("Bonjour");
    }

}
