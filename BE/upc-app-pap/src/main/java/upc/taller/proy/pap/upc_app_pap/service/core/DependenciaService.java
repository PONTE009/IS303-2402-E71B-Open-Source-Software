package upc.taller.proy.pap.upc_app_pap.service.core;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import upc.taller.proy.pap.upc_app_pap.entity.core.DependenciaEntity;

import java.util.List;
import java.util.Optional;

public interface DependenciaService {
    List<DependenciaEntity> Listar();
    Page<DependenciaEntity> ListarPaginado(Pageable pageable);
    Optional<DependenciaEntity> BuscarPorId(Long id);
    List<DependenciaEntity> BuscarPorDescripcion(String descripcion);
    DependenciaEntity Insertar(DependenciaEntity dependenciaEntity);
    DependenciaEntity Actualizar(DependenciaEntity dependenciaEntity);
    void Elminar(Long id);
}
