import java.util.Scanner;
public class ocho {
  public static void main(String [] args) {
    int i=1;
    int numero;
    Scanner r = new Scanner(System.in);
    System.out.println("Di un número y te diré su tabla de multiplicar");
    numero = r.nextInt();
    System.out.println("La tabla del "+numero+" es:");
    while (i<11) {
      System.out.println(numero+"*"+i+"="+numero*i);
      i++;
    }
  }
}
