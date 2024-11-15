package upc.taller.proy.pap.upc_app_pap.entity.core;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "GradoEntity")
@Table(name = "tbl_grado", schema = "mae")
public class GradoEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grado_id")
    private  Long gradoId;
    private String descripcion;
    private String abreviatura;

}
