package Lab1.tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej5 {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(10);
    Scanner scan = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
      System.out.print("Ingrese n" + i + ": ");
      int n = scan.nextInt();
      arr.add(n);
    }

    ArrayList<Integer> arrASC = new ArrayList<Integer>(arr);
    ArrayList<Integer> arrDESC = new ArrayList<Integer>(arr);

    Collections.sort(arrASC);
    Collections.sort(arrDESC, Collections.reverseOrder());
        System.out.println("----------- ASC -------------");

    for (Integer e : arrASC) {
      System.out.println(e);
    }

        System.out.println("----------- DESC -------------");
    for (Integer e : arrDESC) {
      System.out.println(e);
    }
    
  }
}
