package Lab1.tp7.ej_B;

import java.util.HashSet;

public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componenteCPUs;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public HashSet<ComponenteCPU> getComponenteCPUs() {
        return componenteCPUs;
    }
    public void setComponenteCPUs(HashSet<ComponenteCPU> componenteCPUs) {
        this.componenteCPUs = componenteCPUs;
    }
    
}
