import java.util.Scanner;
public class ej5 {
  public static void main (String[] args) {
    Scanner r = new Scanner(System.in);
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int[] numero = new int[10];
    System.out.println("Introduce números hasta que te salga de la polla");
    for (int i = 0; i < 10; i++) {
      numero[i] = r.nextInt();
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    System.out.println("Has introducido estos números");
    for (int i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      if (numero[i] == maximo) {
        System.out.print("  Número máximo");
      }
      if (numero[i] == minimo) {
        System.out.print("  Número mínimo");
      }
      System.out.println();
    }
  }
}
