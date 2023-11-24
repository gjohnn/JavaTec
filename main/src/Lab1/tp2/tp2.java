package Lab1.tp2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Date;

public class tp2 {
    public static void main(String[] args) {
        JFrame windowPane = new JFrame();
        windowPane.setAlwaysOnTop(true);
        int ej = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ejercicio(1 - 18):", null, 1));
        switch (ej) {
            case 0:
                practising();
                break;
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
            case 15:
                ej15();
                break;
            case 16:
                ej16();
                break;
            case 17:
                ej17();
                break;
            case 18:
                ej18();
                break;
            default:
                System.out.println("Ups!");
                break;
        }
    }

    private static void practising() {
        /*
         * FuncionesPrograma prod1 = new
         * FuncionesPrograma(JOptionPane.showInputDialog("Ingrese nombre del producto"),
         * Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto")
         * ),
         * Integer.parseInt(JOptionPane.showInputDialog("Ingrese stock del producto")),
         * JOptionPane.showInputDialog("Ingrese código del producto"));
         * 
         * JOptionPane.showMessageDialog(null, "Producto: " + prod1.getName() + " | " +
         * "Precio: $" + prod1.getPrice()
         * + " | " + "Stock: " + prod1.getStock() + " | " + "Code: " + prod1.getCode(),
         * null, 1);
         */
    }

    private static void ej1() {
        double valorDecimal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor (DOUBLE)", null, 0));
        int valorInt = (int) valorDecimal;
        String valoString = String.valueOf(valorDecimal);
        float valorFloat = (float) valorDecimal;
        System.out.println("Double: " + valorDecimal);
        System.out.println("Int: " + valorInt);
        System.out.println("String: " + valoString);
        System.out.println("Float: " + valorFloat);

    }

    private static void ej2() {
        JOptionPane.showMessageDialog(null,
                "Si se asigna un valor fuera del rango permito en un tipo de variable, el programa no se ejecutará ya que no le es posible indentificar dicho valor. Un claro ejemplo es si a una variable tipo Byte tiene un valor de 130,siendo este de -128 a 127",
                "Valor a una variable fuerga de rango", 0);
        JOptionPane.showMessageDialog(null,
                "Una buena forma de resolver esto y que el usuario ingrese el valor correspondiente es haciendo una validación con un bucle while y que la condición cuente con el valor máximo y mínimo",
                "Valor a una variable fuerga de rango", 0);
    }

    private static void ej3() {
        int num = 0;
        int suma = 0;
        int cifra = 0;
        while (num < 100 || num > 999) {
            num = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ingrese numero entre 100 - 999", "Suma de dígitos", 2));
        }
        while (num != 0) {
            cifra = num % 10;
            suma = suma + cifra;
            num = num / 10;

        }
        JOptionPane.showMessageDialog(null, "Suma de los digitos: " + suma, "Suma de dígitos", 1);
    }

    private static void ej4() {
        double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese dinero total", null, 0));
        System.out.println(num);
        double cont200 = 0;
        double cont100 = 0;
        double cont50 = 0;
        double cont20 = 0;
        double cont10 = 0;
        double cont5 = 0;
        double cont2 = 0;
        double cont1 = 0;
        double cont050 = 0;
        double cont025 = 0;
        double cont010 = 0;
        double cont005 = 0;

        while (num >= 200) {
            num = num - 200;
            cont200++;
        }

        while (num >= 100) {
            num = num - 100;
            cont100++;
        }

        while (num >= 50) {
            num = num - 50;
            cont50++;
        }
        while (num >= 20) {
            num = num - 20;
            cont20++;
        }
        while (num >= 10) {
            num = num - 10;
            cont10++;
        }
        while (num >= 5) {
            num = num - 5;
            cont5++;
        }
        while (num >= 2) {
            num = num - 2;
            cont2++;
        }
        while (num >= 1) {
            num = num - 1;
            cont1++;
        }
        while (num >= 0.50) {
            num = num - 0.50;
            cont050++;
        }
        while (num >= 0.25) {
            num = num - 0.25;
            cont025++;
        }
        while (num >= 0.10) {
            num = num - 0.10;
            cont010++;
        }

        while (num >= 0.04) {
            // hay un "bug" con 0.05
            num = num - 0.04;
            cont005++;
        }

        System.out.println("Billetes de 200: " + cont200);
        System.out.println("Billetes de 100: " + cont100);
        System.out.println("Billetes de 50: " + cont50);
        System.out.println("Billetes de 20: " + cont20);
        System.out.println("Billetes de 10: " + cont10);
        System.out.println("Billetes de 5: " + cont5);
        System.out.println("Billetes de 2: " + cont2);
        System.out.println("Billetes de 1: " + cont1);
        System.out.println("Monedas de 0.50: " + cont050);
        System.out.println("Monedas de 0.25: " + cont025);
        System.out.println("Monedas de 0.10: " + cont010);
        System.out.println("Monedas de 0.05: " + cont005);
    }

    private static void ej5() {
        double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero!", null, 0));
        String numToString = String.valueOf(num);
        System.out.println("Este es un número " + num);
        System.out.println("Este es un string " + numToString);
    }

