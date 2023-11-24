package own_practice.clases;

public class Persona {
    private String name;
    private int age;
    private long dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String name, int age, long dni, String sexo, double peso, double altura) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void show_data(){
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+age);
        System.out.println("DNI: "+dni);
        System.out.println("Sexo: "+"Escaso");
        System.out.println("Peso: "+peso+"Kg");
        System.out.println("Altura: "+altura);


    }
}
