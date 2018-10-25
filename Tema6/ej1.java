public class ej1 {
  public static void main (String [] args) {
    System.out.println("Juego que suma tres tiradas de dados y la suma conjunta");
    int suma = 0;
    for (int i=1; i <= 3; i++) {
      int x = (int)(Math.random()*6)+1;
      System.out.print("Tirada "+i+": ");
      System.out.println(x);
      suma += x;
    }
    System.out.println("Suma: "+suma);
  }
}
