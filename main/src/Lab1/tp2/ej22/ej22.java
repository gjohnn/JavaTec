package Lab1.tp2.ej22;

import java.util.Scanner;

public class ej22 {
    /*
     * Suma los dígitos de un número ingresado por el usuario de forma recursiva.
     * Ejemplo: el usuario ingresa 1596
     * El programa debe sumar 1 + 5 + 9 + 6
     */
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        int num = numInput.nextInt();
        int sumaDeDigitos = sumaDigitos(num);
        System.out.println(sumaDeDigitos);
    }
    static int sumaDigitos(int num){
        int cifra = 0;
        int suma = 0;
        if(num!=0){
            cifra = num%10;
            suma = cifra + sumaDigitos(num/10);
        }
        
        return suma;
    }
}
