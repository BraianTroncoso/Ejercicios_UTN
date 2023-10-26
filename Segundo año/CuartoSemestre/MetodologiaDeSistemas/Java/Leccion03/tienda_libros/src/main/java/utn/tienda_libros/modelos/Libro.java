package utn.tienda_libros.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "libro")
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer idLibro;
    @Column
    String nombreLibro;
    @Column
    String autor;
    @Column
    Double precio;
    @Column
    Integer existencias;
}
