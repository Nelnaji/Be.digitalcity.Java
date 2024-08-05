package be.digitalcity.java.exceptions;

public class Exceptions {

    public static void main(String[] args) {

        MyException myException = new MyException();
        try{
            System.out.println(myException.division(4,5));
            System.out.println("Succeed");
            // ont doit obligatoirement trouver la bonne exception
        } catch(ArithmeticException e){
            System.out.println("Failed" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Failed");
        }
        System.out.println("Finished");
    }

}
