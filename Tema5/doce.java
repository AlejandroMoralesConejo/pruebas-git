import java.util.Scanner;
public class doce {
  public static void main(String[] args) {
    int n;
    int numeros;
    int cuentaVueltas = 0;
    int acumulado;
    int n1 = 0;
    int n2 = 1;
    int aux;
    System.out.println("Dime el número de términos de Fibonacci que quieres ver");
    Scanner r = new Scanner(System.in);
    n = r.nextInt();
    switch (n) {
      case 1:
      System.out.println("0");
      break;
      case 2:
      System.out.println("0 1");
      break;
      default: 
      System.out.printf("0 1 ");
      while(n>(cuentaVueltas+2)) {
        aux = n1;
        n1 = n2;
        n2 = aux+n2;
        System.out.printf(n2);
        cuentaVueltas++;
      }
    }
        
      
      
      
  }
}
