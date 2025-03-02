package upc.taller.proy.pap.upc_app_pap.entity.core;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class PersonaOrganigramaPK implements Serializable {
    private Long personaId;
    private Long organigramaId;
}
