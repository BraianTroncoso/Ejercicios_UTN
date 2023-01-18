import javax.swing.*;
import java.util.Scanner;

public class Practica {
    /*
    Ejercicio 10: Pedir 10 números y escribir la suma total
    Hacerlo con la clase Scanner y JOptionPane
     */
    public static void main(String[] args) {

     // Mi solucion con Scanner
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        System.out.println("Ingrese un valor: ");
        int numero = entrada.nextInt();

        while (contador <= 9){
            suma += numero;
            contador++;
            numero = entrada.nextInt();
        }
        System.out.println("La suma total de los 10 valores es: " +suma);

        // Mi solucion con JOptionPane
        /*

        int contador = 0;
        int suma = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        while (contador <= 9){
            suma += numero;
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero "));
        }
        JOptionPane.showMessageDialog(null,"La suma del total es: " + suma);*/
    }
}
