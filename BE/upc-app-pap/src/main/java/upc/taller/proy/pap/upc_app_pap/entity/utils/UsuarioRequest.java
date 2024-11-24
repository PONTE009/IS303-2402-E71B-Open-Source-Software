package upc.taller.proy.pap.upc_app_pap.entity.utils;

import lombok.Getter;
import lombok.Setter;
import upc.taller.proy.pap.upc_app_pap.entity.core.PersonaEntity;
import upc.taller.proy.pap.upc_app_pap.entity.core.UsuarioEntity;

@Setter
@Getter
public class UsuarioRequest {
    private UsuarioEntity usuario;
    private PersonaEntity persona;
    private boolean flagGeneraError;
}
