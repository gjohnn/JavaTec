package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner nInput = new Scanner(System.in);
        double numberArr[] = new double[10];

        double n = 0;

        for (int i = 0; i < numberArr.length; i++) {
            n = nInput.nextDouble();
            numberArr[i] = n;
            System.out.println(numberArr[i]);
        }

        double high = 0;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] > high) {
                high = numberArr[i];
            }
        }

        double low = numberArr[0];
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] < low) {
                low = numberArr[i];
            }
        }

        System.out.println("Más alto: " + high);
        System.out.println("Más bajo: " + low);

        double dif = high - low;
        System.out.println("Distancia: " + dif);

    }
}
