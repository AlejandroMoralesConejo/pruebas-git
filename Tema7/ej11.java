public class ej11 {
  public static void main (String[] args) {
    int[] indice = new int[10];
    int[] num = new int[10];
    int i;
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.print("Índice:  ");
    for (i = 0; i < 10; i++) {
      indice[i] = i;
      System.out.printf("│%3d", indice[i]);
    }
  }
}
