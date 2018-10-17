public class treintaycinco {
  public static void main(String[] args) {
    String x; //caracter con el que se va a pintar
    int altura;
    System.out.println("Indica el carácter con el que quieres pintar la X");
    x = System.console().readLine();
    Scanner r = new Scanner(System.in);
    System.out.println("Dime la altura de la X (tiene que ser impar)");
    altura = r.nextInt();
    if (((altura%2) == 1) && (altura >= 3)) {
      for (int i = 1; i <= (altura/2+1); i++) {
        System.out.println(" ");
      }
    } else {
      System.out.println("No se puede pintar la pirámide");
    }
  }
}
