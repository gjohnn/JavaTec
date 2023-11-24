package Lab1.tp3.arrMultiDimen;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese n");
        int x = scan.nextInt();
        while (x < 3 || x > 10) {
            System.out.println("Ingrese n correctamente");
            x = scan.nextInt();
        }

        int matriz1[][] = new int[x][x];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.println("Ingrese n para posición: " + i + " " + j);

                matriz1[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        int finalArray[] = new int[x];
        int suma = 0;
        int sumaFinal = 0;

        for (int j = 0; j < finalArray.length; j++) {
            suma = 0;
            for (int i = 0; i < finalArray.length; i++) {
                suma += matriz1[i][j];
            }
            finalArray[j] = suma;
        }
          System.out.println("---------------------");

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < finalArray.length; i++) {
            sumaFinal += finalArray[i];
        }
        System.out.println("Total: " + sumaFinal);

    }
}
