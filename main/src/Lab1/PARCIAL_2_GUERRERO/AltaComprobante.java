package Lab1.PARCIAL_2_GUERRERO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AltaComprobante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner st = new Scanner(System.in);

        String[][] tiposComprobante = {
                {"FV", "Factura Venta"},
                {"R", "Remito"},
                {"P", "Presupuesto"},
                {"PV", "Pedido Venta"},
                {"FO", "Factura Compra"}};
        HashMap<Integer, String> articulos = new HashMap<>();
        articulos.put(100, "Arroz");
        articulos.put(200, "Lavandina");
        articulos.put(300, "Fideos");
        articulos.put(400, "Leche");
        articulos.put(500, "Harina");
        articulos.put(600, "Aceite");
        articulos.put(700, "Sal");
        articulos.put(800, "Pimienta");
        articulos.put(900, "Detergente");
        articulos.put(1000, "Yerba");
        articulos.put(1100, "Shampoo");
        articulos.put(1200, "Jabon");
        articulos.put(1300, "Cepillo de Dientes");
        articulos.put(1400, "Pasta Dental");
        articulos.put(1500, "Lentejas");
        System.out.println();

        Comprobante comprobante = new Comprobante();
        //fecha
        System.out.println("Ingrese fecha: ");
        String fecha = st.nextLine();
        comprobante.setFecha(fecha);
        //nro comprobante
        System.out.println("Ingrese numero de comprobante: ");
        comprobante.setNroComprobante(s.nextLong());
        //tipo de comprobante
        boolean validateTipo = false;
        while (!validateTipo) {
            System.out.println("Tipo de comprobante:");
            String tipoCom = st.nextLine().toUpperCase();
            for (int i = 0; i < tiposComprobante.length; i++) {
                if (tiposComprobante[i][0].equals(tipoCom)) {
                    comprobante.setTipoComprobante(tiposComprobante[i][1]);
                    validateTipo = true;
                }

            }
        }
        //ARTICULOS
        ArrayList<DetalleComprobante> items = new ArrayList<>();
        CargarArticulos(comprobante, articulos, items);

        comprobante.MostrarDatos();


    }

    public static void CargarArticulos(Comprobante comprobante, HashMap<Integer, String> articulos, ArrayList<DetalleComprobante> items) {
        Scanner s = new Scanner(System.in);
        Scanner st = new Scanner(System.in);


        System.out.println(" -- INGRESAR PRODUCTOS -- ");
        boolean otroProd = true;
        int codProd = 0;
        while (otroProd) {
            DetalleComprobante detalleComprobante = new DetalleComprobante();
            otroProd = false;
            boolean ingresoCod = true;
            while (ingresoCod) {
                ingresoCod = false;
                System.out.println("Ingrese código del producto:");
                codProd = s.nextInt();
                if (codProd < 100 || codProd > 1500) {
                    ingresoCod = true;
                }
                if (!articulos.containsKey(codProd)) {
                    System.out.println("Codigo no existente!");
                    ingresoCod = true;
                }
            }
            String articuloElegido = articulos.get(codProd);
            detalleComprobante.setArticulo(articuloElegido);
            double precio = 0.0;
            while (true) {
                System.out.println("Ingrese precio: ");
                precio = s.nextInt();
                if (precio > 0) {
                    break;
                }
                System.out.println("Precio mayor a $0");
            }
            detalleComprobante.setPrecio(precio);
            int cantidad = 0;
            while (true) {
                System.out.println("Ingrese cantidad: ");
                cantidad = s.nextInt();
                if (cantidad > 0) {
                    break;
                }
            }
            detalleComprobante.setCantidad(cantidad);

            items.add(detalleComprobante);
            System.out.println("Agregar otro producto? s/n");
            String otroProds = st.nextLine().toLowerCase();
            if (otroProds.equals("s")) {
                otroProd = true;
            }
        }
        comprobante.setItemsComprobante(items);

    }
}

