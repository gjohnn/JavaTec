package Lab1.tp6.ej1_v;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> Notas= new ArrayList<Nota>() ;
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public long getLegajo() {
        return legajo;
    }
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public ArrayList<Nota> getNotas() {
        return Notas;
    }
    public void setNotas(ArrayList<Nota> notas) {
        Notas = notas;
    }


    public double calcularPromedio() {
        int suma = 0;
        for (Nota nota : Notas) {
            suma += nota.getNotaExamen();
        }
        return (double) suma / Notas.size();
    }

}
