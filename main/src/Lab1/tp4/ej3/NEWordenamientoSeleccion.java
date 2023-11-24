package Lab1.tp4.ej3;

import java.util.Scanner;

public class NEWordenamientoSeleccion {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 8, 9, 7, 6, 2, 5 };
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("ASC o DESC");
    String orden = scan.nextLine();
    if (orden.equals("ASC")) {
      for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
          int min = i;
          if (arr[j] > arr[min]) {
            min = j;
          }
          int aux = arr[min];
          arr[min] = arr[j];
          arr[j] = aux;
        }
      }
    } else if (orden.equals("DESC")) {
      for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
          int min = i;
          if (arr[j] < arr[min]) {
            min = j;
          }
          int aux = arr[min];
          arr[min] = arr[j];
          arr[j] = aux;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
