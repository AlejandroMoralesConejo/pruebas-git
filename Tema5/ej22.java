public class ej22 {
  public static void main (String[] args) {
    boolean primo;
    int contador = 0;
    int maxNumero = 100;
    for (int numero = 2; numero <= maxNumero; numero++) {
      primo = true;
      for (int j=2; (j < numero) && primo; j++) { //dividir para comprobar
        if ((numero % j) == 0) { //si es divisible entre un numero diferente a 1 y su mismo número, ya no es primo
          primo = false;
        }
      }
      if (primo) { //si es primo, lo pintamos
        System.out.print(numero+"  ");
        contador++;
      }
    }
    System.out.println();
    System.out.println("Hemos encontrado "+contador+" números primos desde el 2 hasta el "+maxNumero);
  }
}
