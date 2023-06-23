package Ciclos04;

import javax.swing.*;
import java.util.Scanner;

/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
 */
public class Ciclos04 {
   public static void main(String[] args) {
  /*
# MI SOLUCION
# CON SCANNER
        int numero = 1;
        while (numero >=0 ) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            System.out.println("El numero ingresado es: "+numero);
            if ( numero < 0){
                System.out.println("El n&uacute;mero ingresado "+numero+ " es negativo, el progama finaliza");
            }
        }
    }
*/
       /*

# CON JOptionPane
       int inicio = 1;
       while (inicio >= 0) {
           int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
           if (numero > 0){
               JOptionPane.showMessageDialog(null, "El número ingresado es: "+numero);

           }
           else {
               JOptionPane.showMessageDialog(null, "El número ingresado negativo finaliza el programa");
            break;
           }

       }




*/
Scanner entrada = new Scanner(System.in);
int numero, conteo = 0;
       System.out.println("Digite un numero: ");
       numero = Integer.parseInt(entrada.nextLine());
       while (numero >= 0){
           System.out.println("El numero "+numero+" ingresado la cantidad de "+conteo+" es Positivo");
           conteo++;
           System.out.println("Digite otro numero: ");
           numero = Integer.parseInt(entrada.nextLine());

       }
       System.out.println("A tecleado "+conteo+" de veces numeros que no SON NEGATIVOS");
   }
}
