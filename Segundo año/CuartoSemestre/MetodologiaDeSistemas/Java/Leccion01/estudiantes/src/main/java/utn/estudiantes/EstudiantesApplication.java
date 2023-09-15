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
		logger.info(nl);
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
			case 2 ->{
				logger.info(nl+"Ingrese el ID Estudiante a Buscar: "+nl);
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null){
					logger.info("Estudiante encontrado: "+ estudiante+nl);
				}else{
					logger.info("Estudiante NO encontrado: "+ estudiante+nl);
				} // Fin else
			}
			case 3 ->{
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
			case 4 ->{
				logger.info(nl+"Seleccione el Estudiante a modificar: "+nl);
				List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach((estudiante -> logger.info(estudiante.toString()+nl)));

			}
		} // Fin switch
		return salir;
	};
}
