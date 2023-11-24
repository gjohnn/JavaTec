package Lab1.tp2.ej20;

import java.util.Scanner;

public class OperacionesFraccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador de la primera fracción:");
        int numerador1 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la primera fracción:");
        int denominador1 = scanner.nextInt();

        System.out.println("Ingrese el numerador de la segunda fracción:");
        int numerador2 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la segunda fracción:");
        int denominador2 = scanner.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion suma = fraccion1.sumarFracciones(fraccion1, fraccion2);
        Fraccion resta = fraccion1.restarFracciones(fraccion1, fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicarFracciones(fraccion1, fraccion2);
        Fraccion division = fraccion1.dividirFracciones(fraccion1, fraccion2);

        System.out.println("Suma: " + suma.getNumerador() + "/" + suma.getDenominador());
        System.out.println("Resta: " + resta.getNumerador() + "/" + resta.getDenominador());
        System.out.println("Multiplicación: " + multiplicacion.getNumerador() + "/" + multiplicacion.getDenominador());
        System.out.println("División: " + division.getNumerador() + "/" + division.getDenominador());
    }
}
