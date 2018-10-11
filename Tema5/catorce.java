import java.util.Scanner;
public class catorce {
  public static void main(String[] args) {
  int base;
  int exponente=0;
  int solucion = 1;
  Scanner r = new Scanner(System.in);
  System.out.println("Introduce una base");
  base = r.nextInt();
  System.out.println("Introduce un exponente");
  exponente = r.nextInt();
  for(int n=1;n<=exponente;n++) {
     solucion *= base;
     
   }
   System.out.println("La potencia de "+base+" elevado a "+exponente+" es "+solucion);
  }
}
