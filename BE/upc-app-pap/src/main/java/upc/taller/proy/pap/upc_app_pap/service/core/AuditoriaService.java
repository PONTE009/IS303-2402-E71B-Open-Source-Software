package upc.taller.proy.pap.upc_app_pap.service.core;

import upc.taller.proy.pap.upc_app_pap.entity.core.AuditoriaEntity;

import java.util.List;

public interface AuditoriaService {
        List<AuditoriaEntity> Listar();
        AuditoriaEntity Insertar(AuditoriaEntity auditoriaEntity);
        void Eliminar(String auditoriaId);
}
