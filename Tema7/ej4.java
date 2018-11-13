public class ej4 {
  public static void main(String [] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int i;
    for (i = 0; i < 20; i++) { //cargar 20 números con valores aleatorios entre 0 y 100
      numero[i] = (int)(Math.random()*100);
      cuadrado[i] = (numero[i])*(numero[i]);
      cubo[i] = (numero[i])*(numero[i])*(numero[i]);
    }
    System.out.println("Número   Cuadrado   Cubo");
    for (i = 0; i < 20; i++) {
      System.out.printf("%3d       %3d       s %3d", numero[i], cuadrado[i], cubo[i]);
      System.out.println();
    }
  }
}
