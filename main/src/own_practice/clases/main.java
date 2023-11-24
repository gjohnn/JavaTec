package own_practice.clases;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String name = st.nextLine();
        System.out.println("Ingrese edad: ");
        int age = s.nextInt();
        long dni = validateDNI();
        String genre = validateGENRE();
        System.out.println(genre);
        double peso = validatePeso();
        double altura = validateAltura();

        Persona persona = new Persona(name,age,dni,genre,peso,altura);
        persona.show_data();
    }

    public static long validateDNI() {
        Scanner s = new Scanner(System.in);
        long dni;
        while (true) {
            System.out.println("Ingrese DNI:");
            dni = s.nextLong();
            if (String.valueOf(dni).length() > 6 && String.valueOf(dni).length() < 9) {
                break;
            }
        }
        return dni;
    }

    public static String validateGENRE() {
        Scanner st = new Scanner(System.in);
        String sex = "";
        while (true) {
            System.out.println("Ingrese sexo: ");
            sex = st.nextLine().toUpperCase();
            if (sex.equals("M") || sex.equals("F")) {
                break;
            }
        }
        return sex;
    }

    public static double validatePeso(){
        Scanner s = new Scanner(System.in);
        double peso = 0.0;
        while(peso < 1.0){
            System.out.println("Ingresar peso: ");
            peso = s.nextDouble();
        }
        return peso;
    }
    public static double validateAltura(){
        Scanner s = new Scanner(System.in);
        double altura = 0;
        while(altura < 1){
            System.out.println("Ingresar altura: ");
            altura = s.nextDouble();
        }
        return altura;
    }
}
