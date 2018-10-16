import java.util.Scanner;
public class veinticuatro {
  public static void main(String[] args) {
    System.out.print("Introduce la altura de la pirámide:");
    int hIntrodu;
    Scanner abc = new Scanner(System.in);
    hIntrodu = abc.nextInt();
    int h = 1;
    int x = 0;
    int espacios = hIntrodu - 1;
    while (h <= hIntrodu) {
      for (x = 1; x <= espacios; x++) {
        System.out.print(" ");
      }

      for (x = 1; x < h; x++) {
        System.out.print(x);
      }
      
      for (x = h; x > 0; x--) {
        System.out.print(x);
      }
        System.out.println();
        h++;
        espacios--;
    }
  }
}

