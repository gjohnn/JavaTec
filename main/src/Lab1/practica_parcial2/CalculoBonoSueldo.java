package Lab1.practica_parcial2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculoBonoSueldo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] haberes = {{"100", "Presentismo", "9"}, {"101", "Titulo Profesional", "9"},
                {"102", "Horas Extraordinarias", "M"}, {"103", "Horas Nocturnas", "M"}, {"104", "Otros Haberes", "M"}};
        String[][] deducciones = {{"200", "Obra Social", "3"}, {"201", "Jubilacion", "11"},
                {"202", "Sindicato", "2"}, {"203", "Seguro", "1.5"}, {"204", "Otros", "M"}};


        Empleado empleado = new Empleado();
        System.out.println("Ingrese nombre del empleado: ");
        empleado.setNombreEmpleado(scan.nextLine());
        System.out.println("Ingrese CUIL: ");
        empleado.setCuil(scan.nextLong());
        scan.nextLine();

        int anioIngreso = LocalDate.now().getYear() + 1;

        while (anioIngreso > LocalDate.now().getYear()) {
            System.out.println("Ingrese año de ingreso: ");
            anioIngreso = scan.nextInt();
            scan.nextLine();
        }

        empleado.setAnioIngreso(anioIngreso);
        int mesLiquidacion = 0;
        while (mesLiquidacion < 1 || mesLiquidacion > 12) {
            System.out.println("Ingrese mes de liquidación: ");
            mesLiquidacion = scan.nextInt();
            scan.nextLine();
        }

        int anioLiquidacion = LocalDate.now().getYear() + 1;
        while (anioLiquidacion > LocalDate.now().getYear() || anioLiquidacion < anioIngreso) {
            System.out.println("Ingrese año de liquidacion: ");
            anioLiquidacion = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("Ingrese sueldo basico: ");
        double sueldoBasico = scan.nextDouble();
        empleado.setSueldoBasico(sueldoBasico);
        scan.nextLine();
        //montoAntiguedad
        double montoAntiguedad = (sueldoBasico * (anioLiquidacion - anioIngreso) * 0.02);
        System.out.println("Antiguedad: " + montoAntiguedad);
        empleado.setMontoAntiguedad(montoAntiguedad);

        ArrayList<BonoSueldo> bonosDeSueldos = new ArrayList<>();
        boolean crearOtroBono = true;
        //Crear bonos
        while (crearOtroBono) {

            ArrayList<Integer> codigosIngresados = new ArrayList<>();
            BonoSueldo current_BonoSueldo = new BonoSueldo();
            current_BonoSueldo.setAnioLiquidacion(anioLiquidacion);
            current_BonoSueldo.setMesLiquidacion(mesLiquidacion);
            String[][] bonoCalculado = new String[10][4];

            int indexBonoCalculado = 0;
            boolean salirDeHaberes;
            double sumaHaberes = 0.0;

            System.out.println(" ------- INGRESO de HABERES del EMPLEADO  ------- ");
            do {
                int codigoHaberes;
                boolean salirDeIngresoCodigo;
                do {
                    salirDeIngresoCodigo = false;
                    System.out.println("Ingrese código: ");
                    codigoHaberes = scan.nextInt();
                    scan.nextLine();
                    //codigo mal introducido
                    if (codigoHaberes < 100 || codigoHaberes > 104) {
                        System.out.println("-- Codigo no existente --");
                        salirDeIngresoCodigo = true;
                    }
                    //codigo ya ingresado
                    if (codigosIngresados.contains(codigoHaberes)) {
                        System.out.println("-- Codigo ya ingresado --");
                        salirDeIngresoCodigo = true;
                    }
                } while (salirDeIngresoCodigo);
                //agregar codigo al array para corroborrar que despues no se repita
                codigosIngresados.add(codigoHaberes);
                //agregar a bono calculado
                for (int i = 0; i < haberes.length; i++) {
                    //hacer match de los datos de haberes con codigHaberes
                    if (Integer.parseInt(haberes[i][0]) == codigoHaberes) {
                        bonoCalculado[indexBonoCalculado][0] = haberes[i][0];
                        bonoCalculado[indexBonoCalculado][1] = haberes[i][1];

                        if (haberes[i][2].equals("M")) {
                            System.out.println("Ingrese porcentaje: ");
                            double porcentaje = scan.nextDouble();
                            scan.nextLine();
                            sumaHaberes += empleado.getSueldoBasico() * (porcentaje / 100.0);
                            bonoCalculado[indexBonoCalculado][2] = String.valueOf(empleado.getSueldoBasico() * (porcentaje / 100.0));
                        } else {
                            sumaHaberes += empleado.getSueldoBasico() * Double.parseDouble(haberes[i][2]) / 100.0;
                            bonoCalculado[indexBonoCalculado][2] = String.valueOf(empleado.getSueldoBasico() * Double.parseDouble(haberes[i][2]) / 100.0);
                        }
                    }
                }
                indexBonoCalculado++;
                System.out.println(" -- HABER '" + codigoHaberes + "' AGREGADO -- ");
                for (int i = 0; i < bonoCalculado.length; i++) {
                    for (int j = 0; j < bonoCalculado[0].length; j++) {
                        System.out.print(bonoCalculado[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println(" --------------------------- ");
                //repetir ingreso de haber
                System.out.print("Ingresar otro codigo? (000 para salir): ");
                String salirDeHaberesCod = scan.nextLine();
                salirDeHaberes = salirDeHaberesCod.equals("000");
            } while (!salirDeHaberes);

            System.out.println(" ------- INGRESO de DEDUCCIONES del EMPLEADO  ------- ");
            boolean salirDeDeducciones;
            double sumaDeducciones = 0.0;
            do {
                int codigoDeducciones;
                //corroborrar codigo
                boolean salirDeIngresoCodigo;
                do {
                    salirDeIngresoCodigo = false;
                    System.out.println("Ingrese código: ");
                    codigoDeducciones = scan.nextInt();
                    scan.nextLine();
                    //codigo mal introducido
                    if (codigoDeducciones < 200 || codigoDeducciones > 204) {
                        System.out.println("-- Codigo no existente --");
                        salirDeIngresoCodigo = true;
                    }
                    //codigo ya ingresado
                    if (codigosIngresados.contains(codigoDeducciones)) {
                        System.out.println("-- Codigo ya ingresado --");
                        salirDeIngresoCodigo = true;
                    }
                } while (salirDeIngresoCodigo);

                //agregar codigo al array para corroborrar que despues no se repita
                codigosIngresados.add(codigoDeducciones);

                //agregar a bono calculado
                for (int i = 0; i < haberes.length; i++) {
                    //hacer match de los datos de deducciones con codigHaberes
                    if (Integer.parseInt(deducciones[i][0]) == codigoDeducciones) {
                        bonoCalculado[indexBonoCalculado][0] = deducciones[i][0];
                        bonoCalculado[indexBonoCalculado][1] = deducciones[i][1];
                        if (deducciones[i][2].equals("M")) {
                            System.out.println("Ingrese porcentaje: ");
                            double porcentaje = scan.nextDouble();
                            scan.nextLine();
                            sumaDeducciones += empleado.getSueldoBasico() * (porcentaje / 100.0);
                            bonoCalculado[indexBonoCalculado][3] = String.valueOf(empleado.getSueldoBasico() * (porcentaje / 100.0));
                        } else {
                            sumaDeducciones += empleado.getSueldoBasico() * Double.parseDouble(deducciones[i][2]) / 100.0;
                            bonoCalculado[indexBonoCalculado][3] = String.valueOf(empleado.getSueldoBasico() * Double.parseDouble(deducciones[i][2]) / 100.0);
                        }
                    }
                }
                indexBonoCalculado++;
                System.out.println(" -- DEDUCCION '" + codigoDeducciones + "' AGREGADO -- ");
                for (int i = 0; i < bonoCalculado.length; i++) {
                    for (int j = 0; j < bonoCalculado[0].length; j++) {
                        System.out.print(bonoCalculado[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println(" --------------------------- ");
                //repetir ingreso de haber
                System.out.print("Ingresar otro codigo? (000 para salir): ");
                String salirDeDeduccionesCod = scan.nextLine();
                salirDeDeducciones = salirDeDeduccionesCod.equals("000");
            } while (!salirDeDeducciones);

            current_BonoSueldo.setMontoLiquidacion((empleado.getSueldoBasico() + empleado.getMontoAntiguedad() + sumaHaberes) - sumaDeducciones);
            current_BonoSueldo.setEmpleado(empleado);
            current_BonoSueldo.setCodigos(codigosIngresados);
            bonosDeSueldos.add(current_BonoSueldo);
            //AGREGAR OTRO BONO?
            System.out.println("Agregar otro bono? (s/n) : ");
            String cargarOtroBono = scan.nextLine().toLowerCase();
            if (cargarOtroBono.equals("n")) {
                crearOtroBono = false;
            }
        }
        empleado.setBonos(bonosDeSueldos);
        System.out.println("------- Lista de Bonos de Sueldo -------");
        for (BonoSueldo bono : bonosDeSueldos) {
            System.out.println("Empleado: " + bono.getEmpleado().getNombreEmpleado());
            System.out.println("Año de Ingreso: " + bono.getEmpleado().getAnioIngreso());
            System.out.println("Mes de Liquidación: " + bono.getMesLiquidacion());
            System.out.println("Año de Liquidación: " + bono.getAnioLiquidacion());
            System.out.println("Porcentaje de antiguedad: " + (bono.getEmpleado().getMontoAntiguedad() / 10 + "%"));
            System.out.println(" - HABERES - ");
            for (int e : bono.getCodigos()) {
                for (int i = 0; i < haberes.length; i++) {
                    if (haberes[i][0].equals(String.valueOf(e))) {
                        System.out.println("  Código: " + haberes[i][0] + ", Título: " + haberes[i][1] + ", Monto: $" + haberes[i][2]);
                    }
                }
            }
            System.out.println(" - Deducciones -");
            for (int e : bono.getCodigos()) {
                for (int i = 0; i < deducciones.length; i++) {
                    if (deducciones[i][0].equals(String.valueOf(e))) {
                        System.out.println("  Código: " + deducciones[i][0] + ", Título: " + deducciones[i][1] + ", Monto: $" + deducciones[i][2]);
                    }
                }
            }
            System.out.println("Sueldo de básico: " + bono.getEmpleado().getSueldoBasico());
            System.out.println("Monto de Liquidación: $" + bono.getMontoLiquidacion());
            System.out.println("--------------------------------------");

        }


    }
}
