import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
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
