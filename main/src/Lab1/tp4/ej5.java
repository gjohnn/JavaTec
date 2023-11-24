package Lab1.tp4;

import java.util.Scanner;

public class ej5 {

  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.println("Ingrese cantidad de filas");
    int filas = sn.nextInt();
    while (filas < 2) {
      System.out.println("Ingrese cantidad de filas (mayor o igual a 2)");
      filas = sn.nextInt();
    }
    System.out.println("Ingrese cantidad de columnas");
    int cols = sn.nextInt();
    while (cols < 2) {
      System.out.println("Ingrese cantidad de columnas (mayor o igual a 2)");

      cols = sn.nextInt();
    }

    int matriz[][] = new int[filas][cols];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.println("Ingrese valor [" + i + "][" + j + "].");
        int valor = sn.nextInt();
        matriz[i][j] = valor;
      }
    }

    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        suma += matriz[i][j];
      }
    }
    int promedio = suma / (matriz.length * matriz[0].length);

    System.out.println("Suma: " + suma);
    System.out.println("Promedio: " + promedio);

    boolean encontrado = false;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if (matriz[i][j] == promedio) {
          System.out.println(
            "El promedio '" +
            promedio +
            "' se encuentra en la posición Matriz[" +
            i +
            "][" +
            j +
            "]."
          );
          encontrado = true;
        }
      }
    }
    if (!encontrado) {
      System.out.println("No se encontró ninguna coincidencia.");
    }
  }
}
