package Lab1.tp3.arrMultiDimen;

import java.util.Scanner;

public class ej4 {

    public static void main(String args[]) {
        System.out.println("Ingrese el valor para la dimension de la matriz entre 4 y 10");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x < 4 || x > 10) {
            System.out.println("Inválido: Ingrese nuevamente");
            x = sc.nextInt();
        }

        int[][] matriz = new int[x][x];

        // Ingreso de valores a matriz
        System.out.println("Ingrese los valores para la matriz");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                int numero = sc.nextInt();
                while (numero <= 0) {
                    System.out.println("Valor inválido, ingrese nuevamente");
                    numero = sc.nextInt();
                }
                matriz[i][j] = numero;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(matriz[i][j] + "-");
            }
            System.out.println("");
        }

        boolean repetir = true;
        while (repetir) {
            System.out.println("MENU:");
            System.out.println("b)Suma una fila");
            System.out.println("c)Suma una columna");
            System.out.println("d)Suma diagonal principal");
            System.out.println("e)Suma diagonal inversa");
            System.out.println("f)Promedio de los valores");

            char letra = sc.next().charAt(0);

            switch (letra) {
                case 'b' -> {
                    System.out.println("Sumar Filas:");
                    sumarFilas(matriz);
                    break;
                }
                case 'c' -> {
                    System.out.println("Sumar Columnas:");
                    sumarColumna(matriz);
                    break;

                }
                case 'd' -> {
                    System.out.println("Sumar Diagonal Principal");
                    sumarDiagonalPrincipal(matriz);
                    break;

                }
                case 'e' -> {
                    System.out.println("Sumar Diagonal Inversa");
                    sumarDiagonalInversa(matriz);
                    break;

                }
                case 'f' -> {
                    System.out.println("Sumar Media Valores");
                    mediaValores(matriz);
                    break;
                }
                default -> {
                    System.out.println("Valor inválido");
                    repetir = true;
                    break;
                }
            }

            System.out.println("Ingrese 0 para salir, ingrese 1 para continuar");
            int n = sc.nextInt();
            if (n == 0) {
                repetir = false;
            }
        }

    }

    public static void sumarFilas(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fila a sumar");
        int n = sc.nextInt();

        while (n > matriz.length || n < 0) {
            System.out.println("Fila invalida, ingrese nuevamente");
            n = sc.nextInt();
        }

        int sumaFila = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaFila += matriz[n][i];
        }
        System.out.println("----------------------------------");
        System.out.println("La suma de la fila " + n + " es: " + sumaFila);
        System.out.println("----------------------------------");
    }

    public static void sumarColumna(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la columna a sumar");
        int n = sc.nextInt();

        while (n > matriz.length || n < 0) {
            System.out.println("Columna invalida, ingrese nuevamente");
            n = sc.nextInt();
        }

        int sumaColumna = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna += matriz[i][n];
        }
        System.out.println("----------------------------------");
        System.out.println("La suma de la fila " + n + " es: " + sumaColumna);
        System.out.println("----------------------------------");

    }

    public static void sumarDiagonalPrincipal(int[][] matriz) {
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("----------------------------------");
        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
        System.out.println("----------------------------------");

    }

    public static void sumarDiagonalInversa(int[][] matriz) {
        int fila = 0;
        int columna = matriz.length - 1;
        int sumaDiagonal = 0;
        do {
            sumaDiagonal += matriz[fila][columna];

            fila += 1;
            columna = columna - 1;
        } while (columna >= 0 || fila != matriz.length);
        System.out.println("----------------------------------");
        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonal);
        System.out.println("----------------------------------");

    }

    public static void mediaValores(int[][] matriz) {

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("----------------------------------");
        System.out.println("El promedio de los valores es: " + suma / (matriz.length * matriz.length));
        System.out.println("----------------------------------");

    }
}
