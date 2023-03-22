package ciclos08;

import java.util.Scanner;

/*
Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
 */
public class Ciclos08 {
    public static void main(String[] args) {

     //Mi solución
      /*  Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int n = entrada.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.println(i);
        }*/
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while (i <= numero){
            System.out.println(i);
            i++;
        }
    }
}
