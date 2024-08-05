package be.digitalcity.java.staticdemo;

public final class MathUtils {


    public static class SousClass{


        public static void addition(int a, int b){
            int c = a + b;
            System.out.println(c);
        }

        public static void soustraction( int a, int b){
            int c = a - b;
            System.out.println(c);
        }

        public static void division( int a, int b){
            if (b == 0) {
                throw new RuntimeException("ne peux pas diviser par 0");
            }
            int c = a / b;
            System.out.println(c);

        }
        public static void multiplication(int a,int b){
            int c = a * b;
            System.out.println(c);

        }
        public static void modulo( int a, int b){
            int c = a % b;
            System.out.println(c);

        }
    }
}
