package Lab1.tp5;

import java.util.ArrayList;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(20);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            double nScan = scan.nextDouble();
            Integer n = (int)nScan;
            System.out.println(n);
            arr.add(n);
        }
        int mayor = arr.get(0);
        for(int n : arr){
            if (n > mayor){
                mayor = n;
            }
        }
        int menor = arr.get(0);
        for(int n : arr){
            if (n < menor){
                menor = n;
            }
        }
        System.out.println("El mayor es: "+ mayor);
        System.out.println("El menor es: "+menor);
        System.out.println("Rango de diferencia: "+ (mayor-menor));
    }
}
