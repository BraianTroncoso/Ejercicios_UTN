
package Operaciones;

public class Prueba {
    public int a;
    public int b;


    public Prueba(){};
    public Prueba(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int sumarConRetorno(){
        return a+b;
    }

    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }


    /*
    private int a;
    private int b;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


public Prueba(){
    System.out.println("soy un constructor vacio" + a + b );
}
public Prueba(int a, int b){
    this.a = a;
    this.b = b;
}
 public void sumarNum(){
     int resultado = a+b;
     System.out.println("Soy el resultado de a + b "+ resultado);
 }

public int sumarConRetorno(){
        return a+b;
}
*/
}




