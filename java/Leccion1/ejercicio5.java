import java.net.StandardSocketOptions;
import java.util.Scanner;

public class ejercicio5{
public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  float nota1,nota2,nota3,suma;

  //Guardemos las tres notas
  System.out.println("Digite las tres calificaciones: ");
  nota1 = Float.parseFloat(entrada.nextLine());
  nota2 = Float.parseFloat(entrada.nextLine());
  nota3 = Float.parseFloat(entrada.nextLine());

  suma = nota1 + nota2 + nota3;

  System.out.println("");
}
}