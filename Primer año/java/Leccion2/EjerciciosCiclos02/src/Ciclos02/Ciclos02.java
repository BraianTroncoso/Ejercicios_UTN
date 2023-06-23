package Ciclos02;

import javax.swing.*;
/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca un cero 0.
*/

public class Ciclos02 {
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


