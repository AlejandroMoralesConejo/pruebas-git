public class ej5 {
  public static void main(String [] args) {
    int minNum = 199;
    int maxNum = 100;
    int suma = 0;
    int n = 0;
    for (int i = 1; i <= 50; i++) {
      int numAleatorio = (int)(Math.random()*100)+100;
      System.out.println(numAleatorio);
      suma += numAleatorio;
      n++;
      if (numAleatorio < minNum) {
        minNum = numAleatorio;
      }
      if (numAleatorio > maxNum) {
        maxNum = numAleatorio;
      }
    }
    int media = suma/n;
    System.out.println("El número mínimo es "+minNum);
    System.out.println("El número máximo es "+maxNum);
    System.out.println("La media de los números es "+media);
  }
}
