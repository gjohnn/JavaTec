package Lab1.tp4;

public class ej1 {

  public static void main(String[] args) {
    System.out.println("");
    System.out.println("-----------Algoritmos de Ordenación----------------");
    System.out.println(
      "---Ordenamiento por inserción: Se utiliza para ordenar una lista de elementos en orden ascendente o descendente. Comienza por el primer objeto y lo compara con los demás y así con cada uno."
    );
    System.out.println(
      "---Algoritmo de la burbuja: comparar cada elemento de la lista con el siguiente, si no están en el orden correcto, se intercambian entre sí sus valores"
    );
    System.out.println(
      "---Ordenamiento por selección: se recorre toda la lista buscando el menor de todos los elementos, una vez terminada la recorrida el menor elemento se coloca al inicio de la lista recorrida"
    );
    System.out.println(
      "---Algoritmo Quick-Sort: coloca los elementos menores o iguales al pivote a la izquierda y los elementos mayores al pivote a la derecha, y devuelve la posición final del pivote. "
    );
    System.out.println("");

    System.out.println("-----------Algoritmos de Búsqueda----------------");
    System.out.println(
      "---Búsqueda Secuencial: Funciona examinando cada elemento de la lista uno por uno, en orden secuencial, hasta encontrar el elemento que se busca o hasta recorrer toda la lista sin éxito."
    );
    System.out.println(
      "---Búsqueda Binaria: Basándose en la comparación, decide si el elemento se encuentra en la mitad izquierda o derecha, y repite el proceso en la mitad correspondiente. Este proceso se repite hasta que se encuentre el elemento o se determine que no está en la lista."
    );
    System.out.println("");

    System.out.println("-----------Algoritmos de Recorrido----------------");
    System.out.println(
      "---Recorrido de Profundidad: exige un camino desde el nodo raıź através de un hijo, al descendiente más lejano del primer hijo antes de proseguir aun segundo hijo"
    );
    System.out.println(
      "---Recorrido de anchura: se realiza horizontalmente desde el raıź a todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta que todos los nodos han sido procesados. En otras palabras, en el recorrido en anchura, cada nivel se procesa totalmente antes de que comience el siguiente nivel. Para poder saber qué vértices visitar, utilizamos una cola. "
    );
  }
}
