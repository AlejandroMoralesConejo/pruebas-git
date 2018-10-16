import java.util.Scanner;
public class veintiuno {
  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    int x;
    int numIntroducidos = 0;
    int sumaImpares = 0;
    int imparesIntroducidos = 0;
    int maxPar = 0;
    
    System.out.println("Introduce los números que quieras. Te diré cuantos números has introducido, la media de los impares y el mayor de los pares.");
    System.out.println("Para terminar el programa introduce un número negativo");
    do {
      x = r.nextInt();
      if (x>=0) {
        numIntroducidos++;
        if ((x%2) == 1) {
          imparesIntroducidos++;
          sumaImpares += x;
        } else {
          if (x > maxPar) {
            maxPar = x;
          }
        }
      }
    } while (x>=0);
    int mediaImpares = sumaImpares/imparesIntroducidos;
    System.out.println("Has introducido "+numIntroducidos+" números.");
    System.out.println("La media de los impares es "+mediaImpares);
    System.out.println("El número máximo par es "+maxPar);
    
  }
}
