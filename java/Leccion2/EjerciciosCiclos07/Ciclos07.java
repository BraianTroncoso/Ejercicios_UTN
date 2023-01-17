import java.util.Scanner;

public class Ciclos07 {
    
    //Mi solución
    //Solucion profe
    // Ambas fueron similares por ende dejé una sola
    public static void main(String[] args) {
        // Solución del profe
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while ( numero >= 0) { // Mientras que el numero no sea negativo
                suma += numero;
                conteo ++;
                System.out.println("Digite otro número: ");
                numero = Integer.parseInt(entrada.nextLine());
        }
        if ( conteo == 0){
            System.out.println("Error la division entre 0 no existe");
        }
        else{
            promedio= (float)suma/conteo;
            System.out.println("\nEl promedio es: "+ promedio);
        }
    }
/*
// Mi solucion con JOptionPane
 int num, conteo = 0, suma = 0;
        float promedio = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while ( num >= 0){
            suma += num;
            conteo ++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        if (conteo == 0){
            JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
        }
        else{
            promedio = suma / conteo;
        }
        JOptionPane.showMessageDialog(null, "El promedio del valor es: "+ promedio);
 */
}




