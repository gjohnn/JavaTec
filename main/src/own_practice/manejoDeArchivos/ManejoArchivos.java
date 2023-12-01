package own_practice.manejoDeArchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nameFile) {
        File archivo = new File(nameFile);
        try {
            PrintWriter outFile = new PrintWriter(archivo);
            outFile.close();
            System.out.println("Archivo creado.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void modificarArchivo(String nameFile, String content) {
        File archivo = new File(nameFile);
        try {
            PrintWriter outFile = new PrintWriter(archivo);
            outFile.println(content);
            outFile.close();
            System.out.println("Se modificó el archivo.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nameFile) {
        File archivo = new File(nameFile);
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(nameFile));
            String readLines = inFile.readLine();
            System.out.println("--------------");
            while (readLines != null) {
                System.out.println(readLines);
                readLines = inFile.readLine();
            }
            System.out.println("--------------");
            inFile.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void eliminarArchivo(String nameFile) {
        File archivo = new File(nameFile);
        archivo.delete();
        System.out.println("Archivo eliminado.");

    }

}
