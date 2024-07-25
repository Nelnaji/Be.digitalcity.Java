package be.digitalcity.java.operateurs;

public class Logique {
    public static void main(String[] args) {

        boolean a = true, b = false, rslt;

        // AND - && Binary operator

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // OR - || Binary operator

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // NOT - ! Unary operator "unaire"
        System.out.println( !true); // false
        System.out.println( !false); // true

        // XOR - ^ Binary operator

        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // Loi de Morgan
        boolean estBleu = true, estLigne = false;

        System.out.println(!(estBleu && estLigne));
        // Le sac nest pas bleu et ligné (en même temps)
        System.out.println(!estBleu || !estLigne);
        // le sac n'est pas bleu ou pas ligné

        System.out.println(!(estBleu || estLigne));
        System.out.println(!estBleu && !estLigne);

        int temp = 18;
        boolean allumer = temp >= 5 && temp <= 15;
        boolean fermer = temp < 5 || temp > 15;

        // ternary operator
        int age = 15;
        String majorite = age <= 18 ? "majeur" : "mineur"; // mineur




    }
}
