import java.util.Scanner;
public class diez {
  public static void main (String[] args) {
    int i = 0;
    int acumulado = 0;
    int numIntroducidos = 0;
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce los números positivos que quieras y te haré la media cuando introduzcas uno negativo");
    
    do {
      i = r.nextInt();
      if (i>=0) {
        acumulado += i;
        numIntroducidos++;
      }
    } while (i>=0);
    int media;
    media = acumulado/numIntroducidos;
    System.out.println("La media aritmética de los números introducidos es: "+media);
  }
}
