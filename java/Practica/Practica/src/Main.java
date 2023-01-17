import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        int contador = 0;
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        do{
            num += num;
            contador++;
        }while (num >= 0);

        resultado = num / contador;

        System.out.println("EL resultado de calcular la media es: " + resultado);
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

    }

}

