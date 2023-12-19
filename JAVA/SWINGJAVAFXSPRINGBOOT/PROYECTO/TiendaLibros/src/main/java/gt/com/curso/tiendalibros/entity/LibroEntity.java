package gt.com.curso.tiendalibros.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "libro")
public class LibroEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "libro_id", nullable = false)
    private Long libroId;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "existencia", nullable = false)
    private Integer existencia;

    @Column(name = "estado", nullable = false)
    private boolean estado;
}
