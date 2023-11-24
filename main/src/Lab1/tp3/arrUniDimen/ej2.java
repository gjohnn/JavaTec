package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner ninput = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i =0; i<arr.length; i++) {
            System.out.println("Ingrese n");
            int newNumber = ninput.nextInt();
            arr[i]= newNumber;

        }
        System.out.println("Numeros ingresados:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
