import javax.swing.JOptionPane;

public class Ciclos05 {
    /*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo números indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N
El proceso termina cuadno el usuario acierta y mostramos
el número de intentos hechos.
 */

    //Mi solución
    public static void main(String[] args) {
       /* int cont = 0;
        int aleatorio = (int)(Math.random()*100+1); // Esto genera un número aleatorio
        while (cont >= 0) {
            int user = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número del valor"));

            if (user < aleatorio) {
                JOptionPane.showMessageDialog(null, "El número ingresado es menor, intenta otra vez");

            } else if (user > aleatorio) {
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor, intenta otra vez");
            }
            else{
                JOptionPane.showMessageDialog(null, "¡Acertaste! ¡Felicitaciones!, el número era: "+aleatorio);
                JOptionPane.showMessageDialog(null, "Con un total de intentos de: "+cont);
                break;
            }
            cont++;
        }*/
    }
// Solución del profe
    int cont = 0;
    int aleatorio = (int)(Math.random()*100+1); // Esto genera un número aleatorio
 do{
        System.out.println('Digite un numero: ');
        int user = Integer.parseInt(entrada.nextLine());
        if (user < aleatorio){
            System.out.println('Digite un numero mayor');
        } else if (user > aleatorio) {
            System.out.println('Digite un numero menor');
        }
        else{
            System.out.println('¡Felicitaciones! Has adivinado el número');
        }
        cont++;
    } while (user != aleatorio);
                System.out.println('Adiviniaste en: '+cont,' de intentos');
                System.out.println('El valor era: '+user);

}




