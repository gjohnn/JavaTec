package Lab1.tp4.ej2;

public class burbuja {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 8, 9, 7, 6, 2, 5 };
    int n = arr.length;
    boolean intercambiado;
    do {
      intercambiado = false;
      for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
          int aux = arr[i - 1];
          arr[i - 1] = arr[i];
          arr[i] = aux;
          intercambiado = true;
        }
      }
    } while (intercambiado == true);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
