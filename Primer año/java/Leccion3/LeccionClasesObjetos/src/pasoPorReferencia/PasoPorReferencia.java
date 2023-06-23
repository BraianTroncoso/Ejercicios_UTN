package pasoPorReferencia;

import Clases.Persona;
// Paso por referencia
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        Persona persona2 = new Persona();
        persona2.nombre = null;
        cambiarValor(persona2);
        System.out.println("El nuevo valor del objeto es: "+persona2.nombre);

    }


   /* public static void Persona cambiarElValor(Persona persona){
        if (persona == null){
            System.out.printf("El valor de persona es invalido : Null");
        return null;
        }else{
            persona.nombre = "Mónica";
            return persona;
        }

    }*/
    public static void cambiarValor(Persona persona){ // parámetro por referencia // o paso por referencia
        persona.nombre = "Maria";

    }


}

     // Recordemos que al manipular objetos y atributos u metodos estamos apuntando hacia la memoria heap, esta
    // es la que almacenaria todo los datos.
