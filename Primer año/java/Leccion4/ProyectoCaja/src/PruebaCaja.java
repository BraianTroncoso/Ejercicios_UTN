import caja.Caja;

public class PruebaCaja {
    public static void main(String[] args) { // Método main
        // Variables locales
        int medidaAncho = 3; // Valores ingresados en código duro
        int medidaAlto = 2;
        int medidaProf= 6;

        Caja caja1 = new Caja(); // Instanciamos el objeto, constructor vacio
        caja1.alto = medidaAlto; // Le pasamos los valores al objeto
        caja1.ancho = medidaAncho;
        caja1.profundo = medidaProf;

       int resultado = caja1.calcularVolumen(); // Llamamos al método
        //Primer resultado
        System.out.println("Resultado volumen de caja 1: "+ caja1.calcularVolumen());


        // Necesitamos si o si crear el constructor para pasarle el valor en una linea.
        Caja caja2 = new Caja(2, 4, 6); //Llamamos al consturctor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al método para un nuevo calculo
        System.out.println("Resultado volumen de caja 2: " + caja2.calcularVolumen());

        // Otra solucion sin paradigma a o objectos
     /*   Scanner entrada = new Scanner(System.in);
        int ancho,alto,profundidad,volumen;
        System.out.println("Digite un valor númerico para el ancho: ");
        ancho = entrada.nextInt();
        System.out.println("Digite un valor númerico para el alto: ");
        alto = entrada.nextInt();
        System.out.println("Digite un valor númerico para el profundidad: ");
        profundidad = entrada.nextInt();

        volumen = ancho * alto * profundidad;
        System.out.println("El volumen total de los valores es: " + volumen);*/


    }
}