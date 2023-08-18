package UTN;

import UTN.Conexion.Conexion;
import UTN.Datos.EstudianteDAO;
import UTN.Dominio.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConecction();
        if (conexion != null){
            System.out.println("Conexión exitosa: "+conexion);
        }else {
            System.out.println("Error al conectarse");
        }
        int opc = 0;
        var estudianteDao = new EstudianteDAO();
        Scanner entrada = new Scanner(System.in);
        while (opc == 0){
            try {
                System.out.println("*** Sistema de Estudiantes ***");
                System.out.println("1. Listar estudiantes");
                System.out.println("2. Buscar estudiante");
                System.out.println("3. Agregar estudiante" );
                System.out.println("4. Modificar estudiante");
                System.out.println("5. Eliminar estudiante" );
                System.out.println("6. Salir");
                System.out.println("Elige una opción: ");
                opc = entrada.nextInt();
                switch (opc){
                    case 1:
                        System.out.println("Los estudiantes que se encuentran son: "+ estudianteDao.listarEstudiantes());
                        break;
                    case 2:
                        System.out.println("Ingrese el id del estudiante que desee buscar: ");
                        var idBuscar = entrada.nextInt();
                        Estudiante estudianteIdBuscar = new Estudiante(idBuscar);
                        var estudianteEncontrado = estudianteDao.buscarEstudiantePorId(estudianteIdBuscar);
                        if (estudianteEncontrado){
                            System.out.println("Estudiante encontrado con el ID: "+ estudianteEncontrado + estudianteIdBuscar.toString());
                        }else {
                            System.out.println("Estudiante no encontrado con el ID" + estudianteIdBuscar);
                        }
                        break;
                    case 3:
                        var nuevoEstudiante = new Estudiante();
                        System.out.println("Ingrese los datos del estudiante a ingresar");
                        System.out.println("Ingrese su nombre: ");
                        var nombre = entrada.nextLine();
                        System.out.println("Ingrese su apellido: ");
                        var apellido = entrada.nextLine();
                        System.out.println("Ingrese su telefono: ");
                        var telefono = entrada.nextLine();
                        System.out.println("Ingrese su mail: ");
                        var email = entrada.nextLine();
                        nuevoEstudiante.setNombre(nombre);
                        nuevoEstudiante.setApellido(apellido);
                        nuevoEstudiante.setTelefono(telefono);
                        nuevoEstudiante.setEmail(email);
                        System.out.println("Nuevo estudiante agregado exitosamente: " + nuevoEstudiante.toString());
                    case 4:
                        System.out.println("Los estudiantes que se encuentran son: "+ estudianteDao.listarEstudiantes());
                        System.out.println("Digite el id del estudiante a modificar: ");
                        var idModificar = entrada.nextInt();
                        Estudiante estudianteIdModificar = new Estudiante(idModificar);
                        var estudianteEncontradoMod = estudianteDao.buscarEstudiantePorId(estudianteIdModificar);
                        System.out.println("El estudiante a modificar es: " + estudianteIdModificar.toString());
                        System.out.println("Ingrese los datos del estudiante a ingresar");
                        System.out.println("Ingrese su nombre: ");
                        var nombreM = entrada.nextLine();
                        System.out.println("Ingrese su apellido: ");
                        var apellidoM = entrada.nextLine();
                        System.out.println("Ingrese su telefono: ");
                        var telefonoM = entrada.nextLine();
                        System.out.println("Ingrese su mail: ");
                        var emailM = entrada.nextLine();
                        estudianteIdModificar.setNombre(nombreM);
                        estudianteIdModificar.setApellido(apellidoM);
                        estudianteIdModificar.setTelefono(telefonoM);
                        estudianteIdModificar.setEmail(emailM);
                    case 5:
                        System.out.println("Ingrese el ID del estudiante a eliminar: ");
                        var idEliminar = entrada.nextInt();
                        Estudiante estudianteIdEliminar = new Estudiante(idEliminar);
                        estudianteDao.eliminarEstudiante(estudianteIdEliminar);
                        System.out.println("Estudiante eliminador correctamente");
                    default:
                        System.out.println("Opcion no encontrada: "+ opc);
                }
            }catch (Exception e){
                System.out.println("Opcion incorrecta, digite solo una opc disponible: " + e.getMessage());
                opc = 6;
            }finally {
                try {
                    opc = 6;
                }catch (Exception e){
                    opc 6
                }
            }
        }
    }// Fin main
}// Fin clase
