package Lab1.tp4;

import java.util.Scanner;

public class ej4 {

  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int arr[] = new int[20];
    int n = arr.length;
    boolean aord = false;
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Ingrese n" + (i + 1));
      int scan = sn.nextInt();
      arr[i] = scan;
    }

    System.out.println("Ascendente: 1 | Descendente: 2");
    int ordenDeArray = sn.nextInt();
    while (ordenDeArray < 1 || ordenDeArray > 2) {
      System.out.println("Ascendente: 1 | Descendente: 2");
      ordenDeArray = sn.nextInt();
    }
    if (ordenDeArray == 1) {
      aord = true;
    } else if (ordenDeArray == 2) {
      aord = false;
    }
    int metodo = 0;
    String metodoUsado = "";
    do {
      System.out.println("Elegir método:");
      System.out.println("1) Inserción");
      System.out.println("2) Burbuja");
      System.out.println("3) Selección");

      metodo = sn.nextInt();
    } while (metodo < 1 || metodo > 3);

    if (metodo == 1) {
      if (aord == true) {
        for (int i = 0; i < arr.length; i++) {
          int valor = arr[i];
          int j = i - 1;
          while (j >= 0 && arr[j] > valor) {
            arr[j + 1] = arr[j];
            j--;
          }
          arr[j + 1] = valor;
        }
      } else if (aord == false) {
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
      metodoUsado = "Inserción";
    } else if (metodo == 2) {
      Boolean intercambiado = false;
      if (aord == true) {
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
      } else if (aord == false) {
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
      metodoUsado = "Burbuja";
    } else if (metodo == 3) {
      if (aord == true) {
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
      } else if (aord == false) {
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
      metodoUsado = "Selección";
    }
    System.out.println("Método usado: " + metodoUsado);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
