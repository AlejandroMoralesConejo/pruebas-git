import java.util.Scanner;
public class ExAmc01 {
  public static void main (String[] args) { //Entre 0 y 9999 puede haber un máximo de 14 divisiones entre 2
    System.out.println("Introduzca un número entero positivo para mostrar su codificación en binario");
    Scanner r = new Scanner(System.in);
    int numIntroducido = r.nextInt();
    int n = numIntroducido;
    int cociente = n/2;
    int resto = n%2;
    System.out.println("Número de partida: "+numIntroducido);
    if ((numIntroducido >= 0) && (numIntroducido <= 9999)) {
      System.out.println(numIntroducido+"/2: cociente: "+cociente+" resto: "+resto);
      while ((n/2) != 0) {
        n/=2;
        cociente/=2;
        resto = n%2;
        System.out.println(n+"/2: cociente: "+cociente+" resto: "+resto);
      }
      //No sé como sacar en un único número los restos ordenados, si tuviese ese número el último paso sería el que está comentado y mostrarlo
      //while (binarioInvertido > 0) {
        //int binarioCorrecto = (binarioCorrecto * 10) + (binarioInvertido % 10);
        //BinarioInvertido /= 10; 
      //}
      System.out.println("El número "+numIntroducido+" en binario es la unión de los restos de manera ascendente empezando por el último");
      
    } else {
      System.out.println("Debes introducir un número que oscile entre 0 y 9999");
    }
  }
}
