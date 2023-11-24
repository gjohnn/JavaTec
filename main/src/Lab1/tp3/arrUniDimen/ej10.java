package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner nInput = new Scanner(System.in);
        int arr5[] = new int[5];
        int arr10[] = new int[10];
        int arrMulti[] = new int[10];
        System.out.println("Ingrese valores del arr5");
        for (int i = 0; i < arr5.length; i++) {

            int n = nInput.nextInt();
            arr5[i] = n;
        }
        System.out.println("Ingrese valores del arr10");

        for (int i = 0; i < arr10.length; i++) {
            int n = nInput.nextInt();
            arr10[i] = n;
        }

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arrMulti.length; j++) {
                arrMulti[j] += arr5[i] * arr10[j];
            }
        }

        for (int i = 0; i < arrMulti.length; i++) {
            System.out.println("Posición " + (i + 1) + " = " + arrMulti[i]);
        }

    }
}
