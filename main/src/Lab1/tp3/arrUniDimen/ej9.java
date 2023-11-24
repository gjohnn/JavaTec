package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner dniInput = new Scanner(System.in);
        String letras[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E" };
        System.out.println("Ingrese DNI:");
        int dni = dniInput.nextInt();
        int letraPosicion = obtenerLetra(dni);
        String dniFinal = "DNI: " + dni + letras[letraPosicion];
        System.out.println(dniFinal);
    }

    public static int obtenerLetra(int numeroDNI) {
        int n = numeroDNI % 23;
        return n;
    }
}
