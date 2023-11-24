package Lab1.tp3.arrUniDimen;

import java.util.Scanner;

public class ej3 {
    /*
     * Crea un array o arreglo unidimensional donde tú le indiques el tamaño por
     * teclado y crear
     * una función que rellene el array o arreglo con los múltiplos de un numero
     * pedido por
     * teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la
     * función, el array
     * contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función
     * distinta.
     */
    public static void main(String[] args) {
        Scanner cantInput = new Scanner(System.in);
        Scanner nInput = new Scanner(System.in);

        System.out.println("Tamaño del array:");
        int size = cantInput.nextInt();
        int arr[] = new int[size];
        System.out.println("Ingrese n");
        int n = nInput.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int multiplo = n*size;
            arr[i]=multiplo;
            size = size-1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("| "+arr[i]+" |");
        }
    }
}
