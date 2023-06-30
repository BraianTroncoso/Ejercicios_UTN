package UTN.Datos;

import UTN.Conexion.Conexion;
import UTN.Dominio.Estudiante;
import static UTN.Conexion.Conexion.getConecction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    // Método listar
    public List<Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamos ahora algunos objetos que son necesarios para comunicarnos con la BDD
        PreparedStatement ps; // Envia la sentencia a la base de datos(los querys)
        ResultSet rs; // Recibe el resultado de la base de datos
        // Creamos un objeto del tipo conexion
        Connection con = getConecction();
        String sql = "SELECT * FROM estudiantes ORDEN BY estudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
               var estudiante = new Estudiante();
               estudiante.setIdEstudiante(rs.getInt('idestudiante2022'));
            }
        }catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
        }

    }
}
