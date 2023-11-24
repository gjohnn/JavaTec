package Lab1.tp6.ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {

  public static void main(String[] args) {
    ArrayList<Plato> platos = new ArrayList<Plato>();
    CargaDeIngredientes(platos);
    MostrarPlatos(platos);
  }

  public static void CargaDeIngredientes(ArrayList<Plato> platos) {
    Scanner s = new Scanner(System.in);
    String ingresar_otro_plato;
    String ingresar_otro_ingrediente;
    ArrayList<Ingrediente> ingredientes_local = new ArrayList<>();
    do {
      Plato new_plato = new Plato();
      //nombre plato
      System.out.println("Ingrese nombre del plato: ");
      new_plato.setNombre_completo(s.nextLine());
      //precio plato
      System.out.println("Ingrese precio: ");
      new_plato.setPrecio(s.nextDouble());
      s.nextLine();
      //bebidad si o no
      System.out.println("Es bebida? s/n : ");
      String si_no_bebida = s.nextLine();

      if (si_no_bebida.equals("n")) {
        do {
          Ingrediente ingredientes = new Ingrediente();
          // nombre ingrediente
          System.out.println("Ingrese nombre del ingrediente:");
          ingredientes.setNombre(s.nextLine());
          // precio ingrediente
          System.out.println("Ingrese precio del ingrediente:");
          ingredientes.setPrecio(s.nextDouble());
          s.nextLine();
          // unidad ingrediente
          System.out.println("Ingrese unidad de medida del ingrediente:");
          ingredientes.setUnidad_de_medida(s.nextLine());

          ingredientes_local.add(ingredientes);

          System.out.println("Desea agregar otro ingrediente?");
          ingresar_otro_ingrediente = s.nextLine().toLowerCase();
        } while (ingresar_otro_ingrediente.equals("s"));
        new_plato.setIngrediente(ingredientes_local);
      }

      platos.add(new_plato);
      System.out.println("Desea agregar otro plato? s/n");
      ingresar_otro_plato = s.nextLine().toLowerCase();
    } while (ingresar_otro_plato.equals("s"));
  }

  public static void MostrarPlatos(ArrayList<Plato> platos) {
    System.out.println("---------- John's restaurant -------------");
    System.out.println("-- MENU --");

    for (Plato plato : platos) {
      ArrayList<Ingrediente> ingredientes_platos = plato.getIngrediente();
      System.out.println("Nombre del plato: " + plato.getNombre_completo());
      System.out.println("Precio del plato: " + plato.getPrecio());
      if (ingredientes_platos != null) {
        System.out.println("INGREDIENTES:");
        for (Ingrediente e : ingredientes_platos) {
          System.out.println("Nombre del ingrediente: " + e.getNombre());
          System.out.println("Precio del ingrediente: " + e.getPrecio());
          System.out.println(
            "Unidad del ingrediente: " + e.getUnidad_de_medida()
          );
          System.out.println("--");
        }
      }

      System.out.println(
        "--------------------------------------------------------"
      );
    }
  }
}
