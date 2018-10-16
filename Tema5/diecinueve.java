import java.util.Scanner;
public class diecinueve {
  public static void main (String[] args) {
    int altura;
    String x; //caracter
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce la altura de la pirámide");
    altura = r.nextInt();
    System.out.println("Introduce el carácter con el que quieres pintarla");
    x = System.console().readLine();
    int espacio = altura-1;
    int numSimbolos = 1;
    for (int contador = 0; contador < altura; contador++) {
      for (int k = 0; k<espacio; k++) {
        System.out.print(" ");
      }
      for (int g = 0; g<numSimbolos; g++) {
        System.out.print(x);
      }
      System.out.println("");
      espacio--;
      numSimbolos+=2;

    }
  }
}

