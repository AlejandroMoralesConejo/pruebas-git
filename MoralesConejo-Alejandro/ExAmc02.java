import java.util.Scanner;
public class ExAmc02 { //Alejandro Morales Conejo 1º DAW
  public static void main (String[] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce una altura comprendida entre 3 y 30, ambos incluídos, para dibujar una pirámide de lado");
    int alturaIntroducida = r.nextInt();
    int longitudDeLinea = 1;
    int linea = 1;
    int i = 1;
    if ((3 <= alturaIntroducida) && (alturaIntroducida <= 30)) {
      while (linea <= alturaIntroducida) { //mitad incluída de pirámide para arriba
        for (i = 1; i <= longitudDeLinea; i++) { 
          System.out.print("*");
        }
        System.out.println();
        longitudDeLinea++;
        linea++;
      }
      linea = 1;
      longitudDeLinea = alturaIntroducida -1;
      while (longitudDeLinea > 0) { //parte inferior
        for (i = 1; i <= longitudDeLinea; i++) {
          System.out.print("*");
        }
        System.out.println();
        longitudDeLinea--;
        linea++;
      }

    } else {
      System.out.println("Debes introducir un valor comprendido entre 3 y 30");
    }
  }
}
