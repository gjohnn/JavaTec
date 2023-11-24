package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej7 {
    /*
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * int array[] = new int[10];
     * 
     * for (int i = 0; i < array.length; i++) {
     * int n = scanner.nextInt();
     * array[i] = n;
     * }
     * 
     * int arrayAsc[] = Arrays.copyOf(array, 10);
     * Arrays.sort(arrayAsc);
     * 
     * System.out.println("Orden ascendente");
     * for (int i = 0; i < arrayAsc.length; i++) {
     * System.out.println(arrayAsc[i]);
     * }
     * 
     * int arrayDesc[] = Arrays.copyOf(array, 10);
     * Arrays.sort(arrayDesc);
     * 
     * for (int i = 0; i < array.length / 2; i++) {
     * int temp = arrayDesc[i];
     * arrayDesc[i] = arrayDesc[(array.length - 1) - i];
     * arrayDesc[(array.length - 1) - i] = temp;
     * }
     * 
     * System.out.println("Orden descendente");
     * for (int i = 0; i < arrayDesc.length; i++) {
     * System.out.println(arrayDesc[i]);
     * }
     * 
     * }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            int n = scanner.nextInt();
            array[i] = n;
        }
    }

}