    private static void ej6() {
        String sentence = "La lluvia en Mendoza es escasa";
        int cantCaracteres = sentence.length();
        System.out.println("Texto: " + sentence);
        System.out.println("Cant de caracteres: " + cantCaracteres);
    }

    private static void ej7() {
        String sentence = JOptionPane.showInputDialog(null, "Ingresar texto", null, 0);
        int cantVocales = 0;
        char letra;
        String senteceToMinus = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            letra = senteceToMinus.charAt(i);
            System.out.println(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cantVocales++;
            }
        }
        JOptionPane.showMessageDialog(null, "Oracion: " + sentence);
        JOptionPane.showMessageDialog(null, "Cantidad de vocales: " + cantVocales);
    }

    private static void ej8() {
        String sentence = JOptionPane.showInputDialog(null, "Ingresar texto", null, 0);
        sentence = sentence.replace("a", "e");
        System.out.println(sentence);
    }

    private static void ej9() {
        /*
         * Recorre el String del ejercicio 6 y transforma cada carácter a su código
         * ASCII. Muéstralos en línea recta, separados por un espacio entre cada
         * carácter.
         */
        String oracion = "La lluvia en Mendoza es escasa";
        String paso = "";
        String codAscii = "";
        for (int i = 0; i < oracion.length(); i++) {
            int codigo = (int) oracion.charAt(i);
            paso = String.valueOf(codigo);
            codAscii = codAscii + " " + paso;
        }
        System.out.println(codAscii);
    }

    private static void ej10() {
        /*
         * Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
         * usuario lo pida y mostraremos el resultado por pantalla
         */
        String sentence = JOptionPane.showInputDialog(null, "Ingresar texto", null, 0);
        int confirmText = Integer.parseInt(JOptionPane.showInputDialog(null, "Mayuscula = 1 | Minúscula: 2", null, 0));
        while (confirmText < 1 || confirmText > 2) {
            confirmText = Integer.parseInt(JOptionPane.showInputDialog(null, "Mayuscula = 1 | Minúscula: 2", null, 0));
        }

        if (confirmText == 2) {
            sentence = sentence.toLowerCase();
        } else if (confirmText == 1) {
            sentence = sentence.toUpperCase();
        }
        JOptionPane.showMessageDialog(null, sentence, sentence, confirmText);
    }

    private static void ej11() {
        /*
         * Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
         * compareToIgnoreCase
         */
        String one = JOptionPane.showInputDialog(null, "Ingresar texto 1", null, 0);
        String two = JOptionPane.showInputDialog(null, "Ingresar texto 2", null, 0);
        if (one.equalsIgnoreCase(two)) {
            JOptionPane.showMessageDialog(null, "Son iguales!", "Comparacion de string con equals", 0);
        } else {
            JOptionPane.showMessageDialog(null, "Son distintos!", "Comparacion de string con equals", 0);
        }
    }

    private static void ej12() {
        /*
         * Dada una cadena, extraer la cuarta y quinta letra usando el método substring
         * juanes
         */
        String sentence = JOptionPane.showInputDialog(null, "Ingresar texto ", null, 0);
        sentence = sentence.substring(3, 5);
        JOptionPane.showMessageDialog(null, "Letras 4 y 5: " + sentence, "Comparacion de string con equals", 0);
    }

    private static void ej13() {
        /*- Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se 
        encuentra dentro de la primera (usar indexOf o contains). */
        String one = JOptionPane.showInputDialog(null, "Ingresar texto 1", null, 0);
        String two = JOptionPane.showInputDialog(null, "Ingresar texto 2", null, 0);
        one = one.toLowerCase();
        two = two.toLowerCase();
        if (one.contains(two)) {
            System.out.println("Texto 2 SI se encuentra en en texto 1");
        } else {
            System.out.println("Texto 2 NO encontrado en texto 1");
        }
    }

    private static void ej14() {
        /*
         * Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo
         * el int
         * y su contraparte por referencia ejemplo Integer.
         */

        System.out.println("Por valor: El valor de la variable NUNCA cambia en la memoria cuando se utiliza");
        System.out.println(" ---------------------- ");
        System.out.println(
                "Por referencia: Cuando el valor de la variable cambia en el transcurso del código lo hace también la variable 'original' ");
    }

    private static void ej15() {
        System.out.println(
                "Integer puede tener el valor 'null' ya que este trata al int como si fuera un objeto, en cambio int es de tipo primitivo");
    }

    private static void ej16() {
        Double num = 14.5;
        System.out.println("De tipo objeto: " + num.getClass());
        double numConversion = num;
        System.out.println("Primitiva: (metodo getClass no funciona ya que NO es un objeto)" + numConversion);
    }

    private static void ej17() {
        Date fecha = new Date();
        System.out.println(fecha + " " + fecha.getClass());
        String fechaToS = FuncionesPrograma.getFechaString(fecha);
        System.out.println(fechaToS + " " + fechaToS.getClass());
    }

    private static void ej18() {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese día", null, 0)),
                mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese mes", null, 0)),
                anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese año", null, 0));

        while (dia > 31 || dia < 1) {
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese día entre 1 y 31", null, 0));
        }
        while (mes > 12 || mes < 1) {
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese día entre 1 y 31", null, 0));
        }

        Date fecha = FuncionesPrograma.getFechaDate(dia, mes, anio);
        System.out.println(fecha);
    }
}
