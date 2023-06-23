import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        var salir = false;

        while (!salir){
            mostrarMenu();
            System.out.println(); // Agregamos un salto de linea
        }// Fin del ciclo while
    }// Fin del main
    public static void mostrarMenu(){
        // Mostramos las opciones
        System.out.println("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
    }
}// Fin de la clase
