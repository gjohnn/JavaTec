package Lab1.PARCIAL_2_GUERRERO;

import java.util.ArrayList;

public class Comprobante {
    //nroComprobante(Long), fecha(String), tipoComprobante(String), itemsComprobante(ArrayList<DetalleComprobante>)
    private long nroComprobante;
    private  String fecha;
    private  String tipoComprobante;

    ArrayList<DetalleComprobante> itemsComprobante;

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public long getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(long nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public ArrayList<DetalleComprobante> getItemsComprobante() {
        return itemsComprobante;
    }

    public void setItemsComprobante(ArrayList<DetalleComprobante> itemsComprobante) {
        this.itemsComprobante = itemsComprobante;
    }

    public double calcularTotalComprobante(){
        double sumaProds = 0.0;
        for ( DetalleComprobante e : itemsComprobante) {
            sumaProds+= e.calcularSubTotal();
        }
        return  sumaProds;
    }

    public void MostrarDatos(){
        System.out.println("Comprobante Tipo: " + tipoComprobante);
        System.out.println("Nro de Comprobante: " + nroComprobante);
        System.out.println("Fecha: " + fecha);
        System.out.println(" -- ITEMS FACTURA -- ");
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Articulo", "Cantidad", "Precio", "Subtotal");
        for (DetalleComprobante e : itemsComprobante) {
            System.out.printf("%-20s%-10s$%-10.2f$%-10.2f\n", e.getArticulo(), String.valueOf(e.getCantidad()), e.getPrecio(), e.calcularSubTotal());
        }


        System.out.println("Total: $" + calcularTotalComprobante());
    }
}
