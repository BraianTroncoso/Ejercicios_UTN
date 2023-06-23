package ciclos09;

import java.util.Scanner;

/*
Ejercicio 9: Pedir el dia, mes y año de una fecha e
indicar si la fecha es correcta. Suponiendo que todos los meses
son de 30 dias.
*/
public class Ciclos09 {
    public static void main(String[] args) {

        // Mi solucion
      /*  Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int d = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        int m = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        int a = entrada.nextInt();
        if ( d < 30 && d > 0){
            if(m > 0 && m < 12 && a < 3000 && a > 2000){
                System.out.println("La fecha es correcta el dia es: " + d +"/" + m + "/" + a);
            }
        } else {
            System.out.println("La fecha es incorrecta");
        }*/

        // Solucion del profe
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int d = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el mes: ");
        int m = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el año: ");
        int a = Integer.parseInt(entrada.nextLine());
    if((d != 0) && (d <= 30)){
        if((a != 0)&&(a <= 2022)){
            System.out.println("La fecha ingresada es: "+d+"/"+m+"/"+a+"/");
        }
    }else {
        System.out.println("La fecha ingresada es incorrecta");
    }

    }
}
