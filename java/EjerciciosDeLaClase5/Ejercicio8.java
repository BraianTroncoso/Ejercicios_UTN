/*
 Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0, total;

        System.out.println("Digite la cantidad de números que desea ingresar:  ");
        total = Integer.parseInt(entrada.nextLine());
        int num [] = new int[total];
        while (contador != total){
            System.out.println("Ingrese un número: ");
            num = new int[]{Integer.parseInt(entrada.nextLine())};
            contador++;
        }
        System.out.println(num); // La lógica esta genial, acá hay un error de sintaxis.
    }
}
