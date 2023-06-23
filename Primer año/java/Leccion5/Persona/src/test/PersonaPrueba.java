package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo",57.000,false);
        System.out.println("personal su nombre es: "+persona1.getNombre());

        //Modificamos a través de los métodos
        persona1.setNombre("Juan Ignacio");
        // persona1.nombre("Juan Ignacio"); Ya no se puede utilizar
        //System.out.println("Nombre es: " + persona1.nombre); Error
        System.out.println("personal con su nombre modificado: " + persona1.getNombre());
        System.out.println("personal el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("personal para obtener el booleano: " + persona1.isEliminado());
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //y imprimir, luego modificar sus valores y volver a imprimir

        Persona persona2 = new Persona("Braian",60.000,true);
        System.out.println("personal su nombre es: "+persona2.getNombre());


        //Modificamos a travéz de los métodos
        persona2.setNombre("Axel");
        persona2.setSueldo(65.000);
        persona2.setEliminado(false);
        System.out.println("Hemos modificado el nombre del personal ahora su nombre es: "+persona2.getNombre());
        System.out.println("Tambien su sueldo que es: "+persona2.getSueldo());
        persona2.setEliminado(true);
        System.out.println("Y su valor boolean es: "+ persona2.isEliminado());
        System.out.println("Persona 2" +persona2);
    }
}
