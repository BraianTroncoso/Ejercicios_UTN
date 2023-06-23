package Ciclos01;
/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativo
 */
import javax.swing.*;

public class Ejercicio01 {
    public static void main(String[] args) {

    int numero, cuadrado;

    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (numero >= 0) { //Mientras el número sea igual a cero o positivo
        cuadrado = (int) Math.pow(numero, 2); //El int convierte en entero ya que MAth devielve .
        System.out.println("EL numero " +numero+ " elevado al cuadrado es: "+cuadrado);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

    }
        System.out.println("EL programa finalizado por el número negativo");
}
}