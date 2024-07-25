package be.digitalcity.java.variable;

public class DemoVariable {

    public static void main(String[] args) {
    // Declaration, Initialisation de variables
    //      pour commenter une ligne ctrl + / pavé numerique
        String prenom = "Nawfal", nom= "Elkhaznagi"/*Pour commenter une partie du texte ctrl + shift + / */;
    // Différentes variables primitives elle ne contiennent aucune reference a un objet
//    Integer variables
        byte tresPetitEntier = 127; /* 1 Byte = octet Byte.MAX etc...*/
        short petitEntier = 32767; /* 2 Octet*/
        int entier = 2_147_483_647; /*4 Octet*/
        long grandEntier = 5_000_000_000_000L; /*8 Octets */

        entier = 0b00000111; // ecrire en binaire
        entier = 0377; // ecriture octale
        entier = 0xFF; // ecriture hexadecimale

    // Float variables
        float reel = 0.5F; // 4 Octets
        double reelPrecis = 0.9; // 8 Octets



    //   Others

        boolean bool = true; // or false around 1 octet size
        char character = 'A' + 1 ; // tiens sur 2 octets a retenir qu'un caracter reste un nombre le A est transformé en chiffre
        System.out.println(character);


//        Pour les constantes
        final double PI = 3.141652;

        // conversion
        // 11111111 11111111 11111111 11111111
        //                   11111111 11111111

        petitEntier = (short) entier; // Type casting

        String nombre = "15";
        int converti = Integer.parseInt("15");
//        System.out.println("15"+1-1); Impossible car on ne peux pas soustraire d'une chaine de characters


    }
}
