package upc.taller.proy.pap.upc_app_pap.entity.ejemplo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

import java.util.Date;


@Setter
@Getter
@Entity(name = "LibrosEntity")
@Table(name = "tbl_libro", schema = "mae")
public class LibrosEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_libro_id")
    @SequenceGenerator(sequenceName = "sec_libro_id", initialValue = 1, allocationSize = 1, name="sec_libro_id")
    @Column(name = "libro_id")
    private Long libroId;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "abreviatura")
    private String abreviatura;

    @Column(name = "precio")
    private Double precio;


    @Column(name = "autor")
    private String autor;

    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;

}
