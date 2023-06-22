package test;

import static aritmetica.Aritmetica.division; // Importamos solamente el método de la clase Aritmetica

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10,0);
        } catch (Exception e){
            System.out.println("Ocurrió un error");
            e.printStackTrace(System.out); // Se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        System.out.println("El valor de la variable resultado es: "+resultado);
    }
}
