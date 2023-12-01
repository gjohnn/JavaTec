package own_practice.manejoDeArchivos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (true) {
            System.out.println(" -- Manejo de archivos -- ");
            System.out.println("1) Crear archivo");
            System.out.println("2) Modificar archivo");
            System.out.println("3) Leer archivo");
            System.out.println("4) Eliminar archivo");
            System.out.println("0) salir");
            System.out.print("Ingrese opción: ");
            int option_number = sn.nextInt();
            if (option_number <= 0) {
                System.out.println("Adiós!");
                break;
            }
            optionsFiles(option_number);
        }
    }

    public static void optionsFiles(int option_number) {
        Scanner s = new Scanner(System.in);
        String nameFile = null;
        switch (option_number) {

            case 1:
                System.out.print("Ingrese nombre del archivo a crear: ");
                nameFile = "createdFiles\\";
                nameFile += s.nextLine();
                nameFile += ".txt";
                ManejoArchivos.crearArchivo(nameFile);
                nameFile = null;
                break;
            case 2:
                System.out.print("Ingrese nombre del archivo a modificar: ");
                nameFile = "createdFiles\\";
                nameFile += s.nextLine();
                nameFile += ".txt";
                System.out.printf("Nuevo contenido: ");
                String new_content = s.nextLine();
                ManejoArchivos.modificarArchivo(nameFile, new_content);
                nameFile = null;
                break;
            case 3:
                System.out.print("Ingrese nombre del archivo a leer: ");
                nameFile = "createdFiles\\";
                nameFile += s.nextLine();
                nameFile += ".txt";
                ManejoArchivos.leerArchivo(nameFile);
                nameFile = null;
                break;
            case 4:
                System.out.print("Ingrese nombre del archivo a eliminar: ");
                nameFile = "createdFiles\\";
                nameFile += s.nextLine();
                nameFile += ".txt";
                ManejoArchivos.eliminarArchivo(nameFile);


        }
    }
}
