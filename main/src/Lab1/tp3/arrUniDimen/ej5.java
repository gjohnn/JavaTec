package Lab1.tp3.arrUniDimen;

import java.util.Random;

public class ej5 {
    public static void main(String[] args) {
        Random random = new Random();
        int nEnterosPositivos[] = new int[20];
        int suma = 0;

        for (int i = 0; i < nEnterosPositivos.length; i++) {
            int nAzar = random.nextInt(100);
            while (nAzar % 2 == 1) {
                nAzar = random.nextInt(100);
            }
            nEnterosPositivos[i] = nAzar;
            suma += nEnterosPositivos[i];
        }

        int promedio = suma / 20;

        int cantMayorQuePromedio = 0;
        int cantMenorQuePromedio = 0;

        for (int i = 0; i < nEnterosPositivos.length; i++) {
            if (nEnterosPositivos[i] > promedio) {
                cantMayorQuePromedio++;
            } else {
                cantMenorQuePromedio++;
            }
        }

        for (int i = 0; i < nEnterosPositivos.length; i++) {
            System.out.println(nEnterosPositivos[i]);
        }
        System.out.println("Promedio: " + promedio);

        System.out.println("Cant. de n menores que el promedio: " + cantMenorQuePromedio);
        System.out.println("Cant. de n mayores que el promedio: " + cantMayorQuePromedio);

    }
}
