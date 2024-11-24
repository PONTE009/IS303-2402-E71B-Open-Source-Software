package upc.taller.proy.pap.upc_app_pap.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.taller.proy.pap.upc_app_pap.entity.core.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
