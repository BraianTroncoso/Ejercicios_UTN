package UTN;

import UTN.Conexion.Conexion;
import UTN.Datos.EstudianteDAO;
import UTN.Dominio.Estudiante;

public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConecction();
        if (conexion != null){
            System.out.println("Conexión exitosa: "+conexion);
        }else {
            System.out.println("Error al conectarse");
        }


      /*  var estudianteDao = new EstudianteDAO();
        var nuevoEstudiante = new Estudiante("Carlos", "Lara", "291923", "CarlosL@mail.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if (agregado)
            System.out.println("Se agregó un nuevo estudiante: "+nuevoEstudiante);
        else
            System.out.println("No se pudo agregar el nuevo estudiante: "+nuevoEstudiante);*/
    }// Fin main
}// Fin clase
