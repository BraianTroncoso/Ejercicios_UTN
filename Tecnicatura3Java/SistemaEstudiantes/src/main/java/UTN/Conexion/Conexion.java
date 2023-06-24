package UTN.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConecction(){
        Connection conexion = null;
        // Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2022";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "";

        // Cargamos la clase del driver de mysql en memoria

        Class.forName("con.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, password);
    }
}
