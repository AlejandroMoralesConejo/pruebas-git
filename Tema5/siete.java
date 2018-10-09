import java.util.Scanner;
public class siete {
  public static void main(String[] args) {
    int clave = 2000;
    int intento = 0;
    boolean adivinado = false;
    int contador = 5;
    int maxIntentos = 1;
    Scanner r = new Scanner(System.in);
      do {
        contador--;
        System.out.println("Escribe la combinación secreta (Te quedan "+contador+" intentos)");
        intento = r.nextInt();
        if (intento == clave) {
          adivinado = true;
        }
        } while ((adivinado == false) && (contador > maxIntentos));
      
      if (adivinado) {
        System.out.println("Has acertado la combinación");
      } else  {
        System.out.println("No has acertado y has agotado los intentos");
        
      }
        
  }
}
