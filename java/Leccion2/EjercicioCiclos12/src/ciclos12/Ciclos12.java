package ciclos12;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        // Solucion con Scanner
//        Scanner entrada = new Scanner(System.in);
//        int factorial = 1;
//        System.out.println("Ingrese un número: ");
//        int numero = Integer.parseInt(entrada.nextLine());
//        int numero2 = numero;
//
//        while (numero != 0){
//            factorial = factorial * numero;
//            numero--;
//        }
//        System.out.println("Factorial = " + factorial);
//
//
        // Solucion con JOptionPane
        int factorial = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int num2 = num;

        while (num != 0){
            factorial = factorial * num;
            num--;
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado es: "+ num2 +" Y su factorial es: "+ factorial);
    }
}
