package Lab1.tp5;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n>0) {
            arr.add(n);
            n = scan.nextInt();
        }

        for( Integer e : arr){
            System.out.println("Numero: "+ e);
        }
    }
}
