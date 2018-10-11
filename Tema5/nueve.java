import java.util.Scanner;
public class nueve {
  public static void main (String[] args) {
    int numero;
    int numero2;
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce un número entero y te diré el número de cifras del cual se compone");
    numero = r.nextInt();
    int cifras = 1;
    numero2 = numero;
    while (numero2 > 10) {
      numero2 /= 10;
      cifras++;
    }
    System.out.println("El número "+numero+" se compone de "+cifras+" cifras.");
  }
}
