import java.util.Scanner; //Ejercicio 4 del examen, depósito bancario
public class ExAmc04 { //Alejandro Morales Conejo 1º DAW
  public static void main (String[] args) { //Explicación del ejercicio: La cantidad añadida gracias al interés de cada mes SI se si tiene en cuenta para la base de cada mes
    Scanner r = new Scanner(System.in);
    System.out.println("Introduzca el montante de dinero inicial");
    float dineroInicial = r.nextFloat();
    System.out.println("Introduzca la rentabilidad mensual del depósito (en porcentaje 0-100%)");
    float porcentaje = r.nextFloat();
    float conversorDecimal = porcentaje/100+1; 
    float acumulado = dineroInicial*conversorDecimal;
    System.out.println("Introduzca la cantidad que se quiere alcanzar");
    float cantidadDeseada = r.nextFloat();
    int contadorMes = 1;
    if (dineroInicial >= cantidadDeseada) { //excepción por si la cantidad deseada es la misma o mayor que la inicial 
      contadorMes = 0;
    } else {
      while (acumulado < cantidadDeseada) {
        acumulado *=  conversorDecimal;
        contadorMes++;
      }
    }
    System.out.println("Para alcanzar la cantidad de "+cantidadDeseada+"€ partiendo de un depósito de "+dineroInicial+"€ con un interés del "+porcentaje+"%, son necesarios "+contadorMes+" meses.");
    
  }
}
