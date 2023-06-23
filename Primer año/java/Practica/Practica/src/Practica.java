import javax.swing.*;
import java.util.Scanner;

public class Practica {
    /*
    Ejercicio 10: Pedir 10 números y escribir la suma total
    Hacerlo con la clase Scanner y JOptionPane
     */
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20; i+=2){
            producto*= i;
        }
        JOptionPane.showMessageDialog(null, "El promedio del valor es: "+producto);
    }
}
