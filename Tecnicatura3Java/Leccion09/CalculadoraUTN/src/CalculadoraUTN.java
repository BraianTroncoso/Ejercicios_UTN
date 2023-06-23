import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("******* Aplicación Calculadora *******");
        //Mostramos el menú
        System.out.println("""
                1. Suma
                2. Resta
                3. Múltiplicación
                4. División
                5. Salír
                """);
        System.out.print("¿Qué operación desea realizar?: ");
        var operacion = Integer.parseInt(entrada.nextLine());
        if(operacion >= 1){
            System.out.print("Digite el valor para operando 1: ");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite el valor para operando 2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());
            var resultado = operando1 + operando2;
            System.out.println("resultado = " + resultado);
        }

    }
}
