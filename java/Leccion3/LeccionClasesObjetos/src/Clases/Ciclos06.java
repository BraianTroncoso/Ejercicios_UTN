package Clases;
import java.util.Scanner;
import javax.swing.*;

/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
la suma de todos los números introducidos.
*/
public class Ciclos06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//Mi solución JOptionPane
        int resultado = 0;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        while (numero != 0){
            if (numero != 0){
                resultado += numero;
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        System.out.println("El valor de todos los números digitados es: "+resultado);
        System.out.println("Fin JOptionPane");

// Mi solución con SCANNER
        int resultadoDos = 0;
        System.out.println("Digite un número: ");
        int num = Integer.parseInt(entrada.nextLine());
        while (num != 0){
            if (num != 0){
                resultadoDos += num;
            }
            System.out.println("Digite otro número: ");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El valor de todos los números digitados es: "+resultadoDos);
        System.out.println("Fin SCANNER");
    }

}
/*
 Solucion del profe:

 #Scanner ebtrada = new Scanner(System.in);
 int numero, suma = 0;
 do{
     System.out.println("Digite un número: ");
     int numero = Integer.parseInt(entrada.nextLine());
     suma+= numero;
 } while(numero !=0);
  System.out.println("El valor de todos los números digitados es: "+suma);

 */