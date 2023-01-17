package pasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20; // Recordemos que Stack es el espacio de memoria que se le asigna a una variable local.

        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //Solo le enviamos una copia
        System.out.println("valorX = " + valorX);
    }
    public static void cambioValor(int arg1){ // Parametros por valor, es solo una copia
        System.out.println("arg1 = " + arg1);
        arg1 = 15; // No puede ser modificado porque se le esta asignando la variable local.

    }
}
