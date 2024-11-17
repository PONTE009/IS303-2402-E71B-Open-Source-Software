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
@Entity(name = "DependenciaEntity")
@Table(name = "tbl_dependencia", schema = "mae")
public class DependenciaEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dependencia_id")
    private  Long dependenciaId;
    private String descripcion;
    private String sigla;

    // List Object
    @JsonIgnore
    @OneToMany(mappedBy = "dependencia")
    private List<PersonaEntity> listaPersona;

//    @OneToOne(mappedBy = "persona")
//    private UsuarioEntity usuario;
}
