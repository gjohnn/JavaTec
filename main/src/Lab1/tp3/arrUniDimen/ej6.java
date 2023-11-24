package Lab1.tp3.arrUniDimen;

import java.util.Random;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner nInput = new Scanner(System.in);
        Random random = new Random();
        int arrNumbers[] = new int[50];
        boolean finded = false;
        for (int i = 0; i < arrNumbers.length; i++) {
            int randomN = random.nextInt(100);
            arrNumbers[i] = randomN;
        }

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println(arrNumbers[i]);
        }

        int desiredNumber = nInput.nextInt();

        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] == desiredNumber) {
                finded = true;
                System.out.println("Son iguales! Posición: " + (i + 1));
            }
        }

        if (finded == false) {
            System.out.println("No se encontró el valor en el array!");
        }
    }
}
