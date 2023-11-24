package Lab1.tp5;

import java.util.ArrayList;
import java.util.Random;

public class ej3 {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(20);
    Random random = new Random();
    for (int i = 1; i <= 20; i++) {
      int n = random.nextInt(100);
      while (n % 2 != 0) {
        n = random.nextInt(100);
      }
      arr.add(n);
    }
    int suma = 0;
    for (Integer e : arr) {
      suma += e;
    }

    int promedio = suma / arr.size();
    int menorAlPromedio = 0;
    int mayorAlPromedio = 0;
    int igualAlPromedio = 0;

    for (Integer e : arr) {
      if (e > promedio) {
        mayorAlPromedio++;
      } else if (e < promedio) {
        menorAlPromedio++;
      } else {
        igualAlPromedio++;
      }
    }
    for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i));
    }

    System.out.println("Promedio: " + promedio);
    System.out.println("Cant. de n mayores al promedio: " + mayorAlPromedio);
    System.out.println("Cant. de n menores al promedio: " + menorAlPromedio);
    System.out.println("Cant. de n iguales al promedio: " + igualAlPromedio);
  }
}
