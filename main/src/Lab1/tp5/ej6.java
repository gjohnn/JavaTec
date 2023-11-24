package Lab1.tp5;

import java.util.ArrayList;
import java.util.Scanner;

class Celda {
    private int fila;
    private int columna;
    private String valor;

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getValor() {
        return valor;
    }
}

class Matriz {
    private ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public void agregarCelda(Celda celda) {
        matrizCuadrada.add(celda);
    }

    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.getFila() == fila && celda.getColumna() == columna) {
                return celda.getValor();
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }

    public void mostrarMatriz() {
        for (Celda celda : matrizCuadrada) {
            System.out.println("Fila: " + celda.getFila() + ", Columna: " + celda.getColumna() + ", Valor: " + celda.getValor());
        }
    }
}

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz();

        while (true) {
            System.out.print("Ingrese un valor (o 'FIN' para finalizar): ");
            String valor = scanner.nextLine();

            if (valor.equals("FIN")) {
                break;
            }

            System.out.print("Ingrese la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = scanner.nextInt();

            scanner.nextLine(); // Consumir la línea en blanco

            Celda celda = new Celda(fila, columna, valor);
            matriz.agregarCelda(celda);
        }

        System.out.println("Valores cargados en matrizCuadrada:");
        matriz.mostrarMatriz();

        System.out.print("Ingrese la fila y la columna para obtener un valor (en formato fila columna): ");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        String valorObtenido = matriz.obtenerValor(fila, columna);
        System.out.println("Valor obtenido: " + valorObtenido);

        scanner.close();
    }
}
