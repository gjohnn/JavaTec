package Lab1.PARCIAL_2_GUERRERO;

public class DetalleComprobante {
    //Atributos: articulo(String),cantidad(double), precio (double
    private  String articulo;
    private  double cantidad;
    private  double precio;

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double calcularSubTotal(){
        return getPrecio()*getCantidad();
    }
}
