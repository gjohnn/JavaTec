package
        Lab1.tp3.arrMultiDimen;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        String[][] matriz = new String[4][4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 4 paises");
        matriz[0][0] = "País: " + scan.nextLine();
        matriz[1][0] = "País: " + scan.nextLine();
        matriz[2][0] = "País: " + scan.nextLine();
        matriz[3][0] = "País: " + scan.nextLine();

        System.out.println("Ciudades para " + matriz[0][0]);
        for (int i = 1; i < matriz.length; i++) {
            matriz[0][i] = scan.nextLine();
        }

        System.out.println("Ciudades para " + matriz[1][0]);
        for (int i = 1; i < matriz.length; i++) {
            matriz[1][i] = scan.nextLine();
        }

        System.out.println("Ciudades para " + matriz[2][0]);
        for (int i = 1; i < matriz.length; i++) {
            matriz[2][i] = scan.nextLine();
        }

        System.out.println("Ciudades para " + matriz[3][0]);
        for (int i = 1; i < matriz.length; i++) {
            matriz[3][i] = scan.nextLine();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}