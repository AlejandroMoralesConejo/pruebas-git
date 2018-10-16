import java.util.Scanner;
public class diecisiete {
  public static void main (String[] args) {
    int x;
    Scanner r = new Scanner(System.in);
    int suma = 0;
    do {
      System.out.println("Introduce un número entero positivo y te sumaré los 100 siguientes");
      x = r.nextInt();
      if (x < 0) {
        System.out.println("Debes introducir un número entero positivo, inténtalo de nuevo");
      }} while (x < 0);
      
    for (int vuelta = x; vuelta < (x+100); vuelta++) {
      suma += vuelta;
      }
    System.out.println("La suma de los 100 primeros números después del "+x+" es "+suma);
  }
}
