package Lab1.tp1;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tp1 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        // Introducir ejercicio
        Scanner ejInput = new Scanner(System.in);
        System.out.println("Ingrese ejercicio (1 al 14)");
        int ej = ejInput.nextInt();
        switch (ej) {
            case 1:
                ej1();
                break;
            case 2:
                ej2();
                break;
            case 3:
                ej3();
                break;
            case 4:
                ej4();
                break;
            case 5:
                ej5();
                break;
            case 6:
                ej6();
                break;
            case 7:
                ej7();
                break;
            case 8:
                ej8();
                break;
            case 9:
                ej9();
                break;
            case 10:
                ej10();
                break;
            case 11:
                ej11();
                break;
            case 12:
                ej12();
                break;
            case 13:
                ej13();
                break;
            case 14:
                ej14();
                break;

            default:
                System.out.println("Ups!");
                break;
        }
    }

    private static void ej1() {
        System.out.println("Introduzca su nombre");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        System.out.println("Bienvenido, " + name);
    }

    private static void ej2() {
        String name = JOptionPane.showInputDialog(null, "ingrese nombre", "messi", 3);
        JOptionPane.showMessageDialog(null, "Bienvenido, " + name, "Hola!", 1);
    }

    private static void ej3() {
        Scanner n1Input = new Scanner(System.in);
        Scanner n2Input = new Scanner(System.in);

        System.out.println("Ingrese n1");
        double n1 = n1Input.nextDouble();
        System.out.println("Ingrese n2");
        double n2 = n2Input.nextDouble();
        double plus = n1 + n2;
        double minus = n1 - n2;
        double multi = n1 * n2;
        double div = n1 / n2;
        double mod = n1 % n2;

        System.out.println("N1: " + n1 + "    N2: " + n2);
        System.out.println("Suma: " + plus);
        System.out.println("Resta: " + minus);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + div);
        System.out.println("Modulo: " + mod);

    }

    private static void ej4() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n2"));
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, n1 + " es mayor que " + n2);
        } else if (n2 > n1) {
            JOptionPane.showMessageDialog(null, n2 + " es mayor que " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "Son iguales!");
        }
    }

    private static void ej5() {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese n", "N", 3));
        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Es divisible por dos!", "N", 1);
        } else {
            JOptionPane.showMessageDialog(null, "NO es divisible por 2!", "N", 2);
        }
    }

    private static void ej6() {
        double IVA = 1.21;
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
        double precioFinal = n1 * IVA;
        JOptionPane.showMessageDialog(null, "Precio final: " + precioFinal, "Precio final", 1);
    }

    private static void ej7() {
        int n = 1;
        while (n < 101) {
            System.out.println(n);
            n++;
        }
    }

    private static void ej8() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }

    private static void ej9() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void ej10() {

        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese n", "N", 3));
        } while (n < 0);
    }

    private static void ej11() {
        String pass = "utn2023";
        String password1;
        for (int i = 0; i < 3; i++) {
            password1 = JOptionPane.showInputDialog(null, "Contraseña", "papu", 1);
            System.out.println(password1);
            if (password1.equals(pass)) {
                JOptionPane.showMessageDialog(null, "Acceso correcto", "hola", 1);
                break;
            }
            System.out.println("Le quedan: " + (2 - i) + " intentos");
        }
    }

    private static void ej12() {
        Scanner nInput = new Scanner(System.in);
        int n = nInput.nextInt();
        while (n < 1 || n > 7) {
            System.out.println("Fuera de rango");
            n = nInput.nextInt();
        }
        switch (n) {
            case 1, 2, 3, 4, 5:
                System.out.println("Dia laboral");
                break;
            case 6, 7:
                System.out.println("Dia NO laboral");
                break;
            default:
                break;
        }
    }

    private static void ej13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = sc.nextInt();
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
            if (contador > 2) {
                break;
            }
        }
        if (contador == 2) {
            System.out.println(n + " es PRIMO");
        } else {
            System.out.println(n + " NO PRIMO");
        }

    }

    private static void ej14() {
        Scanner nInput = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double n = nInput.nextDouble();
        int intentos = 1;
        int nAletorio = Double.valueOf(Math.random() * 100).intValue();
        while (n != nAletorio) {
            intentos++;
            if (n < nAletorio) {
                System.out.println("Es mayor!");
            } else {
                System.out.println("Es menor!");
            }
            System.out.println("Ingrese otro número");
            n = nInput.nextDouble();
        }
        System.out.println("Bien! Cantidad de intentos: " + intentos);
    }
}
