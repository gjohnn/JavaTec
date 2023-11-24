package Lab1.MUTXNTES;

import java.util.Scanner;

public class mutantes_GUERRERO {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int option = 0;
    String isMutants = "";
    do {
      System.out.println(" ------------ MENU ---------------- ");
      System.out.println("1) NUEVO MUTANTE");
      System.out.println("2) DEMO DE FILA ");
      System.out.println("3) DEMO DE COLUMNA ");
      System.out.println("4) DEMO DE DIAGONAL ");
      System.out.println("5) DEMO DE NO MUTANTE ");
      System.out.print("Ingrese opción: ");
      option = s.nextInt();
      s.nextLine();
      System.out.println(" ---------------------------------- ");
    } while (option < 1 || option > 5);
    switch (option) {
      case 1:
        String[] dna = new String[6];
        for (int i = 0; i < dna.length; i++) {
          String wordADN = "";
          while (wordADN.length() < 6) {
            String letterADN;
            do {
              System.out.print("Ingrese letra ADN (A, T, C, G): ");
              letterADN = s.nextLine().toUpperCase();
            } while (
              !letterADN.equals("A") &&
              !letterADN.equals("T") &&
              !letterADN.equals("C") &&
              !letterADN.equals("G")
            );
            wordADN += letterADN;
          }
          System.out.println("ADN " + (i + 1) + ": " + wordADN);
          dna[i] = wordADN;
        }
        isMutants = (isMutant(dna)) ? "Es mutante." : "No es mutante.";
        System.out.println(isMutants);
        break;
      case 2:
        String[] dna_row = {
          "ATTCGA",
          "CTTTTC",
          "ATTTTA",
          "AGAACG",
          "TCCTAA",
          "TCACTG",
        };
        isMutants = (isMutant(dna_row)) ? "Es mutante." : "No es mutante.";
        System.out.println(isMutants);
        break;
      case 3:
        String[] dna_col = {
          "ATATGA",
          "AAATTC",
          "TTATTT",
          "AGATGG",
          "CCGCTA",
          "TCTCTG",
        };
        isMutants = (isMutant(dna_col)) ? "Es mutante." : "No es mutante.";
        System.out.println(isMutants);
        break;
      case 4:
        String[] dna_diag = {
          "TGGCGA",
          "CTATAC",
          "TTTAAT",
          "AGATGG",
          "CACXTG",
          "ACACTT",
        };
        isMutants = (isMutant(dna_diag)) ? "Es mutante." : "No es mutante.";
        System.out.println(isMutants);
        break;
      case 5:
        String[] dna_not = {
          "TTGCGA",
          "CCGTGC",
          "TTATGT",
          "AGAAXG",
          "CCCXCA",
          "TCACTT",
        };
        isMutants = (isMutant(dna_not)) ? "Es mutante." : "No es mutante.";
        System.out.println(isMutants);
        break;
    }
  }

  public static boolean isMutant(String[] dna) {
    boolean isMutant = false;
    int count_times = 0;
    String compareDNA[][] = new String[6][6];
    for (int i = 0; i < compareDNA.length; i++) {
      for (int j = 0; j < compareDNA.length; j++) {
        String oneDNA = dna[i];
        compareDNA[i][j] = String.valueOf(oneDNA.charAt(j));
      }
    }

    System.out.println(" --------- MATRIZ DNA --------- ");
    for (int i = 0; i < compareDNA.length; i++) {
      for (int j = 0; j < compareDNA.length; j++) {
        System.out.print(compareDNA[i][j] + " ");
      }
      System.out.println(" ");
    }
    //checkear fila
    int isRow = checkRow(compareDNA);
    if (isRow >= 1) {
      if (isRow >= 2) {
        System.out.println(("MUTANTE POR FILAS"));
      }
      count_times += isRow;
    }
    //checkear col
    int isCol = checkCol(compareDNA);
    if (isCol >= 1) {
      if (isCol >= 2) {
        System.out.println(("MUTANTE POR COLUMNAS"));
      }
      count_times += isCol;
    }
    //checkear diag
    int isDiag = checkDiag(compareDNA);
    if (isDiag >= 1) {
      if (isDiag >= 2) {
        System.out.println(("MUTANTE POR DIAGONALES"));
      }
      count_times += isDiag;
    }
    //segun la cantidad de veces decir si es mutante o no
    if (count_times >= 2) {
      isMutant = true;
    }
    return isMutant;
  }

  public static int checkRow(String[][] compareDNA) {
    int countTimes = 0;
    int count = 0;
    for (int i = 0; i < compareDNA.length; i++) {
      count = 0;
      int j = 0;
      while (j < compareDNA[0].length - 1) {
        count = (compareDNA[i][j].equals(compareDNA[i][j + 1])) ? count + 1 : 0;
        if (count >= 3) {
          countTimes++;
          break;
        }
        j++;
      }
    }
    return countTimes;
  }

  public static Integer checkCol(String[][] compareDNA) {
    int count = 0;
    int countTimes = 0;
    for (int j = 0; j < compareDNA[0].length - 1; j++) {
      int i = 0; //fila
      count = 0;
      while (i < compareDNA.length - 1) {
        count = (compareDNA[i][j].equals(compareDNA[i + 1][j])) ? count + 1 : 0;
        if (count >= 3) {
          countTimes++;
          break;
        }
        i++;
      }
    }
    return countTimes;
  }

  public static int checkDiag(String[][] compareDNA) {
    int count_times = 0;
    for (int i = 0; i < compareDNA.length - 1; i++) {
      for (int j = 0; j < compareDNA[0].length - 1; j++) {
        int count = 0;
        String actualPosition = compareDNA[i][j];
        int newRow = i + 1;
        int newCol = j + 1;
        //corrobar que newRow y newCol no se pasen del limite y que concuerden con el primer valor
        while (
          newRow < compareDNA.length &&
          newCol < compareDNA[0].length &&
          actualPosition.equals(compareDNA[newRow][newCol])
        ) {
          count++;
          if (count >= 3) {
            count_times++;
            count = 0;
          }
          newRow++;
          newCol++;
        }
      }
    }

    for (int i = 0; i < compareDNA.length - 1; i++) {
      for (int j = 0; j < compareDNA[0].length - 1; j++) {
        int count = 0;
        int newRow = i + 1;
        int finalCol = (compareDNA[0].length - 1) - j;
        String actualPosition = compareDNA[i][finalCol];
        int checkDiagonal = finalCol - 1;
        while (
          (newRow) < compareDNA.length &&
          (checkDiagonal) > -1 &&
          actualPosition.equals(compareDNA[newRow][checkDiagonal])
        ) {
          count++;
          if (count >= 3) {
            count_times++;
            count = 0;
          }
          newRow++;
          checkDiagonal--;
        }
      }
    }
    return count_times;
  }
}
