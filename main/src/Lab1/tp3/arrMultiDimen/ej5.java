package Lab1.tp3.arrMultiDimen;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer suma = 0;
        String[][] matriz = {
                { "KitKat", "32", "10" },
                { "Chicles", "2", "50" },
                { "Caramelos de menta", "2", "50" },
                { "Huevo Kinder", "25", "10" },
                { "Cheetos", "30", "10" },
                { "Twix", "26", "10" },
                { "M&M", "35", "10" },
                { "Papas Lays", "40", "20" },
                { "Milkybar", "30", "10" },
                { "Alfajor Tofi", "20", "15" },
                { "Lata Coca", "50", "20" },
                { "Chitos", "45", "10" }
        };

        boolean repeat = true;
        while (repeat) {
            System.out.println("1.Pedir golosina");
            System.out.println("2.Mostrar golosinas");
            System.out.println("3.Rellenar golosinas");
            System.out.println("4.Apagar máquina");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    suma = pedirGolosina(matriz, suma);
                    break;
                case 2:
                    mostrarGolosinas(matriz);
                    break;
                case 3:
                    rellenarGolosinas(matriz);
                    break;
                case 4:
                    apagar(suma);
                    repeat = false;
                    break;

            }
        }
    }

    public static Integer pedirGolosina(String matriz[][], Integer suma) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese golosina");
        int nGoloso = scan.nextInt();
        while (nGoloso < 0 || nGoloso > 12) {
            System.out.println("Ingrese golosina correctamente");
            nGoloso = scan.nextInt();
        }
        int stockGolosina = Integer.parseInt(matriz[nGoloso][2]);
        System.out.println("Golosina: " + matriz[nGoloso][0]);
        if (stockGolosina == 0) {
            System.out.println("No hay más stock");
            return suma;
        } else {
            int precio = Integer.parseInt(matriz[nGoloso][1]);
            System.out.println("Ingrese cantidad");
            int cantidad = scan.nextInt();
            while (cantidad < 1 || cantidad > stockGolosina) {
                System.out.println("Ingrese cantidad correctamente | Stock del producto: " + stockGolosina);
                cantidad = scan.nextInt();
            }

            matriz[nGoloso][2] = String.valueOf(stockGolosina - cantidad);
            Integer finalSuma = precio * cantidad + suma;
            System.out.println("Total:" + finalSuma);

            return finalSuma;
        }
    }

    public static void mostrarGolosinas(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Producto: ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void rellenarGolosinas(String matriz[][]) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        if (user.equals("AdminXYZ")) {
            System.out.println("Rol: Administrador");
            System.out.println("Ingrese golosina para rellenar stock");
            int golosina = scan.nextInt();
            System.out.println("Elegió " + matriz[golosina][0]);
            System.out.println("Ingrese cantidad");
            int masStock = scan.nextInt();
            int stock = Integer.parseInt(matriz[golosina][2]);
            matriz[golosina][2] = String.valueOf(stock + masStock);
            System.out.println("Stock del producto actualizado");
        } else {
            System.out.println("Acceso no autorizado!");
        }

    }

    public static void apagar(Integer suma) {
        System.out.println("Total es: $" + suma);
    }

    public static boolean validation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Desea continuar? SI = 1");
        int coso = scan.nextInt();
        if (coso != 1) {
            System.out.println("Adios!");
            return false;
        } else {
            return true;
        }
    }
}
