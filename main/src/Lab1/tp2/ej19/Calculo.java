package Lab1.tp2.ej19;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner repeatInput = new Scanner(System.in);
        int repeat = 1;
        while (repeat == 1) {
            try {
                code();
                System.out.println("Desea hacer otro cálculo? Si : 1 ");
                repeat = repeatInput.nextInt(); 
            } catch (Exception e) {
                throw new ArithmeticException("Eso no fue un número!");
            }
        }
        System.out.println("Adiós");
        
        

    }

    private static void code() {
        Scanner valor1Input = new Scanner(System.in);
        Scanner valor2Input = new Scanner(System.in);
        Scanner opInput = new Scanner(System.in);
        System.out.println("Ingrese valor 1");
        double valor1 = valor1Input.nextDouble();
        System.out.println("Ingrese valor 2");
        double valor2 = valor2Input.nextDouble();
        System.out.println("Ingrese operación");
        String op = opInput.nextLine();

        OperacionMate OperacionMate = new OperacionMate(valor1, valor2);

        double res = OperacionMate.aplicarOperacion(op);
        System.out.println(res);
    }
}
