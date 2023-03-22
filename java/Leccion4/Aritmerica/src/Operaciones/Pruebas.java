
package Operaciones;

public class Pruebas {
    public static void main(String[] args) {

        Prueba pruebita = new Prueba();

        System.out.println("Estoy sumando con argumentos y reutilizando metodos: "+pruebita.sumarConArgumentos(5,5));




/*Prueba pruebita = new Prueba(5,5);
        pruebita.sumarNum();*//*


        Prueba pruebita = new Prueba();
        pruebita.setA(5);
        pruebita.setB(5);
        pruebita.sumarNum();
        System.out.println("soy el resultado de la suma con retorno: "+pruebita.sumarConRetorno());
    */}
}

