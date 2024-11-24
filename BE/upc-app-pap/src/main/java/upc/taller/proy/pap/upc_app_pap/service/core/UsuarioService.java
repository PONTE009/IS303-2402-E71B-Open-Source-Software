package upc.taller.proy.pap.upc_app_pap.service.core;

import upc.taller.proy.pap.upc_app_pap.entity.core.UsuarioEntity;
import upc.taller.proy.pap.upc_app_pap.entity.utils.UsuarioRequest;

public interface UsuarioService {
    UsuarioEntity Insertar(UsuarioRequest request);
}
