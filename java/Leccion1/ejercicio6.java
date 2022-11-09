import java.util.Scanner;

public class ejercicio6{
public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  float luis,juan,dolares;

  //Ingresamos la cantidad de dolares de Guillermo. De él depende el resultado de los demas.

  System.out.println("Digite la cantidad de dolares: ");

  dolares = Float.parseFloat(entrada.nextLine());
 
  System.out.println("Guillermo tiene disponible:$"+dolares+" de dolares");
 
  luis = (dolares/2);
  
  System.out.println("Luis tiene disponible:$"+luis+" de dolares");

 juan = (dolares+luis)/2;

 System.out.println("Juan tiene disponible:$"+juan+" de dolares");

 System.out.println("*************************************************");
 System.out.println("El total del dinero de los tres es: "+(juan+luis+dolares)+" de dolares");
}
}
