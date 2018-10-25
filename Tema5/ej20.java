import java.util.Scanner;
public class ej20 { //Pintar una pirámide hueca introduciendo altura y carácter
  public static void main (String[] args) {
    Scanner r = new Scanner(System.in);
    int altura = 1;
    int i = 0;
    int alturaIntroducida;
    System.out.println("Introduce el carácter con el que quieres pintar la pirámide");
    String x = System.console().readLine();
    System.out.println("Introduce la altura");
    alturaIntroducida = r.nextInt();
    int espacios = alturaIntroducida - 1;
    int espacios2 = 0;
    while (altura < alturaIntroducida) {
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
        }
      System.out.print(x);
      for (i = 1; i < espacios2; i++) {
        System.out.print(" ");
        }
      if (altura>1) {
        System.out.print(x);
      }
      System.out.println();
      altura++;
      espacios--;
      espacios2 += 2;
    }
      for (i = 1; i < altura*2; i++) {
        System.out.print(x);
        }

  }
}
