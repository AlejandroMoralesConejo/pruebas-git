import java.util.Scanner;
public class ejerciciosCuatro {
  public static void main(String [] args) {
    Scanner horasescaner = new Scanner(System.in); //Ejercicio 4, TEMA 4
    int horas;
    System.out.println("Di el número de horas que has trabajado esta semana y te diré tu sueldo:");
    horas = horasescaner.nextInt();
    if (horas <= 40) {
      int menos;
      menos = horas*12;
      System.out.println("Como has trabajado " + horas + " horas, tu sueldo es de "+ menos +" euros.");
    }
    if (horas > 40) {
      int mas;
      mas = 40*12 + ((horas-40)*16);
      System.out.println("Como has trabajado "+horas+" horas, tu sueldo es de "+mas+" euros.");
    }
    Scanner a = new Scanner(System.in); //Ejercicio 8
    float nota1;
    System.out.println("Di tu primera nota:");
    nota1 = a.nextFloat();
    float nota2;
    System.out.println("Di tu segunda nota:");
    nota2 = a.nextFloat();
    float nota3;
    System.out.println("Di tu tercera nota:");
    nota3 = a.nextFloat();
    float notamedia = (nota1+nota2+nota3)/3;
    System.out.println("Tu nota media es de "+notamedia+".");   
    if (notamedia < 5) {
      System.out.println("Tu nota es insuficiente.");
    }
      else if ((notamedia >= 5) && (notamedia < 6)) {
        System.out.println("Tu nota es suficiente.");
      }
      else if ((notamedia > 6) && (notamedia < 7)) {
        System.out.println("Has sacado un bien, enhorabuena.");
      }
      else if ((notamedia > 7) && (notamedia < 9)) {
        System.out.println("Has sacado un notable, enhorabuena.");
      }
      else if (notamedia > 9) {
        System.out.println("Has sacado un sobresaliente, enhorabuena.");
      }
    Scanner pregunta1 = new Scanner(System.in); //Ejercicio 11
    int hora;
    System.out.println("Dime una hora");
    hora = pregunta1.nextInt();
    Scanner pregunta2 = new Scanner(System.in);
    int minutos;
    System.out.println("Ahora dime los minutos");
    minutos = pregunta2.nextInt();
    int medianoche;
    medianoche = 86400 - ((horas*3600)+(minutos*60));
    System.out.println("Quedan "+medianoche+" segundos para medianoche, es decir, para las 00:00");
    
    String m;
    System.out.println("Elija el carácter con el que quiere dibujar la pirámide");
    m = System.console().readLine();
    Scanner esc = new Scanner(System.in);
    System.out.println("Elija el tipo de pirámide que quiere dibujar");
    System.out.println("1. Vértice hacia arriba");
    System.out.println("2. Vértice hacia abajo");
    System.out.println("3. Vértice hacia la derecha");
    System.out.println("4. Vértice hacia la izquierda");
    System.out.println("Elije una opción del 1 al 4");
    int vertice;
    vertice = esc.nextInt();
    switch (vertice) {
      case 1:
        System.out.println("   "+m);
        System.out.println("  "+m+m+m);
        System.out.println(" "+m+m+m+m+m);
        System.out.println(m+m+m+m+m+m+m);
        break;
      case 2:
        System.out.println(m+m+m+m+m+m+m);
        System.out.println(" "+m+m+m+m+m);
        System.out.println("  "+m+m+m);
        System.out.println("   "+m);
        break;
      case 3:
        System.out.println(m);
        System.out.println(m+m+m);
        System.out.println(m+m+m+m+m);
        System.out.println(m+m+m+m+m+m+m);
        System.out.println(m+m+m+m+m);
        System.out.println(m+m+m);
        System.out.println(m);
        break;
      case 4:
        System.out.println("      "+m);
        System.out.println("    "+m+m+m);
        System.out.println("  "+m+m+m+m+m);
        System.out.println(m+m+m+m+m+m+m);
        System.out.println("  "+m+m+m+m+m);
        System.out.println("    "+m+m+m);
        System.out.println("      "+m);
        break;
        default:
        System.out.println("Tienes que introducir una opción entre 1-4");
      }
    Scanner tra = new Scanner(System.in);
    int trabajo; //puesto de trabajo
    System.out.println("Introduzca su empleo (1-3)");
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de proyecto");
    trabajo = tra.nextInt();
    int sueldo;
    sueldo = 0;
    switch (trabajo) {
      case 1:
        sueldo = 950;
        break;
      case 2:
        sueldo = 1200;
        break;
      case 3:
        sueldo = 1600;
        break;
      default: System.out.println("Tienes que introducir un puesto de trabajo entre el 1 y el 3");
    }
    Scanner dias = new Scanner(System.in); //dietas
    int viajes;
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    viajes = dias.nextInt();
    int pagasViaje;
    pagasViaje = viajes*30;
    
    Scanner est = new Scanner(System.in); //estado civil
    int estadoCivil;
    System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado)");
    estadoCivil = tra.nextInt();
    String porcentaje;
    porcentaje = "vacio";
    int sueldoBruto;
    sueldoBruto = sueldo + pagasViaje;
    double retencion=0;
    switch (estadoCivil) {
      case 1:
        retencion = sueldoBruto*0.2;
        porcentaje = "20%";
        break;
      case 2:
        retencion = sueldoBruto*0.25;
        porcentaje = "25%";
        break;
      default: System.out.println("Tienes que introducir tu estado civil: (1 - Soltero, 2 - Casado)");
    }
    
    //mostrar por pantalla resultados
    System.out.println("Sueldo base                 "+sueldo+"   €");
    System.out.println("Dietas ("+viajes+" viajes)            "+pagasViaje+"   €");
    System.out.println("**********************************************");
    System.out.println("Sueldo bruto                "+sueldoBruto+"   €");
    System.out.println("Retención IRPF ("+porcentaje+")        "+retencion+" €");
    System.out.println("**********************************************");
    System.out.println("Sueldo neto                 "+(sueldoBruto - retencion)+" €");
  }
}
