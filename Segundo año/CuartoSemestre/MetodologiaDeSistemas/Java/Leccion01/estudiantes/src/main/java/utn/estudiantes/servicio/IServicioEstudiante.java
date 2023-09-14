package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;

public interface IServicioEstudiante {
    public List<Estudiantes2022> listarEstudiantes();
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiante);
    public void agregarEstudiante(Estudiantes2022 estudiante);
    public void eliminarEstudiante(Estudiantes2022 estudiante);
}
