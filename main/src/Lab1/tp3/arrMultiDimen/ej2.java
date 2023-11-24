package Lab1.tp3.arrMultiDimen;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indicar tamaño de las filas");
        int x = scan.nextInt();
        System.out.println("Indicar tamaño de las columnas");

        int y = scan.nextInt();

        int matriz[][] = new int[x][y];
        int matriz1[][] = new int[y][x];
        int matrizFinal[][] = new int[x][y];

        System.out.println("Matriz X / Y");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese valor para posición: " + i + " " + j);
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz Y / X");

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Ingrese valor para posición: " + i + " " + j);
                matriz1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIZ FINAL");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrizFinal[i][j] = matriz[i][j] * matriz1[j][i];
                System.out.print(matrizFinal[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
