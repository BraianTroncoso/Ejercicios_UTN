package Ciclos01;
/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativo
 */


import java.util.Scanner;

public class Ciclos01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, cuadrado;
        System.out.println("Digite un numero: ");

        numero = Integer.parseInt(entrada.nextLine());

        while (numero >= 0) { //Mientras el número sea igual a cero o positivo
            cuadrado = (int) Math.pow(numero, 2); //El int convierte en entero ya que MAth devielve .
            System.out.println("EL numero " +numero+ " elevado al cuadrado es: "+cuadrado);
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("EL programa finalizado por el número negativo");
    }}
