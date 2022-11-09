package Clases;

import javax.swing.*;

public class Ciclos06 {
    public static void main(String[] args) {
//Mi solución
        int resultado = 0;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        while (numero != 0){
            if (numero != 0){
                resultado += numero;
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        System.out.println("El valor de todos los números digitados es: "+resultado);
    }

}
