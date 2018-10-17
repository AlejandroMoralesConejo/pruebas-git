public class clase1710 {
  public static void main (String[] args) {
    int x=0;
    int y=0;
    int z=0;
    for (int vuelta=0; vuelta < 999; vuelta++) { //Bucle para dar 999 vueltas de números
      if ((vuelta%10)==0) { //Saltar de línea cada diez n
        System.out.println();
      }
      z++;
      if (z == 10) { //pasar de 9 a 10
        z=0;
        y++;
      }
      if (y == 10) { //pasar de 99 a 100
        y=0;
        x++;
      }
      if (x == 3) { //cambiar 3 por E e imprimir
        System.out.print("E-");
      } else {
        System.out.print(x+"-");
        }
      if (y == 3) {
        System.out.print("E-"); //Si el número es 3, pinta una E y si no, el número tal cual
      } else {
        System.out.print(y+"-");
        }
      if (z == 3) {
        System.out.print("E   ");
      } else {
        System.out.print(z+"   ");
        }
    }
  }
}

