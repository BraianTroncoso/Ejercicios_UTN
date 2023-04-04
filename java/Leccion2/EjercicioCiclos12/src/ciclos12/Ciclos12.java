package ciclos12;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        // Mi Solucion con Scanner
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


        // Mi Solucion con JOptionPane
/*        long factorial = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int num2 = num;

        while (num != 0){
            factorial = factorial * num;
            num--;
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado es: "+ num2 +" Y su factorial es: "+ factorial);*/
        // Solucion del profe

        long factorial = 1; //Utilizamos long porque nos permite almacenar mayor capacidad de datos por la memoria
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for(int i=1; i<=num;i++){
            factorial*=i;

        }
        JOptionPane.showMessageDialog(null,"El facotiral del numero ingresado es: "+factorial);
    }
}