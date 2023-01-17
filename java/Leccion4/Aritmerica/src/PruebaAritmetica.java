import Operaciones.Aritmetica;

public class PruebaAritmetica {
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

    public static void miMetodo(){
        // int a = 10; // Esta variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}
