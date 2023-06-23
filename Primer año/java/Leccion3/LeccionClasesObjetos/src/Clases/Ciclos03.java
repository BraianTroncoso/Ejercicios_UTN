package Clases;

import javax.swing.*;
import java.util.Scanner;

/*
Ejercicio 3: Leer números hasta que se introduzca un cero
para cada uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOoptionPane
 */
public class Ciclos03 {
  /*  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if (numero > 0){
                System.out.println("El número "+numero+" es POSITIVO");
            }
            else {
                System.out.println("El número "+numero+" es NEGATIVO");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());

        }
        System.out.println("El numero "+numero+" Finaliza el programa");
    }


*/
  public static void main(String[] args) {

      int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
      while (numero != 0){
          if (numero > 0){
              JOptionPane.showMessageDialog(null, "El número "+numero+" es Positivo");
          }
          else {
              JOptionPane.showMessageDialog(null, "El número "+numero+" es NEGATIVO");
          }
          numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));

      }
      JOptionPane.showMessageDialog(null,"El número "+numero+" Finaliza el programa");

  }
}