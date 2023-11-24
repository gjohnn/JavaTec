package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String numerosCadena = inputString.nextLine();
        String listado[] = numerosCadena.split("-");

        int listadoEntero[] = new int[10];
        for (int i = 0; i < listado.length; i++) {
            int conversor = Integer.parseInt(listado[i]);
            listadoEntero[i] = conversor;
        }
        int suma = 0;
        int promedio = 0;
        int contadorPromedio = 0;

        for (int i = 0; i < listadoEntero.length; i++) {
            suma += listadoEntero[i];
            contadorPromedio++;
        }

        promedio = suma / contadorPromedio;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

    }
}
