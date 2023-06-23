import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class ejercicio7{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
/*EL salario es fijo del empleado */
    final int salarioFijo = 1000;
    float venta,salarioFinal,porcentaje;
    String nombre;

    System.out.println("Digite el nombre del empleado: ");

    nombre = (entrada.nextLine());

    System.out.println("¿Cuantos vehiculos vendió este mes?");
   
   venta = Float.parseFloat(entrada.nextLine());
   venta = (venta* 150);
   porcentaje = ((venta+salarioFijo)*5)/100;
   
   salarioFinal = (salarioFijo+venta+porcentaje);
   System.out.println("El sueldo del empleado "+nombre+" es: "+salarioFinal+"$");
  }
}