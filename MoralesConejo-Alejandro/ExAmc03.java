import java.util.Scanner;
public class ExAmc03 { //Alejandro Morales Conejo 1º DAW
  public static void main (String[] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce una altura comprendida entre 3 y 30, ambos incluídos, para dibujar una pirámide de lado");
    int alturaIntroducida = r.nextInt();
    int linea = 3;
    int i = 1;
    int espacios = 1;
    if ((3 <= alturaIntroducida) && (alturaIntroducida <= 30)) {
      System.out.println("*"); //las dos primeras líneas siempre son iguales
      System.out.println("**");
      while (linea <= alturaIntroducida) { //parte superior mitad incluida
        System.out.print("*");
        for (i = 1; i <= espacios; i++) { //espacios
          System.out.print(" ");
        }
        System.out.println("*");
        espacios++;
        linea++;
      }
      linea = 1;
      espacios = alturaIntroducida - 3;
      while (linea <= alturaIntroducida-3) { //parte inferior
        System.out.print("*");
        for (i = 1; i <= espacios; i++) { //espacios
          System.out.print(" ");
        }
        System.out.println("*");
        espacios--;
        linea++;
      }
      System.out.println("**"); //las dos últimas filas son siempre iguales
      System.out.println("*");
    } else {
      System.out.println("Debes introducir un valor comprendido entre 3 y 30");
    }
  }
}
