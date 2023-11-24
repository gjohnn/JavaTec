package Lab1.tp4.ej3;

import java.util.Scanner;

public class NEWburbuja {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 8, 9, 7, 6, 2, 5 };
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("ASC o DESC");
    String orden = scan.nextLine();
    boolean intercambiado;

    if (orden.equals("ASC")) {
      do {
        intercambiado = false;
        for (int i = 1; i < n; i++) {
          if (arr[i - 1] > arr[i]) {
            int aux = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = aux;
            intercambiado = true;
          }
        }
      } while (intercambiado);
    } else if (orden.equals("DESC")) {
      do {
        intercambiado = false;
        for (int i = 1; i < n; i++) {
          if (arr[i - 1] < arr[i]) {
            int aux = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = aux;
            intercambiado = true;
          }
        }
      } while (intercambiado);
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
