package own_practice.clases;

public class Cuenta {
    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 1) {
            setCantidad(cantidad);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 1) {
            setCantidad(cantidad);
        }
    }
}
