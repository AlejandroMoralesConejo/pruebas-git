public class ej2 {
  public static void main (String [] args) {
    System.out.println("Carta al azar de la baraja francesa");
    int numCarta = (int)(Math.random()*13)+1;
    switch (numCarta) {
      case 1:
        System.out.print("A de ");
        break;
      case 2:
        System.out.print("2 de ");
        break;
      case 3:
        System.out.print("3 de ");
        break;
      case 4:
        System.out.print("4 de ");
        break;
      case 5:
        System.out.print("5 de ");
        break;
      case 6:
        System.out.print("6 de ");
        break;
      case 7:
        System.out.print("7 de ");
        break;
      case 8:
        System.out.print("8 de ");
        break;
      case 9:
        System.out.print("9 de ");
        break;
      case 10:
        System.out.print("10 de ");
        break;
      case 11:
        System.out.print("J de ");
        break;
      case 12:
        System.out.print("Q de ");
        break;
      case 13:
        System.out.print("K de ");
        break;
      default:
    }
    int numPalo = (int)(Math.random()*4)+1;
    switch (numPalo) {
      case 1:
        System.out.print("picas");
        break;
      case 2:
        System.out.print("corazones");
        break;
      case 3:
        System.out.print("diamantes");
        break;
      case 4:
        System.out.print("tréboles");
        break;
      default:
    }
  }
}
