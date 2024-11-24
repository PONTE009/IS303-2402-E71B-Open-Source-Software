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
@Entity(name = "TipoPersonaEntity")
@Table(name = "tbl_tipo_persona", schema = "mae")
public class TipoPersonaEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_persona_id")
    private  Long tipoPersonaId;
    private String descripcion;
    private String abreviatura;

    @JsonIgnore
    @OneToMany(mappedBy = "tipopPersona")
    private List<PersonaEntity> listaPersona;

}
