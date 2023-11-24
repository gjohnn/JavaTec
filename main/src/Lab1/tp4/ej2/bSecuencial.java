package Lab1.tp4.ej2;

public class bSecuencial {

  public static void main(String[] args) {
    String[] alumnos = {
      "Juan",
      "Marcos",
      "Facundo",
      "Samuel De Luque",
      "Nathan Drake",
    };
    String a = "Samuel De Luque";
    boolean finded = false;
    for (int i = 0; i < alumnos.length; i++) {
      if (alumnos[i].equals(a)) {
        finded = true;
        break;
      } else {
        finded = false;
      }
    }
    if (finded) {
      System.out.println("Alumno encontrado!");
    } else {
      System.out.println("Alumno no encontrado!");
    }
  }
}
