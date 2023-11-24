package Lab1.tp7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej_A {

  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    HashMap<String, Long> agenda = new HashMap<String, Long>();
    System.out.println("------------- AGENDA -------------");
    int n = 0;
    do {
      System.out.println("MENU:");
      System.out.println("1- Cargar Datos en la Agenda");
      System.out.println("2- Buscar Teléfono por Nombre");
      System.out.println("3- Listar Agenda");
      System.out.println("0 - Salir");
      n = s.nextInt();
      switch (n) {
        case 1:
          CargaDatos(agenda);
          break;
        case 2:
          BuscarTel(agenda);
          break;
        case 3:
          ListarAgenda(agenda);
          break;
      }
    } while (n != 0);
    s.close();
  }

  public static void CargaDatos(HashMap<String, Long> agenda)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese nombre del contacto: ");
    String name = s.nextLine();
    System.out.println("Ingrese número del contacto: ");
    Long telefono = s.nextLong();
    s.nextLine();
    agenda.put(name, telefono);
  }

  public static void BuscarTel(HashMap<String, Long> agenda)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese nombre del contacto a buscar: ");
    String findContact = s.nextLine().toLowerCase();
    Long foundContact = agenda.get(findContact);
    if (foundContact!=null) {
          System.out.println("-------Telefono de "+findContact+": "+ foundContact);
    } else {
      System.out.println("Contacto no encontrado!");
    }
  }

  public static void ListarAgenda(HashMap<String, Long> agenda)
  {
    System.out.println("----------------------------------------------------");
    for (Map.Entry<String,Long> e : agenda.entrySet()) {
      String name = e.getKey();
      Long phone = e.getValue();
      System.out.println("Contacto: "+ name);
      System.out.println("Teléfono: "+ phone);
      System.out.println("-----------------------------------");
    }
  }
}
