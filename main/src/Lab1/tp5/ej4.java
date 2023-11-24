package Lab1.tp5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ej4 {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(50);
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    for (int i = 1; i <= 50; i++) {
      int n = random.nextInt(100);
      arr.add(n);
    }
    for (Integer integer : arr) {
      System.out.println(integer);
    }

    System.out.println("Ingrese n a encontrar");
    int findNumber = scan.nextInt();
    boolean finded = false;
    for (int i = 0; i < arr.size(); i++) {
      if (findNumber == arr.get(i)) {
        finded = true;
        System.out.println("Numero encontrado en la posición: " + (i + 1));
      }
    }
    if (!finded) {
      System.out.println("Numero NO encontrado!");
    }
  }
}
