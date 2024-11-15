package upc.taller.proy.pap.upc_app_pap.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.taller.proy.pap.upc_app_pap.entity.core.DependenciaEntity;

import java.util.List;

@Repository
public interface DependenciaRepository extends JpaRepository<DependenciaEntity, Long> {
    List<DependenciaEntity> findByDescripcionLike(String descripcion);
}
