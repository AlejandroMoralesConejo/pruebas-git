import java.util.Scanner;
public class ejercicioClase {
  public static void main (String[] args) {
    int numAdivinar = 18;
    Scanner r = new Scanner(System.in);
    System.out.println("Adivina un número entero introduciéndolo por teclado:");
    int numIntroducido;
    do {
      numIntroducido = r.nextInt();
      if (numIntroducido < numAdivinar) {
        System.out.println("El número "+numIntroducido+" es menor que el número a adivinar");
      }
      if (numIntroducido == numAdivinar) {
        System.out.println("Enhorabuena, lo has adivinado. El número es "+numAdivinar);
      }
      if (numIntroducido > numAdivinar) {
        System.out.println("El número "+numIntroducido+" es mayor que el número a adivinar");
      } 
    }while (numIntroducido != numAdivinar);
    
  }
}
