package upc.taller.proy.pap.upc_app_pap.entity.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

import java.util.List;


@Setter
@Getter
@SuperBuilder
//@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity(name = "EspecialidadEntity")
@Table(name = "tbl_especialidad", schema = "mae")
public class EspecialidadEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "especialidad_id")
    private  Long especialidadId;
    private String descripcion;
    private String abreviatura;

    //@JsonIgnore
    @OneToMany(mappedBy = "especialidad", fetch = FetchType.EAGER)
    private List<PersonaEntity> listaPersona;

}
