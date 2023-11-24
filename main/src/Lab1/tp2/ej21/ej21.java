package Lab1.tp2.ej21;

import java.util.Scanner;

public class ej21 {
    /*
     * Codifique un programa que solicite un número entero mayor a cero y que
     * mediante recursión sume todos los números números naturales desde el
     * número ingresado hasta 1.
     * Ejemplo: Ingreso 10
     * El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
     */
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        int num = numInput.nextInt();
        int sumaDeNums = sumaRecursion(num);
        System.out.println(sumaDeNums);
    }

    static int sumaRecursion(int num) {
        if (num == 0) {
            num = num + 0;
        } else {
            num = num + (sumaRecursion(num - 1));
        }
        return num;
    }
}
