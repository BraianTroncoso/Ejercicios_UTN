package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.servicio.EstudianteServicio;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {
	@Autowired
	// Inyectacción de dependencia para obtener la instancia de estudianteServicio
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);
	String nl = System.lineSeparator();
	public static void main(String[] args) {
		logger.info("Iniciando la aplicación...");
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada!");
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el método run de Spring..."+nl);
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			mostrarMenu();
			salir = ejecutarOpciones(consola);
		}// Fin ciclo while
	}

	private void mostrarMenu(){
//		logger.info(nl);
		logger.info("""
				****** Sistema de Estudiantes ******
				1. Listar Estudiantes
				2. Buscar Estudiante
				3. Agregar Estudiante
				4. Modificar Estudiante
				5. Eliminar Estudiante
				6. Salir
				Eliga una opción:""");
	}
	private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch (opcion){
			case 1 ->{// Listar estudiantes
				logger.info(nl+"Listado de Estudiantes: "+nl);
				List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach((estudiante -> logger.info(estudiante.toString()+nl)));
			}
			case 2 ->{ // Buscar estudiante por ID
				logger.info(nl+"Ingrese el ID Estudiante a Buscar: "+nl);
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null){
					logger.info("Estudiante encontrado: "+ estudiante+nl);
				}else{
					logger.info("Estudiante NO encontrado: "+ estudiante+nl);
				} // Fin else
			}
			case 3 ->{ // Agregar estudiante
				logger.info(nl+"Ingrese los datos del Estudiante al agregar"+nl);
				logger.info(nl+"Nombre: "+nl);
				var nombre = consola.nextLine();
				logger.info(nl+"Apellido: "+nl);
				var apellido = consola.nextLine();
				logger.info(nl+"Email: "+nl);
				var email = consola.nextLine();
				logger.info(nl+"Telefono: "+nl);
				var telefono = consola.nextLine();
				// Creando el objeto estudiante sin el ID
				var estudiante = new Estudiantes2022();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);
				estudianteServicio.agregarEstudiante(estudiante);
				logger.info("Estudiante agregado: "+estudiante+nl);

			}
			case 4 ->{ // Modificar estudiante
				logger.info(nl+"Modificar Estudiante: "+nl);
				logger.info(nl+"Seleccione el ID Estudiante: "+nl);
				var idEstudiante = Integer.parseInt(consola.nextLine());
				// Buscamos el ID a modificar
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null){
					logger.info("Nombre: ");
					var nombre = consola.nextLine();
					logger.info("Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Telefono: ");
					var telefono = consola.nextLine();
					logger.info("Email: ");
					var email = consola.nextLine();
					estudiante.setNombre(nombre);
					estudiante.setApellido(apellido);
					estudiante.setTelefono(telefono);
					estudiante.setEmail(email);
					estudianteServicio.agregarEstudiante(estudiante);
					logger.info("Estudiante modificado: "+estudiante+nl);
				}else {
					logger.info("Estudiante NO encontrado con el ID: "+idEstudiante+nl);
				}

			}
			case 5 ->{ // Eliminar estudiante por ID
				logger.info(nl+"Eliminar Estudiante: "+nl);
				logger.info(nl+"Seleccione el ID Estudiante: "+nl);
				var idEstudiante = Integer.parseInt(consola.nextLine());
				var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if(estudiante != null){
					estudianteServicio.eliminarEstudiante(estudiante);
					logger.info("Estudiante Eliminado: "+estudiante+nl);
				}else {
					logger.info("No se encontró el estudiante con el ID"+estudiante+nl);
				}

			}
			case 6 ->{ // Salir
				logger.info("Hasta Pronto!!"+nl+nl);
				salir = true;
			}
			default -> logger.info("Opcion NO reconocida: "+opcion+nl);
		} // Fin switch
		return salir;
	};
}
