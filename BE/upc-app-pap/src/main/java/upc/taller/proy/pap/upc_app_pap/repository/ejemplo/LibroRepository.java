package upc.taller.proy.pap.upc_app_pap.repository.ejemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.taller.proy.pap.upc_app_pap.entity.ejemplo.LibrosEntity;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<LibrosEntity,Long> {
    // SQL Y JPQL

    List<LibrosEntity> findByAutorLike(String autor);

}
