package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.modelos.Libro;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

@Component
public class LibroFrom extends JFrame  {
    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tablaLibros;
    private JTextField libroTexto;
    private JLabel Autor;
    private JTextField autorTexto;
    private JTextField precioTexto;
    private JTextField existenciasTexto;
    private JButton agregarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    private DefaultTableModel tablaModeloLibros;

    private void iniciarForma() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900,700);
        // Para obtener las dimenciones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth() / 2);
        int y = (tamanioPantalla.height - getHeight() / 2);
        setLocation(x,y);
    }
        private void agregarLibro(){
            // Leer los valores del formulario
            if (libroTexto.getText().equals("")){
                mostrarMensaje("Ingrese el nombre del libro");
                libroTexto.requestFocusInWindow();
                return;
            };
            var nombreLibro = libroTexto.getText();
            var autor = autorTexto.getText();
            var precio = Double.parseDouble(precioTexto.getText());
            var existencias = Integer.parseInt(existenciasTexto.getText());
            // Si pasamos el valor null va hacer un INSERT en caso que le pasemos un ID va a ser un UPDATE
            var libro = new Libro(null,nombreLibro,autor,precio,existencias);
          /*  libro.setNombreLibro(nombreLibro);
            libro.setAutor(autor);
            libro.setPrecio(precio);
            libro.setExistencias(existencias);*/
            this.libroServicio.guardarLibro(libro);
            mostrarMensaje("Se agregó el libro");
            limpiarFormulario();
            listarLibros();
        };
    private void limpiarFormulario(){
    libroTexto.setText("");
    autorTexto.setText("");
    precioTexto.setText("");
    existenciasTexto.setText("");
    };

        private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje);
        };


    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
        agregarButton.addActionListener(e -> agregarLibro());{

        };
    }
    // Como intectamos una instancia de LibroServicio en nuestro constructor de la clase LibroForms, ya podriamos utilizar esa instancia
    // en cualquier parte de nuestra clase
    private void createUIComponents() {
        this.tablaModeloLibros = new DefaultTableModel(0 , 5);
        String [] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        // Instanciar el objeto de Jtable
        this.tablaLibros = new JTable(tablaModeloLibros);
        listarLibros();
    }

    private void listarLibros() {
        // Limpiamos la tabla
        tablaModeloLibros.setRowCount(0);

        // Obtenemos los libros de la base datos
        var libros = libroServicio.listarLibros();

        //  Iteramos cada libro
        libros.forEach((libro)->{
            // Creamos cada registro para agregarlos a la tabla
            Object [] reglonLibro = {
                    libro.getIdLibro(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getPrecio(),
                    libro.getExistencias()
            };
            this.tablaModeloLibros.addRow(reglonLibro);
        });

    }
}
