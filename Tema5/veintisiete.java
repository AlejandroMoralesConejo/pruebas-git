import java.util.Scanner;
public class veintisiete {
  public static void main(String[] args) {
    System.out.print("Introduce un número que sea mayor que 1: ");
    Scanner r = new Scanner(System.in);
    int numIntroducido = r.nextInt();
    int contador = 0;
    int suma = 0;
    for (int x = 1; x < numIntroducido; x++) { //Suma de los múltiplos y contador+1
      if ((x%3) == 0) {
        System.out.print(x + " ");
        suma += x;
        contador++;
      }
    }
    System.out.println("Desde el número 1 hasta el "+numIntroducido+" hay "+contador+" múltiplos de 3 que suman "+suma);
  }
}
