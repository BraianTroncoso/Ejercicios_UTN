package Operaciones;

public class Aritmetica {
    public int a, b; // Variables locales, publicas.
    // Atributos de la clase
    //int a;
    //int b; // El valor por default cuando inicializamos una variable el valor es 0.

    // El consturctor es un método especial

    public Aritmetica(){ // Constructor 1 vacio
        System.out.println("Se esta ejecutando el constructor número uno");
    }
    // Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){ // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor número dos");
    }
    // Metodo
    public  void sumarNumeros(){
        int resultado = a + b;
        System.out.println("Resultado = "+ resultado);
    }

    public int sumarConRetorno() {
        // Es lo mismo que poner int resultado = a + b;
        return a+b;
    }
    public int sumarConArgumentos(int a,int b){
        this.a = a;
        this.b = b;
        // Es lo mismo que poner return a + b
        return this.sumarConRetorno();
    }
}
