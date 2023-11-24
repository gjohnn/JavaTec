package Lab1.tp4.ej2;

public class ordenamientoSeleccion {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 8, 9, 7, 6, 2, 5 };
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[min]) {
          min = j;
        }
        int aux = arr[min];
        arr[min] = arr[j];
        arr[j] = aux;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
