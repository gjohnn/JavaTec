package Lab1.tp2.ej23;

import java.util.Scanner;

public class ej23 {
    /*
     * Crea un programa donde se pida el ingreso de una cadena y por medio de
     * recursión mostrar la cadena de forma inversa.
     * Ejemplo: Ingreso “computadora de escritorio”
     * Invertir cadena “oirotircse ed arodatupmoc”
     */
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        String word = wordInput.nextLine();
        String upsideDown_Word = changeString(word);
        System.out.println(word);
        System.out.println("----------------------------------------");
        System.out.println(upsideDown_Word);
    }
    static String changeString(String word){
        if ((word == null) || (word.length() <= 1))
            return word;
        else {
            System.out.println(changeString(word.substring(1)) + word.charAt(0));
            return changeString(word.substring(1)) + word.charAt(0);
        }
    }
}
