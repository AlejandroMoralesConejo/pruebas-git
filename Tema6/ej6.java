import java.util.Scanner;
public class ej6 {
  public static void main (String [] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Adivina el número que he pensado entre el 0 y el 100");
    int numPensado = (int)(Math.random()*100);
    for (int i = 200; i >= 0; i--) {
      intento = r.nextInt();
      if (intento == numPensado) {
        i = -2;
        System.out.println("Has acertado, el número secreto era "+numPensado);
      } else {
        System.out.println("Has fallado, te quedan "+i+" intentos");
        if (intento > numPensado) {
          System.out.println("El número introducido es mayor al pensado");
        } else {
          System.out.println("El número introducido es menor al pensado");
        }
      }
    }
  }
}
