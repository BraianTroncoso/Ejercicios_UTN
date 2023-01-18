package ciclos11;

import javax.swing.*;
/*
Ejercicio 11: Diseñar un programa que muestre el producto
de los que 10 primeros números impartes
Hacerlo con JOptionPane
 */
public class Ciclos11 {
    public static void main(String[] args) {

        long producto = 1;
        for(int i = 1; i<=20; i+=2){ // El aumento apunta a solo ir por los impartes
            producto*= i;
        }
        JOptionPane.showMessageDialog(null, "El promedio del valor es: "+producto);
    }
}
