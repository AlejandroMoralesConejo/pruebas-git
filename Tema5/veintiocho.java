import java.util.Scanner;
public class veintiocho {
  public static void main (String[] args) {
    int numIntroducido;
    int factorial = 1;
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce un número entero para calcular su factorial");
    numIntroducido = r.nextInt();
    if (numIntroducido < 0) {
      System.out.println("Debes introducir un número entero positivo");
    } else if (numIntroducido == 0) {
      System.out.println("0! = 1");
    } else {
    for (int vuelta = 1; vuelta <= numIntroducido; vuelta++) {
      factorial *= vuelta;
    }
    System.out.println(numIntroducido+"! = "+factorial);
    }
    
  }
}
