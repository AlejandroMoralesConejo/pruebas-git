import java.util.Scanner;
public class ejercicioClaseAmpliado {
  public static void main (String[] args) {
    int numAdivinar = 18;
    Scanner r = new Scanner(System.in);
    System.out.println("Adivina un número entero introduciéndolo por teclado:");
    int numIntroducido;
    int abajoProximo = 0;
    int arribaProximo = 999;
    do {
      numIntroducido = r.nextInt();
      if (numIntroducido < numAdivinar) { //número por debajo del adivinado
        System.out.println("El número "+numIntroducido+" es menor que el número a adivinar");
        if (abajoProximo < numIntroducido) {
          abajoProximo = numIntroducido;
        }
      }
      if (numIntroducido == numAdivinar) { //acierto
        System.out.println("Enhorabuena, lo has adivinado. El número es "+numAdivinar);
      }
      if (numIntroducido > numAdivinar) { //número por arriba del adivinado
        System.out.println("El número "+numIntroducido+" es mayor que el número a adivinar");
        if (arribaProximo > numIntroducido) {
          arribaProximo = numIntroducido;
        }
      }
      if (numIntroducido != numAdivinar) { //ejercicio ampliado
        System.out.println("El número a adivinar es mayor que "+abajoProximo+" y menor que "+arribaProximo);
      } 
    } while (numIntroducido != numAdivinar);
  }
}
