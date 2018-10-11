import java.util.Scanner;
public class once {
  public static void main(String[] args) {
    int num;
    int cinco;
    
    Scanner r = new Scanner(System.in);
    System.out.println("Introduce un número y te diré el cuadrado y el cubo de los 5 siguientes");
    num = r.nextInt();
    cinco = num+5;
    while (num < cinco) {
      num++;
      System.out.println("Número: "+num+"     Cuadrado: "+(num*num)+"     Cubo: "+(num*num*num));
    }
  }
}
