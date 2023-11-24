package Lab1.tp7.ej_B;

import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {

  public static void main(String[] args) {
    Computadora compu = new Computadora();
    CargaComputadora(compu);
    MostrarComputadora(compu);
  }

  public static void CargaComputadora(Computadora compu) {
    Scanner s = new Scanner(System.in);
    HashSet<ComponenteCPU> componenteCPUs = new HashSet<ComponenteCPU>();
    System.out.println("Ingrese marca:");
    compu.setMarca(s.nextLine());
    System.out.println("Ingrese modelo:");
    compu.setModelo(s.nextLine());
    System.out.println("Ingrese cantidad de componentes: ");
    int cant_componentes = s.nextInt();
    s.nextLine();
    int iterator_cant = 1;
    do {
      ComponenteCPU ComponenteCPU = new ComponenteCPU();
      //nombre
      System.out.println("Ingrese componente " + iterator_cant + ": ");
      ComponenteCPU.setComponente(s.nextLine());
      //marca
      System.out.println("Ingrese marca: ");
      ComponenteCPU.setMarca(s.nextLine());
      //cantidad
      System.out.println("Ingrese cantidad: ");
      ComponenteCPU.setCantidad(s.nextInt());
      s.nextLine();
      //precio
      System.out.println("Ingrese precio: ");
      ComponenteCPU.setPrecio(s.nextDouble());
      s.nextLine();
      iterator_cant += 1;
      componenteCPUs.add(ComponenteCPU);
    } while (iterator_cant <= cant_componentes);
    compu.setComponenteCPUs(componenteCPUs);
  }

  public static void MostrarComputadora(Computadora compu) {
    System.out.println(
      "---------------------- Computadora ---------------------- "
    );
    System.out.println("Marca: " + compu.getMarca());
    System.out.println("Modelo: " + compu.getModelo());
    System.out.println("Componentes: ");
    System.out.println("-------------------------------------");
    double costo_total = 0;
    for (ComponenteCPU e : compu.getComponenteCPUs()) {
      System.out.println("Componente: " + e.getComponente());
      System.out.println("Marca: " + e.getMarca());
      System.out.println("Cantidad: " + e.getCantidad());
      System.out.println("Precio: " + e.getPrecio());
      double costo_final_por_prod = e.getCantidad() * e.getPrecio();
      System.out.println("Subtotal: " + (costo_final_por_prod));
      costo_total += costo_final_por_prod;
      System.out.println("-------------------------------------");
    }
    double costo_adicional = costo_total < 50000
      ? costo_total * 0.40
      : costo_total * 0.30;
    System.out.println(
      "Precio sugerido de venta es " +
      costo_total +
      " + " +
      (costo_adicional) +
      " = " +
      (costo_total + costo_adicional)
    );
  }
}
