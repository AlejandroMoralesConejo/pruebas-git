public class ej3 {
  public static void main(String[] args) {
    int[] num = new int[10];
    int i;
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    for (i = 9; i >= 0; i--) {
      System.out.print(num[i]+" ");
    }
  }
}
