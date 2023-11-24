package Lab1.tp6.ej2;

import java.util.ArrayList;

public class Plato {
    private String nombre_completo;
    private double precio;
    private boolean es_bebida;
    private ArrayList<Ingrediente> ingrediente;
    public String getNombre_completo() {
        return nombre_completo;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isEs_bebida() {
        return es_bebida;
    }
    public void setEs_bebida(boolean es_bebida) {
        this.es_bebida = es_bebida;
    }
    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }
    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }
}
