package Lab1.tp4.ej2;

public class ordenamientoInsercion {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 8, 9, 7, 6, 2, 5 };
    for (int i = 0; i < arr.length; i++) {
      int valor = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > valor) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = valor;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
