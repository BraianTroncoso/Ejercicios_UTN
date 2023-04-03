/*
import Operaciones.Aritmetica;

public class PruebaAritmetica { // Una sola clase se puede hacer de tipo publica
    public static void main(String[] args) {
        var a = 10; // variables locales
        int b = 7; // Memoria Stack (Las variables locales trabajan con la memoria Stack)
        miMetodo(); // Llamamos el método nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        // aritmetica1 = null; Esto no se utiliza al compilar todo, despues el compilador destruye y compila todo
        // System.gc(); Podemos limpiar tambien con este metodo, pero no debemos utilizarlo, es mejor que lo haga por defecto
        aritmetica1.sumarNumeros();
        // Para almacenar un objeto o los atributos se utiliza la memoria heap.
        // Sabiendo esto, cabe recalcar que la memoria trabaja de manera dinamica
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado = "+ resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = "+resultado);

        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica2 b: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica1 a: "+aritmetica2.a);
        System.out.println("aritmetica2 b: "+aritmetica2.b);


    }


*/
/*        Persona persona = new Persona("Ariel","Bentacud");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);*//*

// Modularidad creamos un nuevo método
    public static void miMetodo(){
        // int a = 10; // Esta variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
class Persona{ // Se le asigna a la clase un tipo default o package a la clase (pq ya tenemos una publica)
    String nombre;
    String apellido;

    Persona (String nombre, String apellido){ // THIS Hace referencia al atributo
    this.nombre = nombre;// Se guarda los valores indicado en el atributo que llamamos y le asignamos el parametro
    this.apellido = apellido; // Del constructor, por convenio se usa el mismo nombre asi no se confunda.

    }
class Imprimir(){
    public Imprimir(){
     super();
    }
    public void imprimir (Persona persona){
    System.out.println("Persona desde la clase Imprimir" + this.persona)
    }
}

    }
}

*/
