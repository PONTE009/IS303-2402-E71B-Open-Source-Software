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
@Entity(name = "EspecialidadEntity")
@Table(name = "tbl_especialidad", schema = "mae")
public class EspecialidadEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "especialidad_id")
    private  Long especialidadId;
    private String descripcion;
    private String abreviatura;

    @JsonIgnore
    @OneToMany(mappedBy = "especialidad")
    private List<PersonaEntity> listaPersona;

}
