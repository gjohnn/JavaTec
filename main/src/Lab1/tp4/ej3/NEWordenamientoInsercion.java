package Lab1.tp4.ej3;

import java.util.Scanner;

public class NEWordenamientoInsercion {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 8, 9, 7, 6, 2, 5 };
    Scanner scan = new Scanner(System.in);
    System.out.println("ASC o DESC");
    String orden = scan.nextLine();

    if (orden.equals("ASC")) {
      for (int i = 0; i < arr.length; i++) {
        int valor = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > valor) {
          arr[j + 1] = arr[j];
          j--;
        }
        arr[j + 1] = valor;
      }
    } else if (orden.equals("DESC")) {
      for (int i = 0; i < arr.length; i++) {
        int valor = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] < valor) {
          arr[j + 1] = arr[j];
          j--;
        }
        arr[j + 1] = valor;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
