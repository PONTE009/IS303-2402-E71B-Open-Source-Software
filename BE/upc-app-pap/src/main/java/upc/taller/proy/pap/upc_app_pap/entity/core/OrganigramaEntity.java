package upc.taller.proy.pap.upc_app_pap.entity.core;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@Entity(name = "OrganigramaEntity")
@Table(name = "tbl_organigrama", schema = "mae")
public class OrganigramaEntity extends Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organigrama_id")
    private  Long organigramaId;
    private String descripcion;

    @OneToMany(mappedBy = "organigrama", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonaOrganigramaEntity> listaPersona = new ArrayList<>();

}
