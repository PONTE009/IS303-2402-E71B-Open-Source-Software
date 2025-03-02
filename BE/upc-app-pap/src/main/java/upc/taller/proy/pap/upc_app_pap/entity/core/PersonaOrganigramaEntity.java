package upc.taller.proy.pap.upc_app_pap.entity.core;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;



@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@Entity
@Table(name = "tbl_persona_organigrama", schema = "pap")
public class PersonaOrganigramaEntity extends Auditoria {
    @EmbeddedId
    private PersonaOrganigramaPK id;


    @ManyToOne
    @MapsId("personaId")  // Vincula con la clave en Persona
    @JoinColumn(name = "persona_id")
    private PersonaEntity persona;

    @ManyToOne
    @MapsId("organigramaId")  // Vincula con la clave en Organigrama
    @JoinColumn(name = "organigrama_id")
    private OrganigramaEntity organigrama;
}
