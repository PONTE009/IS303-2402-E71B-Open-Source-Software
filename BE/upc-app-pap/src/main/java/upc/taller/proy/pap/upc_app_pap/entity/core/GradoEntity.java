package upc.taller.proy.pap.upc_app_pap.entity.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "grado")
    private List<PersonaEntity> listaPersona;
}
