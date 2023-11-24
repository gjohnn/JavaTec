package Lab1.PARCIAL_1_GUERRERO;

import Lab1.PARCIAL_2_GUERRERO.DetalleComprobante;
import Lab1.tp6.ej1_v.CargaNotas;

import java.util.Arrays;
import java.util.Scanner;

public class CalculoFactura {
    public static void main(String[] args) {
        String[][] articulos = {
                {"100", "Azucar", "20", "U"},
                {"101", "Leche", "30", "U"},
                {"102", "Aceite", "50", "U"},
                {"103", "Sal", "45", "U"},
                {"104", "Fideos", "15", "U"},
                {"105", "Arroz", "28", "U"},
                {"106", "Galletas", "26", "U"},
                {"107", "Carne Molida", "220", "Kg"},
                {"108", "Shampoo", "42", "U"},
                {"109", "Queso Mantecoso", "178", "Kg"},
                {"110", "Jamon Cocido", "320", "Kg"},
                {"111", "Naranjas", "80", "Kg"}
        };


        Factura factura = new Factura();
        CargaDeDatosFactura(factura);
        CargaArticulos(articulos, factura);

        System.out.println("Fecha:" + factura.getFecha());
        System.out.println("Nro:" + factura.getNroFactura());
        System.out.println("Tipo de pago:" + factura.getTipoPago());
        System.out.printf("%-10s%-20s%-10s%-10s%-10s\n", "Codigo", "Denominacion", "Precio U", "Cantidad", "Subtotal");
        double total = 0;
        for (String[] e : factura.getItemsFactura()) {
            String codigo = e[0];
            String denominacion = e[1];
            String precioUnitario = e[2];
            String cantidad = e[3];
            String subtotal = String.valueOf(Double.parseDouble(precioUnitario) * Double.parseDouble(cantidad));
            total = total + Double.valueOf(subtotal);
            System.out.printf("%-10s%-20s%-10s%-10s%-10s\n", codigo, denominacion, precioUnitario, cantidad, subtotal);
        }
        System.out.println(" ------------------------------------ ");
        System.out.println("Total: " + total);
        if (factura.getTipoPago().equals("C")) {
            System.out.println("Recargo: " + (0.0));
            System.out.println("TOTAL FINAL: " + total);
        } else if (factura.getTipoPago().equals("TC")) {
            System.out.println("Recargo: " + total * 0.1);
            System.out.println("TOTAL FINAL: " + total * 1.1);
        } else if (factura.getTipoPago().equals("TD")) {
            System.out.println("Recargo: " + total * 0.05);
            System.out.println("TOTAL FINAL: " + total * 1.05);
        }
    }


    public static void CargaDeDatosFactura(Factura factura) {
        System.out.println(" -- NUEVA FACTURA -- ");
        Scanner s = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.print("Fecha: ");
        factura.setFecha(st.nextLine());
        System.out.print("Nro de Factura: ");
        factura.setNroFactura(s.nextLong());
        System.out.print("Razon social: ");
        factura.setRazonSocial(st.nextLine());
        System.out.print("CUIT: ");
        factura.setCuitCliente(s.nextLong());
        String tipoDePago = "";
        while (!tipoDePago.equals("C") && !tipoDePago.equals("TD") && !tipoDePago.equals("TC")) {
            System.out.print("Tipo de pago (C - TC - TD) : ");
            tipoDePago = st.nextLine().toUpperCase();
        }
        factura.setTipoPago(tipoDePago);

    }

    public static void CargaArticulos(String[][] articulos, Factura factura) {
        Scanner s = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.print("Ingresar cantidad de articulos: ");
        int qty = 0;
        while (qty <= 0) {
            qty = s.nextInt();
        }
        String itemsFactura[][] = factura.getItemsFactura();
        itemsFactura = new String[qty][5];

        int indexFactura = 0;

        while (indexFactura < qty) {
            boolean encontrado = false;
            System.out.print("Ingrese codigo: ");
            int codigo = s.nextInt();
            for (int i = 0; i < articulos.length; i++) {
                if (articulos[i][0].equals(String.valueOf(codigo))) {
                    encontrado = true;
                    itemsFactura[indexFactura][0] = articulos[i][0];
                    itemsFactura[indexFactura][1] = articulos[i][1];
                    itemsFactura[indexFactura][2] = articulos[i][2];
                    //cantidad
                    System.out.println("Ingrese cantidad: ");
                    int qty_item = s.nextInt();
                    itemsFactura[indexFactura][3] = String.valueOf(qty_item);
                    itemsFactura[indexFactura][4] = String.valueOf(Double.parseDouble(articulos[i][2]) * qty_item);
                }
            }
            if (!encontrado) {
                System.out.println(" -- Producto no encontrado -- ");
                continue;
            }
            indexFactura++;
        }
        factura.setItemsFactura(itemsFactura);
    }

}

