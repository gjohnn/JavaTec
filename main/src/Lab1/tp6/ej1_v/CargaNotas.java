package Lab1.tp6.ej1_v;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        CargarAlumnos(alumnos);
        MostrarAlumnos(alumnos);
    }

    public static void CargarAlumnos(ArrayList<Alumno> alumnos){
        Scanner s = new Scanner(System.in);
        System.out.println("------ CARGAR ALUMNOS -----");
        String validate_otroAlumno;
        String validate_otraNota;

        do {
            // DATOS DEL ALUMNO
            Alumno alum = new Alumno();
            ArrayList<Nota> notas_alumno = new ArrayList<>();
            System.out.println("Ingresar nombre completo: ");
            alum.setNombreCompleto(s.nextLine());
            System.out.println("Ingresar legajo: ");
            alum.setLegajo(s.nextLong());
            s.nextLine();
            ///NOTAS
            do {
                Nota nota = new Nota();
                System.out.println("Ingrese cátedra: ");
                nota.setCatedra(s.nextLine());
                double ingreso_nota;
                while (true) {
                    System.out.println("Nota (debe ser un número):");
                    String input = s.nextLine();
                    try {
                        ingreso_nota = Double.parseDouble(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Introduce un número válido.");
                    }
                }
                nota.setNotaExamen(ingreso_nota);
                notas_alumno.add(nota);
                //CARGAR OTRA NOTA
                System.out.println("Cargar otra nota? s/n");
                validate_otraNota = s.nextLine().toLowerCase();
            } while (validate_otraNota.equals("s"));

            alum.setNotas(notas_alumno);
            alumnos.add(alum);

            //CARGAR OTRO ALUMNO
            System.out.println("Cargar otro alumno? s/n");
            validate_otroAlumno = s.nextLine().toLowerCase();
        } while (validate_otroAlumno.equals("s"));
    }

    public static void MostrarAlumnos(ArrayList<Alumno>alumnos){
        System.out.println("------------------------------------------------------");
        for (Alumno alumno : alumnos) {
            ArrayList<Nota> notas = alumno.getNotas();
            System.out.println("Nombre y Apellido: " + alumno.getNombreCompleto());
            System.out.println("Legajo: " + alumno.getLegajo());
            for (Nota nota : notas) {
                System.out.println("Catedra :" + nota.getCatedra() + "  Nota :" + nota.getNotaExamen());
            }
            double promedio = alumno.calcularPromedio();
            System.out.println("Promedio :" + promedio);
            System.out.println("--------------------------------------------------------");
        }
    }
}
