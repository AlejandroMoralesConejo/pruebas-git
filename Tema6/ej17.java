import java.util.Scanner;
public class ej17 {
  public static void main (String [] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Voy a pintar una pecera con un pececito dentro");
    System.out.println("Indica la altura (mínimo: 4)");
    int altura = r.nextInt();
    System.out.println("Indica la anchura (mínimo: 4)");
    int anchura = r.nextInt();
    int coordenadaFila = (int)(Math.random()*(altura-2))+2;
    int coordenadaColumna = (int)(Math.random()*(anchura-2))+2;
    for (int contadorFilas = 1; contadorFilas <= altura; contadorFilas++) {
      for (int contadorColumnas = 1; contadorColumnas <= anchura; contadorColumnas++) {
        if  ((contadorFilas==1) || (contadorFilas==altura)) {
          System.out.print("*");
        } else if ((contadorColumnas == 1) || (contadorColumnas==anchura)) {
          System.out.print("*");
        } else if ((contadorFilas == coordenadaFila) && (contadorColumnas==coordenadaColumna)) {
          System.out.print("&");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
