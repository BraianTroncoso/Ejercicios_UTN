package caja; //Package

public class Caja { // Clase publica caja
    // Atributos (caracteristicas)
    public int ancho,alto, profundo;

    // Métodos y constructores (acciones)

    public Caja(){ //Constructor 1 = vacio

    }
    // Constructor con parámetros
    public Caja(int alto, int ancho, int profundo) { // Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){ // Método para calcular volumen
        return ancho * alto * profundo;
    }

}

