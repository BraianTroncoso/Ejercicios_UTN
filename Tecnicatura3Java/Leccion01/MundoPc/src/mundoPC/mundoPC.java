package mundoPC;

import ar.com.system2023.mundopc.*;


public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton   ratonHP = new Raton("Bluetooh","HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP, tecladoHP, ratonHP);


        //Creamos otros objetos de diferente marcas
        Monitor monitorGamer = new Monitor("Gamer",32);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton   ratonGamer = new Raton("Bluetooh","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer, tecladoGamer, ratonGamer);

        Orden orden2 = new Orden(); //Una nueva lista para el objeto orden 2
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        orden1.agregarComputadoras(computadoraHP);
        orden1.agregarComputadoras(computadoraGamer);

        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas: ", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadoras(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();

        //Crear mas objetos de tipo computadora con todos sus elementos
        //Completar una lista en el objeto orden1 que llege a los 10 elementos
        //Probar de esta manera los métodos al máximo rendimiento



    }
}
